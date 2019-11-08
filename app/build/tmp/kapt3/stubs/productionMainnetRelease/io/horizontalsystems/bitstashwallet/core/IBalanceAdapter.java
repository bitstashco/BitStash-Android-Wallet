package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IBalanceAdapter;", "", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "balanceUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getBalanceUpdatedFlowable", "()Lio/reactivex/Flowable;", "state", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "getState", "()Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "stateUpdatedFlowable", "getStateUpdatedFlowable", "app_productionMainnetRelease"})
public abstract interface IBalanceAdapter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.core.AdapterState getState();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getStateUpdatedFlowable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getBalance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getBalanceUpdatedFlowable();
}