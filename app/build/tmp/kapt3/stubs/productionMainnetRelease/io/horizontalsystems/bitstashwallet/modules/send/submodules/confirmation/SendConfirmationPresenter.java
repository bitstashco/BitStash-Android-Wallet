package io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractorDelegate;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractor;", "confirmationViewItems", "", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractor;Ljava/util/List;)V", "receiver", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationViewModel;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationViewModel;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationViewModel;)V", "didCopyToClipboard", "", "onReceiverClick", "onSendError", "onViewDidLoad", "app_productionMainnetRelease"})
public final class SendConfirmationPresenter implements io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationViewModel view;
    private java.lang.String receiver;
    private final io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractor interactor = null;
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationViewModel getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationViewModel p0) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onReceiverClick() {
    }
    
    @java.lang.Override()
    public void didCopyToClipboard() {
    }
    
    @java.lang.Override()
    public void onSendError() {
    }
    
    public SendConfirmationPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems) {
        super();
    }
}