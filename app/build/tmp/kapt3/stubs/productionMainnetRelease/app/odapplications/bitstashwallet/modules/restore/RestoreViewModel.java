package app.odapplications.bitstashwallet.modules.restore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\u0006\u0010 \u001a\u00020\u0007J\u0016\u0010!\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0014\u0010#\u001a\u00020\u00072\n\u0010$\u001a\u00060\u0015j\u0002`\u0016H\u0016J\b\u0010%\u001a\u00020\u0007H\u0016J\b\u0010&\u001a\u00020\u0007H\u0016J\u0010\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u001dH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u001b\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`\u00160\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\t\u00a8\u0006)"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/RestoreViewModel;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$View;", "Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$Router;", "()V", "closeLiveEvent", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "", "getCloseLiveEvent", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "delegate", "Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$ViewDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$ViewDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$ViewDelegate;)V", "reloadLiveEvent", "", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "getReloadLiveEvent", "showErrorLiveEvent", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getShowErrorLiveEvent", "startMainModuleLiveEvent", "getStartMainModuleLiveEvent", "startRestoreEosLiveEvent", "getStartRestoreEosLiveEvent", "startRestoreWordsLiveEvent", "", "getStartRestoreWordsLiveEvent", "close", "init", "reload", "items", "showError", "ex", "startMainModule", "startRestoreEosModule", "startRestoreWordsModule", "wordsCount", "app_productionMainnetRelease"})
public final class RestoreViewModel extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.restore.RestoreModule.View, app.odapplications.bitstashwallet.modules.restore.RestoreModule.Router {
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.restore.RestoreModule.ViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.util.List<app.odapplications.bitstashwallet.core.IPredefinedAccountType>> reloadLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Exception> showErrorLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Integer> startRestoreWordsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> startRestoreEosLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> startMainModuleLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> closeLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.restore.RestoreModule.ViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.RestoreModule.ViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.util.List<app.odapplications.bitstashwallet.core.IPredefinedAccountType>> getReloadLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Exception> getShowErrorLiveEvent() {
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
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> getStartMainModuleLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> getCloseLiveEvent() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void reload(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends app.odapplications.bitstashwallet.core.IPredefinedAccountType> items) {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Exception ex) {
    }
    
    @java.lang.Override()
    public void startRestoreWordsModule(int wordsCount) {
    }
    
    @java.lang.Override()
    public void startRestoreEosModule() {
    }
    
    @java.lang.Override()
    public void startMainModule() {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    public RestoreViewModel() {
        super();
    }
}