package io.horizontalsystems.bitstashwallet.modules.ratechart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u0011H\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001eH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tj\u0002`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0017@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006."}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartModule$ViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartModule$InteractorDelegate;", "view", "Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartModule$View;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartModule$Interactor;", "coinCode", "", "Lio/horizontalsystems/bitstashwallet/modules/transactions/CoinCode;", "currency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "factory", "Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartViewFactory;", "(Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartModule$View;Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartModule$Interactor;Ljava/lang/String;Lio/horizontalsystems/bitstashwallet/entities/Currency;Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartViewFactory;)V", "chartType", "Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartView$ChartType;", "value", "Lio/horizontalsystems/bitstashwallet/entities/Rate;", "latestRate", "setLatestRate", "(Lio/horizontalsystems/bitstashwallet/entities/Rate;)V", "Lio/horizontalsystems/bitstashwallet/core/managers/StatsData;", "statsData", "setStatsData", "(Lio/horizontalsystems/bitstashwallet/core/managers/StatsData;)V", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartModule$View;", "onCleared", "", "onReceiveError", "ex", "", "onReceiveLatestRate", "rate", "onReceiveStats", "data", "onSelect", "type", "onTouchSelect", "point", "Lio/horizontalsystems/bitstashwallet/lib/chartview/models/ChartPoint;", "showChart", "updateChart", "viewDidLoad", "app_devMainnetMasterDebug"})
public final class RateChartPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartModule.ViewDelegate, io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartModule.InteractorDelegate {
    private io.horizontalsystems.bitstashwallet.entities.Rate latestRate;
    private io.horizontalsystems.bitstashwallet.core.managers.StatsData statsData;
    private io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType chartType;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartModule.View view = null;
    private final io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartModule.Interactor interactor = null;
    private final java.lang.String coinCode = null;
    private final io.horizontalsystems.bitstashwallet.entities.Currency currency = null;
    private final io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartViewFactory factory = null;
    
    private final void setLatestRate(io.horizontalsystems.bitstashwallet.entities.Rate value) {
    }
    
    private final void setStatsData(io.horizontalsystems.bitstashwallet.core.managers.StatsData value) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType type) {
    }
    
    @java.lang.Override()
    public void onTouchSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartPoint point) {
    }
    
    @java.lang.Override()
    public synchronized void onReceiveStats(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.StatsData data) {
    }
    
    @java.lang.Override()
    public synchronized void onReceiveLatestRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
    }
    
    private final void updateChart() {
    }
    
    @java.lang.Override()
    public void onReceiveError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable ex) {
    }
    
    private final void showChart() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartModule.View getView() {
        return null;
    }
    
    public RateChartPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartModule.View view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartModule.Interactor interactor, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Currency currency, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartViewFactory factory) {
        super();
    }
}