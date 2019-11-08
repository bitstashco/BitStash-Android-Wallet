package io.horizontalsystems.bitstashwallet.modules.send;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendInteractorDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandlerDelegate;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendInteractor;", "router", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IRouter;", "handler", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandler;", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendInteractor;Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IRouter;Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandler;)V", "getHandler", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandler;", "view", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IView;)V", "didFailToSend", "", "error", "", "didSend", "onAddressScan", "address", "", "onChange", "isValid", "", "onClear", "onModulesDidLoad", "onProceedClicked", "onSendConfirmed", "onViewDidLoad", "app_devMainnetMasterDebug"})
public final class SendPresenter implements io.horizontalsystems.bitstashwallet.modules.send.SendModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendInteractorDelegate, io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandlerDelegate {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.send.SendModule.IView view;
    private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendInteractor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.IRouter router = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandler handler = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.SendModule.IView getView() {
        return null;
    }
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.IView p0) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onModulesDidLoad() {
    }
    
    @java.lang.Override()
    public void onAddressScan(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void onProceedClicked() {
    }
    
    @java.lang.Override()
    public void onSendConfirmed() {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    @java.lang.Override()
    public void didSend() {
    }
    
    @java.lang.Override()
    public void didFailToSend(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @java.lang.Override()
    public void onChange(boolean isValid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandler getHandler() {
        return null;
    }
    
    public SendPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandler handler) {
        super();
    }
}