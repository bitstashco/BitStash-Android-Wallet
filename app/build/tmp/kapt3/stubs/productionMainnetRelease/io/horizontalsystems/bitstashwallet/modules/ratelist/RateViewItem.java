package io.horizontalsystems.bitstashwallet.modules.ratelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateViewItem;", "", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "(Lio/horizontalsystems/bitstashwallet/entities/Coin;)V", "getCoin", "()Lio/horizontalsystems/bitstashwallet/entities/Coin;", "diff", "Ljava/math/BigDecimal;", "getDiff", "()Ljava/math/BigDecimal;", "setDiff", "(Ljava/math/BigDecimal;)V", "loadingStatus", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateLoadingStatus;", "getLoadingStatus", "()Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateLoadingStatus;", "setLoadingStatus", "(Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateLoadingStatus;)V", "rate", "Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "getRate", "()Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "setRate", "(Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;)V", "rateExpired", "", "getRateExpired", "()Z", "setRateExpired", "(Z)V", "app_productionMainnetRelease"})
public final class RateViewItem {
    private boolean rateExpired;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.entities.CurrencyValue rate;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal diff;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bitstashwallet.modules.ratelist.RateLoadingStatus loadingStatus;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.entities.Coin coin = null;
    
    public final boolean getRateExpired() {
        return false;
    }
    
    public final void setRateExpired(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue getRate() {
        return null;
    }
    
    public final void setRate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getDiff() {
        return null;
    }
    
    public final void setDiff(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.ratelist.RateLoadingStatus getLoadingStatus() {
        return null;
    }
    
    public final void setLoadingStatus(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.ratelist.RateLoadingStatus p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.Coin getCoin() {
        return null;
    }
    
    public RateViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
        super();
    }
}