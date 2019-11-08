package io.horizontalsystems.bitstashwallet.modules.managecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016J\"\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0016\u0010%\u001a\u00020&2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eH\u0016J\u0012\u0010\'\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011\u00a8\u0006("}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/managecoins/ManageWalletsInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractor;", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "walletManager", "Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "accountCreator", "Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;", "walletFactory", "Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;", "predefinedAccountTypeManager", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;Lio/horizontalsystems/bitstashwallet/core/IWalletManager;Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;)V", "coins", "", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "getCoins", "()Ljava/util/List;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractorDelegate;)V", "predefinedAccountTypes", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "getPredefinedAccountTypes", "wallets", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "getWallets", "createWallet", "coin", "restoreWallet", "accountType", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "saveWallets", "", "wallet", "app_devMainnetMasterDebug"})
public final class ManageWalletsInteractor implements io.horizontalsystems.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IAccountCreator accountCreator = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletFactory walletFactory = null;
    private final io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> getCoins() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> getWallets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType> getPredefinedAccountTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Wallet wallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
        return null;
    }
    
    @java.lang.Override()
    public void saveWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Wallet createWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Wallet restoreWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode) {
        return null;
    }
    
    public ManageWalletsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountCreator accountCreator, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletFactory walletFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager) {
        super();
    }
}