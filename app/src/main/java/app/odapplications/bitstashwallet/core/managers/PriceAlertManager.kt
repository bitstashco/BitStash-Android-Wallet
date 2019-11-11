package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.IPriceAlertsStorage
import app.odapplications.bitstashwallet.core.IWalletManager
import app.odapplications.bitstashwallet.entities.PriceAlert
import io.reactivex.schedulers.Schedulers

class PriceAlertManager(private val walletManager: IWalletManager, private val priceAlertsStorage: IPriceAlertsStorage) {

    init {
        walletManager.walletsUpdatedSignal
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    val enabledCoins = walletManager.wallets.map { it.coin.code }

                    priceAlertsStorage.deleteExcluding(enabledCoins)
                }
    }

    fun getPriceAlerts(): List<PriceAlert> {
        val priceAlerts = priceAlertsStorage.all()

        return walletManager.wallets.map { wallet ->
            priceAlerts.firstOrNull { it.coin == wallet.coin } ?: PriceAlert(wallet.coin, PriceAlert.State.OFF)
        }
    }

    fun savePriceAlerts(priceAlerts: List<PriceAlert>) {
        priceAlertsStorage.save(priceAlerts.filter { it.state.value != null })
        priceAlertsStorage.delete(priceAlerts.filter { it.state.value == null })
    }

}
