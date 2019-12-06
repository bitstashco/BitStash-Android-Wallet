package app.odapplications.bitstashwallet.modules.send.submodules.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J$\u0010\"\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010#\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%H\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010\'\u001a\u00020\bH\u0016R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@RX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006("}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressPresenter;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "interactor", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IInteractor;", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IInteractor;)V", "value", "", "currentAddress", "getCurrentAddress", "()Ljava/lang/String;", "setCurrentAddress", "(Ljava/lang/String;)V", "moduleDelegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "getModuleDelegate", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "setModuleDelegate", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;)V", "view", "Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IView;", "getView", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IView;", "setView", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/address/SendAddressModule$IView;)V", "didScanQrCode", "", "address", "onAddressDeleteClicked", "onAddressEnter", "onAddressPasteClicked", "onAddressScanClicked", "onViewDidLoad", "updateAddress", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "updatePasteButtonState", "validAddress", "app_productionMainnetRelease"})
public final class SendAddressPresenter implements app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IViewDelegate, app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IInteractorDelegate, app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModule {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IView view;
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate moduleDelegate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentAddress;
    private final app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IInteractor interactor = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate getModuleDelegate() {
        return null;
    }
    
    public final void setModuleDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getCurrentAddress() {
        return null;
    }
    
    private void setCurrentAddress(java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String validAddress() {
        return null;
    }
    
    @java.lang.Override()
    public void didScanQrCode(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onAddressScanClicked() {
    }
    
    @java.lang.Override()
    public void onAddressPasteClicked() {
    }
    
    @java.lang.Override()
    public void onAddressDeleteClicked() {
    }
    
    private final void onAddressEnter(java.lang.String address) {
    }
    
    private final void updateAddress(java.lang.String address, java.lang.Exception error) {
    }
    
    private final void updatePasteButtonState() {
    }
    
    public SendAddressPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.address.SendAddressModule.IInteractor interactor) {
        super();
    }
}