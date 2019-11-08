package io.horizontalsystems.bitstashwallet.modules.send.submodules.memo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IView;", "()V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IViewDelegate;)V", "maxLength", "Landroidx/lifecycle/MutableLiveData;", "", "getMaxLength", "()Landroidx/lifecycle/MutableLiveData;", "init", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "setMaxLength", "", "app_productionMainnetRelease"})
public final class SendMemoViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IView {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> maxLength = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMaxLength() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule init(int maxLength) {
        return null;
    }
    
    @java.lang.Override()
    public void setMaxLength(int maxLength) {
    }
    
    public SendMemoViewModel() {
        super();
    }
}