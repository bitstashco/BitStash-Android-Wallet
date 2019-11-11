package app.odapplications.bitstashwallet.modules.ratelist

import android.app.Activity
import app.odapplications.bitstashwallet.core.*
import app.odapplications.bitstashwallet.core.managers.BackgroundManager
import app.odapplications.bitstashwallet.core.managers.CurrentDateProvider
import app.odapplications.bitstashwallet.core.managers.StatsData
import app.odapplications.bitstashwallet.core.managers.StatsError
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.Currency
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.util.*

class RatesInteractor(
        private val rateStatsManager: IRateStatsManager,
        private val rateStorage: IRateStorage,
        private val currentDateProvider: CurrentDateProvider,
        private val backgroundManager: BackgroundManager,
        private val currencyManager: ICurrencyManager,
        private val walletStorage: IWalletStorage,
        private val appConfigProvider: IAppConfigProvider,
        private val rateListSorter: RateListSorter
) : RateListModule.IInteractor, BackgroundManager.Listener {

    init {
        backgroundManager.registerListener(this)
    }

    var delegate: RateListModule.IInteractorDelegate? = null
    private var disposables = CompositeDisposable()

    override fun willEnterForeground(activity: Activity) {
        delegate?.willEnterForeground()
    }

    override val currentDate: Date
        get() = currentDateProvider.currentDate

    override val currency: Currency
        get() = currencyManager.baseCurrency

    override val coins: List<Coin>
        get() = rateListSorter.smartSort(walletStorage.enabledCoins(), appConfigProvider.featuredCoins)

    override fun initRateList() {
        rateStatsManager.statsFlowable
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe({
                    when (it) {
                        is StatsData -> delegate?.onReceive(it)
                        is StatsError -> delegate?.onFailStats(it.coinCode)
                    }
                }, {
                })
                .let { disposables.add(it) }
    }

    override fun getRateStats(coinCodes: List<String>, currencyCode: String) {
        coinCodes.forEach { coinCode ->
            rateStatsManager.syncStats(coinCode, currencyCode)
        }
    }

    override fun fetchRates(coinCodes: List<String>, currencyCode: String) {
        coinCodes.forEach { coinCode ->
            rateStorage.latestRateObservable(coinCode, currencyCode)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.io())
                    .subscribe {
                        delegate?.didUpdateRate(it)
                    }
                    .let { disposables.add(it) }
        }
    }

    override fun clear() {
        backgroundManager.unregisterListener(this)
        disposables.clear()
    }
}
