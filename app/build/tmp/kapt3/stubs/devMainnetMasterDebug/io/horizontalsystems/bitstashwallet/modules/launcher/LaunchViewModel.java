package io.horizontalsystems.bitstashwallet.modules.launcher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u0010\u001a\u00020\u001cH\u0016J\b\u0010\u0012\u001a\u00020\u001cH\u0016J\b\u0010\u0014\u001a\u00020\u001cH\u0016J\b\u0010\u0016\u001a\u00020\u001cH\u0016J\b\u0010\u0018\u001a\u00020\u001cH\u0016J\b\u0010\u001a\u001a\u00020\u001cH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\t\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/launcher/LaunchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/launcher/LaunchModule$IView;", "Lio/horizontalsystems/bitstashwallet/modules/launcher/LaunchModule$IRouter;", "()V", "closeApplication", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "Ljava/lang/Void;", "getCloseApplication", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/launcher/LaunchModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/launcher/LaunchModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/launcher/LaunchModule$IViewDelegate;)V", "openKeyInvalidatedModule", "getOpenKeyInvalidatedModule", "openMainModule", "getOpenMainModule", "openNoSystemLockModule", "getOpenNoSystemLockModule", "openUnlockModule", "getOpenUnlockModule", "openUserAuthenticationModule", "getOpenUserAuthenticationModule", "openWelcomeModule", "getOpenWelcomeModule", "", "init", "app_devMainnetMasterDebug"})
public final class LaunchViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.launcher.LaunchModule.IView, io.horizontalsystems.bitstashwallet.modules.launcher.LaunchModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.launcher.LaunchModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> openWelcomeModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> openMainModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> openUnlockModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> openNoSystemLockModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> openKeyInvalidatedModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> openUserAuthenticationModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> closeApplication = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.launcher.LaunchModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.launcher.LaunchModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenWelcomeModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenMainModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenUnlockModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenNoSystemLockModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenKeyInvalidatedModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenUserAuthenticationModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getCloseApplication() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void openWelcomeModule() {
    }
    
    @java.lang.Override()
    public void openMainModule() {
    }
    
    @java.lang.Override()
    public void openUnlockModule() {
    }
    
    @java.lang.Override()
    public void openNoSystemLockModule() {
    }
    
    @java.lang.Override()
    public void openKeyInvalidatedModule() {
    }
    
    @java.lang.Override()
    public void openUserAuthenticationModule() {
    }
    
    @java.lang.Override()
    public void closeApplication() {
    }
    
    public LaunchViewModel() {
        super();
    }
}