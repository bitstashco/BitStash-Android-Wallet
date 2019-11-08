package io.horizontalsystems.bitstashwallet.modules.ratechart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\"\u0010\u001e\u001a\u00020\t2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R)\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartView;", "Lio/horizontalsystems/bitstashwallet/modules/ratechart/RateChartModule$View;", "()V", "enableChartType", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartView$ChartType;", "getEnableChartType", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "hideSpinner", "", "getHideSpinner", "setDefaultMode", "getSetDefaultMode", "setSelectedPoint", "Lkotlin/Triple;", "", "Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "getSetSelectedPoint", "showChart", "Lio/horizontalsystems/bitstashwallet/modules/ratechart/ChartViewItem;", "getShowChart", "showError", "", "getShowError", "showSpinner", "getShowSpinner", "type", "setChartType", "viewItem", "ex", "showSelectedPoint", "data", "app_devMainnetMasterDebug"})
public final class RateChartView implements io.horizontalsystems.bitstashwallet.modules.ratechart.RateChartModule.View {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showSpinner = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> hideSpinner = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType> setDefaultMode = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Triple<java.lang.Long, io.horizontalsystems.bitstashwallet.entities.CurrencyValue, io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType>> setSelectedPoint = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType> enableChartType = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.modules.ratechart.ChartViewItem> showChart = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Throwable> showError = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowSpinner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getHideSpinner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType> getSetDefaultMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Triple<java.lang.Long, io.horizontalsystems.bitstashwallet.entities.CurrencyValue, io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType>> getSetSelectedPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType> getEnableChartType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.modules.ratechart.ChartViewItem> getShowChart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Throwable> getShowError() {
        return null;
    }
    
    @java.lang.Override()
    public void showSpinner() {
    }
    
    @java.lang.Override()
    public void hideSpinner() {
    }
    
    @java.lang.Override()
    public void setChartType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType type) {
    }
    
    @java.lang.Override()
    public void enableChartType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType type) {
    }
    
    @java.lang.Override()
    public void showChart(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.ratechart.ChartViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void showSelectedPoint(@org.jetbrains.annotations.NotNull()
    kotlin.Triple<java.lang.Long, io.horizontalsystems.bitstashwallet.entities.CurrencyValue, ? extends io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType> data) {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable ex) {
    }
    
    public RateChartView() {
        super();
    }
}