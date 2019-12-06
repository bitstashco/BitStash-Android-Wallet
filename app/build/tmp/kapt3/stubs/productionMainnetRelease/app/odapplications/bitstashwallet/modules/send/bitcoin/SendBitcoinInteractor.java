package app.odapplications.bitstashwallet.modules.send.bitcoin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/bitcoin/SendBitcoinInteractor;", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$ISendBitcoinInteractor;", "adapter", "Lapp/odapplications/bitstashwallet/core/ISendBitcoinAdapter;", "(Lapp/odapplications/bitstashwallet/core/ISendBitcoinAdapter;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$ISendBitcoinInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/send/SendModule$ISendBitcoinInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/send/SendModule$ISendBitcoinInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "clear", "", "fetchAvailableBalance", "feeRate", "", "address", "", "fetchFee", "amount", "Ljava/math/BigDecimal;", "send", "Lio/reactivex/Single;", "validate", "app_productionMainnetRelease"})
public final class SendBitcoinInteractor implements app.odapplications.bitstashwallet.modules.send.SendModule.ISendBitcoinInteractor {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.SendModule.ISendBitcoinInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.ISendBitcoinAdapter adapter = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.SendModule.ISendBitcoinInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.SendModule.ISendBitcoinInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void fetchAvailableBalance(long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void fetchFee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, long feeRate) {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public SendBitcoinInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ISendBitcoinAdapter adapter) {
        super();
    }
}