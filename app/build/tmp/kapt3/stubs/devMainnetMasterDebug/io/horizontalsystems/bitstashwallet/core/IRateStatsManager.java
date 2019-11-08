package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IRateStatsManager;", "", "statsFlowable", "Lio/reactivex/Flowable;", "Lio/horizontalsystems/bitstashwallet/core/managers/StatsResponse;", "getStatsFlowable", "()Lio/reactivex/Flowable;", "syncStats", "", "coinCode", "", "currencyCode", "app_devMainnetMasterDebug"})
public abstract interface IRateStatsManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<io.horizontalsystems.bitstashwallet.core.managers.StatsResponse> getStatsFlowable();
    
    public abstract void syncStats(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
}