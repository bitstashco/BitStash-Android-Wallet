package io.horizontalsystems.bitstashwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0004\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006\u0082\u0001\u0003\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "", "()V", "getAsString", "", "getTitleRes", "", "Companion", "Name", "PercentGrowth", "Value", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType$Name;", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType$Value;", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType$PercentGrowth;", "app_productionMainnetRelease"})
public abstract class BalanceSortType {
    public static final io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType.Companion Companion = null;
    
    public final int getTitleRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAsString() {
        return null;
    }
    
    private BalanceSortType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType$Name;", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "()V", "app_productionMainnetRelease"})
    public static final class Name extends io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType {
        public static final io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType.Name INSTANCE = null;
        
        private Name() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType$Value;", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "()V", "app_productionMainnetRelease"})
    public static final class Value extends io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType {
        public static final io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType.Value INSTANCE = null;
        
        private Value() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType$PercentGrowth;", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "()V", "app_productionMainnetRelease"})
    public static final class PercentGrowth extends io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType {
        public static final io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType.PercentGrowth INSTANCE = null;
        
        private PercentGrowth() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType$Companion;", "", "()V", "getTypeFromString", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "value", "", "app_productionMainnetRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType getTypeFromString(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}