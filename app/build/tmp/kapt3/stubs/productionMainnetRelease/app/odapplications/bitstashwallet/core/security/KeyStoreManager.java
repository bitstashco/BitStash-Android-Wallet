package app.odapplications.bitstashwallet.core.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lapp/odapplications/bitstashwallet/core/security/KeyStoreManager;", "Lapp/odapplications/bitstashwallet/core/IKeyStoreManager;", "Lapp/odapplications/bitstashwallet/core/IKeyProvider;", "keyAlias", "", "(Ljava/lang/String;)V", "ANDROID_KEY_STORE", "AUTH_DURATION_SEC", "", "BLOCK_MODE", "PADDING", "isKeyInvalidated", "", "()Z", "isUserNotAuthenticated", "keyStore", "Ljava/security/KeyStore;", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "createKey", "Ljavax/crypto/SecretKey;", "getKey", "removeKey", "", "validateKey", "app_productionMainnetRelease"})
public final class KeyStoreManager implements app.odapplications.bitstashwallet.core.IKeyStoreManager, app.odapplications.bitstashwallet.core.IKeyProvider {
    private final java.lang.String ANDROID_KEY_STORE = "AndroidKeyStore";
    private final java.lang.String BLOCK_MODE = "CBC";
    private final java.lang.String PADDING = "PKCS7Padding";
    private final int AUTH_DURATION_SEC = 86400;
    private final java.security.KeyStore keyStore = null;
    private final java.util.logging.Logger logger = null;
    private final java.lang.String keyAlias = null;
    
    @java.lang.Override()
    public boolean isKeyInvalidated() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isUserNotAuthenticated() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public javax.crypto.SecretKey getKey() {
        return null;
    }
    
    @java.lang.Override()
    public void removeKey() {
    }
    
    private final javax.crypto.SecretKey createKey() {
        return null;
    }
    
    private final void validateKey() {
    }
    
    public KeyStoreManager(@org.jetbrains.annotations.NotNull()
    java.lang.String keyAlias) {
        super();
    }
}