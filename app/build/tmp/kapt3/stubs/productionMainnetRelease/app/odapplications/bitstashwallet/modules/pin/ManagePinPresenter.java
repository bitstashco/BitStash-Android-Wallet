package app.odapplications.bitstashwallet.modules.pin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0015H\u0016J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\nH\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0015H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/pin/ManagePinPresenter;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IInteractorDelegate;", "view", "Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IView;", "interactor", "Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IInteractor;", "pages", "", "Lapp/odapplications/bitstashwallet/modules/pin/ManagePinPresenter$Page;", "(Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IView;Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IInteractor;Ljava/util/List;)V", "enteredPin", "", "isShowingPinMismatchError", "", "getPages", "()Ljava/util/List;", "getView", "()Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IView;", "didFailToSavePin", "", "didSavePin", "navigateToPage", "pageIndex", "", "pin", "onDelete", "onEnter", "onEnterFromConfirmPage", "onEnterFromEnterPage", "onEnterFromUnlock", "removeErrorMessage", "resetPin", "show", "page", "showEnterPage", "viewDidLoad", "Page", "app_productionMainnetRelease"})
public class ManagePinPresenter extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.pin.PinModule.IViewDelegate, app.odapplications.bitstashwallet.modules.pin.PinModule.IInteractorDelegate {
    private java.lang.String enteredPin;
    private boolean isShowingPinMismatchError;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.modules.pin.PinModule.IView view = null;
    private final app.odapplications.bitstashwallet.modules.pin.PinModule.IInteractor interactor = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<app.odapplications.bitstashwallet.modules.pin.ManagePinPresenter.Page> pages = null;
    
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
    public void didSavePin() {
    }
    
    @java.lang.Override()
    public void didFailToSavePin() {
    }
    
    private final void removeErrorMessage(int pageIndex) {
    }
    
    private final void navigateToPage(int pageIndex, java.lang.String pin) {
    }
    
    private final void show(app.odapplications.bitstashwallet.modules.pin.ManagePinPresenter.Page page) {
    }
    
    private final void showEnterPage() {
    }
    
    private final void onEnterFromUnlock(java.lang.String pin) {
    }
    
    private final void onEnterFromEnterPage(java.lang.String pin) {
    }
    
    private final void onEnterFromConfirmPage(java.lang.String pin) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.pin.PinModule.IView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.modules.pin.ManagePinPresenter.Page> getPages() {
        return null;
    }
    
    public ManagePinPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.pin.PinModule.IView view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.pin.PinModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends app.odapplications.bitstashwallet.modules.pin.ManagePinPresenter.Page> pages) {
        super();
    }
    
    public void onFingerprintUnlock() {
    }
    
    public void showFingerprintUnlock() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/pin/ManagePinPresenter$Page;", "", "(Ljava/lang/String;I)V", "UNLOCK", "ENTER", "CONFIRM", "app_productionMainnetRelease"})
    public static enum Page {
        /*public static final*/ UNLOCK /* = new UNLOCK() */,
        /*public static final*/ ENTER /* = new ENTER() */,
        /*public static final*/ CONFIRM /* = new CONFIRM() */;
        
        Page() {
        }
    }
}