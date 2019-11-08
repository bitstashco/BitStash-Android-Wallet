package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/SystemInfoManager;", "Lio/horizontalsystems/bitstashwallet/core/ISystemInfoManager;", "()V", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "biometricAuthSupported", "", "getBiometricAuthSupported", "()Z", "biometricManager", "Landroidx/biometric/BiometricManager;", "isSystemLockOff", "app_devMainnetMasterDebug"})
public final class SystemInfoManager implements io.horizontalsystems.bitstashwallet.core.ISystemInfoManager {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appVersion = "0.0.1";
    private final androidx.biometric.BiometricManager biometricManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAppVersion() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isSystemLockOff() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getBiometricAuthSupported() {
        return false;
    }
    
    public SystemInfoManager() {
        super();
    }
}