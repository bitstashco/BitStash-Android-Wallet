package app.odapplications.bitstashwallet.modules.settings.basecurrency

import app.odapplications.bitstashwallet.core.ICurrencyManager
import app.odapplications.bitstashwallet.entities.Currency

class BaseCurrencySettingsInteractor(private val currencyManager: ICurrencyManager) : BaseCurrencySettingsModule.IInteractor {

    override val currencies: List<Currency>
        get() = currencyManager.currencies

    override var baseCurrency: Currency
        get() = currencyManager.baseCurrency
        set(value) {
            currencyManager.baseCurrency = value
        }
}
