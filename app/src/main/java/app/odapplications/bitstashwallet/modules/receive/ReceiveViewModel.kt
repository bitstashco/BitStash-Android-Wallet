package app.odapplications.bitstashwallet.modules.receive

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.odapplications.bitstashwallet.SingleLiveEvent
import app.odapplications.bitstashwallet.entities.Wallet
import app.odapplications.bitstashwallet.modules.receive.viewitems.AddressItem

class ReceiveViewModel : ViewModel(), ReceiveModule.IView, ReceiveModule.IRouter {

    lateinit var delegate: ReceiveModule.IViewDelegate

    val showAddressLiveData = MutableLiveData<AddressItem>()
    val showErrorLiveData = MutableLiveData<Int>()
    val showCopiedLiveEvent = SingleLiveEvent<Unit>()
    val shareAddressLiveEvent = SingleLiveEvent<String>()
    val hintTextResLiveEvent = SingleLiveEvent<Int>()

    fun init(wallet: Wallet) {
        ReceiveModule.init(wallet, this, this)
        delegate.viewDidLoad()
    }

    override fun showAddress(addresses: AddressItem) {
        showAddressLiveData.value = addresses
    }

    override fun showError(error: Int) {
        showErrorLiveData.value = error
    }

    override fun showCopied() {
        showCopiedLiveEvent.call()
    }

    override fun shareAddress(address: String) {
        shareAddressLiveEvent.value = address
    }

    override fun setHint(hint: Int) {
        hintTextResLiveEvent.value = hint
    }
}
