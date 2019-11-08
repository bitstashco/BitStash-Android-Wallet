package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\"\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/AccountCreator;", "Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;", "accountManager", "Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "accountFactory", "Lio/horizontalsystems/bitstashwallet/core/IAccountFactory;", "wordsManager", "Lio/horizontalsystems/bitstashwallet/core/IWordsManager;", "defaultWalletCreator", "Lio/horizontalsystems/bitstashwallet/core/managers/DefaultWalletCreator;", "(Lio/horizontalsystems/bitstashwallet/core/IAccountManager;Lio/horizontalsystems/bitstashwallet/core/IAccountFactory;Lio/horizontalsystems/bitstashwallet/core/IWordsManager;Lio/horizontalsystems/bitstashwallet/core/managers/DefaultWalletCreator;)V", "createAccount", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "defaultAccountType", "Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType;", "accountType", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "isBackedUp", "", "defaultSyncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "createAccountType", "createMnemonicAccountType", "wordsCount", "", "createNewAccount", "createDefaultWallets", "", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "createRestoredAccount", "syncMode", "app_devMainnetMasterDebug"})
public final class AccountCreator implements io.horizontalsystems.bitstashwallet.core.IAccountCreator {
    private final io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IAccountFactory accountFactory = null;
    private final io.horizontalsystems.bitstashwallet.core.IWordsManager wordsManager = null;
    private final io.horizontalsystems.bitstashwallet.core.managers.DefaultWalletCreator defaultWalletCreator = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Account createRestoredAccount(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode, boolean createDefaultWallets) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Account createNewAccount(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.DefaultAccountType defaultAccountType, boolean createDefaultWallets) {
        return null;
    }
    
    @java.lang.Override()
    public void createNewAccount(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
    }
    
    private final io.horizontalsystems.bitstashwallet.entities.Account createAccount(io.horizontalsystems.bitstashwallet.core.DefaultAccountType defaultAccountType) {
        return null;
    }
    
    private final io.horizontalsystems.bitstashwallet.entities.Account createAccount(io.horizontalsystems.bitstashwallet.entities.AccountType accountType, boolean isBackedUp, io.horizontalsystems.bitstashwallet.entities.SyncMode defaultSyncMode) {
        return null;
    }
    
    private final io.horizontalsystems.bitstashwallet.entities.AccountType createAccountType(io.horizontalsystems.bitstashwallet.core.DefaultAccountType defaultAccountType) {
        return null;
    }
    
    private final io.horizontalsystems.bitstashwallet.entities.AccountType createMnemonicAccountType(int wordsCount) {
        return null;
    }
    
    public AccountCreator(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountFactory accountFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWordsManager wordsManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.DefaultWalletCreator defaultWalletCreator) {
        super();
    }
}