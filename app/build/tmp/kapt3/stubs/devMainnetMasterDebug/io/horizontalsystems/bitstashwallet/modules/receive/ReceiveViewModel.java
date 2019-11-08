package io.horizontalsystems.bitstashwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0011H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\rH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017\u00a8\u0006)"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IView;", "Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IRouter;", "()V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveModule$IViewDelegate;)V", "hintTextResLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getHintTextResLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "shareAddressLiveEvent", "", "getShareAddressLiveEvent", "showAddressLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bitstashwallet/modules/receive/viewitems/AddressItem;", "getShowAddressLiveData", "()Landroidx/lifecycle/MutableLiveData;", "showCopiedLiveEvent", "", "getShowCopiedLiveEvent", "showErrorLiveData", "getShowErrorLiveData", "init", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "setHint", "hint", "shareAddress", "address", "showAddress", "addresses", "showCopied", "showError", "error", "app_devMainnetMasterDebug"})
public final class ReceiveViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.receive.ReceiveModule.IView, io.horizontalsystems.bitstashwallet.modules.receive.ReceiveModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.receive.ReceiveModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bitstashwallet.modules.receive.viewitems.AddressItem> showAddressLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> showErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showCopiedLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> shareAddressLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Integer> hintTextResLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.receive.ReceiveModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.receive.ReceiveModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bitstashwallet.modules.receive.viewitems.AddressItem> getShowAddressLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getShowErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowCopiedLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> getShareAddressLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Integer> getHintTextResLiveEvent() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void showAddress(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.receive.viewitems.AddressItem addresses) {
    }
    
    @java.lang.Override()
    public void showError(int error) {
    }
    
    @java.lang.Override()
    public void showCopied() {
    }
    
    @java.lang.Override()
    public void shareAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void setHint(int hint) {
    }
    
    public ReceiveViewModel() {
        super();
    }
}