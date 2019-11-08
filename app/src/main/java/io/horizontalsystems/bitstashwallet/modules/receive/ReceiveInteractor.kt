package io.horizontalsystems.bitstashwallet.modules.receive

import io.horizontalsystems.bitstashwallet.core.IAdapterManager
import io.horizontalsystems.bitstashwallet.core.IClipboardManager
import io.horizontalsystems.bitstashwallet.entities.Wallet
import io.horizontalsystems.bitstashwallet.modules.receive.viewitems.AddressItem

class ReceiveInteractor(
        private var wallet: Wallet,
        private var adapterManager: IAdapterManager,
        private var clipboardManager: IClipboardManager) : ReceiveModule.IInteractor {

    var delegate: ReceiveModule.IInteractorDelegate? = null

    override fun getReceiveAddress() {
        adapterManager.getReceiveAdapterForWallet(wallet)?.let { adapter ->
            val addressItem = AddressItem(adapter.receiveAddress, wallet.coin)
            delegate?.didReceiveAddress(addressItem)
        }
    }

    override fun copyToClipboard(coinAddress: String) {
        clipboardManager.copyText(coinAddress)
        delegate?.didCopyToClipboard()
    }
}
