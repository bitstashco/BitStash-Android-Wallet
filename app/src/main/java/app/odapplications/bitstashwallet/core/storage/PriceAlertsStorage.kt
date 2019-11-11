package app.odapplications.bitstashwallet.core.storage

import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.IPriceAlertsStorage
import app.odapplications.bitstashwallet.entities.PriceAlert
import app.odapplications.bitstashwallet.entities.PriceAlertRecord

class PriceAlertsStorage(private val appConfigProvider: IAppConfigProvider, appDatabase: AppDatabase) : IPriceAlertsStorage {

    override val priceAlertCount: Int
        get() = dao.count()

    private val dao = appDatabase.priceAlertsDao()

    override fun all(): List<PriceAlert> {
        return dao.all().mapNotNull { priceAlertRecord ->
            appConfigProvider.coins.firstOrNull {
                it.code == priceAlertRecord.coinCode
            }?.let { coin ->
                PriceAlert(coin, PriceAlert.State.valueOf(priceAlertRecord.stateRaw), priceAlertRecord.lastRate)
            }
        }
    }

    override fun save(priceAlerts: List<PriceAlert>) {
        priceAlerts.forEach { priceAlert ->
            priceAlert.state.value?.let {
                dao.update(PriceAlertRecord(priceAlert.coin.code, it, priceAlert.lastRate))
            }
        }
    }

    override fun delete(priceAlerts: List<PriceAlert>) {
        dao.delete(priceAlerts.map { it.coin.code })
    }

    override fun deleteExcluding(coinCodes: List<String>) {
        dao.deleteExcluding(coinCodes)
    }
}