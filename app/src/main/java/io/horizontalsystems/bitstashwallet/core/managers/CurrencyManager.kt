package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.IAppConfigProvider
import io.horizontalsystems.bitstashwallet.core.ICurrencyManager
import io.horizontalsystems.bitstashwallet.core.ILocalStorage
import io.horizontalsystems.bitstashwallet.entities.Currency
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
