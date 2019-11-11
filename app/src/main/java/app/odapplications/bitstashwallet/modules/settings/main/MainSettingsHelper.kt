package app.odapplications.bitstashwallet.modules.settings.main

import app.odapplications.bitstashwallet.entities.Currency

class MainSettingsHelper {

    fun displayName(baseCurrency: Currency): String {
        return baseCurrency.code
    }

}
