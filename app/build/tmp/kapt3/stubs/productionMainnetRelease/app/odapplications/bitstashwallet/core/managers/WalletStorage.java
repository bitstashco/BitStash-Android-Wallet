package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0016J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/WalletStorage;", "Lapp/odapplications/bitstashwallet/core/IWalletStorage;", "appConfigProvider", "Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;", "walletFactory", "Lapp/odapplications/bitstashwallet/core/IWalletFactory;", "storage", "Lapp/odapplications/bitstashwallet/core/IEnabledWalletStorage;", "(Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;Lapp/odapplications/bitstashwallet/core/IWalletFactory;Lapp/odapplications/bitstashwallet/core/IEnabledWalletStorage;)V", "enabledCoins", "", "Lapp/odapplications/bitstashwallet/entities/Coin;", "save", "", "wallets", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "accounts", "Lapp/odapplications/bitstashwallet/entities/Account;", "app_productionMainnetRelease"})
public final class WalletStorage implements app.odapplications.bitstashwallet.core.IWalletStorage {
    private final app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final app.odapplications.bitstashwallet.core.IWalletFactory walletFactory = null;
    private final app.odapplications.bitstashwallet.core.IEnabledWalletStorage storage = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.entities.Wallet> wallets(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.Account> accounts) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.entities.Coin> enabledCoins() {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.Wallet> wallets) {
    }
    
    public WalletStorage(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletFactory walletFactory, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IEnabledWalletStorage storage) {
        super();
    }
}