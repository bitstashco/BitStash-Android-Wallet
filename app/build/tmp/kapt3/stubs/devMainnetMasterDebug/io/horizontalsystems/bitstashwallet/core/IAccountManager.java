package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\fH&J\b\u0010\u001a\u001a\u00020\u0015H&J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "", "accounts", "", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "getAccounts", "()Ljava/util/List;", "accountsFlowable", "Lio/reactivex/Flowable;", "getAccountsFlowable", "()Lio/reactivex/Flowable;", "deleteAccountObservable", "", "getDeleteAccountObservable", "isAccountsEmpty", "", "()Z", "account", "coinType", "Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "clear", "", "clearAccounts", "create", "delete", "id", "preloadAccounts", "update", "app_devMainnetMasterDebug"})
public abstract interface IAccountManager {
    
    public abstract boolean isAccountsEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Account> getAccounts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<io.horizontalsystems.bitstashwallet.entities.Account>> getAccountsFlowable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.lang.String> getDeleteAccountObservable();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bitstashwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinType coinType);
    
    public abstract void preloadAccounts();
    
    public abstract void create(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account);
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void clear();
    
    public abstract void clearAccounts();
}