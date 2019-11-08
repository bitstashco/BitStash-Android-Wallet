package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J2\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\b\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\u000bj\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J2\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/NetworkManager;", "Lio/horizontalsystems/bitstashwallet/core/INetworkManager;", "appConfig", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;)V", "getLatestRateData", "Lio/reactivex/Single;", "Lio/horizontalsystems/bitstashwallet/entities/LatestRateData;", "hostType", "Lio/horizontalsystems/bitstashwallet/core/managers/ServiceExchangeApi$HostType;", "currency", "", "getRateByDay", "Ljava/math/BigDecimal;", "coinCode", "timestamp", "", "getRateByHour", "Lio/horizontalsystems/bitstashwallet/modules/transactions/CoinCode;", "getRateStats", "Lio/horizontalsystems/bitstashwallet/entities/RateStatData;", "getTransaction", "Lio/reactivex/Flowable;", "Lcom/google/gson/JsonObject;", "host", "path", "getTransactionWithPost", "body", "", "", "ping", "url", "rateApiClient", "Lio/horizontalsystems/bitstashwallet/core/managers/ServiceExchangeApi$IExchangeRate;", "app_devMainnetMasterDebug"})
public final class NetworkManager implements io.horizontalsystems.bitstashwallet.core.INetworkManager {
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfig = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<io.horizontalsystems.bitstashwallet.entities.RateStatData> getRateStats(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.ServiceExchangeApi.HostType hostType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.math.BigDecimal> getRateByDay(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.ServiceExchangeApi.HostType hostType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.math.BigDecimal> getRateByHour(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.ServiceExchangeApi.HostType hostType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<io.horizontalsystems.bitstashwallet.entities.LatestRateData> getLatestRateData(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.ServiceExchangeApi.HostType hostType, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.google.gson.JsonObject> getTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.google.gson.JsonObject> getTransactionWithPost(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.lang.Object> ping(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    private final io.horizontalsystems.bitstashwallet.core.managers.ServiceExchangeApi.IExchangeRate rateApiClient(io.horizontalsystems.bitstashwallet.core.managers.ServiceExchangeApi.HostType hostType) {
        return null;
    }
    
    public NetworkManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfig) {
        super();
    }
}