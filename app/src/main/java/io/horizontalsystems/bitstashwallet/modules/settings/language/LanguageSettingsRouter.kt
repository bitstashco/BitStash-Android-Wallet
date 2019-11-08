package io.horizontalsystems.bitstashwallet.modules.settings.language

import io.horizontalsystems.bitstashwallet.SingleLiveEvent

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
