package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/core/IEncryptionManager;", "", "decrypt", "", "data", "encrypt", "getCryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "app_productionMainnetRelease"})
public abstract interface IEncryptionManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String encrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.biometric.BiometricPrompt.CryptoObject getCryptoObject();
}