package io.horizontalsystems.bitstashwallet.modules.send.eos

import io.horizontalsystems.bitstashwallet.modules.send.SendModule
import io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule
import io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule
import io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule
import io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule
import io.reactivex.Single
import java.math.BigDecimal

class SendEosHandler(private val interactor: SendModule.ISendEosInteractor,
                     private val router: SendModule.IRouter) : SendModule.ISendHandler,
        SendAmountModule.IAmountModuleDelegate,
        SendAddressModule.IAddressModuleDelegate {

    private fun syncValidation() {
        try {
            amountModule.validAmount()
            addressModule.validAddress()

            delegate.onChange(true)

        } catch (e: Exception) {
            delegate.onChange(false)
        }
    }

    private fun syncAvailableBalance() {
        amountModule.setAvailableBalance(interactor.availableBalance)
    }

    // SendModule.ISendHandler

    override lateinit var amountModule: SendAmountModule.IAmountModule
    override lateinit var addressModule: SendAddressModule.IAddressModule
    override lateinit var feeModule: SendFeeModule.IFeeModule
    override lateinit var memoModule: SendMemoModule.IMemoModule

    override lateinit var delegate: SendModule.ISendHandlerDelegate

    override val inputItems: List<SendModule.Input> = listOf(
            SendModule.Input.Amount,
            SendModule.Input.Address,
            SendModule.Input.Memo(120),
            SendModule.Input.ProceedButton)

    override fun confirmationViewItems(): List<SendModule.SendConfirmationViewItem> {
        return listOf(
                SendModule.SendConfirmationAmountViewItem(amountModule.primaryAmountInfo(), amountModule.secondaryAmountInfo(), addressModule.validAddress()),
                SendModule.SendConfirmationMemoViewItem(memoModule.memo))
    }

    override fun sendSingle(): Single<Unit> {
        return interactor.send(amountModule.validAmount(), addressModule.validAddress(), memoModule.memo)
    }

    override fun onModulesDidLoad() {
        syncAvailableBalance()
    }

    override fun onAddressScan(address: String) {
        addressModule.didScanQrCode(address)
    }

    // SendAmountModule.IAmountModuleDelegate

    override fun onChangeAmount() {
        syncValidation()
    }

    override fun onChangeInputType(inputType: SendModule.InputType) {

    }

    // SendAddressModule.IAddressModuleDelegate

    override fun validate(address: String) {
        interactor.validate(address)
    }

    override fun onUpdateAddress() {
        syncValidation()
    }

    override fun onUpdateAmount(amount: BigDecimal) {
        amountModule.setAvailableBalance(amount)
    }

    override fun scanQrCode() {
        router.scanQrCode()
    }

}
