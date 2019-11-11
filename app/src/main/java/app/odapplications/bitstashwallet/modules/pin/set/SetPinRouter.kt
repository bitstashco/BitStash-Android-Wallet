package app.odapplications.bitstashwallet.modules.pin.set

import app.odapplications.bitstashwallet.SingleLiveEvent

class SetPinRouter: SetPinModule.IRouter {

    val navigateToMain = SingleLiveEvent<Unit>()
    val dismissWithSuccess = SingleLiveEvent<Unit>()

    override fun dismissModuleWithSuccess() {
        dismissWithSuccess.call()
    }

    override fun navigateToMain() {
        navigateToMain.call()
    }
}
