package io.horizontalsystems.bitstashwallet.modules.send.submodules.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u001f\u001a\u00020\u001d2\u000e\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0014H\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00110\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\b\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IView;", "()V", "addressText", "Landroidx/lifecycle/MutableLiveData;", "", "getAddressText", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IViewDelegate;)V", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getError", "pasteButtonEnabled", "", "getPasteButtonEnabled", "init", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressPresenter;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "moduleDelegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "setAddress", "", "address", "setAddressError", "setPasteButtonState", "enabled", "app_devMainnetMasterDebug"})
public final class SendAddressViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IView {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> addressText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> error = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> pasteButtonEnabled = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAddressText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Exception> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPasteButtonEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressPresenter init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate moduleDelegate) {
        return null;
    }
    
    @java.lang.Override()
    public void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void setAddressError(@org.jetbrains.annotations.Nullable()
    java.lang.Exception error) {
    }
    
    @java.lang.Override()
    public void setPasteButtonState(boolean enabled) {
    }
    
    public SendAddressViewModel() {
        super();
    }
}