package io.horizontalsystems.bitstashwallet.modules.send.submodules.memo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "maxLength", "", "(I)V", "<set-?>", "", "memo", "getMemo", "()Ljava/lang/String;", "view", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IView;)V", "onTextEntered", "", "onViewDidLoad", "app_devMainnetMasterDebug"})
public final class SendMemoPresenter implements io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String memo;
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IView view;
    private final int maxLength = 0;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getMemo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IView getView() {
        return null;
    }
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IView p0) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onTextEntered(@org.jetbrains.annotations.NotNull()
    java.lang.String memo) {
    }
    
    public SendMemoPresenter(int maxLength) {
        super();
    }
}