package app.odapplications.bitstashwallet.modules.keystore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreInteractor;", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IInteractor;", "accountManager", "Lapp/odapplications/bitstashwallet/core/IAccountManager;", "walletManager", "Lapp/odapplications/bitstashwallet/core/IWalletManager;", "localStorage", "Lapp/odapplications/bitstashwallet/core/ILocalStorage;", "systemInfoManager", "Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;", "keyStoreManager", "Lapp/odapplications/bitstashwallet/core/IKeyStoreManager;", "(Lapp/odapplications/bitstashwallet/core/IAccountManager;Lapp/odapplications/bitstashwallet/core/IWalletManager;Lapp/odapplications/bitstashwallet/core/ILocalStorage;Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;Lapp/odapplications/bitstashwallet/core/IKeyStoreManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IInteractorDelegate;)V", "isKeyInvalidated", "", "()Z", "isSystemLockOff", "isUserNotAuthenticated", "removeKey", "", "resetApp", "app_productionMainnetRelease"})
public final class KeyStoreInteractor implements app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IAccountManager accountManager = null;
    private final app.odapplications.bitstashwallet.core.IWalletManager walletManager = null;
    private final app.odapplications.bitstashwallet.core.ILocalStorage localStorage = null;
    private final app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager = null;
    private final app.odapplications.bitstashwallet.core.IKeyStoreManager keyStoreManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IInteractorDelegate p0) {
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
    app.odapplications.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IKeyStoreManager keyStoreManager) {
        super();
    }
}