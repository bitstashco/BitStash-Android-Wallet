package io.horizontalsystems.bitstashwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/storage/EnabledWalletsStorage;", "Lio/horizontalsystems/bitstashwallet/core/IEnabledWalletStorage;", "appDatabase", "Lio/horizontalsystems/bitstashwallet/core/storage/AppDatabase;", "(Lio/horizontalsystems/bitstashwallet/core/storage/AppDatabase;)V", "enabledWallets", "", "Lio/horizontalsystems/bitstashwallet/entities/EnabledWallet;", "getEnabledWallets", "()Ljava/util/List;", "deleteAll", "", "save", "coins", "app_devMainnetMasterDebug"})
public final class EnabledWalletsStorage implements io.horizontalsystems.bitstashwallet.core.IEnabledWalletStorage {
    private final io.horizontalsystems.bitstashwallet.core.storage.AppDatabase appDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.EnabledWallet> getEnabledWallets() {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.EnabledWallet> coins) {
    }
    
    @java.lang.Override()
    public void deleteAll() {
    }
    
    public EnabledWalletsStorage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.storage.AppDatabase appDatabase) {
        super();
    }
}