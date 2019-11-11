package app.odapplications.bitstashwallet.modules.settings.language

import app.odapplications.bitstashwallet.SingleLiveEvent

class LanguageSettingsRouter: LanguageSettingsModule.ILanguageSettingsRouter {
    val reloadAppLiveEvent = SingleLiveEvent<Unit>()
    val closeLiveEvent = SingleLiveEvent<Unit>()

    override fun reloadAppInterface() {
        reloadAppLiveEvent.call()
    }

    override fun close() {
        closeLiveEvent.call()
    }
}
