package io.horizontalsystems.bitstashwallet.modules.restore.options;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IView;", "Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IRouter;", "()V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/restore/options/RestoreOptionsModule$IViewDelegate;)V", "derivationLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "getDerivationLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "notifyOptionsLiveEvent", "Lkotlin/Pair;", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "getNotifyOptionsLiveEvent", "syncModeLiveEvent", "getSyncModeLiveEvent", "init", "", "notifyOptions", "syncMode", "derivation", "update", "app_productionMainnetRelease"})
public final class RestoreOptionsViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.restore.options.RestoreOptionsModule.IView, io.horizontalsystems.bitstashwallet.modules.restore.options.RestoreOptionsModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.restore.options.RestoreOptionsModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Pair<io.horizontalsystems.bitstashwallet.entities.SyncMode, io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation>> notifyOptionsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.entities.SyncMode> syncModeLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation> derivationLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.restore.options.RestoreOptionsModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.options.RestoreOptionsModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Pair<io.horizontalsystems.bitstashwallet.entities.SyncMode, io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation>> getNotifyOptionsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.entities.SyncMode> getSyncModeLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation> getDerivationLiveEvent() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation) {
    }
    
    @java.lang.Override()
    public void notifyOptions(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation) {
    }
    
    public RestoreOptionsViewModel() {
        super();
    }
}