package app.odapplications.bitstashwallet.modules.receive

import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.entities.CoinType
import app.odapplications.bitstashwallet.modules.receive.viewitems.AddressItem

class ReceivePresenter(
        private val interactor: ReceiveModule.IInteractor,
        private val router: ReceiveModule.IRouter) : ReceiveModule.IViewDelegate, ReceiveModule.IInteractorDelegate {

    var view: ReceiveModule.IView? = null
    private var receiveAddress: AddressItem? = null

    override fun viewDidLoad() {
        interactor.getReceiveAddress()
    }

    override fun didReceiveAddress(address: AddressItem) {
        this.receiveAddress = address
        view?.showAddress(address)
        view?.setHint(getHint(address.coin.type))
    }

    private fun getHint(type: CoinType): Int {
        return when(type) {
            is CoinType.Eos -> R.string.Deposit_Your_Account
            else -> R.string.Deposit_Your_Address
        }
    }

    override fun didFailToReceiveAddress(exception: Exception) {
        view?.showError(R.string.Error)
    }

    override fun onShareClick() {
        receiveAddress?.address?.let { router.shareAddress(it) }
    }

    override fun onAddressClick() {
        receiveAddress?.address?.let { interactor.copyToClipboard(it) }
    }

    override fun didCopyToClipboard() {
        view?.showCopied()
    }

}
