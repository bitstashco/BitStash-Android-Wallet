package app.odapplications.bitstashwallet.modules.keystore

import androidx.lifecycle.ViewModel
import app.odapplications.bitstashwallet.SingleLiveEvent

class KeyStoreViewModel : ViewModel(), KeyStoreModule.IView, KeyStoreModule.IRouter {

    lateinit var delegate: KeyStoreModule.IViewDelegate

    val showNoSystemLockWarning = SingleLiveEvent<Void>()
    val showInvalidKeyWarning = SingleLiveEvent<Void>()
    val promptUserAuthentication = SingleLiveEvent<Void>()
    val openLaunchModule = SingleLiveEvent<Void>()
    val closeApplication = SingleLiveEvent<Void>()

    fun init(mode: KeyStoreModule.ModeType) {
        KeyStoreModule.init(this, this, mode)
        delegate.viewDidLoad()
    }

    // IView
    override fun showNoSystemLockWarning() {
        showNoSystemLockWarning.call()
    }

    override fun showInvalidKeyWarning() {
        showInvalidKeyWarning.call()
    }

    override fun promptUserAuthentication() {
        promptUserAuthentication.call()
    }

    // IRouter
    override fun openLaunchModule() {
        openLaunchModule.call()
    }

    override fun closeApplication() {
        closeApplication.call()
    }

}
