package io.horizontalsystems.bitstashwallet.modules.welcome

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class WelcomeViewModel : ViewModel(), WelcomeModule.IView, WelcomeModule.IRouter {

    lateinit var delegate: WelcomeModule.IViewDelegate

    val openRestoreModule = SingleLiveEvent<Void>()
    val openCreateWalletModule = SingleLiveEvent<Void>()
    val appVersionLiveData = MutableLiveData<String>()

    fun init() {
        WelcomeModule.init(this, this)
        delegate.viewDidLoad()
    }

    // IView

    override fun setAppVersion(appVersion: String) {
        appVersionLiveData.value = appVersion
    }

    // IRouter

    override fun openRestoreModule() {
        openRestoreModule.call()
    }

    override fun openCreateWalletModule() {
        openCreateWalletModule.call()
    }
}
