package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170!2\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/RateManager;", "Lio/horizontalsystems/bitstashwallet/core/IRateManager;", "storage", "Lio/horizontalsystems/bitstashwallet/core/IRateStorage;", "networkManager", "Lio/horizontalsystems/bitstashwallet/core/INetworkManager;", "walletStorage", "Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;", "currencyManager", "Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;", "connectivityManager", "Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;", "(Lio/horizontalsystems/bitstashwallet/core/IRateStorage;Lio/horizontalsystems/bitstashwallet/core/INetworkManager;Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "latestRateFallbackThreshold", "", "clear", "", "getLatestRateFallback", "Lio/reactivex/Single;", "Ljava/math/BigDecimal;", "coinCode", "", "Lio/horizontalsystems/bitstashwallet/modules/transactions/CoinCode;", "currencyCode", "timestamp", "", "getRateFromNetwork", "rateValueObservable", "refreshLatestRates", "Lio/horizontalsystems/bitstashwallet/entities/LatestRateData;", "coinCodes", "", "syncLatestRates", "syncLatestRatesSingle", "app_devMainnetMasterDebug"})
public final class RateManager implements io.horizontalsystems.bitstashwallet.core.IRateManager {
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final int latestRateFallbackThreshold = 600;
    private final io.horizontalsystems.bitstashwallet.core.IRateStorage storage = null;
    private final io.horizontalsystems.bitstashwallet.core.INetworkManager networkManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletStorage walletStorage = null;
    private final io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bitstashwallet.core.managers.ConnectivityManager connectivityManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<io.horizontalsystems.bitstashwallet.entities.LatestRateData> syncLatestRatesSingle() {
        return null;
    }
    
    @java.lang.Override()
    public void syncLatestRates() {
    }
    
    private final io.reactivex.Single<io.horizontalsystems.bitstashwallet.entities.LatestRateData> refreshLatestRates(java.util.List<java.lang.String> coinCodes, java.lang.String currencyCode) {
        return null;
    }
    
    private final io.reactivex.Single<java.math.BigDecimal> getLatestRateFallback(java.lang.String coinCode, java.lang.String currencyCode, long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.math.BigDecimal> rateValueObservable(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, long timestamp) {
        return null;
    }
    
    private final io.reactivex.Single<java.math.BigDecimal> getRateFromNetwork(java.lang.String coinCode, java.lang.String currencyCode, long timestamp) {
        return null;
    }
    
    public final void clear() {
    }
    
    public RateManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IRateStorage storage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.INetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletStorage walletStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.ConnectivityManager connectivityManager) {
        super();
    }
}