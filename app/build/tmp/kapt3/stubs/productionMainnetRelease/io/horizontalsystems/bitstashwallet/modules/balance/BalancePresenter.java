package io.horizontalsystems.bitstashwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\"\u001a\u00020\u0014H\u0016J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010/\u001a\u000200H\u0016J\u0016\u00101\u001a\u00020\u00142\f\u00102\u001a\b\u0012\u0004\u0012\u00020%03H\u0016J\b\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0017H\u0016J\b\u00109\u001a\u00020\u0014H\u0016J\b\u0010:\u001a\u00020\u0014H\u0016J\u0010\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u0017H\u0016J\u0010\u0010?\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u0017H\u0016J\u0010\u0010@\u001a\u00020\u00142\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020\u0014H\u0016J\u0010\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020\u0014H\u0016J\u0010\u0010H\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u0017H\u0016J\b\u0010I\u001a\u00020\u0014H\u0016J\b\u0010J\u001a\u00020\u0014H\u0002J\b\u0010K\u001a\u00020\u0014H\u0016J\u0010\u0010L\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u0017H\u0002J\b\u0010M\u001a\u00020\u0014H\u0002J\b\u0010N\u001a\u00020\u0014H\u0002J\b\u0010O\u001a\u00020\u0014H\u0016J\b\u0010P\u001a\u00020\u0014H\u0016R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006Q"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/balance/BalancePresenter;", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$IInteractorDelegate;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$IInteractor;", "router", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$IRouter;", "dataSource", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$DataSource;", "predefinedAccountTypeManager", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;", "factory", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceViewItemFactory;", "(Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$IInteractor;Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$IRouter;Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$DataSource;Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceViewItemFactory;)V", "accountToBackup", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "flushSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "itemsCount", "", "getItemsCount", "()I", "reloadViewSubject", "showSortingButtonThreshold", "view", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$IView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$IView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceModule$IView;)V", "didRefresh", "didUpdateBalance", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "balance", "Ljava/math/BigDecimal;", "didUpdateCurrency", "currency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "didUpdateRate", "rate", "Lio/horizontalsystems/bitstashwallet/entities/Rate;", "didUpdateState", "state", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "didUpdateWallets", "wallets", "", "getHeaderViewItem", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceHeaderViewItem;", "getViewItem", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceViewItem;", "position", "onChartClick", "onClear", "onFailFetchChartStats", "coinCode", "", "onPay", "onReceive", "onReceiveRateStats", "data", "Lio/horizontalsystems/bitstashwallet/core/managers/StatsData;", "onSortClick", "onSortTypeChanged", "sortType", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "openBackup", "openChart", "openManageCoins", "postViewReload", "refresh", "updateByPosition", "updateStats", "updateViewItems", "viewDidLoad", "willEnterForeground", "app_productionMainnetRelease"})
public final class BalancePresenter implements io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.IView view;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> flushSubject = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> reloadViewSubject = null;
    private final int showSortingButtonThreshold = 5;
    private io.horizontalsystems.bitstashwallet.entities.Account accountToBackup;
    private final io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.IInteractor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.IRouter router = null;
    private final io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.DataSource dataSource = null;
    private final io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager = null;
    private final io.horizontalsystems.bitstashwallet.modules.balance.BalanceViewItemFactory factory = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.IView p0) {
    }
    
    @java.lang.Override()
    public int getItemsCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.balance.BalanceViewItem getViewItem(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.balance.BalanceHeaderViewItem getHeaderViewItem() {
        return null;
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @java.lang.Override()
    public void onReceive(int position) {
    }
    
    @java.lang.Override()
    public void onPay(int position) {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    @java.lang.Override()
    public void openManageCoins() {
    }
    
    @java.lang.Override()
    public void onSortClick() {
    }
    
    @java.lang.Override()
    public void onChartClick() {
    }
    
    @java.lang.Override()
    public void onSortTypeChanged(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType sortType) {
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public void didUpdateWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets) {
    }
    
    @java.lang.Override()
    public void didUpdateCurrency(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Currency currency) {
    }
    
    @java.lang.Override()
    public void didUpdateBalance(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal balance) {
    }
    
    @java.lang.Override()
    public void didUpdateState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.AdapterState state) {
    }
    
    @java.lang.Override()
    public synchronized void didUpdateRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
    }
    
    @java.lang.Override()
    public void onReceiveRateStats(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.StatsData data) {
    }
    
    @java.lang.Override()
    public void onFailFetchChartStats(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode) {
    }
    
    @java.lang.Override()
    public void didRefresh() {
    }
    
    @java.lang.Override()
    public void openBackup() {
    }
    
    @java.lang.Override()
    public void openChart(int position) {
    }
    
    private final void postViewReload() {
    }
    
    private final void updateViewItems() {
    }
    
    private final void updateByPosition(int position) {
    }
    
    private final void updateStats() {
    }
    
    public BalancePresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceModule.DataSource dataSource, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceViewItemFactory factory) {
        super();
    }
}