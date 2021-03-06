package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/core/ISendEosAdapter;", "", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "send", "Lio/reactivex/Single;", "", "amount", "account", "", "memo", "validate", "app_productionMainnetRelease"})
public abstract interface ISendEosAdapter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getAvailableBalance();
    
    public abstract void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String account);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String account, @org.jetbrains.annotations.Nullable()
    java.lang.String memo);
}