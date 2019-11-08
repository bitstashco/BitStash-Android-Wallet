package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IAccountFactory;", "", "account", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "type", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "backedUp", "", "defaultSyncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "app_devMainnetMasterDebug"})
public abstract interface IAccountFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.AccountType type, boolean backedUp, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode defaultSyncMode);
}