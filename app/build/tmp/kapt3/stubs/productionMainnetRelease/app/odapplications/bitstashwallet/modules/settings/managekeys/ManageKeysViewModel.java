package app.odapplications.bitstashwallet.modules.settings.managekeys;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020!H\u0016J\u0006\u0010\'\u001a\u00020!J\b\u0010(\u001a\u00020!H\u0014J\u0016\u0010)\u001a\u00020!2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cH\u0016J\u0010\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020!2\u0006\u0010,\u001a\u00020\u000bH\u0016J\u0014\u0010.\u001a\u00020!2\n\u0010/\u001a\u00060\u0018j\u0002`\u0019H\u0016J\b\u00100\u001a\u00020!H\u0016J\u0010\u00101\u001a\u00020!2\u0006\u0010,\u001a\u00020\u000bH\u0016J\u0010\u00102\u001a\u00020!2\u0006\u0010,\u001a\u00020\u000bH\u0016J\b\u00103\u001a\u00020!H\u0016J\u0010\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020$H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\f\u0012\b\u0012\u00060\u0018j\u0002`\u00190\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\tR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\tR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\tR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\t\u00a8\u00066"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysViewModel;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$View;", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$Router;", "()V", "closeLiveEvent", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "Ljava/lang/Void;", "getCloseLiveEvent", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "confirmBackupEvent", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageAccountItem;", "getConfirmBackupEvent", "confirmCreateEvent", "getConfirmCreateEvent", "confirmUnlinkEvent", "getConfirmUnlinkEvent", "delegate", "Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$ViewDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$ViewDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/settings/managekeys/ManageKeysModule$ViewDelegate;)V", "showErrorEvent", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getShowErrorEvent", "showItemsEvent", "", "getShowItemsEvent", "startBackupModuleLiveEvent", "getStartBackupModuleLiveEvent", "startRestoreEosLiveEvent", "", "getStartRestoreEosLiveEvent", "startRestoreWordsLiveEvent", "", "getStartRestoreWordsLiveEvent", "close", "init", "onCleared", "show", "items", "showBackupConfirmation", "accountItem", "showCreateConfirmation", "showError", "error", "showSuccess", "showUnlinkConfirmation", "startBackupModule", "startRestoreEos", "startRestoreWords", "wordsCount", "app_productionMainnetRelease"})
public final class ManageKeysViewModel extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.View, app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.Router {
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.util.List<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem>> showItemsEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Exception> showErrorEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> confirmUnlinkEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> confirmCreateEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> confirmBackupEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> startBackupModuleLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Integer> startRestoreWordsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> startRestoreEosLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> closeLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.ViewDelegate delegate;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.util.List<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem>> getShowItemsEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Exception> getShowErrorEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> getConfirmUnlinkEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> getConfirmCreateEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> getConfirmBackupEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> getStartBackupModuleLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Integer> getStartRestoreWordsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> getStartRestoreEosLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getCloseLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.ViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageKeysModule.ViewDelegate p0) {
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem> items) {
    }
    
    @java.lang.Override()
    public void showCreateConfirmation(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem) {
    }
    
    @java.lang.Override()
    public void showBackupConfirmation(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem) {
    }
    
    @java.lang.Override()
    public void showUnlinkConfirmation(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem) {
    }
    
    @java.lang.Override()
    public void showSuccess() {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Exception error) {
    }
    
    @java.lang.Override()
    public void startBackupModule(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem) {
    }
    
    @java.lang.Override()
    public void startRestoreWords(int wordsCount) {
    }
    
    @java.lang.Override()
    public void startRestoreEos() {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public ManageKeysViewModel() {
        super();
    }
}