package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/PredefinedAccountTypeManager;", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "accountManager", "Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "accountCreator", "Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;Lio/horizontalsystems/bitstashwallet/core/IAccountManager;Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;)V", "allTypes", "", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "getAllTypes", "()Ljava/util/List;", "account", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "predefinedAccountType", "createAccount", "type", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "app_productionMainnetRelease"})
public final class PredefinedAccountTypeManager implements io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager {
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IAccountCreator accountCreator = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType> getAllTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Account createAccount(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType predefinedAccountType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.AccountType type) {
        return null;
    }
    
    public PredefinedAccountTypeManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountCreator accountCreator) {
        super();
    }
}