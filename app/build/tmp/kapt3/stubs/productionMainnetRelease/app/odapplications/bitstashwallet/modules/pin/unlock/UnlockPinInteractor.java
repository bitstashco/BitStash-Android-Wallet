package app.odapplications.bitstashwallet.modules.pin.unlock;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020 H\u0016R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/pin/unlock/UnlockPinInteractor;", "Lapp/odapplications/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractor;", "Lapp/odapplications/bitstashwallet/core/OneTimerDelegate;", "pinManager", "Lapp/odapplications/bitstashwallet/core/IPinManager;", "lockManager", "Lapp/odapplications/bitstashwallet/core/ILockManager;", "lockoutManager", "Lapp/odapplications/bitstashwallet/core/ILockoutManager;", "encryptionManager", "Lapp/odapplications/bitstashwallet/core/IEncryptionManager;", "systemInfoManager", "Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;", "timer", "Lapp/odapplications/bitstashwallet/core/managers/OneTimeTimer;", "(Lapp/odapplications/bitstashwallet/core/IPinManager;Lapp/odapplications/bitstashwallet/core/ILockManager;Lapp/odapplications/bitstashwallet/core/ILockoutManager;Lapp/odapplications/bitstashwallet/core/IEncryptionManager;Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;Lapp/odapplications/bitstashwallet/core/managers/OneTimeTimer;)V", "biometricAuthSupported", "", "getBiometricAuthSupported", "()Z", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "getCryptoObject", "()Landroidx/biometric/BiometricPrompt$CryptoObject;", "delegate", "Lapp/odapplications/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/pin/unlock/UnlockPinModule$IInteractorDelegate;)V", "isFingerprintEnabled", "onFire", "", "onUnlock", "unlock", "pin", "", "updateLockoutState", "app_productionMainnetRelease"})
public final class UnlockPinInteractor implements app.odapplications.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractor, app.odapplications.bitstashwallet.core.OneTimerDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IPinManager pinManager = null;
    private final app.odapplications.bitstashwallet.core.ILockManager lockManager = null;
    private final app.odapplications.bitstashwallet.core.ILockoutManager lockoutManager = null;
    private final app.odapplications.bitstashwallet.core.IEncryptionManager encryptionManager = null;
    private final app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager = null;
    private final app.odapplications.bitstashwallet.core.managers.OneTimeTimer timer = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.pin.unlock.UnlockPinModule.IInteractorDelegate p0) {
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
    app.odapplications.bitstashwallet.core.IPinManager pinManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILockManager lockManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILockoutManager lockoutManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IEncryptionManager encryptionManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.OneTimeTimer timer) {
        super();
    }
}