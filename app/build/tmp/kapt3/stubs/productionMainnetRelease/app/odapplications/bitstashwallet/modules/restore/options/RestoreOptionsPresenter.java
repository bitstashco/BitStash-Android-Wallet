package app.odapplications.bitstashwallet.modules.restore.options;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/options/RestoreOptionsPresenter;", "Lapp/odapplications/bitstashwallet/modules/restore/options/RestoreOptionsModule$IViewDelegate;", "router", "Lapp/odapplications/bitstashwallet/modules/restore/options/RestoreOptionsModule$IRouter;", "(Lapp/odapplications/bitstashwallet/modules/restore/options/RestoreOptionsModule$IRouter;)V", "derivation", "Lapp/odapplications/bitstashwallet/entities/AccountType$Derivation;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "view", "Lapp/odapplications/bitstashwallet/modules/restore/options/RestoreOptionsModule$IView;", "getView", "()Lapp/odapplications/bitstashwallet/modules/restore/options/RestoreOptionsModule$IView;", "setView", "(Lapp/odapplications/bitstashwallet/modules/restore/options/RestoreOptionsModule$IView;)V", "onDone", "", "onSelect", "viewDidLoad", "app_productionMainnetRelease"})
public final class RestoreOptionsPresenter implements app.odapplications.bitstashwallet.modules.restore.options.RestoreOptionsModule.IViewDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.restore.options.RestoreOptionsModule.IView view;
    private app.odapplications.bitstashwallet.entities.SyncMode syncMode;
    private app.odapplications.bitstashwallet.entities.AccountType.Derivation derivation;
    private final app.odapplications.bitstashwallet.modules.restore.options.RestoreOptionsModule.IRouter router = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.restore.options.RestoreOptionsModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.restore.options.RestoreOptionsModule.IView p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.SyncMode syncMode) {
    }
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType.Derivation derivation) {
    }
    
    @java.lang.Override()
    public void onDone() {
    }
    
    public RestoreOptionsPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.options.RestoreOptionsModule.IRouter router) {
        super();
    }
}