package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/DefaultWalletCreator;", "", "walletManager", "Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "walletFactory", "Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;", "(Lio/horizontalsystems/bitstashwallet/core/IWalletManager;Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;Lio/horizontalsystems/bitstashwallet/core/IWalletFactory;)V", "createWallet", "", "account", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "defaultCoinCodes", "", "", "Lio/horizontalsystems/bitstashwallet/modules/transactions/CoinCode;", "accountType", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "defaultWallets", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "handleCreate", "app_devMainnetMasterDebug"})
public final class DefaultWalletCreator {
    private final io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletFactory walletFactory = null;
    
    public final void handleCreate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account) {
    }
    
    public final void createWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
    }
    
    private final java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> defaultWallets(io.horizontalsystems.bitstashwallet.entities.Account account) {
        return null;
    }
    
    private final java.util.List<java.lang.String> defaultCoinCodes(io.horizontalsystems.bitstashwallet.entities.AccountType accountType) {
        return null;
    }
    
    public DefaultWalletCreator(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletFactory walletFactory) {
        super();
    }
}