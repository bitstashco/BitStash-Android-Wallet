package io.horizontalsystems.bitstashwallet.modules.restore.eos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosModule$IInteractorDelegate;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosModule$IInteractor;", "router", "Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosModule$IRouter;", "(Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosModule$IInteractor;Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosModule$IRouter;)V", "view", "Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosModule$IView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosModule$IView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/restore/eos/RestoreEosModule$IView;)V", "onClickDone", "", "accountName", "", "privateKey", "onClickScan", "onInvalidAccount", "onInvalidKey", "onPasteAccount", "onPasteKey", "onQRCodeScan", "key", "onValidationSuccess", "app_productionMainnetRelease"})
public final class RestoreEosPresenter implements io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule.IView view;
    private final io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule.IInteractor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule.IRouter router = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule.IView p0) {
    }
    
    @java.lang.Override()
    public void onClickDone(@org.jetbrains.annotations.NotNull()
    java.lang.String accountName, @org.jetbrains.annotations.NotNull()
    java.lang.String privateKey) {
    }
    
    @java.lang.Override()
    public void onClickScan() {
    }
    
    @java.lang.Override()
    public void onPasteAccount() {
    }
    
    @java.lang.Override()
    public void onPasteKey() {
    }
    
    @java.lang.Override()
    public void onQRCodeScan(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public void onValidationSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String accountName, @org.jetbrains.annotations.NotNull()
    java.lang.String privateKey) {
    }
    
    @java.lang.Override()
    public void onInvalidAccount() {
    }
    
    @java.lang.Override()
    public void onInvalidKey() {
    }
    
    public RestoreEosPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule.IRouter router) {
        super();
    }
}