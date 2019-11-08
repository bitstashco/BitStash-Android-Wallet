package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0007H&J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0007H&J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H&\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IRateStorage;", "", "deleteAll", "", "latestRate", "Lio/horizontalsystems/bitstashwallet/entities/Rate;", "coinCode", "", "Lio/horizontalsystems/bitstashwallet/modules/transactions/CoinCode;", "currencyCode", "latestRateObservable", "Lio/reactivex/Flowable;", "rateSingle", "Lio/reactivex/Single;", "timestamp", "", "save", "rate", "saveLatest", "app_devMainnetMasterDebug"})
public abstract interface IRateStorage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<io.horizontalsystems.bitstashwallet.entities.Rate> latestRateObservable(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bitstashwallet.entities.Rate latestRate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<io.horizontalsystems.bitstashwallet.entities.Rate> rateSingle(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, long timestamp);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Rate rate);
    
    public abstract void saveLatest(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Rate rate);
    
    public abstract void deleteAll();
}