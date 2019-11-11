package app.odapplications.bitstashwallet.modules.settings.language

import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.ILanguageManager

class LanguageSettingsInteractor(
        private val languageManager: ILanguageManager,
        private val appConfigProvider: IAppConfigProvider
) : LanguageSettingsModule.ILanguageSettingsInteractor {

    override var currentLanguage: String
        get() = languageManager.currentLanguage
        set(value) {
            languageManager.currentLanguage = value
        }

    override val availableLanguages: List<String>
        get() = appConfigProvider.localizations

    override fun getName(language: String): String {
        return languageManager.getName(language)
    }

    override fun getNativeName(language: String): String {
        return languageManager.getNativeName(language)
    }
}
