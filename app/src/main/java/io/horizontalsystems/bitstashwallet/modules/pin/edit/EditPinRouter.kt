package io.horizontalsystems.bitstashwallet.modules.pin.edit

import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class EditPinRouter: EditPinModule.IRouter {

    val dismissWithSuccess = SingleLiveEvent<Unit>()

    override fun dismissModuleWithSuccess() {
        dismissWithSuccess.call()
    }
}
