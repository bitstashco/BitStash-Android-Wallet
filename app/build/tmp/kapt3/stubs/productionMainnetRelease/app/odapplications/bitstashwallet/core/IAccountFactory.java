package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/core/IAccountFactory;", "", "account", "Lapp/odapplications/bitstashwallet/entities/Account;", "type", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "backedUp", "", "defaultSyncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "app_productionMainnetRelease"})
public abstract interface IAccountFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract app.odapplications.bitstashwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType type, boolean backedUp, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.SyncMode defaultSyncMode);
}