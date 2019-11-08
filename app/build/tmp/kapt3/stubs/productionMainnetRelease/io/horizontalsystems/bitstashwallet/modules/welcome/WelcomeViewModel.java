package io.horizontalsystems.bitstashwallet.modules.welcome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0010\u001a\u00020\u0018H\u0016J\b\u0010\u0015\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IView;", "Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IRouter;", "()V", "appVersionLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAppVersionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/welcome/WelcomeModule$IViewDelegate;)V", "openCreateWalletModule", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "Ljava/lang/Void;", "getOpenCreateWalletModule", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "openRestoreModule", "getOpenRestoreModule", "init", "", "setAppVersion", "appVersion", "app_productionMainnetRelease"})
public final class WelcomeViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.welcome.WelcomeModule.IView, io.horizontalsystems.bitstashwallet.modules.welcome.WelcomeModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.welcome.WelcomeModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> openRestoreModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> openCreateWalletModule = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> appVersionLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.welcome.WelcomeModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.welcome.WelcomeModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenRestoreModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenCreateWalletModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAppVersionLiveData() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void setAppVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String appVersion) {
    }
    
    @java.lang.Override()
    public void openRestoreModule() {
    }
    
    @java.lang.Override()
    public void openCreateWalletModule() {
    }
    
    public WelcomeViewModel() {
        super();
    }
}