package io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo

import io.horizontalsystems.bitstashwallet.core.IClipboardManager

class TransactionInfoInteractor(private var clipboardManager: IClipboardManager) : TransactionInfoModule.Interactor {
    var delegate: TransactionInfoModule.InteractorDelegate? = null

    override fun onCopy(value: String) {
        clipboardManager.copyText(value)
    }

}
