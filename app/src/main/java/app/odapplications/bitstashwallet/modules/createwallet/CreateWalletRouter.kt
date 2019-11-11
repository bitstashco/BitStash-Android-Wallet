package app.odapplications.bitstashwallet.modules.createwallet

import app.odapplications.bitstashwallet.SingleLiveEvent

class CreateWalletRouter : CreateWalletModule.IRouter {
    val startMainModuleLiveEvent = SingleLiveEvent<Unit>()

    override fun startMainModule() {
        startMainModuleLiveEvent.call()
    }
}
