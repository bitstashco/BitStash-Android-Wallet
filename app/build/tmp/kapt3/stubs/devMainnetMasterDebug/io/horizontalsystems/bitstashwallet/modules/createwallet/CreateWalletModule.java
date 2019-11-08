package io.horizontalsystems.bitstashwallet.modules.createwallet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule;", "", "()V", "start", "", "context", "Landroid/content/Context;", "CoinViewItem", "Factory", "IInteractor", "IRouter", "IView", "IViewDelegate", "State", "app_devMainnetMasterDebug"})
public final class CreateWalletModule {
    public static final io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private CreateWalletModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0014\u0010\u0007\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IView;", "", "setItems", "", "items", "", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$CoinViewItem;", "showError", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_devMainnetMasterDebug"})
    public static abstract interface IView {
        
        public abstract void setItems(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.CoinViewItem> items);
        
        public abstract void showError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IRouter;", "", "startMainModule", "", "app_devMainnetMasterDebug"})
    public static abstract interface IRouter {
        
        public abstract void startMainModule();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IViewDelegate;", "", "didClickCreate", "", "didTapItem", "position", "", "viewDidLoad", "app_devMainnetMasterDebug"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void didTapItem(int position);
        
        public abstract void didClickCreate();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IInteractor;", "", "featuredCoins", "", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "getFeaturedCoins", "()Ljava/util/List;", "createWallet", "", "coin", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> getFeaturedCoins();
        
        public abstract void createWallet(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Coin coin) throws io.horizontalsystems.bitstashwallet.core.EosUnsupportedException;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$State;", "", "()V", "coins", "", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "getCoins", "()Ljava/util/List;", "setCoins", "(Ljava/util/List;)V", "selectedPosition", "", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "app_devMainnetMasterDebug"})
    public static final class State {
        private int selectedPosition;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> coins;
        
        public final int getSelectedPosition() {
            return 0;
        }
        
        public final void setSelectedPosition(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> getCoins() {
            return null;
        }
        
        public final void setCoins(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> p0) {
        }
        
        public State() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$CoinViewItem;", "", "title", "", "code", "selected", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getSelected", "()Z", "setSelected", "(Z)V", "getTitle", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_devMainnetMasterDebug"})
    public static final class CoinViewItem {
        private boolean selected;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        public final boolean getSelected() {
            return false;
        }
        
        public final void setSelected(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        public CoinViewItem(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String code) {
            super();
        }
        
        public CoinViewItem(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String code, boolean selected) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.CoinViewItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String code) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_devMainnetMasterDebug"})
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
}