package app.odapplications.bitstashwallet.modules.pin.unlock

import app.odapplications.bitstashwallet.SingleLiveEvent

class UnlockPinRouter: UnlockPinModule.IRouter {

    val dismissWithSuccess = SingleLiveEvent<Unit>()

    override fun dismissModuleWithSuccess() {
        dismissWithSuccess.call()
    }
}
