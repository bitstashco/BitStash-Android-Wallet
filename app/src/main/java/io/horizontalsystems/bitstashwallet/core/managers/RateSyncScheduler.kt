package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.ICurrencyManager
import io.horizontalsystems.bitstashwallet.core.IRateManager
import io.horizontalsystems.bitstashwallet.core.IWalletManager
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class RateSyncScheduler(private val rateManager: IRateManager,
                        walletManager: IWalletManager,
                        currencyManager: ICurrencyManager,
                        connectivityManager: ConnectivityManager,
                        timerSignal: Observable<Unit> = Observable.interval(0L, 5L, TimeUnit.MINUTES).map { Unit }) {

    private val disposables = CompositeDisposable()

    init {
        disposables.add(Observable.merge(
                walletManager.walletsUpdatedSignal,
                currencyManager.baseCurrencyUpdatedSignal,
                connectivityManager.networkAvailabilitySignal,
                timerSignal)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    rateManager.syncLatestRates()
                })
    }

}
