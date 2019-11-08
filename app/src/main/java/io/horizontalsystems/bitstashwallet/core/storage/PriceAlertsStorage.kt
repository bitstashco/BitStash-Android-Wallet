package io.horizontalsystems.bitstashwallet.core.storage

import io.horizontalsystems.bitstashwallet.core.IAppConfigProvider
import io.horizontalsystems.bitstashwallet.core.IPriceAlertsStorage
import io.horizontalsystems.bitstashwallet.entities.PriceAlert
import io.horizontalsystems.bitstashwallet.entities.PriceAlertRecord

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