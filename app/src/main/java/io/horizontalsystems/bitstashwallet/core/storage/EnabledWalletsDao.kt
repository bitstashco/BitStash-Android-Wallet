package io.horizontalsystems.bitstashwallet.core.storage

import androidx.room.*
import io.horizontalsystems.bitstashwallet.entities.EnabledWallet

@Dao
interface EnabledWalletsDao {

    @Query("SELECT * FROM EnabledWallet ORDER BY `walletOrder` ASC")
    fun enabledCoins(): List<EnabledWallet>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(storableCoin: EnabledWallet)

    @Query("DELETE FROM EnabledWallet")
    fun deleteAll()

    @Transaction
    fun insertCoins(coins: List<EnabledWallet>) {
        coins.forEach { insert(it) }
    }
}
