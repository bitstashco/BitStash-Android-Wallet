package io.horizontalsystems.bitstashwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule;", "", "()V", "init", "", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "view", "Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IRouter;", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_devMainnetMasterDebug"})
public final class ReceiveModule {
    public static final io.horizontalsystems.bitstashwallet.modules.receive.ReceiveModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.receive.ReceiveViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.receive.ReceiveModule.IRouter router) {
    }
    
    private ReceiveModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IView;", "", "setHint", "", "hint", "", "showAddress", "address", "Lio/horizontalsystems/bitstashwallet/modules/receive/viewitems/AddressItem;", "showCopied", "showError", "error", "app_devMainnetMasterDebug"})
    public static abstract interface IView {
        
        public abstract void showAddress(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.receive.viewitems.AddressItem address);
        
        public abstract void showError(int error);
        
        public abstract void showCopied();
        
        public abstract void setHint(int hint);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IViewDelegate;", "", "onAddressClick", "", "onShareClick", "viewDidLoad", "app_devMainnetMasterDebug"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onShareClick();
        
        public abstract void onAddressClick();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IInteractor;", "", "copyToClipboard", "", "coinAddress", "", "getReceiveAddress", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractor {
        
        public abstract void getReceiveAddress();
        
        public abstract void copyToClipboard(@org.jetbrains.annotations.NotNull()
        java.lang.String coinAddress);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IInteractorDelegate;", "", "didCopyToClipboard", "", "didFailToReceiveAddress", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "didReceiveAddress", "address", "Lio/horizontalsystems/bitstashwallet/modules/receive/viewitems/AddressItem;", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didReceiveAddress(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.receive.viewitems.AddressItem address);
        
        public abstract void didFailToReceiveAddress(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception);
        
        public abstract void didCopyToClipboard();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IRouter;", "", "shareAddress", "", "address", "", "app_devMainnetMasterDebug"})
    public static abstract interface IRouter {
        
        public abstract void shareAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
    }
}