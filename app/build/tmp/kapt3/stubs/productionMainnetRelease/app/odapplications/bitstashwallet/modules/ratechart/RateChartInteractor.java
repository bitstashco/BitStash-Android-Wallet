package app.odapplications.bitstashwallet.modules.ratechart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartInteractor;", "Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$Interactor;", "rateStatsManager", "Lapp/odapplications/bitstashwallet/core/IRateStatsManager;", "rateStorage", "Lapp/odapplications/bitstashwallet/core/IRateStorage;", "localStorage", "Lapp/odapplications/bitstashwallet/core/ILocalStorage;", "(Lapp/odapplications/bitstashwallet/core/IRateStatsManager;Lapp/odapplications/bitstashwallet/core/IRateStorage;Lapp/odapplications/bitstashwallet/core/ILocalStorage;)V", "value", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "defaultChartType", "getDefaultChartType", "()Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "setDefaultChartType", "(Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$InteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$InteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$InteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "clear", "", "subscribeToChartStats", "subscribeToLatestRate", "coinCode", "", "currencyCode", "syncStats", "app_productionMainnetRelease"})
public final class RateChartInteractor implements app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.Interactor {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.InteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IRateStatsManager rateStatsManager = null;
    private final app.odapplications.bitstashwallet.core.IRateStorage rateStorage = null;
    private final app.odapplications.bitstashwallet.core.ILocalStorage localStorage = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.InteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.InteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType getDefaultChartType() {
        return null;
    }
    
    @java.lang.Override()
    public void setDefaultChartType(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType value) {
    }
    
    @java.lang.Override()
    public void syncStats(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @java.lang.Override()
    public void subscribeToChartStats() {
    }
    
    @java.lang.Override()
    public void subscribeToLatestRate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public RateChartInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateStatsManager rateStatsManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateStorage rateStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILocalStorage localStorage) {
        super();
    }
}