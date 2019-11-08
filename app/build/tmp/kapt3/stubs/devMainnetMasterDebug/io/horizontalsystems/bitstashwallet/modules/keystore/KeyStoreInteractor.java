package io.horizontalsystems.bitstashwallet.modules.keystore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/keystore/KeyStoreInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/keystore/KeyStoreModule$IInteractor;", "accountManager", "Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "walletManager", "Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "localStorage", "Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;", "systemInfoManager", "Lio/horizontalsystems/bitstashwallet/core/ISystemInfoManager;", "keyStoreManager", "Lio/horizontalsystems/bitstashwallet/core/IKeyStoreManager;", "(Lio/horizontalsystems/bitstashwallet/core/IAccountManager;Lio/horizontalsystems/bitstashwallet/core/IWalletManager;Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;Lio/horizontalsystems/bitstashwallet/core/ISystemInfoManager;Lio/horizontalsystems/bitstashwallet/core/IKeyStoreManager;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/keystore/KeyStoreModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/keystore/KeyStoreModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/keystore/KeyStoreModule$IInteractorDelegate;)V", "isKeyInvalidated", "", "()Z", "isSystemLockOff", "isUserNotAuthenticated", "removeKey", "", "resetApp", "app_devMainnetMasterDebug"})
public final class KeyStoreInteractor implements io.horizontalsystems.bitstashwallet.modules.keystore.KeyStoreModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.keystore.KeyStoreModule.IInteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.bitstashwallet.core.ISystemInfoManager systemInfoManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IKeyStoreManager keyStoreManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.keystore.KeyStoreModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.keystore.KeyStoreModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public boolean isSystemLockOff() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isKeyInvalidated() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isUserNotAuthenticated() {
        return false;
    }
    
    @java.lang.Override()
    public void resetApp() {
    }
    
    @java.lang.Override()
    public void removeKey() {
    }
    
    public KeyStoreInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IKeyStoreManager keyStoreManager) {
        super();
    }
}