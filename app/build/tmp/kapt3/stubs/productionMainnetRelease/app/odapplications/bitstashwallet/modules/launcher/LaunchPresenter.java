package app.odapplications.bitstashwallet.modules.launcher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/launcher/LaunchPresenter;", "Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IInteractorDelegate;", "interactor", "Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IInteractor;", "router", "Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IRouter;", "(Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IInteractor;Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IRouter;)V", "view", "Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IView;", "getView", "()Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IView;", "setView", "(Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IView;)V", "didCancelUnlock", "", "didUnlock", "viewDidLoad", "app_productionMainnetRelease"})
public final class LaunchPresenter implements app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IViewDelegate, app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IView view;
    private final app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IInteractor interactor = null;
    private final app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IRouter router = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IView p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void didUnlock() {
    }
    
    @java.lang.Override()
    public void didCancelUnlock() {
    }
    
    public LaunchPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IRouter router) {
        super();
    }
}