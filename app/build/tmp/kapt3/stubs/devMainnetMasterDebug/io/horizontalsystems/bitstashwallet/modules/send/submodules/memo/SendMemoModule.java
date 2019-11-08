package io.horizontalsystems.bitstashwallet.modules.send.submodules.memo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule;", "", "()V", "init", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "view", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoViewModel;", "maxLength", "", "IMemoModule", "IView", "IViewDelegate", "app_devMainnetMasterDebug"})
public final class SendMemoModule {
    public static final io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoViewModel view, int maxLength) {
        return null;
    }
    
    private SendMemoModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IView;", "", "setMaxLength", "", "maxLength", "", "app_devMainnetMasterDebug"})
    public static abstract interface IView {
        
        public abstract void setMaxLength(int maxLength);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IViewDelegate;", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IView;)V", "onTextEntered", "", "memo", "", "onViewDidLoad", "app_devMainnetMasterDebug"})
    public static abstract interface IViewDelegate {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IView getView();
        
        public abstract void setView(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IView p0);
        
        public abstract void onViewDidLoad();
        
        public abstract void onTextEntered(@org.jetbrains.annotations.NotNull()
        java.lang.String memo);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "", "memo", "", "getMemo", "()Ljava/lang/String;", "app_devMainnetMasterDebug"})
    public static abstract interface IMemoModule {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getMemo();
    }
}