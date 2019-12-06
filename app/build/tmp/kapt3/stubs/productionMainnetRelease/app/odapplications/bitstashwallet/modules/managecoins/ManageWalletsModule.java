package app.odapplications.bitstashwallet.modules.managecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0011"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule;", "", "()V", "init", "", "view", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsViewModel;", "router", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IRouter;", "start", "context", "Landroid/content/Context;", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_productionMainnetRelease"})
public final class ManageWalletsModule {
    public static final app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IRouter router) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private ManageWalletsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IView;", "", "showError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "showNoAccountDialog", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "predefinedAccountType", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "showSuccess", "updateCoins", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void updateCoins();
        
        public abstract void showNoAccountDialog(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType);
        
        public abstract void showSuccess();
        
        public abstract void showError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH&J\b\u0010\u0012\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\tH&J\u001c\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\tH&J\b\u0010\u001b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IViewDelegate;", "", "itemsCount", "", "getItemsCount", "()I", "popularItemsCount", "getPopularItemsCount", "disableCoin", "", "position", "disablePopularCoin", "enableCoin", "enablePopularCoin", "item", "Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletViewItem;", "onClear", "onClickCancel", "onClickCreateKey", "onClickRestoreKey", "onRestore", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "popularItem", "saveChanges", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onClickCreateKey();
        
        public abstract void onClickRestoreKey();
        
        public abstract void onClickCancel();
        
        public abstract void onRestore(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.SyncMode syncMode);
        
        public abstract int getPopularItemsCount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.managecoins.ManageWalletViewItem popularItem(int position);
        
        public abstract int getItemsCount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.managecoins.ManageWalletViewItem item(int position);
        
        public abstract void enablePopularCoin(int position);
        
        public abstract void disablePopularCoin(int position);
        
        public abstract void enableCoin(int position);
        
        public abstract void disableCoin(int position);
        
        public abstract void saveChanges();
        
        public abstract void onClear();
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onClear(app.odapplications.bitstashwallet.modules.managecoins.ManageWalletsModule.IViewDelegate $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H&J\"\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractor;", "", "coins", "", "Lapp/odapplications/bitstashwallet/entities/Coin;", "getCoins", "()Ljava/util/List;", "predefinedAccountTypes", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "getPredefinedAccountTypes", "wallets", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getWallets", "createWallet", "coin", "restoreWallet", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "saveWallets", "", "wallet", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<app.odapplications.bitstashwallet.entities.Coin> getCoins();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<app.odapplications.bitstashwallet.entities.Wallet> getWallets();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<app.odapplications.bitstashwallet.core.IPredefinedAccountType> getPredefinedAccountTypes();
        
        @org.jetbrains.annotations.Nullable()
        public abstract app.odapplications.bitstashwallet.entities.Wallet wallet(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin);
        
        public abstract void saveWallets(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.entities.Wallet> wallets);
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.entities.Wallet createWallet(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin);
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.entities.Wallet restoreWallet(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.SyncMode syncMode);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IInteractorDelegate;", "", "didSaveChanges", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didSaveChanges();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/managecoins/ManageWalletsModule$IRouter;", "", "close", "", "openRestoreEosModule", "openRestoreWordsModule", "wordsCount", "", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
        
        public abstract void openRestoreWordsModule(int wordsCount);
        
        public abstract void openRestoreEosModule();
        
        public abstract void close();
    }
}