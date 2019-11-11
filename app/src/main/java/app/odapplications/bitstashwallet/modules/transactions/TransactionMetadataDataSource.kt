package app.odapplications.bitstashwallet.modules.transactions

import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.Currency
import app.odapplications.bitstashwallet.entities.CurrencyValue
import app.odapplications.bitstashwallet.entities.Wallet
import java.math.BigDecimal

class TransactionMetadataDataSource {

    private val lastBlockHeights = mutableMapOf<Wallet, Int>()
    private val thresholds = mutableMapOf<Wallet, Int>()
    private val rates = mutableMapOf<Coin, MutableMap<Long, CurrencyValue>>()

    fun setLastBlockHeight(lastBlockHeight: Int, wallet: Wallet) {
        lastBlockHeights[wallet] = lastBlockHeight
    }

    fun getLastBlockHeight(wallet: Wallet): Int? {
        return lastBlockHeights[wallet]
    }

    fun setConfirmationThreshold(confirmationThreshold: Int, wallet: Wallet) {
        thresholds[wallet] = confirmationThreshold
    }

    fun getConfirmationThreshold(wallet: Wallet): Int =
            thresholds[wallet] ?: 1

    fun setRate(rateValue: BigDecimal, coin: Coin, currency: Currency, timestamp: Long) {
        if (!rates.containsKey(coin)) {
            rates[coin] = mutableMapOf()
        }

        rates[coin]?.set(timestamp, CurrencyValue(currency, rateValue))
    }

    fun getRate(coin: Coin, timestamp: Long): CurrencyValue? {
        return rates[coin]?.get(timestamp)
    }

    fun clearRates() {
        rates.clear()
    }

}
