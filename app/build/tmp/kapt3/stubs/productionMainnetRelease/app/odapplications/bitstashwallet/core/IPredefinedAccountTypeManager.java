package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lapp/odapplications/bitstashwallet/core/IPredefinedAccountTypeManager;", "", "allTypes", "", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "getAllTypes", "()Ljava/util/List;", "account", "Lapp/odapplications/bitstashwallet/entities/Account;", "predefinedAccountType", "createAccount", "type", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "app_productionMainnetRelease"})
public abstract interface IPredefinedAccountTypeManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<app.odapplications.bitstashwallet.core.IPredefinedAccountType> getAllTypes();
    
    @org.jetbrains.annotations.Nullable()
    public abstract app.odapplications.bitstashwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType);
    
    @org.jetbrains.annotations.Nullable()
    public abstract app.odapplications.bitstashwallet.entities.Account createAccount(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType);
    
    @org.jetbrains.annotations.Nullable()
    public abstract app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType type);
}