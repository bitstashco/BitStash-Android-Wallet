package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/PredefinedAccountTypeManager;", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountTypeManager;", "appConfigProvider", "Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;", "accountManager", "Lapp/odapplications/bitstashwallet/core/IAccountManager;", "accountCreator", "Lapp/odapplications/bitstashwallet/core/IAccountCreator;", "(Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;Lapp/odapplications/bitstashwallet/core/IAccountManager;Lapp/odapplications/bitstashwallet/core/IAccountCreator;)V", "allTypes", "", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "getAllTypes", "()Ljava/util/List;", "account", "Lapp/odapplications/bitstashwallet/entities/Account;", "predefinedAccountType", "createAccount", "type", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "app_productionMainnetRelease"})
public final class PredefinedAccountTypeManager implements app.odapplications.bitstashwallet.core.IPredefinedAccountTypeManager {
    private final app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final app.odapplications.bitstashwallet.core.IAccountManager accountManager = null;
    private final app.odapplications.bitstashwallet.core.IAccountCreator accountCreator = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.core.IPredefinedAccountType> getAllTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.Account createAccount(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType type) {
        return null;
    }
    
    public PredefinedAccountTypeManager(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAccountCreator accountCreator) {
        super();
    }
}