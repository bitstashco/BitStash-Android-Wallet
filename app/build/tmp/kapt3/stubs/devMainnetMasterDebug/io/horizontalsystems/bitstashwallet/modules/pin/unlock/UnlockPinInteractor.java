package io.horizontalsystems.bitstashwallet.modules.pin.unlock;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020 H\u0016R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractor;", "Lio/horizontalsystems/bitstashwallet/core/OneTimerDelegate;", "pinManager", "Lio/horizontalsystems/bitstashwallet/core/IPinManager;", "lockManager", "Lio/horizontalsystems/bitstashwallet/core/ILockManager;", "lockoutManager", "Lio/horizontalsystems/bitstashwallet/core/ILockoutManager;", "encryptionManager", "Lio/horizontalsystems/bitstashwallet/core/IEncryptionManager;", "systemInfoManager", "Lio/horizontalsystems/bitstashwallet/core/ISystemInfoManager;", "timer", "Lio/horizontalsystems/bitstashwallet/core/managers/OneTimeTimer;", "(Lio/horizontalsystems/bitstashwallet/core/IPinManager;Lio/horizontalsystems/bitstashwallet/core/ILockManager;Lio/horizontalsystems/bitstashwallet/core/ILockoutManager;Lio/horizontalsystems/bitstashwallet/core/IEncryptionManager;Lio/horizontalsystems/bitstashwallet/core/ISystemInfoManager;Lio/horizontalsystems/bitstashwallet/core/managers/OneTimeTimer;)V", "biometricAuthSupported", "", "getBiometricAuthSupported", "()Z", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "getCryptoObject", "()Landroidx/biometric/BiometricPrompt$CryptoObject;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractorDelegate;)V", "isFingerprintEnabled", "onFire", "", "onUnlock", "unlock", "pin", "", "updateLockoutState", "app_devMainnetMasterDebug"})
public final class UnlockPinInteractor implements io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractor, io.horizontalsystems.bitstashwallet.core.OneTimerDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.IPinManager pinManager = null;
    private final io.horizontalsystems.bitstashwallet.core.ILockManager lockManager = null;
    private final io.horizontalsystems.bitstashwallet.core.ILockoutManager lockoutManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IEncryptionManager encryptionManager = null;
    private final io.horizontalsystems.bitstashwallet.core.ISystemInfoManager systemInfoManager = null;
    private final io.horizontalsystems.bitstashwallet.core.managers.OneTimeTimer timer = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public boolean isFingerprintEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getBiometricAuthSupported() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.biometric.BiometricPrompt.CryptoObject getCryptoObject() {
        return null;
    }
    
    @java.lang.Override()
    public boolean unlock(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
        return false;
    }
    
    @java.lang.Override()
    public void onUnlock() {
    }
    
    @java.lang.Override()
    public void onFire() {
    }
    
    @java.lang.Override()
    public void updateLockoutState() {
    }
    
    public UnlockPinInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPinManager pinManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILockManager lockManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILockoutManager lockoutManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IEncryptionManager encryptionManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.OneTimeTimer timer) {
        super();
    }
}