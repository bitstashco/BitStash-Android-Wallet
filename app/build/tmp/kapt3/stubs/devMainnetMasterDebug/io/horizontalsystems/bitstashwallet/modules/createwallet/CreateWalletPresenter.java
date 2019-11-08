package io.horizontalsystems.bitstashwallet.modules.createwallet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IViewDelegate;", "view", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IView;", "router", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IRouter;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IInteractor;", "coinViewItemFactory", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CoinViewItemFactory;", "state", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$State;", "(Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IView;Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IRouter;Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IInteractor;Lio/horizontalsystems/bitstashwallet/modules/createwallet/CoinViewItemFactory;Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$State;)V", "getRouter", "()Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IRouter;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IView;", "didClickCreate", "", "didTapItem", "position", "", "viewDidLoad", "app_devMainnetMasterDebug"})
public final class CreateWalletPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IViewDelegate {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IView view = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IRouter router = null;
    private final io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IInteractor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.createwallet.CoinViewItemFactory coinViewItemFactory = null;
    private final io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.State state = null;
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void didTapItem(int position) {
    }
    
    @java.lang.Override()
    public void didClickCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IRouter getRouter() {
        return null;
    }
    
    public CreateWalletPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.createwallet.CoinViewItemFactory coinViewItemFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.State state) {
        super();
    }
}