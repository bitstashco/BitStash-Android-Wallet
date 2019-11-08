package io.horizontalsystems.bitstashwallet.modules.send.submodules.fee

import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.FeeRatePriority
import io.horizontalsystems.bitstashwallet.core.factories.FeeRateProviderFactory
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.CoinValue
import io.horizontalsystems.bitstashwallet.entities.FeeRateInfo
import io.horizontalsystems.bitstashwallet.entities.Rate
import io.horizontalsystems.bitstashwallet.modules.send.SendModule
import io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo
import java.math.BigDecimal


object SendFeeModule {

    class InsufficientFeeBalance(val coin: Coin, val coinProtocol: String, val feeCoin: Coin, val fee: CoinValue) : Exception()

    interface IView {
        fun setPrimaryFee(feeAmount: String?)
        fun setSecondaryFee(feeAmount: String?)
        fun setInsufficientFeeBalanceError(insufficientFeeBalance: InsufficientFeeBalance?)
        fun setDuration(duration: Long)
        fun setFeePriority(priority: FeeRatePriority)
        fun showFeeRatePrioritySelector(feeRates: List<FeeRateInfoViewItem>)
    }

    interface IViewDelegate {
        fun onViewDidLoad()
        fun onChangeFeeRate(feeRateInfo: FeeRateInfo)
        fun onClickFeeRatePriority()
        fun onClear()
    }

    interface IInteractor {
        fun getRate(coinCode: String)
        fun getFeeRates(): List<FeeRateInfo>?
        fun clear()
    }

    interface IInteractorDelegate {
        fun onRateFetched(latestRate: Rate?)
    }

    interface IFeeModule {
        val isValid: Boolean
        val feeRate: Long
        val primaryAmountInfo: AmountInfo
        val secondaryAmountInfo: AmountInfo?
        val duration: Long?

        fun setFee(fee: BigDecimal)
        fun setAvailableFeeBalance(availableFeeBalance: BigDecimal)
        fun setInputType(inputType: SendModule.InputType)
    }

    interface IFeeModuleDelegate {
        fun onUpdateFeeRate(feeRate: Long)
    }

    data class FeeRateInfoViewItem(val feeRateInfo: FeeRateInfo, val selected: Boolean)

    fun init(view: SendFeeViewModel, coin: Coin, moduleDelegate: IFeeModuleDelegate?): IFeeModule {
        val feeRateProvider = FeeRateProviderFactory.provider(coin)
        val feeCoinData = App.feeCoinProvider.feeCoinData(coin)
        val feeCoin = feeCoinData?.first ?: coin

        val baseCurrency = App.currencyManager.baseCurrency
        val helper = SendFeePresenterHelper(App.numberFormatter, feeCoin, baseCurrency)
        val interactor = SendFeeInteractor(App.rateStorage, feeRateProvider, App.currencyManager)
        val presenter = SendFeePresenter(interactor, helper, coin, baseCurrency, feeCoinData)

        view.delegate = presenter

        presenter.view = view
        presenter.moduleDelegate = moduleDelegate

        interactor.delegate = presenter

        return presenter
    }

}
