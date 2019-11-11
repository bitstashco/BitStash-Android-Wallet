package app.odapplications.bitstashwallet.modules.pin.edit

import app.odapplications.bitstashwallet.SingleLiveEvent

class EditPinRouter: EditPinModule.IRouter {

    val dismissWithSuccess = SingleLiveEvent<Unit>()

    override fun dismissModuleWithSuccess() {
        dismissWithSuccess.call()
    }
}
