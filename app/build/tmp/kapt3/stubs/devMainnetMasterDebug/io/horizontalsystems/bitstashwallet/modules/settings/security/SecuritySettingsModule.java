package io.horizontalsystems.bitstashwallet.modules.settings.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsRouter;", "start", "context", "Landroid/content/Context;", "ISecuritySettingsInteractor", "ISecuritySettingsInteractorDelegate", "ISecuritySettingsRouter", "ISecuritySettingsView", "ISecuritySettingsViewDelegate", "app_devMainnetMasterDebug"})
public final class SecuritySettingsModule {
    public static final io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsRouter router) {
    }
    
    private SecuritySettingsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsView;", "", "setBackupAlertVisible", "", "visible", "", "setBiometricSettingsVisible", "setEditPinVisible", "toggleBiometricEnabled", "enabled", "togglePinSet", "pinSet", "app_devMainnetMasterDebug"})
    public static abstract interface ISecuritySettingsView {
        
        public abstract void setBackupAlertVisible(boolean visible);
        
        public abstract void togglePinSet(boolean pinSet);
        
        public abstract void setEditPinVisible(boolean visible);
        
        public abstract void setBiometricSettingsVisible(boolean visible);
        
        public abstract void toggleBiometricEnabled(boolean enabled);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsViewDelegate;", "", "didCancelSetPin", "", "didCancelUnlockPinToDisablePin", "didSetPin", "didSwitchBiometricEnabled", "enable", "", "didSwitchPinSet", "didTapEditPin", "didTapManageKeys", "didUnlockPinToDisablePin", "onClear", "viewDidLoad", "app_devMainnetMasterDebug"})
    public static abstract interface ISecuritySettingsViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void didTapManageKeys();
        
        public abstract void didTapEditPin();
        
        public abstract void didSwitchPinSet(boolean enable);
        
        public abstract void didSwitchBiometricEnabled(boolean enable);
        
        public abstract void didSetPin();
        
        public abstract void didCancelSetPin();
        
        public abstract void didUnlockPinToDisablePin();
        
        public abstract void didCancelUnlockPinToDisablePin();
        
        public abstract void onClear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractor;", "", "allBackedUp", "", "getAllBackedUp", "()Z", "biometricAuthSupported", "getBiometricAuthSupported", "isBiometricEnabled", "setBiometricEnabled", "(Z)V", "isPinSet", "clear", "", "disablePin", "app_devMainnetMasterDebug"})
    public static abstract interface ISecuritySettingsInteractor {
        
        public abstract boolean getAllBackedUp();
        
        public abstract boolean getBiometricAuthSupported();
        
        public abstract boolean isPinSet();
        
        public abstract boolean isBiometricEnabled();
        
        public abstract void setBiometricEnabled(boolean p0);
        
        public abstract void disablePin();
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractorDelegate;", "", "didAllBackedUp", "", "allBackedUp", "", "app_devMainnetMasterDebug"})
    public static abstract interface ISecuritySettingsInteractorDelegate {
        
        public abstract void didAllBackedUp(boolean allBackedUp);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsRouter;", "", "showEditPin", "", "showManageKeys", "showSetPin", "showUnlockPin", "app_devMainnetMasterDebug"})
    public static abstract interface ISecuritySettingsRouter {
        
        public abstract void showManageKeys();
        
        public abstract void showEditPin();
        
        public abstract void showSetPin();
        
        public abstract void showUnlockPin();
    }
}