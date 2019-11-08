package io.horizontalsystems.bitstashwallet.modules.send.eos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\"H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020/H\u0016J\u0010\u00103\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020/H\u0016J\b\u00107\u001a\u00020/H\u0016J\u0010\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020/H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020/0=H\u0016J\b\u0010>\u001a\u00020/H\u0002J\b\u0010?\u001a\u00020/H\u0002J\u0010\u0010@\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\'X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/eos/SendEosHandler;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandler;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendEosInteractor;", "router", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IRouter;", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendEosInteractor;Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IRouter;)V", "addressModule", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "getAddressModule", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "setAddressModule", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;)V", "amountModule", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "getAmountModule", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "setAmountModule", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandlerDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandlerDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandlerDelegate;)V", "feeModule", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "getFeeModule", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "setFeeModule", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;)V", "inputItems", "", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "getInputItems", "()Ljava/util/List;", "memoModule", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "getMemoModule", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "setMemoModule", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;)V", "confirmationViewItems", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "onAddressScan", "", "address", "", "onChangeAmount", "onChangeInputType", "inputType", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;", "onModulesDidLoad", "onUpdateAddress", "onUpdateAmount", "amount", "Ljava/math/BigDecimal;", "scanQrCode", "sendSingle", "Lio/reactivex/Single;", "syncAvailableBalance", "syncValidation", "validate", "app_devMainnetMasterDebug"})
public final class SendEosHandler implements io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandler, io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate, io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule amountModule;
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModule addressModule;
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule feeModule;
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule memoModule;
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandlerDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input> inputItems = null;
    private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendEosInteractor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.IRouter router = null;
    
    private final void syncValidation() {
    }
    
    private final void syncAvailableBalance() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule getAmountModule() {
        return null;
    }
    
    @java.lang.Override()
    public void setAmountModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModule getAddressModule() {
        return null;
    }
    
    @java.lang.Override()
    public void setAddressModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule getFeeModule() {
        return null;
    }
    
    @java.lang.Override()
    public void setFeeModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule getMemoModule() {
        return null;
    }
    
    @java.lang.Override()
    public void setMemoModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandlerDelegate getDelegate() {
        return null;
    }
    
    @java.lang.Override()
    public void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandlerDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input> getInputItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> sendSingle() {
        return null;
    }
    
    @java.lang.Override()
    public void onModulesDidLoad() {
    }
    
    @java.lang.Override()
    public void onAddressScan(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void onChangeAmount() {
    }
    
    @java.lang.Override()
    public void onChangeInputType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType inputType) {
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void onUpdateAddress() {
    }
    
    @java.lang.Override()
    public void onUpdateAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    @java.lang.Override()
    public void scanQrCode() {
    }
    
    public SendEosHandler(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendEosInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.IRouter router) {
        super();
    }
}