package app.odapplications.bitstashwallet.modules.managecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020!J\b\u0010#\u001a\u00020!H\u0014J\b\u0010\u0012\u001a\u00020!H\u0016J\u0010\u0010\u0015\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0016H\u0016J\u0014\u0010%\u001a\u00020!2\n\u0010&\u001a\u00060\u0019j\u0002`\u001aH\u0016J\u0018\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u001b\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR#\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u001d0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\t\u00a8\u0006,"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IView;", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IRouter;", "()V", "closeLiveDate", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "Ljava/lang/Void;", "getCloseLiveDate", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "coinsLoadedLiveEvent", "getCoinsLoadedLiveEvent", "delegate", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IViewDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IViewDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IViewDelegate;)V", "openRestoreEosModule", "Lapp/odapplications/bitstashwallet/entities/Coin;", "getOpenRestoreEosModule", "openRestoreWordsModule", "", "getOpenRestoreWordsModule", "showErrorEvent", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getShowErrorEvent", "showManageKeysDialog", "Lkotlin/Pair;", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "getShowManageKeysDialog", "close", "", "init", "onCleared", "wordsCount", "showError", "e", "showNoAccountDialog", "coin", "predefinedAccountType", "showSuccess", "updateCoins", "app_productionMainnetRelease"})
public final class ManageWalletsViewModel extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IView, app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> coinsLoadedLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<app.odapplications.bitstashwallet.entities.Coin, app.odapplications.bitstashwallet.core.IPredefinedAccountType>> showManageKeysDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Integer> openRestoreWordsModule = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.entities.Coin> openRestoreEosModule = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Exception> showErrorEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> closeLiveDate = null;
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IViewDelegate delegate;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getCoinsLoadedLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<app.odapplications.bitstashwallet.entities.Coin, app.odapplications.bitstashwallet.core.IPredefinedAccountType>> getShowManageKeysDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Integer> getOpenRestoreWordsModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.entities.Coin> getOpenRestoreEosModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Exception> getShowErrorEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getCloseLiveDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IViewDelegate p0) {
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void updateCoins() {
    }
    
    @java.lang.Override()
    public void showNoAccountDialog(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
    }
    
    @java.lang.Override()
    public void showSuccess() {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    @java.lang.Override()
    public void openRestoreWordsModule(int wordsCount) {
    }
    
    @java.lang.Override()
    public void openRestoreEosModule() {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public ManageWalletsViewModel() {
        super();
    }
}