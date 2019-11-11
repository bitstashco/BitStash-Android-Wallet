package app.odapplications.bitstashwallet.modules.settings.basecurrency

import app.odapplications.bitstashwallet.SingleLiveEvent

class BaseCurrencySettingsRouter : BaseCurrencySettingsModule.IRouter {
    val closeLiveEvent = SingleLiveEvent<Unit>()

    override fun close() {
        closeLiveEvent.call()
    }
}
