package app.odapplications.bitstashwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u00020\u00112\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/receive/ReceivePresenter;", "Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IInteractorDelegate;", "interactor", "Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IInteractor;", "router", "Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IRouter;", "(Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IInteractor;Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IRouter;)V", "receiveAddress", "Lapp/odapplications/bitstashwallet/modules/receive/viewitems/AddressItem;", "view", "Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IView;", "getView", "()Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IView;", "setView", "(Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IView;)V", "didCopyToClipboard", "", "didFailToReceiveAddress", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "didReceiveAddress", "address", "getHint", "", "type", "Lapp/odapplications/bitstashwallet/entities/CoinType;", "onAddressClick", "onShareClick", "viewDidLoad", "app_productionMainnetRelease"})
public final class ReceivePresenter implements app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IViewDelegate, app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IView view;
    private app.odapplications.bitstashwallet.modules.receive.viewitems.AddressItem receiveAddress;
    private final app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IInteractor interactor = null;
    private final app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IRouter router = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IView p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void didReceiveAddress(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.receive.viewitems.AddressItem address) {
    }
    
    private final int getHint(app.odapplications.bitstashwallet.entities.CoinType type) {
        return 0;
    }
    
    @java.lang.Override()
    public void didFailToReceiveAddress(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
    }
    
    @java.lang.Override()
    public void onShareClick() {
    }
    
    @java.lang.Override()
    public void onAddressClick() {
    }
    
    @java.lang.Override()
    public void didCopyToClipboard() {
    }
    
    public ReceivePresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IRouter router) {
        super();
    }
}