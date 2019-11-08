package io.horizontalsystems.bitstashwallet.entities;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/PriceAlertRecord;", "", "coinCode", "", "stateRaw", "", "lastRate", "Ljava/math/BigDecimal;", "(Ljava/lang/String;ILjava/math/BigDecimal;)V", "getCoinCode", "()Ljava/lang/String;", "getLastRate", "()Ljava/math/BigDecimal;", "getStateRaw", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_devMainnetMasterDebug"})
public final class PriceAlertRecord {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final java.lang.String coinCode = null;
    private final int stateRaw = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.math.BigDecimal lastRate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinCode() {
        return null;
    }
    
    public final int getStateRaw() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getLastRate() {
        return null;
    }
    
    public PriceAlertRecord(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, int stateRaw, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal lastRate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.PriceAlertRecord copy(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, int stateRaw, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal lastRate) {
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