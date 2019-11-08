package io.horizontalsystems.bitstashwallet.modules.settings.main

import io.horizontalsystems.bitstashwallet.entities.Currency

class MainSettingsHelper {

    fun displayName(baseCurrency: Currency): String {
        return baseCurrency.code
    }

}
