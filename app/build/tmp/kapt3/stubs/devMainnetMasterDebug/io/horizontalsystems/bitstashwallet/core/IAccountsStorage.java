package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IAccountsStorage;", "", "isAccountsEmpty", "", "()Z", "allAccounts", "", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "clear", "", "clearDeleted", "delete", "id", "", "getDeletedAccountIds", "getNonBackedUpCount", "Lio/reactivex/Flowable;", "", "save", "account", "update", "app_devMainnetMasterDebug"})
public abstract interface IAccountsStorage {
    
    public abstract boolean isAccountsEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Account> allAccounts();
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account);
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.lang.Integer> getNonBackedUpCount();
    
    public abstract void clear();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getDeletedAccountIds();
    
    public abstract void clearDeleted();
}