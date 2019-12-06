package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0016\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016R(\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00120\u00120\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/RateStatsManager;", "Lapp/odapplications/bitstashwallet/core/IRateStatsManager;", "networkManager", "Lapp/odapplications/bitstashwallet/core/INetworkManager;", "rateStorage", "Lapp/odapplications/bitstashwallet/core/IRateStorage;", "(Lapp/odapplications/bitstashwallet/core/INetworkManager;Lapp/odapplications/bitstashwallet/core/IRateStorage;)V", "cache", "", "Lapp/odapplications/bitstashwallet/core/managers/StatsKey;", "Lkotlin/Pair;", "", "Lapp/odapplications/bitstashwallet/entities/RateStatData;", "cacheUpdateTimeInterval", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "statsFlowable", "Lio/reactivex/Flowable;", "Lapp/odapplications/bitstashwallet/core/managers/StatsResponse;", "getStatsFlowable", "()Lio/reactivex/Flowable;", "statsSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "clear", "", "convert", "", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "data", "Lapp/odapplications/bitstashwallet/entities/RateData;", "rate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "chartType", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "growthDiff", "Ljava/math/BigDecimal;", "points", "syncStats", "coinCode", "", "currencyCode", "app_productionMainnetRelease"})
public final class RateStatsManager implements app.odapplications.bitstashwallet.core.IRateStatsManager {
    private final long cacheUpdateTimeInterval = 108000L;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final java.util.Map<app.odapplications.bitstashwallet.core.managers.StatsKey, kotlin.Pair<java.lang.Long, app.odapplications.bitstashwallet.entities.RateStatData>> cache = null;
    private final io.reactivex.subjects.PublishSubject<app.odapplications.bitstashwallet.core.managers.StatsResponse> statsSubject = null;
    private final app.odapplications.bitstashwallet.core.INetworkManager networkManager = null;
    private final app.odapplications.bitstashwallet.core.IRateStorage rateStorage = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<app.odapplications.bitstashwallet.core.managers.StatsResponse> getStatsFlowable() {
        return null;
    }
    
    @java.lang.Override()
    public void syncStats(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    public final void clear() {
    }
    
    private final java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> convert(app.odapplications.bitstashwallet.entities.RateData data, app.odapplications.bitstashwallet.entities.Rate rate, app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType chartType) {
        return null;
    }
    
    private final java.math.BigDecimal growthDiff(java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> points) {
        return null;
    }
    
    public RateStatsManager(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.INetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateStorage rateStorage) {
        super();
    }
}