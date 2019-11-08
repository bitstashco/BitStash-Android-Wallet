package io.horizontalsystems.bitstashwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%J\b\u0010&\u001a\u00020\'H\u0014J\u0010\u0010(\u001a\u00020\'2\u0006\u0010\n\u001a\u00020\fH\u0016J\u0010\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020\u0010H\u0016J\u0012\u0010+\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010-\u001a\u00020\'2\b\u0010.\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010/\u001a\u00020\'2\b\u0010.\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u00100\u001a\u00020\'2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000eR\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000e\u00a8\u00062"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IView;", "()V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IViewDelegate;)V", "duration", "Landroidx/lifecycle/MutableLiveData;", "", "getDuration", "()Landroidx/lifecycle/MutableLiveData;", "feePriority", "Lio/horizontalsystems/bitstashwallet/core/FeeRatePriority;", "getFeePriority", "insufficientFeeBalanceError", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$InsufficientFeeBalance;", "getInsufficientFeeBalanceError", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "primaryFee", "", "getPrimaryFee", "secondaryFee", "getSecondaryFee", "showFeePriorityOptions", "", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "getShowFeePriorityOptions", "init", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "moduleDelegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "onCleared", "", "setDuration", "setFeePriority", "priority", "setInsufficientFeeBalanceError", "insufficientFeeBalance", "setPrimaryFee", "feeAmount", "setSecondaryFee", "showFeeRatePrioritySelector", "feeRates", "app_devMainnetMasterDebug"})
public final class SendFeeViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IView {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> primaryFee = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> secondaryFee = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> duration = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bitstashwallet.core.FeeRatePriority> feePriority = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem>> showFeePriorityOptions = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.InsufficientFeeBalance> insufficientFeeBalanceError = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrimaryFee() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSecondaryFee() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bitstashwallet.core.FeeRatePriority> getFeePriority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem>> getShowFeePriorityOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.InsufficientFeeBalance> getInsufficientFeeBalanceError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate moduleDelegate) {
        return null;
    }
    
    @java.lang.Override()
    public void setPrimaryFee(@org.jetbrains.annotations.Nullable()
    java.lang.String feeAmount) {
    }
    
    @java.lang.Override()
    public void setSecondaryFee(@org.jetbrains.annotations.Nullable()
    java.lang.String feeAmount) {
    }
    
    @java.lang.Override()
    public void setFeePriority(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.FeeRatePriority priority) {
    }
    
    @java.lang.Override()
    public void setDuration(long duration) {
    }
    
    @java.lang.Override()
    public void showFeeRatePrioritySelector(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem> feeRates) {
    }
    
    @java.lang.Override()
    public void setInsufficientFeeBalanceError(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.InsufficientFeeBalance insufficientFeeBalance) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public SendFeeViewModel() {
        super();
    }
}