package app.odapplications.bitstashwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0016J\u0006\u00103\u001a\u000202J\b\u00104\u001a\u000202H\u0014J\u000e\u00105\u001a\u0002022\u0006\u00106\u001a\u00020\u0013J\u000e\u00107\u001a\u0002022\u0006\u00106\u001a\u00020\u0013J\u0018\u0010\u0010\u001a\u0002022\u0006\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u0013H\u0016J\u0010\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020\u0016H\u0016J\b\u0010<\u001a\u000202H\u0016J\u0010\u0010\u001a\u001a\u0002022\u0006\u0010=\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u0002022\u0006\u0010=\u001a\u00020\u001bH\u0016J\u0010\u0010>\u001a\u0002022\u0006\u0010?\u001a\u00020 H\u0016J\b\u0010@\u001a\u000202H\u0016J\u0010\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020)H\u0016J\u0010\u0010C\u001a\u0002022\u0006\u0010D\u001a\u00020,H\u0016J\u0018\u0010.\u001a\u0002022\u0006\u0010;\u001a\u00020\u00162\u0006\u0010E\u001a\u00020/H\u0016J\b\u0010F\u001a\u000202H\u0016J\u0010\u0010G\u001a\u0002022\u0006\u00106\u001a\u00020\u0013H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000fR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000fR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u000fR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u000fR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000fR#\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020/0\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u000f\u00a8\u0006H"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IView;", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IRouter;", "()V", "delegate", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IViewDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IViewDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IViewDelegate;)V", "didRefreshLiveEvent", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "Ljava/lang/Void;", "getDidRefreshLiveEvent", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "openBackup", "Lkotlin/Pair;", "Lapp/odapplications/bitstashwallet/entities/Account;", "", "getOpenBackup", "openChartModule", "Lapp/odapplications/bitstashwallet/entities/Coin;", "getOpenChartModule", "openManageCoinsLiveEvent", "getOpenManageCoinsLiveEvent", "openReceiveDialog", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getOpenReceiveDialog", "openSendDialog", "getOpenSendDialog", "openSortingTypeDialogLiveEvent", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "getOpenSortingTypeDialogLiveEvent", "reloadHeaderLiveEvent", "getReloadHeaderLiveEvent", "reloadItemLiveEvent", "getReloadItemLiveEvent", "reloadLiveEvent", "getReloadLiveEvent", "setSortingOnLiveEvent", "", "getSetSortingOnLiveEvent", "setStatsButtonState", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$StatsButtonState;", "getSetStatsButtonState", "showBackupAlert", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "getShowBackupAlert", "didRefresh", "", "init", "onCleared", "onReceiveClicked", "position", "onSendClicked", "account", "coinCodesStringRes", "openChart", "coin", "openManageCoins", "wallet", "openSortTypeDialog", "sortingType", "reload", "setSortingOn", "isOn", "setStatsButton", "state", "predefinedAccountType", "updateHeader", "updateItem", "app_productionMainnetRelease"})
public final class BalanceViewModel extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.balance.BalanceModule.IView, app.odapplications.bitstashwallet.modules.balance.BalanceModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.balance.BalanceModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.entities.Wallet> openSendDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.entities.Wallet> openReceiveDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> didRefreshLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> openManageCoinsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.balance.BalanceSortType> openSortingTypeDialogLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> reloadLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> reloadHeaderLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Integer> reloadItemLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Boolean> setSortingOnLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<app.odapplications.bitstashwallet.entities.Coin, app.odapplications.bitstashwallet.core.IPredefinedAccountType>> showBackupAlert = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<app.odapplications.bitstashwallet.entities.Account, java.lang.Integer>> openBackup = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.entities.Coin> openChartModule = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.balance.BalanceModule.StatsButtonState> setStatsButtonState = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.balance.BalanceModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.balance.BalanceModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.entities.Wallet> getOpenSendDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.entities.Wallet> getOpenReceiveDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getDidRefreshLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getOpenManageCoinsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.balance.BalanceSortType> getOpenSortingTypeDialogLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getReloadLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getReloadHeaderLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Integer> getReloadItemLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Boolean> getSetSortingOnLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<app.odapplications.bitstashwallet.entities.Coin, app.odapplications.bitstashwallet.core.IPredefinedAccountType>> getShowBackupAlert() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<app.odapplications.bitstashwallet.entities.Account, java.lang.Integer>> getOpenBackup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.entities.Coin> getOpenChartModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.balance.BalanceModule.StatsButtonState> getSetStatsButtonState() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void reload() {
    }
    
    @java.lang.Override()
    public void updateItem(int position) {
    }
    
    @java.lang.Override()
    public void updateHeader() {
    }
    
    @java.lang.Override()
    public void openReceiveDialog(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void openSendDialog(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
    }
    
    public final void onReceiveClicked(int position) {
    }
    
    public final void onSendClicked(int position) {
    }
    
    @java.lang.Override()
    public void didRefresh() {
    }
    
    @java.lang.Override()
    public void openManageCoins() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public void openSortTypeDialog(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.balance.BalanceSortType sortingType) {
    }
    
    @java.lang.Override()
    public void setSortingOn(boolean isOn) {
    }
    
    @java.lang.Override()
    public void showBackupAlert(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
    }
    
    @java.lang.Override()
    public void openBackup(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Account account, int coinCodesStringRes) {
    }
    
    @java.lang.Override()
    public void openChart(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin) {
    }
    
    @java.lang.Override()
    public void setStatsButton(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.balance.BalanceModule.StatsButtonState state) {
    }
    
    public BalanceViewModel() {
        super();
    }
}