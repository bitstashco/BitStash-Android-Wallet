package app.odapplications.bitstashwallet.modules.managecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\rH\u0016J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\rH\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\rH\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010\u001f\u001a\u00020*2\u0006\u0010!\u001a\u00020\rH\u0016J\b\u0010+\u001a\u00020\u001dH\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\u001a\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00103\u001a\u00020*2\u0006\u0010!\u001a\u00020\rH\u0016J\b\u00104\u001a\u00020\u001dH\u0016J\b\u00105\u001a\u00020\u001dH\u0016J\u0010\u00106\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00067"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsPresenter;", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractorDelegate;", "interactor", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractor;", "router", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IRouter;", "(Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractor;Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IRouter;)V", "currentItem", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletItem;", "items", "", "itemsCount", "", "getItemsCount", "()I", "popularCoinCodes", "", "", "popularItems", "popularItemsCount", "getPopularItemsCount", "view", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IView;", "getView", "()Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IView;", "setView", "(Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IView;)V", "didSaveChanges", "", "disable", "item", "disableCoin", "position", "disablePopularCoin", "enable", "enableCoin", "enablePopularCoin", "getPredefinedAccountType", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "coinDefaultAccountType", "Lapp/odapplications/bitstashwallet/core/DefaultAccountType;", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletViewItem;", "onClickCancel", "onClickCreateKey", "onClickRestoreKey", "onRestore", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "popularItem", "saveChanges", "viewDidLoad", "viewItem", "app_productionMainnetRelease"})
public final class ManageWalletsPresenter implements app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IViewDelegate, app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IView view;
    private java.util.List<app.odapplications.bitstashwallet.modules.managecoins.ManageWalletItem> items;
    private java.util.List<app.odapplications.bitstashwallet.modules.managecoins.ManageWalletItem> popularItems;
    private final java.util.List<java.lang.String> popularCoinCodes = null;
    private app.odapplications.bitstashwallet.modules.managecoins.ManageWalletItem currentItem;
    private final app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractor interactor = null;
    private final app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IRouter router = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IView p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onClickCreateKey() {
    }
    
    @java.lang.Override()
    public void onClickRestoreKey() {
    }
    
    @java.lang.Override()
    public void onClickCancel() {
    }
    
    @java.lang.Override()
    public void onRestore(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.SyncMode syncMode) {
    }
    
    @java.lang.Override()
    public int getPopularItemsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.managecoins.ManageWalletViewItem popularItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.managecoins.ManageWalletViewItem item(int position) {
        return null;
    }
    
    @java.lang.Override()
    public void enablePopularCoin(int position) {
    }
    
    @java.lang.Override()
    public void disablePopularCoin(int position) {
    }
    
    @java.lang.Override()
    public void enableCoin(int position) {
    }
    
    @java.lang.Override()
    public void disableCoin(int position) {
    }
    
    @java.lang.Override()
    public void saveChanges() {
    }
    
    @java.lang.Override()
    public void didSaveChanges() {
    }
    
    private final void enable(app.odapplications.bitstashwallet.modules.managecoins.ManageWalletItem item) {
    }
    
    private final app.odapplications.bitstashwallet.core.IPredefinedAccountType getPredefinedAccountType(app.odapplications.bitstashwallet.core.DefaultAccountType coinDefaultAccountType) {
        return null;
    }
    
    private final void disable(app.odapplications.bitstashwallet.modules.managecoins.ManageWalletItem item) {
    }
    
    private final app.odapplications.bitstashwallet.modules.managecoins.ManageWalletViewItem viewItem(app.odapplications.bitstashwallet.modules.managecoins.ManageWalletItem item) {
        return null;
    }
    
    public ManageWalletsPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IRouter router) {
        super();
    }
    
    public void onClear() {
    }
}