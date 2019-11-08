package io.horizontalsystems.bitstashwallet.modules.settings.basecurrency

import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class BaseCurrencySettingsRouter : BaseCurrencySettingsModule.IRouter {
    val closeLiveEvent = SingleLiveEvent<Unit>()

    override fun close() {
        closeLiveEvent.call()
    }
}
