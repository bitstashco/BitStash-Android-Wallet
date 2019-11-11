package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.ICurrencyManager
import app.odapplications.bitstashwallet.core.ILocalStorage
import app.odapplications.bitstashwallet.entities.Currency
import io.reactivex.subjects.PublishSubject

class CurrencyManager(private val localStorage: ILocalStorage, private val appConfigProvider: IAppConfigProvider) : ICurrencyManager {

    override var baseCurrency: Currency
        get() {
            val currencies = appConfigProvider.currencies
            val storedCode = localStorage.baseCurrencyCode
            return storedCode?.let { code ->
                currencies.first { it.code == code }
            } ?: currencies.first()
        }
        set(value) {
            localStorage.baseCurrencyCode = value.code
            baseCurrencyUpdatedSignal.onNext(Unit)
        }

    override val currencies: List<Currency>
        get() = appConfigProvider.currencies

    override val baseCurrencyUpdatedSignal = PublishSubject.create<Unit>()
}
