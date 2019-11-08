package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/PinManager;", "Lio/horizontalsystems/bitstashwallet/core/IPinManager;", "securedStorage", "Lio/horizontalsystems/bitstashwallet/core/ISecuredStorage;", "localStorage", "Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bitstashwallet/core/ISecuredStorage;Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;)V", "value", "", "isFingerprintEnabled", "()Z", "setFingerprintEnabled", "(Z)V", "isPinSet", "getLocalStorage", "()Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;", "clear", "", "store", "pin", "", "validate", "app_devMainnetMasterDebug"})
public final class PinManager implements io.horizontalsystems.bitstashwallet.core.IPinManager {
    private final io.horizontalsystems.bitstashwallet.core.ISecuredStorage securedStorage = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage = null;
    
    @java.lang.Override()
    public boolean isPinSet() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isFingerprintEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setFingerprintEnabled(boolean value) {
    }
    
    @java.lang.Override()
    public void store(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) throws android.security.keystore.UserNotAuthenticatedException {
    }
    
    @java.lang.Override()
    public boolean validate(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
        return false;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.core.ILocalStorage getLocalStorage() {
        return null;
    }
    
    public PinManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ISecuredStorage securedStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage) {
        super();
    }
}