package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lapp/odapplications/bitstashwallet/core/ISendDashAdapter;", "", "availableBalance", "Ljava/math/BigDecimal;", "address", "", "fee", "amount", "send", "Lio/reactivex/Single;", "", "validate", "app_productionMainnetRelease"})
public abstract interface ISendDashAdapter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal availableBalance(@org.jetbrains.annotations.Nullable()
    java.lang.String address);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal fee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
    java.lang.String address);
    
    public abstract void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address);
}