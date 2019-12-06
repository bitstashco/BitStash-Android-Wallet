package app.odapplications.bitstashwallet.core.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/core/security/CipherWrapper;", "", "()V", "cipher", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "decrypt", "", "data", "key", "Ljava/security/Key;", "encrypt", "Companion", "app_productionMainnetRelease"})
public final class CipherWrapper {
    @org.jetbrains.annotations.NotNull()
    private final javax.crypto.Cipher cipher = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRANSFORMATION_SYMMETRIC = "AES/CBC/PKCS7Padding";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IV_SEPARATOR = "]";
    public static final app.odapplications.bitstashwallet.core.security.CipherWrapper.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final javax.crypto.Cipher getCipher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String encrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.security.Key key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.security.Key key) {
        return null;
    }
    
    public CipherWrapper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/core/security/CipherWrapper$Companion;", "", "()V", "IV_SEPARATOR", "", "TRANSFORMATION_SYMMETRIC", "app_productionMainnetRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}