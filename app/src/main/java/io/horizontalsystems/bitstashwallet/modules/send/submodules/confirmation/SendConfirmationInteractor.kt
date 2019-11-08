package io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation

import io.horizontalsystems.bitstashwallet.core.IClipboardManager


class SendConfirmationInteractor(private val clipboardManager: IClipboardManager): SendConfirmationModule.IInteractor {

    var delegate: SendConfirmationModule.IInteractorDelegate? = null

    override fun copyToClipboard(coinAddress: String) {
        clipboardManager.copyText(coinAddress)
        delegate?.didCopyToClipboard()
    }

}
