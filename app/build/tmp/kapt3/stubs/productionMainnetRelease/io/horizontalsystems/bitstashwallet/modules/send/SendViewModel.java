package io.horizontalsystems.bitstashwallet.modules.send;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0013H\u0016J\u000e\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020:J\u0016\u0010;\u001a\u00020\u00132\f\u0010<\u001a\b\u0012\u0004\u0012\u00020/0\u0018H\u0016J\b\u0010=\u001a\u00020\u0013H\u0014J\b\u00101\u001a\u00020\u0013H\u0016J\u0010\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u000204H\u0016J\u0016\u0010@\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0010\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u00020&H\u0016J\u0010\u0010C\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0015R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00180\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0015R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0015R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001bR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0015\u00a8\u0006D"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IView;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IRouter;", "()V", "addressModuleDelegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "getAddressModuleDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "setAddressModuleDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;)V", "amountModuleDelegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "getAmountModuleDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "setAmountModuleDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;)V", "closeWithSuccess", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getCloseWithSuccess", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "confirmationViewItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "getConfirmationViewItems", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;)V", "error", "", "getError", "errorInDialog", "Lio/horizontalsystems/bitstashwallet/core/CoinException;", "getErrorInDialog", "feeModuleDelegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "getFeeModuleDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "setFeeModuleDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;)V", "inputItems", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "getInputItems", "scanQrCode", "getScanQrCode", "sendButtonEnabled", "", "getSendButtonEnabled", "showSendConfirmation", "getShowSendConfirmation", "init", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "loadInputItems", "inputs", "onCleared", "setSendButtonEnabled", "enabled", "showConfirmation", "showErrorInDialog", "coinException", "showErrorInToast", "app_productionMainnetRelease"})
public final class SendViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.send.SendModule.IView, io.horizontalsystems.bitstashwallet.modules.send.SendModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.SendModule.IViewDelegate delegate;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate amountModuleDelegate;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate addressModuleDelegate;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate feeModuleDelegate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> closeWithSuccess = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> error = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.core.CoinException> errorInDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem>> confirmationViewItems = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showSendConfirmation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sendButtonEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input>> inputItems = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> scanQrCode = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.SendModule.IViewDelegate getDelegate() {
        return null;
    }
    
    @java.lang.Override()
    public void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate getAmountModuleDelegate() {
        return null;
    }
    
    public final void setAmountModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate getAddressModuleDelegate() {
        return null;
    }
    
    public final void setAddressModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate getFeeModuleDelegate() {
        return null;
    }
    
    public final void setFeeModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getCloseWithSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.core.CoinException> getErrorInDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem>> getConfirmationViewItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowSendConfirmation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSendButtonEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input>> getInputItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getScanQrCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.IViewDelegate init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    @java.lang.Override()
    public void loadInputItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input> inputs) {
    }
    
    @java.lang.Override()
    public void setSendButtonEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public void showErrorInToast(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @java.lang.Override()
    public void showErrorInDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.CoinException coinException) {
    }
    
    @java.lang.Override()
    public void showConfirmation(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems) {
    }
    
    @java.lang.Override()
    public void scanQrCode() {
    }
    
    @java.lang.Override()
    public void closeWithSuccess() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public SendViewModel() {
        super();
    }
}