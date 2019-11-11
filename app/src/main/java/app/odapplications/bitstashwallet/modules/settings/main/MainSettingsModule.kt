package app.odapplications.bitstashwallet.modules.settings.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.entities.Currency

object MainSettingsModule {

    interface IMainSettingsView {
        fun setBackedUp(backedUp: Boolean)
        fun setBaseCurrency(currency: String)
        fun setLanguage(language: String)
        fun setLightMode(lightMode: Boolean)
        fun setAppVersion(appVersion: String)
    }

    interface IMainSettingsViewDelegate {
        fun viewDidLoad()
        fun didTapSecurity()
        fun didManageCoins()
        fun didTapBaseCurrency()
        fun didTapLanguage()
        fun didSwitchLightMode(lightMode: Boolean)
        fun didTapAbout()
        fun didTapCompanyLogo()
        fun didTapReportProblem()
        fun didTapTellFriends()
        fun didTapNotifications()
    }

    interface IMainSettingsInteractor {
        val companyWebPageLink: String
        val appWebPageLink: String
        val allBackedUp: Boolean
        val currentLanguageDisplayName: String
        val baseCurrency: Currency
        val appVersion: String
        var lightMode: Boolean

        fun clear()
    }

    interface IMainSettingsInteractorDelegate {
        fun didUpdateAllBackedUp(allBackedUp: Boolean)
        fun didUpdateBaseCurrency()
    }

    interface IMainSettingsRouter {
        fun showSecuritySettings()
        fun showManageCoins()
        fun showBaseCurrencySettings()
        fun showLanguageSettings()
        fun showAbout()
        fun openLink(url: String)
        fun reloadAppInterface()
        fun showReportProblem()
        fun showShareApp(appWebPageLink: String)
        fun showNotifications()
    }

    class Factory : ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            val view = MainSettingsView()
            val router = MainSettingsRouter()
            val interactor = MainSettingsInteractor(
                    localStorage = App.localStorage,
                    backupManager = App.backupManager,
                    languageManager = App.languageManager,
                    systemInfoManager = App.systemInfoManager,
                    currencyManager = App.currencyManager,
                    appConfigProvider = App.appConfigProvider
            )
            val presenter = MainSettingsPresenter(view, router, interactor)
            interactor.delegate = presenter

            return presenter as T
        }
    }

}
