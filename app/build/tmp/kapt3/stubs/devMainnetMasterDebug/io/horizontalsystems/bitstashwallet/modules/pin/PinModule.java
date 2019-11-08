package io.horizontalsystems.bitstashwallet.modules.pin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule;", "", "()V", "PIN_COUNT", "", "RESULT_CANCELLED", "RESULT_OK", "keyInteractionType", "", "keyShowCancel", "startForEditPin", "", "context", "Landroidx/appcompat/app/AppCompatActivity;", "startForSetPin", "requestCode", "startForUnlock", "IInteractor", "IInteractorDelegate", "IView", "IViewDelegate", "app_devMainnetMasterDebug"})
public final class PinModule {
    public static final int RESULT_OK = 1;
    public static final int RESULT_CANCELLED = 2;
    public static final int PIN_COUNT = 6;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String keyInteractionType = "interaction_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String keyShowCancel = "show_cancel";
    public static final io.horizontalsystems.bitstashwallet.modules.pin.PinModule INSTANCE = null;
    
    public final void startForSetPin(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity context, int requestCode) {
    }
    
    public final void startForEditPin(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity context) {
    }
    
    public final void startForUnlock(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity context, int requestCode) {
    }
    
    private PinModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH&J\b\u0010\u0019\u001a\u00020\u0003H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\tH&\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule$IView;", "", "addPages", "", "pages", "", "Lio/horizontalsystems/bitstashwallet/modules/pin/PinPage;", "fillCircles", "length", "", "pageIndex", "hideToolbar", "setTitle", "title", "showBackButton", "showError", "error", "showFingerprintDialog", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "showLockView", "until", "Ljava/util/Date;", "showPage", "index", "showPinInput", "showPinWrong", "updateTopTextForPage", "text", "Lio/horizontalsystems/bitstashwallet/modules/pin/TopText;", "app_devMainnetMasterDebug"})
    public static abstract interface IView {
        
        public abstract void setTitle(int title);
        
        public abstract void addPages(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.modules.pin.PinPage> pages);
        
        public abstract void showPage(int index);
        
        public abstract void updateTopTextForPage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.pin.TopText text, int pageIndex);
        
        public abstract void showError(int error);
        
        public abstract void showPinWrong(int pageIndex);
        
        public abstract void showBackButton();
        
        public abstract void fillCircles(int length, int pageIndex);
        
        public abstract void hideToolbar();
        
        public abstract void showFingerprintDialog(@org.jetbrains.annotations.NotNull()
        androidx.biometric.BiometricPrompt.CryptoObject cryptoObject);
        
        public abstract void showLockView(@org.jetbrains.annotations.NotNull()
        java.util.Date until);
        
        public abstract void showPinInput();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule$IViewDelegate;", "", "onDelete", "", "pageIndex", "", "onEnter", "pin", "", "onFingerprintUnlock", "resetPin", "showFingerprintUnlock", "viewDidLoad", "app_devMainnetMasterDebug"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onEnter(@org.jetbrains.annotations.NotNull()
        java.lang.String pin, int pageIndex);
        
        public abstract void onDelete(int pageIndex);
        
        public abstract void onFingerprintUnlock();
        
        public abstract void showFingerprintUnlock();
        
        public abstract void resetPin();
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onFingerprintUnlock(io.horizontalsystems.bitstashwallet.modules.pin.PinModule.IViewDelegate $this) {
            }
            
            public static void showFingerprintUnlock(io.horizontalsystems.bitstashwallet.modules.pin.PinModule.IViewDelegate $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule$IInteractor;", "", "save", "", "pin", "", "set", "unlock", "", "validate", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractor {
        
        public abstract void set(@org.jetbrains.annotations.Nullable()
        java.lang.String pin);
        
        public abstract boolean validate(@org.jetbrains.annotations.NotNull()
        java.lang.String pin);
        
        public abstract void save(@org.jetbrains.annotations.NotNull()
        java.lang.String pin);
        
        public abstract boolean unlock(@org.jetbrains.annotations.NotNull()
        java.lang.String pin);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule$IInteractorDelegate;", "", "didFailToSavePin", "", "didSavePin", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didSavePin();
        
        public abstract void didFailToSavePin();
    }
}