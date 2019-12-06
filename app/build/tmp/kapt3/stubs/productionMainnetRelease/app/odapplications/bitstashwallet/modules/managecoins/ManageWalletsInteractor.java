package app.odapplications.bitstashwallet.modules.managecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016J\"\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0016\u0010%\u001a\u00020&2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eH\u0016J\u0012\u0010\'\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011\u00a8\u0006("}, d2 = {"Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsInteractor;", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractor;", "appConfigProvider", "Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;", "walletManager", "Lapp/odapplications/bitstashwallet/core/IWalletManager;", "accountCreator", "Lapp/odapplications/bitstashwallet/core/IAccountCreator;", "walletFactory", "Lapp/odapplications/bitstashwallet/core/IWalletFactory;", "predefinedAccountTypeManager", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountTypeManager;", "(Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;Lapp/odapplications/bitstashwallet/core/IWalletManager;Lapp/odapplications/bitstashwallet/core/IAccountCreator;Lapp/odapplications/bitstashwallet/core/IWalletFactory;Lapp/odapplications/bitstashwallet/core/IPredefinedAccountTypeManager;)V", "coins", "", "Lapp/odapplications/bitstashwallet/entities/Coin;", "getCoins", "()Ljava/util/List;", "delegate", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractorDelegate;)V", "predefinedAccountTypes", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "getPredefinedAccountTypes", "wallets", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getWallets", "createWallet", "coin", "restoreWallet", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "saveWallets", "", "wallet", "app_productionMainnetRelease"})
public final class ManageWalletsInteractor implements app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final app.odapplications.bitstashwallet.core.IWalletManager walletManager = null;
    private final app.odapplications.bitstashwallet.core.IAccountCreator accountCreator = null;
    private final app.odapplications.bitstashwallet.core.IWalletFactory walletFactory = null;
    private final app.odapplications.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.entities.Coin> getCoins() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.entities.Wallet> getWallets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.core.IPredefinedAccountType> getPredefinedAccountTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.Wallet wallet(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin) {
        return null;
    }
    
    @java.lang.Override()
    public void saveWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.Wallet> wallets) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.Wallet createWallet(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.Wallet restoreWallet(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.SyncMode syncMode) {
        return null;
    }
    
    public ManageWalletsInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAccountCreator accountCreator, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletFactory walletFactory, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager) {
        super();
    }
}