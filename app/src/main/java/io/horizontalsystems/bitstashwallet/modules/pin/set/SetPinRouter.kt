package io.horizontalsystems.bitstashwallet.modules.pin.set

import io.horizontalsystems.bitstashwallet.SingleLiveEvent

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
