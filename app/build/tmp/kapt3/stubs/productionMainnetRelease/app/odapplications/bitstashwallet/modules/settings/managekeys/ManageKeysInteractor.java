package app.odapplications.bitstashwallet.modules.settings.managekeys;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0012H\u0002J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\'"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysInteractor;", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$Interactor;", "accountManager", "Lapp/odapplications/bitstashwallet/core/IAccountManager;", "accountCreator", "Lapp/odapplications/bitstashwallet/core/IAccountCreator;", "predefinedAccountTypeManager", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountTypeManager;", "(Lapp/odapplications/bitstashwallet/core/IAccountManager;Lapp/odapplications/bitstashwallet/core/IAccountCreator;Lapp/odapplications/bitstashwallet/core/IPredefinedAccountTypeManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$InteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$InteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$InteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "predefinedAccountTypes", "", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "getPredefinedAccountTypes", "()Ljava/util/List;", "account", "Lapp/odapplications/bitstashwallet/entities/Account;", "predefinedAccountType", "clear", "", "createAccount", "deleteAccount", "id", "", "loadAccounts", "mapAccounts", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageAccountItem;", "restoreAccount", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "app_productionMainnetRelease"})
public final class ManageKeysInteractor implements app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.Interactor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.InteractorDelegate delegate;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final app.odapplications.bitstashwallet.core.IAccountManager accountManager = null;
    private final app.odapplications.bitstashwallet.core.IAccountCreator accountCreator = null;
    private final app.odapplications.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.InteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.InteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.core.IPredefinedAccountType> getPredefinedAccountTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
        return null;
    }
    
    @java.lang.Override()
    public void createAccount(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
    }
    
    @java.lang.Override()
    public void restoreAccount(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.SyncMode syncMode) {
    }
    
    @java.lang.Override()
    public void loadAccounts() {
    }
    
    @java.lang.Override()
    public void deleteAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final java.util.List<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> mapAccounts() {
        return null;
    }
    
    public ManageKeysInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAccountCreator accountCreator, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager) {
        super();
    }
}