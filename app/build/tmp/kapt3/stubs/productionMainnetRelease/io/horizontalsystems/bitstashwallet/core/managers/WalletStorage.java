package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0016J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/WalletStorage;", "Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "walletFactory", "Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;", "storage", "Lio/horizontalsystems/bitstashwallet/core/IEnabledWalletStorage;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;Lio/horizontalsystems/bitstashwallet/core/IEnabledWalletStorage;)V", "enabledCoins", "", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "save", "", "wallets", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "accounts", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "app_productionMainnetRelease"})
public final class WalletStorage implements io.horizontalsystems.bitstashwallet.core.IWalletStorage {
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletFactory walletFactory = null;
    private final io.horizontalsystems.bitstashwallet.core.IEnabledWalletStorage storage = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Account> accounts) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> enabledCoins() {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets) {
    }
    
    public WalletStorage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletFactory walletFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IEnabledWalletStorage storage) {
        super();
    }
}