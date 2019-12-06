package app.odapplications.bitstashwallet.modules.ratechart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule;", "", "()V", "Factory", "Interactor", "InteractorDelegate", "Router", "View", "ViewDelegate", "app_productionMainnetRelease"})
public final class RateChartModule {
    public static final app.odapplications.bitstashwallet.modules.ratechart.RateChartModule INSTANCE = null;
    
    private RateChartModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\"\u0010\u000e\u001a\u00020\u00032\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0010H&J\b\u0010\u0013\u001a\u00020\u0003H&\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$View;", "", "enableChartType", "", "type", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "hideSpinner", "setChartType", "showChart", "viewItem", "Lapp/odapplications/bitstashwallet/modules/ratechart/ChartViewItem;", "showError", "ex", "", "showSelectedPoint", "data", "Lkotlin/Triple;", "", "Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "showSpinner", "app_productionMainnetRelease"})
    public static abstract interface View {
        
        public abstract void showSpinner();
        
        public abstract void hideSpinner();
        
        public abstract void setChartType(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType type);
        
        public abstract void enableChartType(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType type);
        
        public abstract void showChart(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.ratechart.ChartViewItem viewItem);
        
        public abstract void showSelectedPoint(@org.jetbrains.annotations.NotNull()
        kotlin.Triple<java.lang.Long, app.odapplications.bitstashwallet.entities.CurrencyValue, ? extends app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType> data);
        
        public abstract void showError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable ex);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$ViewDelegate;", "", "onSelect", "", "type", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "onTouchSelect", "point", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface ViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onSelect(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType type);
        
        public abstract void onTouchSelect(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint point);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$Interactor;", "", "defaultChartType", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "getDefaultChartType", "()Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "setDefaultChartType", "(Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;)V", "clear", "", "subscribeToChartStats", "subscribeToLatestRate", "coinCode", "", "currencyCode", "syncStats", "app_productionMainnetRelease"})
    public static abstract interface Interactor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType getDefaultChartType();
        
        public abstract void setDefaultChartType(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType p0);
        
        public abstract void subscribeToLatestRate(@org.jetbrains.annotations.NotNull()
        java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode);
        
        public abstract void subscribeToChartStats();
        
        public abstract void syncStats(@org.jetbrains.annotations.NotNull()
        java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$InteractorDelegate;", "", "onReceiveError", "", "ex", "", "onReceiveLatestRate", "rate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "onReceiveStats", "data", "Lapp/odapplications/bitstashwallet/core/managers/StatsData;", "app_productionMainnetRelease"})
    public static abstract interface InteractorDelegate {
        
        public abstract void onReceiveStats(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.managers.StatsData data);
        
        public abstract void onReceiveLatestRate(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Rate rate);
        
        public abstract void onReceiveError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable ex);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$Router;", "", "app_productionMainnetRelease"})
    public static abstract interface Router {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/RateChartModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "(Lapp/odapplications/bitstashwallet/entities/Coin;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_productionMainnetRelease"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final app.odapplications.bitstashwallet.entities.Coin coin = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin) {
            super();
        }
    }
}