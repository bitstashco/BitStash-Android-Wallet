package io.horizontalsystems.bitstashwallet.modules.createwallet

import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class CreateWalletRouter : CreateWalletModule.IRouter {
    val startMainModuleLiveEvent = SingleLiveEvent<Unit>()

    override fun startMainModule() {
        startMainModuleLiveEvent.call()
    }
}
