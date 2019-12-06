package app.odapplications.bitstashwallet.modules.ratechart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u0011H\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001eH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tj\u0002`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0017@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006."}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartPresenter;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$ViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$InteractorDelegate;", "view", "Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$View;", "interactor", "Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$Interactor;", "coinCode", "", "Lapp/odapplications/bitstashwallet/modules/transactions/CoinCode;", "currency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "factory", "Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartViewFactory;", "(Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$View;Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$Interactor;Ljava/lang/String;Lapp/odapplications/bitstashwallet/entities/Currency;Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartViewFactory;)V", "chartType", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "value", "Lapp/odapplications/bitstashwallet/entities/Rate;", "latestRate", "setLatestRate", "(Lapp/odapplications/bitstashwallet/entities/Rate;)V", "Lapp/odapplications/bitstashwallet/core/managers/StatsData;", "statsData", "setStatsData", "(Lapp/odapplications/bitstashwallet/core/managers/StatsData;)V", "getView", "()Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$View;", "onCleared", "", "onReceiveError", "ex", "", "onReceiveLatestRate", "rate", "onReceiveStats", "data", "onSelect", "type", "onTouchSelect", "point", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "showChart", "updateChart", "viewDidLoad", "app_productionMainnetRelease"})
public final class RateChartPresenter extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.ViewDelegate, app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.InteractorDelegate {
    private app.odapplications.bitstashwallet.entities.Rate latestRate;
    private app.odapplications.bitstashwallet.core.managers.StatsData statsData;
    private app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType chartType;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.View view = null;
    private final app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.Interactor interactor = null;
    private final java.lang.String coinCode = null;
    private final app.odapplications.bitstashwallet.entities.Currency currency = null;
    private final app.odapplications.bitstashwallet.modules.ratechart.RateChartViewFactory factory = null;
    
    private final void setLatestRate(app.odapplications.bitstashwallet.entities.Rate value) {
    }
    
    private final void setStatsData(app.odapplications.bitstashwallet.core.managers.StatsData value) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType type) {
    }
    
    @java.lang.Override()
    public void onTouchSelect(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint point) {
    }
    
    @java.lang.Override()
    public synchronized void onReceiveStats(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.StatsData data) {
    }
    
    @java.lang.Override()
    public synchronized void onReceiveLatestRate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Rate rate) {
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
    public final app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.View getView() {
        return null;
    }
    
    public RateChartPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.View view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.Interactor interactor, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Currency currency, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.ratechart.RateChartViewFactory factory) {
        super();
    }
}