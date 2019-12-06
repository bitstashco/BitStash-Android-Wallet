package app.odapplications.bitstashwallet.modules.keystore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u0010\u001a\u00020\u0018H\u0016J\b\u0010\u0012\u001a\u00020\u0018H\u0016J\b\u0010\u0014\u001a\u00020\u0018H\u0016J\b\u0010\u0016\u001a\u00020\u0018H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreViewModel;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IView;", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IRouter;", "()V", "closeApplication", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "Ljava/lang/Void;", "getCloseApplication", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "delegate", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IViewDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IViewDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IViewDelegate;)V", "openLaunchModule", "getOpenLaunchModule", "promptUserAuthentication", "getPromptUserAuthentication", "showInvalidKeyWarning", "getShowInvalidKeyWarning", "showNoSystemLockWarning", "getShowNoSystemLockWarning", "", "init", "mode", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$ModeType;", "app_productionMainnetRelease"})
public final class KeyStoreViewModel extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IView, app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> showNoSystemLockWarning = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> showInvalidKeyWarning = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> promptUserAuthentication = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> openLaunchModule = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> closeApplication = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getShowNoSystemLockWarning() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getShowInvalidKeyWarning() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getPromptUserAuthentication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenLaunchModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getCloseApplication() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.ModeType mode) {
    }
    
    @java.lang.Override()
    public void showNoSystemLockWarning() {
    }
    
    @java.lang.Override()
    public void showInvalidKeyWarning() {
    }
    
    @java.lang.Override()
    public void promptUserAuthentication() {
    }
    
    @java.lang.Override()
    public void openLaunchModule() {
    }
    
    @java.lang.Override()
    public void closeApplication() {
    }
    
    public KeyStoreViewModel() {
        super();
    }
}