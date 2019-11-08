package io.horizontalsystems.bitstashwallet.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/PriceAlert;", "", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "state", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;", "lastRate", "Ljava/math/BigDecimal;", "(Lio/horizontalsystems/bitstashwallet/entities/Coin;Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;Ljava/math/BigDecimal;)V", "getCoin", "()Lio/horizontalsystems/bitstashwallet/entities/Coin;", "getLastRate", "()Ljava/math/BigDecimal;", "setLastRate", "(Ljava/math/BigDecimal;)V", "getState", "()Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;", "setState", "(Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "State", "app_productionMainnetRelease"})
public final class PriceAlert {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.entities.Coin coin = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bitstashwallet.entities.PriceAlert.State state;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal lastRate;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.Coin getCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.PriceAlert.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.PriceAlert.State p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getLastRate() {
        return null;
    }
    
    public final void setLastRate(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal p0) {
    }
    
    public PriceAlert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.PriceAlert.State state, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal lastRate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.Coin component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.PriceAlert.State component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.PriceAlert copy(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.PriceAlert.State state, @org.jetbrains.annotations.Nullable()
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;", "", "value", "", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "OFF", "PERCENT_2", "PERCENT_3", "PERCENT_5", "Companion", "app_productionMainnetRelease"})
    public static enum State {
        /*public static final*/ OFF /* = new OFF(null) */,
        /*public static final*/ PERCENT_2 /* = new PERCENT_2(null) */,
        /*public static final*/ PERCENT_3 /* = new PERCENT_3(null) */,
        /*public static final*/ PERCENT_5 /* = new PERCENT_5(null) */;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer value = null;
        public static final io.horizontalsystems.bitstashwallet.entities.PriceAlert.State.Companion Companion = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getValue() {
            return null;
        }
        
        State(java.lang.Integer value) {
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State$Companion;", "", "()V", "valueOf", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;", "value", "", "(Ljava/lang/Integer;)Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;", "app_productionMainnetRelease"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bitstashwallet.entities.PriceAlert.State valueOf(@org.jetbrains.annotations.Nullable()
            java.lang.Integer value) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}