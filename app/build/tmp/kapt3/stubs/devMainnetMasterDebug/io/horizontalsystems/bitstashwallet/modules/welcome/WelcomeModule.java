package io.horizontalsystems.bitstashwallet.modules.welcome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IRouter;", "start", "context", "Landroid/content/Context;", "IInteractor", "IRouter", "IView", "IViewDelegate", "app_devMainnetMasterDebug"})
public final class WelcomeModule {
    public static final io.horizontalsystems.bitstashwallet.modules.welcome.WelcomeModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.welcome.WelcomeViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.welcome.WelcomeModule.IRouter router) {
    }
    
    private WelcomeModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IView;", "", "setAppVersion", "", "appVersion", "", "app_devMainnetMasterDebug"})
    public static abstract interface IView {
        
        public abstract void setAppVersion(@org.jetbrains.annotations.NotNull()
        java.lang.String appVersion);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IViewDelegate;", "", "createWalletDidClick", "", "restoreWalletDidClick", "viewDidLoad", "app_devMainnetMasterDebug"})
    public static abstract interface IViewDelegate {
        
        public abstract void createWalletDidClick();
        
        public abstract void restoreWalletDidClick();
        
        public abstract void viewDidLoad();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IInteractor;", "", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getAppVersion();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IRouter;", "", "openCreateWalletModule", "", "openRestoreModule", "app_devMainnetMasterDebug"})
    public static abstract interface IRouter {
        
        public abstract void openRestoreModule();
        
        public abstract void openCreateWalletModule();
    }
}