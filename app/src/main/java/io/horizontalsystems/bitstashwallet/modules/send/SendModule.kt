package io.horizontalsystems.bitstashwallet.modules.send

import io.horizontalsystems.bitstashwallet.core.*
import io.horizontalsystems.bitstashwallet.entities.CoinValue
import io.horizontalsystems.bitstashwallet.entities.CurrencyValue
import io.horizontalsystems.bitstashwallet.entities.Wallet
import io.horizontalsystems.bitstashwallet.modules.send.binance.SendBinanceHandler
import io.horizontalsystems.bitstashwallet.modules.send.binance.SendBinanceInteractor
import io.horizontalsystems.bitstashwallet.modules.send.bitcoin.SendBitcoinHandler
import io.horizontalsystems.bitstashwallet.modules.send.bitcoin.SendBitcoinInteractor
import io.horizontalsystems.bitstashwallet.modules.send.dash.SendDashHandler
import io.horizontalsystems.bitstashwallet.modules.send.dash.SendDashInteractor
import io.horizontalsystems.bitstashwallet.modules.send.eos.SendEosHandler
import io.horizontalsystems.bitstashwallet.modules.send.eos.SendEosInteractor
import io.horizontalsystems.bitstashwallet.modules.send.ethereum.SendEthereumHandler
import io.horizontalsystems.bitstashwallet.modules.send.ethereum.SendEthereumInteractor
import io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule
import io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule
import io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule
import io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule
import io.reactivex.Single
import java.math.BigDecimal

object SendModule {

    interface IView {
        var delegate: IViewDelegate

        fun loadInputItems(inputs: List<Input>)
        fun setSendButtonEnabled(enabled: Boolean)
        fun showConfirmation(confirmationViewItems: List<SendConfirmationViewItem>)
        fun showErrorInToast(error: Throwable)
        fun showErrorInDialog(coinException: CoinException)
    }

    interface IViewDelegate {
        var view: IView
        val handler: ISendHandler

        fun onViewDidLoad()
        fun onModulesDidLoad()
        fun onAddressScan(address: String)
        fun onProceedClicked()
        fun onSendConfirmed()
        fun onClear()
    }

    interface ISendBitcoinInteractor {
        fun fetchAvailableBalance(feeRate: Long, address: String?)
        fun fetchFee(amount: BigDecimal, feeRate: Long, address: String?)
        fun validate(address: String)
        fun send(amount: BigDecimal, address: String, feeRate: Long): Single<Unit>
        fun clear()
    }

    interface ISendBitcoinInteractorDelegate {
        fun didFetchAvailableBalance(availableBalance: BigDecimal)
        fun didFetchFee(fee: BigDecimal)
    }

    interface ISendDashInteractor {
        fun fetchAvailableBalance(address: String?)
        fun fetchFee(amount: BigDecimal, address: String?)
        fun validate(address: String)
        fun send(amount: BigDecimal, address: String): Single<Unit>
        fun clear()
    }

    interface ISendDashInteractorDelegate {
        fun didFetchAvailableBalance(availableBalance: BigDecimal)
        fun didFetchFee(fee: BigDecimal)
    }

    interface ISendEthereumInteractor {
        val ethereumBalance: BigDecimal

        fun availableBalance(gasPrice: Long): BigDecimal
        fun validate(address: String)
        fun fee(gasPrice: Long): BigDecimal
        fun send(amount: BigDecimal, address: String, gasPrice: Long): Single<Unit>
    }

    interface ISendBinanceInteractor {
        val availableBalance: BigDecimal
        val availableBinanceBalance: BigDecimal
        val fee: BigDecimal

        fun validate(address: String)
        fun send(amount: BigDecimal, address: String, memo: String?): Single<Unit>
    }

    interface ISendEosInteractor {
        val availableBalance: BigDecimal

        fun validate(account: String)
        fun send(amount: BigDecimal, account: String, memo: String?): Single<Unit>
    }

    interface IRouter {
        fun scanQrCode()
        fun closeWithSuccess()
    }

    interface ISendInteractor {
        var delegate: ISendInteractorDelegate

        fun send(sendSingle: Single<Unit>)
        fun clear()
    }

    interface ISendInteractorDelegate {
        fun didSend()
        fun didFailToSend(error: Throwable)
    }

    interface ISendHandler {
        var amountModule: SendAmountModule.IAmountModule
        var addressModule: SendAddressModule.IAddressModule
        var feeModule: SendFeeModule.IFeeModule
        var memoModule: SendMemoModule.IMemoModule

