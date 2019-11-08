package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/SecuredStorageManager;", "Lio/horizontalsystems/bitstashwallet/core/ISecuredStorage;", "encryptionManager", "Lio/horizontalsystems/bitstashwallet/core/IEncryptionManager;", "(Lio/horizontalsystems/bitstashwallet/core/IEncryptionManager;)V", "AUTH_DATA", "", "LOCK_PIN", "authData", "Lio/horizontalsystems/bitstashwallet/entities/AuthData;", "getAuthData", "()Lio/horizontalsystems/bitstashwallet/entities/AuthData;", "savedPin", "getSavedPin", "()Ljava/lang/String;", "pinIsEmpty", "", "removePin", "", "savePin", "pin", "app_productionMainnetRelease"})
public final class SecuredStorageManager implements io.horizontalsystems.bitstashwallet.core.ISecuredStorage {
    private final java.lang.String AUTH_DATA = "auth_data";
    private final java.lang.String LOCK_PIN = "lock_pin";
    private final io.horizontalsystems.bitstashwallet.core.IEncryptionManager encryptionManager = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.AuthData getAuthData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getSavedPin() {
        return null;
    }
    
    @java.lang.Override()
    public void savePin(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
    }
    
    @java.lang.Override()
    public void removePin() {
    }
    
    @java.lang.Override()
    public boolean pinIsEmpty() {
        return false;
    }
    
    public SecuredStorageManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IEncryptionManager encryptionManager) {
        super();
    }
}