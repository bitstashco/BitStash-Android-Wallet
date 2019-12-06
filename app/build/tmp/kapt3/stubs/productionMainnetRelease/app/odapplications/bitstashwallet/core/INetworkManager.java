package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH&J2\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0018H&J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH&\u00a8\u0006\u001b"}, d2 = {"Lapp/odapplications/bitstashwallet/core/INetworkManager;", "", "getLatestRateData", "Lio/reactivex/Single;", "Lapp/odapplications/bitstashwallet/entities/LatestRateData;", "hostType", "Lapp/odapplications/bitstashwallet/core/managers/ServiceExchangeApi$HostType;", "currency", "", "getRateByDay", "Ljava/math/BigDecimal;", "coinCode", "timestamp", "", "getRateByHour", "getRateStats", "Lapp/odapplications/bitstashwallet/entities/RateStatData;", "getTransaction", "Lio/reactivex/Flowable;", "Lcom/google/gson/JsonObject;", "host", "path", "getTransactionWithPost", "body", "", "ping", "url", "app_productionMainnetRelease"})
public abstract interface INetworkManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<app.odapplications.bitstashwallet.entities.RateStatData> getRateStats(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.ServiceExchangeApi.HostType hostType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currency);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.math.BigDecimal> getRateByDay(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.ServiceExchangeApi.HostType hostType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, long timestamp);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.math.BigDecimal> getRateByHour(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.ServiceExchangeApi.HostType hostType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, long timestamp);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<app.odapplications.bitstashwallet.entities.LatestRateData> getLatestRateData(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.ServiceExchangeApi.HostType hostType, @org.jetbrains.annotations.NotNull()
    java.lang.String currency);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<com.google.gson.JsonObject> getTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<com.google.gson.JsonObject> getTransactionWithPost(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> body);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.lang.Object> ping(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
}