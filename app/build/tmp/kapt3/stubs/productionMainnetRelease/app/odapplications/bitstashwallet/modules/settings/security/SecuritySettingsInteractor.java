package app.odapplications.bitstashwallet.modules.settings.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/security/SecuritySettingsInteractor;", "Lapp/odapplications/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractor;", "backupManager", "Lapp/odapplications/bitstashwallet/core/IBackupManager;", "localStorage", "Lapp/odapplications/bitstashwallet/core/ILocalStorage;", "systemInfoManager", "Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;", "pinManager", "Lapp/odapplications/bitstashwallet/core/IPinManager;", "(Lapp/odapplications/bitstashwallet/core/IBackupManager;Lapp/odapplications/bitstashwallet/core/ILocalStorage;Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;Lapp/odapplications/bitstashwallet/core/IPinManager;)V", "allBackedUp", "", "getAllBackedUp", "()Z", "biometricAuthSupported", "getBiometricAuthSupported", "delegate", "Lapp/odapplications/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "value", "isBiometricEnabled", "setBiometricEnabled", "(Z)V", "isPinSet", "clear", "", "disablePin", "app_productionMainnetRelease"})
public final class SecuritySettingsInteractor implements app.odapplications.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractorDelegate delegate;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final app.odapplications.bitstashwallet.core.IBackupManager backupManager = null;
    private final app.odapplications.bitstashwallet.core.ILocalStorage localStorage = null;
    private final app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager = null;
    private final app.odapplications.bitstashwallet.core.IPinManager pinManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public boolean getBiometricAuthSupported() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getAllBackedUp() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isBiometricEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setBiometricEnabled(boolean value) {
    }
    
    @java.lang.Override()
    public boolean isPinSet() {
        return false;
    }
    
    @java.lang.Override()
    public void disablePin() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public SecuritySettingsInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IBackupManager backupManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPinManager pinManager) {
        super();
    }
}