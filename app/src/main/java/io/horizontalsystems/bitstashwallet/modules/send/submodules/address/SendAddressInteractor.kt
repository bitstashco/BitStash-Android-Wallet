package io.horizontalsystems.bitstashwallet.modules.send.submodules.address

import io.horizontalsystems.bitstashwallet.core.IAddressParser
import io.horizontalsystems.bitstashwallet.core.IClipboardManager
import java.math.BigDecimal

class SendAddressInteractor(private val textHelper: IClipboardManager,
                            private val addressParser: IAddressParser) : SendAddressModule.IInteractor {

    var delegate: SendAddressModule.IInteractorDelegate? = null

    override val addressFromClipboard: String?
        get() = textHelper.getCopiedText()

    override val clipboardHasPrimaryClip: Boolean
        get() = textHelper.hasPrimaryClip

    override fun parseAddress(address: String): Pair<String, BigDecimal?> {
        val addressData = addressParser.parse(address)

        return Pair(addressData.address, addressData.amount?.toBigDecimal())
    }

}
