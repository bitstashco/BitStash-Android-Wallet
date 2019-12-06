package app.odapplications.bitstashwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\t\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0012"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule;", "", "()V", "init", "", "view", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceViewModel;", "router", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IRouter;", "BalanceItem", "DataSource", "IBalanceSorter", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "StatsButtonState", "app_productionMainnetRelease"})
public final class BalanceModule {
    public static final app.odapplications.bitstashwallet.modules.balance.BalanceModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.balance.BalanceViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.balance.BalanceModule.IRouter router) {
    }
    
    private BalanceModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IView;", "", "didRefresh", "", "reload", "setSortingOn", "isOn", "", "setStatsButton", "state", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$StatsButtonState;", "showBackupAlert", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "predefinedAccountType", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "updateHeader", "updateItem", "position", "", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void didRefresh();
        
        public abstract void reload();
        
        public abstract void updateItem(int position);
        
        public abstract void updateHeader();
        
        public abstract void setSortingOn(boolean isOn);
        
        public abstract void showBackupAlert(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType);
        
        public abstract void setStatsButton(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceModule.StatsButtonState state);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\fH&J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\fH&J\b\u0010\u0017\u001a\u00020\fH&J\b\u0010\u0018\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0019"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IViewDelegate;", "", "itemsCount", "", "getItemsCount", "()I", "getHeaderViewItem", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceHeaderViewItem;", "getViewItem", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceViewItem;", "position", "onChartClick", "", "onClear", "onPay", "onReceive", "onSortClick", "onSortTypeChanged", "sortType", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "openBackup", "openChart", "openManageCoins", "refresh", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract int getItemsCount();
        
        public abstract void viewDidLoad();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.balance.BalanceViewItem getViewItem(int position);
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.balance.BalanceHeaderViewItem getHeaderViewItem();
        
        public abstract void refresh();
        
        public abstract void onReceive(int position);
        
        public abstract void onPay(int position);
        
        public abstract void openManageCoins();
        
        public abstract void onClear();
        
        public abstract void onSortClick();
        
        public abstract void onChartClick();
        
        public abstract void onSortTypeChanged(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceSortType sortType);
        
        public abstract void openBackup();
        
        public abstract void openChart(int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\t0\bH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fH&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0018"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IInteractor;", "", "clear", "", "fetchRates", "currencyCode", "", "coinCodes", "", "Lapp/odapplications/bitstashwallet/modules/transactions/CoinCode;", "getBalanceAdapterForWallet", "Lapp/odapplications/bitstashwallet/core/IBalanceAdapter;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getSortingType", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "initWallets", "predefinedAccountType", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "refresh", "saveSortingType", "sortType", "syncStats", "coinCode", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        public abstract void refresh();
        
        public abstract void initWallets();
        
        public abstract void fetchRates(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> coinCodes);
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.balance.BalanceSortType getSortingType();
        
        public abstract void clear();
        
        public abstract void saveSortingType(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceSortType sortType);
        
        @org.jetbrains.annotations.Nullable()
        public abstract app.odapplications.bitstashwallet.core.IBalanceAdapter getBalanceAdapterForWallet(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet);
        
        public abstract void syncStats(@org.jetbrains.annotations.NotNull()
        java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode);
        
        @org.jetbrains.annotations.Nullable()
        public abstract app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0003H&\u00a8\u0006\u001c"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IInteractorDelegate;", "", "didRefresh", "", "didUpdateBalance", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "balance", "Ljava/math/BigDecimal;", "didUpdateCurrency", "currency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "didUpdateRate", "rate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "didUpdateState", "state", "Lapp/odapplications/bitstashwallet/core/AdapterState;", "didUpdateWallets", "wallets", "", "onFailFetchChartStats", "coinCode", "", "onReceiveRateStats", "data", "Lapp/odapplications/bitstashwallet/core/managers/StatsData;", "willEnterForeground", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didUpdateWallets(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.entities.Wallet> wallets);
        
        public abstract void didUpdateCurrency(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Currency currency);
        
        public abstract void didUpdateBalance(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal balance);
        
        public abstract void didUpdateState(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.AdapterState state);
        
        public abstract void didUpdateRate(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Rate rate);
        
        public abstract void onReceiveRateStats(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.managers.StatsData data);
        
        public abstract void onFailFetchChartStats(@org.jetbrains.annotations.NotNull()
        java.lang.String coinCode);
        
        public abstract void didRefresh();
        
        public abstract void willEnterForeground();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IRouter;", "", "openBackup", "", "account", "Lapp/odapplications/bitstashwallet/entities/Account;", "coinCodesStringRes", "", "openChart", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "openManageCoins", "openReceiveDialog", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "openSendDialog", "openSortTypeDialog", "sortingType", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
        
        public abstract void openReceiveDialog(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet);
        
        public abstract void openSendDialog(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet);
        
        public abstract void openManageCoins();
        
        public abstract void openSortTypeDialog(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceSortType sortingType);
        
        public abstract void openBackup(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Account account, int coinCodesStringRes);
        
        public abstract void openChart(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IBalanceSorter;", "", "sort", "", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$BalanceItem;", "items", "sortType", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "app_productionMainnetRelease"})
    public static abstract interface IBalanceSorter {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<app.odapplications.bitstashwallet.modules.balance.BalanceModule.BalanceItem> sort(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.modules.balance.BalanceModule.BalanceItem> items, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceSortType sortType);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$StatsButtonState;", "", "(Ljava/lang/String;I)V", "NORMAL", "HIDDEN", "SELECTED", "app_productionMainnetRelease"})
    public static enum StatsButtonState {
        /*public static final*/ NORMAL /* = new NORMAL() */,
        /*public static final*/ HIDDEN /* = new HIDDEN() */,
        /*public static final*/ SELECTED /* = new SELECTED() */;
        
        StatsButtonState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000eJ\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u000e\u0010.\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u000eJ\u000e\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u000201J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u00103\u001a\u00020\tJ\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\bJ\u0014\u00105\u001a\u00020*2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\bJ\u0016\u00106\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000e2\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020>J\u0016\u0010?\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020AR\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000e0(X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$DataSource;", "", "currency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "sorter", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IBalanceSorter;", "(Lapp/odapplications/bitstashwallet/entities/Currency;Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IBalanceSorter;)V", "coinCodes", "", "", "Lapp/odapplications/bitstashwallet/modules/transactions/CoinCode;", "getCoinCodes", "()Ljava/util/List;", "count", "", "getCount", "()I", "getCurrency", "()Lapp/odapplications/bitstashwallet/entities/Currency;", "setCurrency", "(Lapp/odapplications/bitstashwallet/entities/Currency;)V", "items", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$BalanceItem;", "getItems", "setItems", "(Ljava/util/List;)V", "value", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "sortType", "getSortType", "()Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "setSortType", "(Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;)V", "statsButtonState", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$StatsButtonState;", "getStatsButtonState", "()Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$StatsButtonState;", "setStatsButtonState", "(Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$StatsButtonState;)V", "updatedPositions", "", "addUpdatedPosition", "", "position", "clearRates", "clearUpdatedPositions", "getItem", "getPosition", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getPositionsByCoinCode", "coinCode", "getUpdatedPositions", "set", "setBalance", "balance", "Ljava/math/BigDecimal;", "setChartData", "data", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceChartData;", "setRate", "rate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "setState", "state", "Lapp/odapplications/bitstashwallet/core/AdapterState;", "app_productionMainnetRelease"})
    public static final class DataSource {
        private java.util.List<java.lang.Integer> updatedPositions;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<app.odapplications.bitstashwallet.modules.balance.BalanceModule.BalanceItem> items;
        @org.jetbrains.annotations.NotNull()
        private app.odapplications.bitstashwallet.modules.balance.BalanceSortType sortType;
        @org.jetbrains.annotations.NotNull()
        private app.odapplications.bitstashwallet.modules.balance.BalanceModule.StatsButtonState statsButtonState;
        @org.jetbrains.annotations.NotNull()
        private app.odapplications.bitstashwallet.entities.Currency currency;
        private final app.odapplications.bitstashwallet.modules.balance.BalanceModule.IBalanceSorter sorter = null;
        
        public final int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getCoinCodes() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<app.odapplications.bitstashwallet.modules.balance.BalanceModule.BalanceItem> getItems() {
            return null;
        }
        
        public final void setItems(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.modules.balance.BalanceModule.BalanceItem> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.modules.balance.BalanceSortType getSortType() {
            return null;
        }
        
        public final void setSortType(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceSortType value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.modules.balance.BalanceModule.StatsButtonState getStatsButtonState() {
            return null;
        }
        
        public final void setStatsButtonState(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceModule.StatsButtonState p0) {
        }
        
        public final synchronized void addUpdatedPosition(int position) {
        }
        
        public final synchronized void clearUpdatedPositions() {
        }
        
        public final void set(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.modules.balance.BalanceModule.BalanceItem> items) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final synchronized java.util.List<java.lang.Integer> getUpdatedPositions() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.modules.balance.BalanceModule.BalanceItem getItem(int position) {
            return null;
        }
        
        public final int getPosition(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Integer> getPositionsByCoinCode(@org.jetbrains.annotations.NotNull()
        java.lang.String coinCode) {
            return null;
        }
        
        public final void setBalance(int position, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal balance) {
        }
        
        public final void setState(int position, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.AdapterState state) {
        }
        
        public final void setRate(int position, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Rate rate) {
        }
        
        public final void setChartData(int position, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceChartData data) {
        }
        
        public final void clearRates() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.Currency getCurrency() {
            return null;
        }
        
        public final void setCurrency(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Currency p0) {
        }
        
        public DataSource(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Currency currency, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.balance.BalanceModule.IBalanceSorter sorter) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003J3\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006-"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$BalanceItem;", "", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "balance", "Ljava/math/BigDecimal;", "state", "Lapp/odapplications/bitstashwallet/core/AdapterState;", "rate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "(Lapp/odapplications/bitstashwallet/entities/Wallet;Ljava/math/BigDecimal;Lapp/odapplications/bitstashwallet/core/AdapterState;Lapp/odapplications/bitstashwallet/entities/Rate;)V", "getBalance", "()Ljava/math/BigDecimal;", "setBalance", "(Ljava/math/BigDecimal;)V", "chartData", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceChartData;", "getChartData", "()Lapp/odapplications/bitstashwallet/modules/balance/BalanceChartData;", "setChartData", "(Lapp/odapplications/bitstashwallet/modules/balance/BalanceChartData;)V", "fiatValue", "getFiatValue", "getRate", "()Lapp/odapplications/bitstashwallet/entities/Rate;", "setRate", "(Lapp/odapplications/bitstashwallet/entities/Rate;)V", "getState", "()Lapp/odapplications/bitstashwallet/core/AdapterState;", "setState", "(Lapp/odapplications/bitstashwallet/core/AdapterState;)V", "getWallet", "()Lapp/odapplications/bitstashwallet/entities/Wallet;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionMainnetRelease"})
    public static final class BalanceItem {
        @org.jetbrains.annotations.Nullable()
        private app.odapplications.bitstashwallet.modules.balance.BalanceChartData chartData;
        @org.jetbrains.annotations.NotNull()
        private final app.odapplications.bitstashwallet.entities.Wallet wallet = null;
        @org.jetbrains.annotations.NotNull()
        private java.math.BigDecimal balance;
        @org.jetbrains.annotations.NotNull()
        private app.odapplications.bitstashwallet.core.AdapterState state;
        @org.jetbrains.annotations.Nullable()
        private app.odapplications.bitstashwallet.entities.Rate rate;
        
        @org.jetbrains.annotations.Nullable()
        public final app.odapplications.bitstashwallet.modules.balance.BalanceChartData getChartData() {
            return null;
        }
        
        public final void setChartData(@org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.modules.balance.BalanceChartData p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getFiatValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.Wallet getWallet() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getBalance() {
            return null;
        }
        
        public final void setBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.core.AdapterState getState() {
            return null;
        }
        
        public final void setState(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.AdapterState p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final app.odapplications.bitstashwallet.entities.Rate getRate() {
            return null;
        }
        
        public final void setRate(@org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.Rate p0) {
        }
        
        public BalanceItem(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal balance, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.AdapterState state, @org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.Rate rate) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.Wallet component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.core.AdapterState component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final app.odapplications.bitstashwallet.entities.Rate component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.modules.balance.BalanceModule.BalanceItem copy(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal balance, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.AdapterState state, @org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.Rate rate) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}