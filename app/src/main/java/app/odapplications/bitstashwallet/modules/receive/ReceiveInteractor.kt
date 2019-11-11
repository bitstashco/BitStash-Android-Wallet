package app.odapplications.bitstashwallet.modules.receive

import app.odapplications.bitstashwallet.core.IAdapterManager
import app.odapplications.bitstashwallet.core.IClipboardManager
import app.odapplications.bitstashwallet.entities.Wallet
import app.odapplications.bitstashwallet.modules.receive.viewitems.AddressItem

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
