package app.odapplications.bitstashwallet.modules.receive

import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.entities.Wallet
import app.odapplications.bitstashwallet.modules.receive.viewitems.AddressItem
import app.odapplications.bitstashwallet.viewHelpers.TextHelper

object ReceiveModule {

    interface IView {
        fun showAddress(address: AddressItem)
        fun showError(error: Int)
        fun showCopied()
        fun setHint(hint: Int)
    }

    interface IViewDelegate {
        fun viewDidLoad()
        fun onShareClick()
        fun onAddressClick()
    }

    interface IInteractor {
        fun getReceiveAddress()
        fun copyToClipboard(coinAddress: String)
    }

    interface IInteractorDelegate {
        fun didReceiveAddress(address: AddressItem)
        fun didFailToReceiveAddress(exception: Exception)
        fun didCopyToClipboard()
    }

    interface IRouter{
        fun shareAddress(address: String)
    }

    fun init(wallet: Wallet, view: ReceiveViewModel, router: IRouter) {
        val interactor = ReceiveInteractor(wallet, App.adapterManager, TextHelper)
        val presenter = ReceivePresenter(interactor, router)

        view.delegate = presenter
        presenter.view = view
        interactor.delegate = presenter
    }

}
