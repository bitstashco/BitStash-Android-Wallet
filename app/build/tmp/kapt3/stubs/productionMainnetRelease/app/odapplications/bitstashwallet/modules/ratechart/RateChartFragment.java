package app.odapplications.bitstashwallet.modules.ratechart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\u001a\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\tH\u0002J)\u0010%\u001a\u00020\u00112\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\'\"\u00020\t2\u0006\u0010(\u001a\u00020)H\u0002\u00a2\u0006\u0002\u0010*J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,2\u0006\u0010/\u001a\u000200H\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$Listener;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "(Lapp/odapplications/bitstashwallet/entities/Coin;)V", "actions", "", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "Landroid/view/View;", "formatter", "Lapp/odapplications/bitstashwallet/core/IAppNumberFormatter;", "presenter", "Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartPresenter;", "presenterView", "Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartView;", "bindActions", "", "getTheme", "", "observeData", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTouchDown", "onTouchSelect", "point", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "onTouchUp", "onViewCreated", "view", "resetActions", "current", "setViewVisibility", "views", "", "isVisible", "", "([Landroid/view/View;Z)V", "shortenValue", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "", "number", "", "app_productionMainnetRelease"})
public final class RateChartFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements app.odapplications.bitstashwallet.lib.chartview.ChartView.Listener {
    private app.odapplications.bitstashwallet.modules.ratechart.RateChartPresenter presenter;
    private app.odapplications.bitstashwallet.modules.ratechart.RateChartView presenterView;
    private final app.odapplications.bitstashwallet.core.IAppNumberFormatter formatter = null;
    private java.util.Map<app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType, ? extends android.view.View> actions;
    private final app.odapplications.bitstashwallet.entities.Coin coin = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeData() {
    }
    
    @java.lang.Override()
    public void onTouchDown() {
    }
    
    @java.lang.Override()
    public void onTouchUp() {
    }
    
    @java.lang.Override()
    public void onTouchSelect(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint point) {
    }
    
    private final void bindActions() {
    }
    
    private final void resetActions(android.view.View current) {
    }
    
    private final void setViewVisibility(android.view.View[] views, boolean isVisible) {
    }
    
    private final kotlin.Pair<java.math.BigDecimal, java.lang.String> shortenValue(java.lang.Number number) {
        return null;
    }
    
    public RateChartFragment(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin) {
        super();
    }
}