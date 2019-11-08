package io.horizontalsystems.bitstashwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\rH\u0016J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/storage/RatesRepository;", "Lio/horizontalsystems/bitstashwallet/core/IRateStorage;", "appDatabase", "Lio/horizontalsystems/bitstashwallet/core/storage/AppDatabase;", "(Lio/horizontalsystems/bitstashwallet/core/storage/AppDatabase;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "deleteAll", "", "latestRate", "Lio/horizontalsystems/bitstashwallet/entities/Rate;", "coinCode", "", "Lio/horizontalsystems/bitstashwallet/modules/transactions/CoinCode;", "currencyCode", "latestRateObservable", "Lio/reactivex/Flowable;", "rateSingle", "Lio/reactivex/Single;", "timestamp", "", "save", "rate", "saveLatest", "app_productionMainnetRelease"})
public final class RatesRepository implements io.horizontalsystems.bitstashwallet.core.IRateStorage {
    private final java.util.concurrent.ExecutorService executor = null;
    private final io.horizontalsystems.bitstashwallet.core.storage.AppDatabase appDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<io.horizontalsystems.bitstashwallet.entities.Rate> latestRateObservable(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Rate latestRate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<io.horizontalsystems.bitstashwallet.entities.Rate> rateSingle(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, long timestamp) {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
    }
    
    @java.lang.Override()
    public void saveLatest(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
    }
    
    @java.lang.Override()
    public void deleteAll() {
    }
    
    public RatesRepository(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.storage.AppDatabase appDatabase) {
        super();
    }
}