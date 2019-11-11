package app.odapplications.bitstashwallet.modules.transactions.transactionInfo

import app.odapplications.bitstashwallet.core.IClipboardManager

class TransactionInfoInteractor(private var clipboardManager: IClipboardManager) : TransactionInfoModule.Interactor {
    var delegate: TransactionInfoModule.InteractorDelegate? = null

    override fun onCopy(value: String) {
        clipboardManager.copyText(value)
    }

}
