package io.horizontalsystems.bitstashwallet.modules.send.submodules.fee

import io.horizontalsystems.bitstashwallet.core.ICurrencyManager
import io.horizontalsystems.bitstashwallet.core.IFeeRateProvider
import io.horizontalsystems.bitstashwallet.core.IRateStorage
import io.horizontalsystems.bitstashwallet.entities.FeeRateInfo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class SendFeeInteractor(private val rateStorage: IRateStorage,
                        private val feeRateProvider: IFeeRateProvider?,
                        private val currencyManager: ICurrencyManager) : SendFeeModule.IInteractor {

    private var disposable: Disposable? = null

    var delegate: SendFeeModule.IInteractorDelegate? = null

    override fun getRate(coinCode: String) {
        disposable = rateStorage.latestRateObservable(coinCode, currencyManager.baseCurrency.code)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    delegate?.onRateFetched(if (it.expired) null else it)
                }
    }

    override fun getFeeRates(): List<FeeRateInfo>? {
        return feeRateProvider?.feeRates()
    }

    override fun clear() {
        disposable?.dispose()
    }

}
