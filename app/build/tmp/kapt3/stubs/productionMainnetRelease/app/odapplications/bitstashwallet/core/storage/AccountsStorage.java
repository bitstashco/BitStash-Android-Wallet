package app.odapplications.bitstashwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u00a8\u0006#"}, d2 = {"Lapp/odapplications/bitstashwallet/core/storage/AccountsStorage;", "Lapp/odapplications/bitstashwallet/core/IAccountsStorage;", "appDatabase", "Lapp/odapplications/bitstashwallet/core/storage/AppDatabase;", "(Lapp/odapplications/bitstashwallet/core/storage/AppDatabase;)V", "dao", "Lapp/odapplications/bitstashwallet/core/storage/AccountsDao;", "isAccountsEmpty", "", "()Z", "allAccounts", "", "Lapp/odapplications/bitstashwallet/entities/Account;", "clear", "", "clearDeleted", "delete", "id", "", "getAccountRecord", "Lapp/odapplications/bitstashwallet/core/storage/AccountRecord;", "account", "getAccountTypeCode", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "getDeletedAccountIds", "getDerivation", "Lapp/odapplications/bitstashwallet/entities/AccountType$Derivation;", "getKey", "getNonBackedUpCount", "Lio/reactivex/Flowable;", "", "save", "update", "Companion", "app_productionMainnetRelease"})
public final class AccountsStorage implements app.odapplications.bitstashwallet.core.IAccountsStorage {
    private final app.odapplications.bitstashwallet.core.storage.AccountsDao dao = null;
    private static final java.lang.String MNEMONIC = "mnemonic";
    private static final java.lang.String PRIVATE_KEY = "private_key";
    private static final java.lang.String HD_MASTER_KEY = "hd_master_key";
    private static final java.lang.String EOS = "eos";
    public static final app.odapplications.bitstashwallet.core.storage.AccountsStorage.Companion Companion = null;
    
    @java.lang.Override()
    public boolean isAccountsEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.entities.Account> allAccounts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getDeletedAccountIds() {
        return null;
    }
    
    @java.lang.Override()
    public void clearDeleted() {
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.lang.Integer> getNonBackedUpCount() {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final app.odapplications.bitstashwallet.core.storage.AccountRecord getAccountRecord(app.odapplications.bitstashwallet.entities.Account account) {
        return null;
    }
    
    private final java.lang.String getKey(app.odapplications.bitstashwallet.entities.AccountType accountType) {
        return null;
    }
    
    private final app.odapplications.bitstashwallet.entities.AccountType.Derivation getDerivation(app.odapplications.bitstashwallet.entities.AccountType accountType) {
        return null;
    }
    
    private final java.lang.String getAccountTypeCode(app.odapplications.bitstashwallet.entities.AccountType accountType) {
        return null;
    }
    
    public AccountsStorage(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.storage.AppDatabase appDatabase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/core/storage/AccountsStorage$Companion;", "", "()V", "EOS", "", "HD_MASTER_KEY", "MNEMONIC", "PRIVATE_KEY", "app_productionMainnetRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}