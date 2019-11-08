package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0012*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00160\u00160\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/AccountManager;", "Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "storage", "Lio/horizontalsystems/bitstashwallet/core/IAccountsStorage;", "accountCleaner", "Lio/horizontalsystems/bitstashwallet/core/managers/AccountCleaner;", "(Lio/horizontalsystems/bitstashwallet/core/IAccountsStorage;Lio/horizontalsystems/bitstashwallet/core/managers/AccountCleaner;)V", "accounts", "", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "getAccounts", "()Ljava/util/List;", "accountsFlowable", "Lio/reactivex/Flowable;", "getAccountsFlowable", "()Lio/reactivex/Flowable;", "accountsSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "cache", "Lio/horizontalsystems/bitstashwallet/core/managers/AccountManager$AccountsCache;", "deleteAccountObservable", "", "getDeleteAccountObservable", "deleteAccountSubject", "isAccountsEmpty", "", "()Z", "account", "coinType", "Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "clear", "", "clearAccounts", "create", "delete", "id", "preloadAccounts", "update", "AccountsCache", "app_devMainnetMasterDebug"})
public final class AccountManager implements io.horizontalsystems.bitstashwallet.core.IAccountManager {
    private final io.horizontalsystems.bitstashwallet.core.managers.AccountManager.AccountsCache cache = null;
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bitstashwallet.entities.Account>> accountsSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.lang.String> deleteAccountSubject = null;
    private final io.horizontalsystems.bitstashwallet.core.IAccountsStorage storage = null;
    private final io.horizontalsystems.bitstashwallet.core.managers.AccountCleaner accountCleaner = null;
    
    @java.lang.Override()
    public boolean isAccountsEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Account> getAccounts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.bitstashwallet.entities.Account>> getAccountsFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.lang.String> getDeleteAccountObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinType coinType) {
        return null;
    }
    
    @java.lang.Override()
    public void preloadAccounts() {
    }
    
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    public void clearAccounts() {
    }
    
    public AccountManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountsStorage storage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.AccountCleaner accountCleaner) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005J\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005R*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/AccountManager$AccountsCache;", "", "()V", "<set-?>", "", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "accountsSet", "getAccountsSet", "()Ljava/util/Set;", "delete", "", "id", "", "insert", "account", "set", "accounts", "", "update", "app_devMainnetMasterDebug"})
    static final class AccountsCache {
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<io.horizontalsystems.bitstashwallet.entities.Account> accountsSet;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<io.horizontalsystems.bitstashwallet.entities.Account> getAccountsSet() {
            return null;
        }
        
        public final void insert(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Account account) {
        }
        
        public final void update(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Account account) {
        }
        
        public final void set(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.entities.Account> accounts) {
        }
        
        public final void delete(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
        }
        
        public AccountsCache() {
            super();
        }
    }
}