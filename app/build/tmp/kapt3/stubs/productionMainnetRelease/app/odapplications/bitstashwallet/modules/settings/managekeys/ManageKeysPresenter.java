package app.odapplications.bitstashwallet.modules.settings.managekeys;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0017H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006,"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysPresenter;", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$ViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$InteractorDelegate;", "interactor", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$Interactor;", "router", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$Router;", "(Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$Interactor;Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$Router;)V", "currentItem", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageAccountItem;", "items", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "view", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$View;", "getView", "()Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$View;", "setView", "(Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$View;)V", "didLoad", "", "accounts", "onClear", "onClickBackup", "accountItem", "onClickNew", "onClickRestore", "accountType", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "onClickShow", "onClickUnlink", "onConfirmBackup", "onConfirmCreate", "onConfirmRestore", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "onConfirmUnlink", "accountId", "", "viewDidLoad", "app_productionMainnetRelease"})
public final class ManageKeysPresenter implements app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.ViewDelegate, app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.InteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.View view;
    private app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem currentItem;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> items;
    private final app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.Interactor interactor = null;
    private final app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.Router router = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> getItems() {
        return null;
    }
    
    public void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onClickNew(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem) {
    }
    
    @java.lang.Override()
    public void onClickBackup(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem) {
    }
    
    @java.lang.Override()
    public void onClickRestore(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountType accountType) {
    }
    
    @java.lang.Override()
    public void onClickUnlink(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem) {
    }
    
    @java.lang.Override()
    public void onClickShow(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem) {
    }
    
    @java.lang.Override()
    public void onConfirmCreate() {
    }
    
    @java.lang.Override()
    public void onConfirmBackup() {
    }
    
    @java.lang.Override()
    public void onConfirmUnlink(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId) {
    }
    
    @java.lang.Override()
    public void onConfirmRestore(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.SyncMode syncMode) {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    @java.lang.Override()
    public void didLoad(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> accounts) {
    }
    
    public ManageKeysPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.Interactor interactor, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.Router router) {
        super();
    }
}