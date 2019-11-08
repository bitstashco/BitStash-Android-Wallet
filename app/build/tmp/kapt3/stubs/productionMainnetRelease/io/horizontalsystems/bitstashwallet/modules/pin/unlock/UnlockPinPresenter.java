package io.horizontalsystems.bitstashwallet.modules.pin.unlock;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006%"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractorDelegate;", "view", "Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule$IView;", "router", "Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IRouter;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractor;", "showCancelButton", "", "(Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule$IView;Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IRouter;Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractor;Z)V", "enteredPin", "", "isShowingPinMismatchError", "getRouter", "()Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IRouter;", "unlockPageIndex", "", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule$IView;", "onDelete", "", "pageIndex", "onEnter", "pin", "onFingerprintUnlock", "removeErrorMessage", "resetPin", "showFingerprintUnlock", "unlock", "updateLockoutState", "state", "Lio/horizontalsystems/bitstashwallet/entities/LockoutState;", "viewDidLoad", "wrongPinSubmitted", "app_productionMainnetRelease"})
public final class UnlockPinPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.pin.PinModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractorDelegate {
    private final int unlockPageIndex = 0;
    private java.lang.String enteredPin;
    private boolean isShowingPinMismatchError;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.pin.PinModule.IView view = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IRouter router = null;
    private final io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractor interactor = null;
    private final boolean showCancelButton = false;
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onEnter(@org.jetbrains.annotations.NotNull()
    java.lang.String pin, int pageIndex) {
    }
    
    @java.lang.Override()
    public void resetPin() {
    }
    
    @java.lang.Override()
    public void onDelete(int pageIndex) {
    }
    
    @java.lang.Override()
    public void unlock() {
    }
    
    @java.lang.Override()
    public void wrongPinSubmitted() {
    }
    
    @java.lang.Override()
    public void showFingerprintUnlock() {
    }
    
    @java.lang.Override()
    public void onFingerprintUnlock() {
    }
    
    @java.lang.Override()
    public void updateLockoutState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.LockoutState state) {
    }
    
    private final void removeErrorMessage() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.pin.PinModule.IView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IRouter getRouter() {
        return null;
    }
    
    public UnlockPinPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.pin.PinModule.IView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractor interactor, boolean showCancelButton) {
        super();
    }
}