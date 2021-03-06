package app.odapplications.bitstashwallet.modules.launcher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/launcher/LaunchInteractor;", "Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IInteractor;", "accountManager", "Lapp/odapplications/bitstashwallet/core/IAccountManager;", "pinManager", "Lapp/odapplications/bitstashwallet/core/IPinManager;", "systemInfoManager", "Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;", "keyStoreManager", "Lapp/odapplications/bitstashwallet/core/IKeyStoreManager;", "(Lapp/odapplications/bitstashwallet/core/IAccountManager;Lapp/odapplications/bitstashwallet/core/IPinManager;Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;Lapp/odapplications/bitstashwallet/core/IKeyStoreManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/launcher/LaunchModule$IInteractorDelegate;)V", "isAccountsEmpty", "", "()Z", "isKeyInvalidated", "isPinNotSet", "isSystemLockOff", "isUserNotAuthenticated", "app_productionMainnetRelease"})
public final class LaunchInteractor implements app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IAccountManager accountManager = null;
    private final app.odapplications.bitstashwallet.core.IPinManager pinManager = null;
    private final app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager = null;
    private final app.odapplications.bitstashwallet.core.IKeyStoreManager keyStoreManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.launcher.LaunchModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public boolean isPinNotSet() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isAccountsEmpty() {
        return false;
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
    
    public LaunchInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPinManager pinManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IKeyStoreManager keyStoreManager) {
        super();
    }
}