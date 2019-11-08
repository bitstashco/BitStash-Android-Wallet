package io.horizontalsystems.bitstashwallet.entities;

import java.lang.System;

@androidx.room.TypeConverters(value = {io.horizontalsystems.bitstashwallet.core.storage.DatabaseConverters.class})
@androidx.room.Entity(primaryKeys = {"coinCode", "currencyCode", "timestamp", "isLatest"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/Rate;", "", "coinCode", "", "currencyCode", "value", "Ljava/math/BigDecimal;", "timestamp", "", "isLatest", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;JZ)V", "getCoinCode", "()Ljava/lang/String;", "setCoinCode", "(Ljava/lang/String;)V", "getCurrencyCode", "setCurrencyCode", "expired", "getExpired", "()Z", "setLatest", "(Z)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getValue", "()Ljava/math/BigDecimal;", "setValue", "(Ljava/math/BigDecimal;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionMainnetRelease"})
public final class Rate {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String coinCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currencyCode;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal value;
    private long timestamp;
    private boolean isLatest;
    
    public final boolean getExpired() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinCode() {
        return null;
    }
    
    public final void setCoinCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final void setCurrencyCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final void setTimestamp(long p0) {
    }
    
    public final boolean isLatest() {
        return false;
    }
    
    public final void setLatest(boolean p0) {
    }
    
    public Rate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value, long timestamp, boolean isLatest) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.Rate copy(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value, long timestamp, boolean isLatest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}