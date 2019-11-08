package io.horizontalsystems.bitstashwallet.core.storage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/storage/EnabledWalletsDao;", "", "deleteAll", "", "enabledCoins", "", "Lio/horizontalsystems/bitstashwallet/entities/EnabledWallet;", "insert", "storableCoin", "insertCoins", "coins", "app_productionMainnetRelease"})
public abstract interface EnabledWalletsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM EnabledWallet ORDER BY `walletOrder` ASC")
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.EnabledWallet> enabledCoins();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.EnabledWallet storableCoin);
    
    @androidx.room.Query(value = "DELETE FROM EnabledWallet")
    public abstract void deleteAll();
    
    @androidx.room.Transaction()
    public abstract void insertCoins(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.EnabledWallet> coins);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void insertCoins(io.horizontalsystems.bitstashwallet.core.storage.EnabledWalletsDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.entities.EnabledWallet> coins) {
        }
    }
}