        val inputItems: List<Input>
        var delegate: ISendHandlerDelegate

        fun onModulesDidLoad()
        fun onAddressScan(address: String)
        @Throws
        fun confirmationViewItems(): List<SendConfirmationViewItem>
        fun sendSingle(): Single<Unit>
    }

    interface ISendHandlerDelegate {
        fun onChange(isValid: Boolean)
    }

    abstract class SendConfirmationViewItem

    data class SendConfirmationAmountViewItem(val primaryInfo: AmountInfo,
                                              val secondaryInfo: AmountInfo?,
                                              val receiver: String) : SendConfirmationViewItem()

    data class SendConfirmationFeeViewItem(val primaryInfo: AmountInfo,
                                           val secondaryInfo: AmountInfo?) : SendConfirmationViewItem()

    data class SendConfirmationTotalViewItem(val primaryInfo: AmountInfo,
                                             val secondaryInfo: AmountInfo?) : SendConfirmationViewItem()

    data class SendConfirmationMemoViewItem(val memo: String?) : SendConfirmationViewItem()

    data class SendConfirmationDurationViewItem(val duration: Long?) : SendConfirmationViewItem()


    fun init(viewModel: SendViewModel, wallet: Wallet): IViewDelegate {
        val handler: ISendHandler = when (val adapter = App.adapterManager.getAdapterForWallet(wallet)) {
            is ISendBitcoinAdapter -> {
                val interactor = SendBitcoinInteractor(adapter)
                val handler = SendBitcoinHandler(interactor, viewModel)

                interactor.delegate = handler

                viewModel.amountModuleDelegate = handler
                viewModel.addressModuleDelegate = handler
                viewModel.feeModuleDelegate = handler

                handler
            }
            is ISendDashAdapter -> {
                val interactor = SendDashInteractor(adapter)
                val handler = SendDashHandler(interactor, viewModel)

                interactor.delegate = handler

                viewModel.amountModuleDelegate = handler
                viewModel.addressModuleDelegate = handler

                handler
            }
            is ISendEthereumAdapter -> {
                val interactor = SendEthereumInteractor(adapter)
                val handler = SendEthereumHandler(interactor, viewModel)

                viewModel.amountModuleDelegate = handler
                viewModel.addressModuleDelegate = handler
                viewModel.feeModuleDelegate = handler

                handler
            }
            is ISendBinanceAdapter -> {
                val interactor = SendBinanceInteractor(adapter)
                val handler = SendBinanceHandler(interactor, viewModel)

                viewModel.amountModuleDelegate = handler
                viewModel.addressModuleDelegate = handler

                handler
            }
            is ISendEosAdapter -> {
                val interactor = SendEosInteractor(adapter)
                val handler = SendEosHandler(interactor, viewModel)

                viewModel.amountModuleDelegate = handler
                viewModel.addressModuleDelegate = handler

                handler
            }
            else -> {
                throw Exception("No adapter found!")
            }
        }
        val view: IView = viewModel
        val router: IRouter = viewModel
        val interactor: ISendInteractor = SendInteractor()

        val presenter = SendPresenter(interactor, router, handler)

        presenter.view = view

        view.delegate = presenter
        handler.delegate = presenter
        interactor.delegate = presenter

        return presenter
    }

    enum class InputType {
        COIN, CURRENCY;

        fun reversed(): InputType {
            return if (this == COIN) CURRENCY else COIN
        }
    }

    sealed class Input {
        object Amount : Input()
        object Address : Input()
        class Fee(val isAdjustable: Boolean) : Input()
        class Memo(val maxLength: Int): Input()
        object ProceedButton : Input()
    }

    sealed class AmountInfo {
        data class CoinValueInfo(val coinValue: CoinValue) : AmountInfo()
        data class CurrencyValueInfo(val currencyValue: CurrencyValue) : AmountInfo()

        fun getAmountName(): String = when (this) {
            is CoinValueInfo -> this.coinValue.coin.title
            is CurrencyValueInfo -> this.currencyValue.currency.code
        }

        fun getFormatted(): String? = when (this) {
            is CoinValueInfo -> {
                App.numberFormatter.format(this.coinValue)
            }
            is CurrencyValueInfo -> {
                App.numberFormatter.format(this.currencyValue, trimmable = true)
            }
        }
    }

}
