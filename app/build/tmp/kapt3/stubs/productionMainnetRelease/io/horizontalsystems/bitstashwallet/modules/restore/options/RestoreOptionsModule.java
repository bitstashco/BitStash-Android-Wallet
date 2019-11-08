package io.horizontalsystems.bitstashwallet.modules.restore.options;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IRouter;", "start", "context", "Landroidx/appcompat/app/AppCompatActivity;", "requestCode", "", "IInteractor", "IRouter", "IView", "IViewDelegate", "app_productionMainnetRelease"})
public final class RestoreOptionsModule {
    public static final io.horizontalsystems.bitstashwallet.modules.restore.options.RestoreOptionsModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity context, int requestCode) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.options.RestoreOptionsViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.options.RestoreOptionsModule.IRouter router) {
    }
    
    private RestoreOptionsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IView;", "", "update", "", "derivation", "Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void update(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode);
        
        public abstract void update(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IViewDelegate;", "", "onDone", "", "onSelect", "derivation", "Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onSelect(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode);
        
        public abstract void onSelect(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation);
        
        public abstract void onDone();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IInteractor;", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IRouter;", "", "notifyOptions", "", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "derivation", "Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
        
        public abstract void notifyOptions(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation);
    }
}