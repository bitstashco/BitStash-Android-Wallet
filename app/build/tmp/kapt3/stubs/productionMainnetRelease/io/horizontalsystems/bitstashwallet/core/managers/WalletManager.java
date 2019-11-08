package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00150\u00150\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/WalletManager;", "Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "accountManager", "Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "walletFactory", "Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;", "storage", "Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;", "(Lio/horizontalsystems/bitstashwallet/core/IAccountManager;Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;)V", "cache", "Lio/horizontalsystems/bitstashwallet/core/managers/WalletManager$WalletsCache;", "disposable", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "wallets", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "getWallets", "()Ljava/util/List;", "walletsUpdatedSignal", "Lio/reactivex/subjects/PublishSubject;", "", "getWalletsUpdatedSignal", "()Lio/reactivex/subjects/PublishSubject;", "clear", "enable", "loadWallets", "wallet", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "WalletsCache", "app_productionMainnetRelease"})
public final class WalletManager implements io.horizontalsystems.bitstashwallet.core.IWalletManager {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> walletsUpdatedSignal = null;
    private final io.horizontalsystems.bitstashwallet.core.managers.WalletManager.WalletsCache cache = null;
    private final io.reactivex.disposables.Disposable disposable = null;
    private final io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletFactory walletFactory = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletStorage storage = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> getWallets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.PublishSubject<kotlin.Unit> getWalletsUpdatedSignal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Wallet wallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
        return null;
    }
    
    @java.lang.Override()
    public void loadWallets() {
    }
    
    @java.lang.Override()
    public void enable(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public WalletManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletFactory walletFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletStorage storage) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rR*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/WalletManager$WalletsCache;", "", "()V", "<set-?>", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "walletsSet", "getWalletsSet", "()Ljava/util/Set;", "clear", "", "set", "wallets", "", "app_productionMainnetRelease"})
    static final class WalletsCache {
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<io.horizontalsystems.bitstashwallet.entities.Wallet> walletsSet;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<io.horizontalsystems.bitstashwallet.entities.Wallet> getWalletsSet() {
            return null;
        }
        
        public final void set(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets) {
        }
        
        public final void clear() {
        }
        
        public WalletsCache() {
            super();
        }
    }
}