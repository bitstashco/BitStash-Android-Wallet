package app.odapplications.bitstashwallet.modules.ratelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule;", "", "()V", "DataSource", "Factory", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_productionMainnetRelease"})
public final class RateListModule {
    public static final app.odapplications.bitstashwallet.modules.ratelist.RateListModule INSTANCE = null;
    
    private RateListModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IView;", "", "reload", "", "showCurrentDate", "currentDate", "Ljava/util/Date;", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void showCurrentDate(@org.jetbrains.annotations.NotNull()
        java.util.Date currentDate);
        
        public abstract void reload();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IRouter;", "", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IViewDelegate;", "", "itemsCount", "", "getItemsCount", "()I", "getViewItem", "Lapp/odapplications/bitstashwallet/modules/ratelist/RateViewItem;", "position", "viewDidLoad", "", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract int getItemsCount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.ratelist.RateViewItem getViewItem(int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&J\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0014\u001a\u00020\u0013H&J\u001e\u0010\u0015\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0016\u001a\u00020\u0010H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IInteractor;", "", "coins", "", "Lapp/odapplications/bitstashwallet/entities/Coin;", "getCoins", "()Ljava/util/List;", "currency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "getCurrency", "()Lapp/odapplications/bitstashwallet/entities/Currency;", "currentDate", "Ljava/util/Date;", "getCurrentDate", "()Ljava/util/Date;", "clear", "", "fetchRates", "coinCodes", "", "currencyCode", "getRateStats", "initRateList", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.Date getCurrentDate();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.entities.Currency getCurrency();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<app.odapplications.bitstashwallet.entities.Coin> getCoins();
        
        public abstract void clear();
        
        public abstract void initRateList();
        
        public abstract void getRateStats(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> coinCodes, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode);
        
        public abstract void fetchRates(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> coinCodes, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IInteractorDelegate;", "", "didUpdateRate", "", "rate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "onFailStats", "coinCode", "", "onReceive", "statsData", "Lapp/odapplications/bitstashwallet/core/managers/StatsData;", "willEnterForeground", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void onReceive(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.managers.StatsData statsData);
        
        public abstract void onFailStats(@org.jetbrains.annotations.NotNull()
        java.lang.String coinCode);
        
        public abstract void didUpdateRate(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Rate rate);
        
        public abstract void willEnterForeground();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_productionMainnetRelease"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0004J\u0014\u0010\u001c\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$DataSource;", "", "()V", "chartType", "", "coinCodes", "", "getCoinCodes", "()Ljava/util/List;", "items", "Lapp/odapplications/bitstashwallet/modules/ratelist/RateViewItem;", "getItems", "setItems", "(Ljava/util/List;)V", "getPositionByCoinCode", "", "coinCode", "(Ljava/lang/String;)Ljava/lang/Integer;", "setChartData", "", "statsData", "Lapp/odapplications/bitstashwallet/core/managers/StatsData;", "setRate", "rate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "baseCurrency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "setStatsFailed", "setViewItems", "coins", "Lapp/odapplications/bitstashwallet/entities/Coin;", "app_productionMainnetRelease"})
    public static final class DataSource {
        private final java.lang.String chartType = null;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<app.odapplications.bitstashwallet.modules.ratelist.RateViewItem> items;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<app.odapplications.bitstashwallet.modules.ratelist.RateViewItem> getItems() {
            return null;
        }
        
        public final void setItems(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.modules.ratelist.RateViewItem> p0) {
        }
        
        public final void setViewItems(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.entities.Coin> coins) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getCoinCodes() {
            return null;
        }
        
        public final void setChartData(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.managers.StatsData statsData) {
        }
        
        public final void setRate(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Rate rate, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Currency baseCurrency) {
        }
        
        public final void setStatsFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String coinCode) {
        }
        
        private final java.lang.Integer getPositionByCoinCode(java.lang.String coinCode) {
            return null;
        }
        
        public DataSource() {
            super();
        }
    }
}