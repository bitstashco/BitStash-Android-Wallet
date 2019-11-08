package io.horizontalsystems.bitstashwallet.modules.pin.unlock;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule;", "", "()V", "Factory", "IInteractor", "IInteractorDelegate", "IRouter", "app_devMainnetMasterDebug"})
public final class UnlockPinModule {
    public static final io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule INSTANCE = null;
    
    private UnlockPinModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IRouter;", "", "dismissModuleWithSuccess", "", "app_devMainnetMasterDebug"})
    public static abstract interface IRouter {
        
        public abstract void dismissModuleWithSuccess();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0005\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractor;", "", "biometricAuthSupported", "", "getBiometricAuthSupported", "()Z", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "getCryptoObject", "()Landroidx/biometric/BiometricPrompt$CryptoObject;", "isFingerprintEnabled", "onUnlock", "", "unlock", "pin", "", "updateLockoutState", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractor {
        
        public abstract boolean isFingerprintEnabled();
        
        public abstract boolean getBiometricAuthSupported();
        
        @org.jetbrains.annotations.Nullable()
        public abstract androidx.biometric.BiometricPrompt.CryptoObject getCryptoObject();
        
        public abstract void updateLockoutState();
        
        public abstract boolean unlock(@org.jetbrains.annotations.NotNull()
        java.lang.String pin);
        
        public abstract void onUnlock();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractorDelegate;", "", "unlock", "", "updateLockoutState", "state", "Lio/horizontalsystems/bitstashwallet/entities/LockoutState;", "wrongPinSubmitted", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void unlock();
        
        public abstract void wrongPinSubmitted();
        
        public abstract void updateLockoutState(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.LockoutState state);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "showCancelButton", "", "(Z)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_devMainnetMasterDebug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final boolean showCancelButton = false;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(boolean showCancelButton) {
            super();
        }
    }
}