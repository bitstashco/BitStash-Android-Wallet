package app.odapplications.bitstashwallet.modules.send.submodules.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u001a\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\rH\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\b\u00a8\u0006%"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IView;", "()V", "addPrimaryDataViewItem", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$PrimaryItemData;", "getAddPrimaryDataViewItem", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "addSecondaryDataViewItem", "Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$SecondaryItemData;", "getAddSecondaryDataViewItem", "addSendButton", "", "getAddSendButton", "delegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IViewDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IViewDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IViewDelegate;)V", "sendButtonState", "Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$SendButtonState;", "getSendButtonState", "showCopied", "getShowCopied", "init", "confirmationInfo", "", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "loadPrimaryItems", "primaryItemData", "loadSecondaryItems", "secondaryItemData", "loadSendButton", "setSendButtonState", "state", "app_productionMainnetRelease"})
public final class SendConfirmationViewModel extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IView {
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.PrimaryItemData> addPrimaryDataViewItem = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.SecondaryItemData> addSecondaryDataViewItem = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> showCopied = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> addSendButton = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.SendButtonState> sendButtonState = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.PrimaryItemData> getAddPrimaryDataViewItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.SecondaryItemData> getAddSecondaryDataViewItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowCopied() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> getAddSendButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.SendButtonState> getSendButtonState() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends app.odapplications.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationInfo) {
    }
    
    @java.lang.Override()
    public void loadPrimaryItems(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.PrimaryItemData primaryItemData) {
    }
    
    @java.lang.Override()
    public void showCopied() {
    }
    
    @java.lang.Override()
    public void loadSecondaryItems(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.SecondaryItemData secondaryItemData) {
    }
    
    @java.lang.Override()
    public void loadSendButton() {
    }
    
    @java.lang.Override()
    public void setSendButtonState(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.SendButtonState state) {
    }
    
    public SendConfirmationViewModel() {
        super();
    }
}