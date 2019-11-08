package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/PoolRepo;", "", "()V", "activePoolWallets", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "activePools", "Lio/horizontalsystems/bitstashwallet/modules/transactions/Pool;", "getActivePools", "()Ljava/util/List;", "allPools", "getAllPools", "pools", "", "activatePools", "", "wallets", "deactivatePools", "getPool", "wallet", "isPoolActiveByWallet", "", "app_devMainnetMasterDebug"})
public final class PoolRepo {
    private java.util.Map<io.horizontalsystems.bitstashwallet.entities.Wallet, io.horizontalsystems.bitstashwallet.modules.transactions.Pool> pools;
    private java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> activePoolWallets;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bitstashwallet.modules.transactions.Pool> getActivePools() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bitstashwallet.modules.transactions.Pool> getAllPools() {
        return null;
    }
    
    public final void activatePools(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets) {
    }
    
    public final void deactivatePools(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.Pool getPool(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    public final boolean isPoolActiveByWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        return false;
    }
    
    public PoolRepo() {
        super();
    }
}