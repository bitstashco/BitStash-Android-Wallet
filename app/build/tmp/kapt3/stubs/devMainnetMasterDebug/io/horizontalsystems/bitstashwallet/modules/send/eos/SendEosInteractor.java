package io.horizontalsystems.bitstashwallet.modules.send.eos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/eos/SendEosInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendEosInteractor;", "adapter", "Lio/horizontalsystems/bitstashwallet/core/ISendEosAdapter;", "(Lio/horizontalsystems/bitstashwallet/core/ISendEosAdapter;)V", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "send", "Lio/reactivex/Single;", "", "amount", "account", "", "memo", "validate", "app_devMainnetMasterDebug"})
public final class SendEosInteractor implements io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendEosInteractor {
    private final io.horizontalsystems.bitstashwallet.core.ISendEosAdapter adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAvailableBalance() {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String account) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String account, @org.jetbrains.annotations.Nullable()
    java.lang.String memo) {
        return null;
    }
    
    public SendEosInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ISendEosAdapter adapter) {
        super();
    }
}