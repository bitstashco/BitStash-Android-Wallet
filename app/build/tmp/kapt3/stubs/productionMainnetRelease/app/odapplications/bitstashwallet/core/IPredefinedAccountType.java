package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u00a8\u0006\u0010"}, d2 = {"Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "", "coinCodes", "", "getCoinCodes", "()I", "defaultAccountType", "Lapp/odapplications/bitstashwallet/core/DefaultAccountType;", "getDefaultAccountType", "()Lapp/odapplications/bitstashwallet/core/DefaultAccountType;", "title", "getTitle", "supports", "", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "app_productionMainnetRelease"})
public abstract interface IPredefinedAccountType {
    
    public abstract int getTitle();
    
    public abstract int getCoinCodes();
    
    @org.jetbrains.annotations.NotNull()
    public abstract app.odapplications.bitstashwallet.core.DefaultAccountType getDefaultAccountType();
    
    public abstract boolean supports(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType accountType);
}