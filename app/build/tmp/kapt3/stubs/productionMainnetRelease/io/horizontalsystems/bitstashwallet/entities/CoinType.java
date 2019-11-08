package io.horizontalsystems.bitstashwallet.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "Ljava/io/Serializable;", "()V", "defaultAccountType", "Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType;", "getDefaultAccountType", "()Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType;", "canSupport", "", "accountType", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "Binance", "Bitcoin", "BitcoinCash", "Dash", "Eos", "Erc20", "Ethereum", "Lio/horizontalsystems/bitstashwallet/entities/CoinType$BitcoinCash;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType$Bitcoin;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType$Dash;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType$Ethereum;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType$Erc20;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType$Eos;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType$Binance;", "app_productionMainnetRelease"})
public abstract class CoinType implements java.io.Serializable {
    
    public final boolean canSupport(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.AccountType accountType) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.core.DefaultAccountType getDefaultAccountType() {
        return null;
    }
    
    private CoinType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/CoinType$BitcoinCash;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "()V", "app_productionMainnetRelease"})
    public static final class BitcoinCash extends io.horizontalsystems.bitstashwallet.entities.CoinType {
        public static final io.horizontalsystems.bitstashwallet.entities.CoinType.BitcoinCash INSTANCE = null;
        
        private BitcoinCash() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/CoinType$Bitcoin;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "()V", "app_productionMainnetRelease"})
    public static final class Bitcoin extends io.horizontalsystems.bitstashwallet.entities.CoinType {
        public static final io.horizontalsystems.bitstashwallet.entities.CoinType.Bitcoin INSTANCE = null;
        
        private Bitcoin() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/CoinType$Dash;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "()V", "app_productionMainnetRelease"})
    public static final class Dash extends io.horizontalsystems.bitstashwallet.entities.CoinType {
        public static final io.horizontalsystems.bitstashwallet.entities.CoinType.Dash INSTANCE = null;
        
        private Dash() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/CoinType$Ethereum;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "()V", "app_productionMainnetRelease"})
    public static final class Ethereum extends io.horizontalsystems.bitstashwallet.entities.CoinType {
        public static final io.horizontalsystems.bitstashwallet.entities.CoinType.Ethereum INSTANCE = null;
        
        private Ethereum() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/CoinType$Erc20;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "address", "", "fee", "Ljava/math/BigDecimal;", "gasLimit", "", "(Ljava/lang/String;Ljava/math/BigDecimal;J)V", "getAddress", "()Ljava/lang/String;", "getFee", "()Ljava/math/BigDecimal;", "getGasLimit", "()J", "app_productionMainnetRelease"})
    public static final class Erc20 extends io.horizontalsystems.bitstashwallet.entities.CoinType {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String address = null;
        @org.jetbrains.annotations.NotNull()
        private final java.math.BigDecimal fee = null;
        private final long gasLimit = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getFee() {
            return null;
        }
        
        public final long getGasLimit() {
            return 0L;
        }
        
        public Erc20(@org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal fee, long gasLimit) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/CoinType$Eos;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "token", "", "symbol", "(Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getToken", "app_productionMainnetRelease"})
    public static final class Eos extends io.horizontalsystems.bitstashwallet.entities.CoinType {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String token = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String symbol = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getToken() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSymbol() {
            return null;
        }
        
        public Eos(@org.jetbrains.annotations.NotNull()
        java.lang.String token, @org.jetbrains.annotations.NotNull()
        java.lang.String symbol) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/CoinType$Binance;", "Lio/horizontalsystems/bitstashwallet/entities/CoinType;", "symbol", "", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "app_productionMainnetRelease"})
    public static final class Binance extends io.horizontalsystems.bitstashwallet.entities.CoinType {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String symbol = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSymbol() {
            return null;
        }
        
        public Binance(@org.jetbrains.annotations.NotNull()
        java.lang.String symbol) {
            super();
        }
    }
}