package io.horizontalsystems.bitstashwallet.modules.restore.eos

import io.horizontalsystems.bitstashwallet.core.adapters.EosAdapter
import io.horizontalsystems.bitstashwallet.core.IClipboardManager

class RestoreEosInteractor(private val clipboardManager: IClipboardManager)
    : RestoreEosModule.IInteractor {

    var delegate: RestoreEosModule.IInteractorDelegate? = null

    override val textFromClipboard: String?
        get() = clipboardManager.getCopiedText()

    override fun validate(accountName: String, privateKey: String) {
        if (accountName.length !in 1..12) {
            delegate?.onInvalidAccount()
            return
        }

        if (privateKey.isEmpty()) {
            delegate?.onInvalidKey()
            return
        }

        try {
            EosAdapter.validatePrivateKey(privateKey)
            delegate?.onValidationSuccess(accountName, privateKey)
        } catch (e: Exception) {
            delegate?.onInvalidKey()
        }
    }
}
