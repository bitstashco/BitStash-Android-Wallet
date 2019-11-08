package io.horizontalsystems.bitstashwallet.modules.pin.unlock

import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class UnlockPinRouter: UnlockPinModule.IRouter {

    val dismissWithSuccess = SingleLiveEvent<Unit>()

    override fun dismissModuleWithSuccess() {
        dismissWithSuccess.call()
    }
}
