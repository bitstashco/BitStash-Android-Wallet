package io.horizontalsystems.bitstashwallet.core.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/security/EncryptionManager;", "Lio/horizontalsystems/bitstashwallet/core/IEncryptionManager;", "keyProvider", "Lio/horizontalsystems/bitstashwallet/core/IKeyProvider;", "(Lio/horizontalsystems/bitstashwallet/core/IKeyProvider;)V", "decrypt", "", "data", "encrypt", "getCryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "app_devMainnetMasterDebug"})
public final class EncryptionManager implements io.horizontalsystems.bitstashwallet.core.IEncryptionManager {
    private final io.horizontalsystems.bitstashwallet.core.IKeyProvider keyProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public synchronized java.lang.String encrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public synchronized java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.biometric.BiometricPrompt.CryptoObject getCryptoObject() {
        return null;
    }
    
    public EncryptionManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IKeyProvider keyProvider) {
        super();
    }
}