package io.horizontalsystems.bitstashwallet.modules.send.dash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/dash/SendDashInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendDashInteractor;", "adapter", "Lio/horizontalsystems/bitstashwallet/core/ISendDashAdapter;", "(Lio/horizontalsystems/bitstashwallet/core/ISendDashAdapter;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendDashInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendDashInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendDashInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "clear", "", "fetchAvailableBalance", "address", "", "fetchFee", "amount", "Ljava/math/BigDecimal;", "send", "Lio/reactivex/Single;", "validate", "app_productionMainnetRelease"})
public final class SendDashInteractor implements io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendDashInteractor {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendDashInteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.ISendDashAdapter adapter = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendDashInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendDashInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void fetchAvailableBalance(@org.jetbrains.annotations.Nullable()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void fetchFee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public SendDashInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ISendDashAdapter adapter) {
        super();
    }
}