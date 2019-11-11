package app.odapplications.bitstashwallet.core.storage

import app.odapplications.bitstashwallet.core.IEnabledWalletStorage
import app.odapplications.bitstashwallet.entities.EnabledWallet

class EnabledWalletsStorage(private val appDatabase: AppDatabase) : IEnabledWalletStorage {

    override val enabledWallets: List<EnabledWallet>
        get() = appDatabase.walletsDao().enabledCoins()

    override fun save(coins: List<EnabledWallet>) {
        appDatabase.walletsDao().deleteAll()
        appDatabase.walletsDao().insertCoins(coins)
    }

    override fun deleteAll() {
        appDatabase.walletsDao().deleteAll()
    }
}
