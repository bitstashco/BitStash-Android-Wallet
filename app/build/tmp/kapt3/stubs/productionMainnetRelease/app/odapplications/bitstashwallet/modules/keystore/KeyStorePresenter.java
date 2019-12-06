package app.odapplications.bitstashwallet.modules.keystore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStorePresenter;", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IInteractorDelegate;", "interactor", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IInteractor;", "router", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IRouter;", "mode", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$ModeType;", "(Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IInteractor;Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IRouter;Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$ModeType;)V", "view", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IView;", "getView", "()Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IView;", "setView", "(Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IView;)V", "onAuthenticationCanceled", "", "onAuthenticationSuccess", "onCloseInvalidKeyWarning", "onResume", "viewDidLoad", "app_productionMainnetRelease"})
public final class KeyStorePresenter implements app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IViewDelegate, app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IView view;
    private final app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IInteractor interactor = null;
    private final app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IRouter router = null;
    private final app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.ModeType mode = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IView p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onCloseInvalidKeyWarning() {
    }
    
    @java.lang.Override()
    public void onAuthenticationCanceled() {
    }
    
    @java.lang.Override()
    public void onAuthenticationSuccess() {
    }
    
    public KeyStorePresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IRouter router, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.ModeType mode) {
        super();
    }
}