package app.odapplications.bitstashwallet.modules.send.submodules.amount

import app.odapplications.bitstashwallet.core.ILocalStorage
import app.odapplications.bitstashwallet.core.IRateStorage
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.Currency
import app.odapplications.bitstashwallet.entities.Rate
import app.odapplications.bitstashwallet.modules.send.SendModule
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit


class SendAmountInteractor(
        private val baseCurrency: Currency,
        private val rateStorage: IRateStorage,
        private val localStorage: ILocalStorage,
        private val coin: Coin
): SendAmountModule.IInteractor {

    private var exchangeRate: Rate? = null
    private val disposables = CompositeDisposable()

    var delegate: SendAmountModule.IInteractorDelegate? = null

    override var defaultInputType: SendModule.InputType
        get() = localStorage.sendInputType ?: SendModule.InputType.COIN
        set(value) { localStorage.sendInputType = value }

    override fun retrieveRate() {
        disposables.clear()

        disposables.add(
                rateStorage.latestRateObservable(coin.code, baseCurrency.code)
                        .take(1)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe {
                            exchangeRate = if (it.expired) null else it
                            delegate?.didRateRetrieve(exchangeRate)
                        }
        )

        disposables.add(
                Flowable.interval(1, TimeUnit.MINUTES)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe {
                            if (exchangeRate?.expired == true) {
                                exchangeRate = null
                                delegate?.didRateRetrieve(exchangeRate)
                            }
                        }
        )
    }
}
