package io.horizontalsystems.bitstashwallet.modules.settings.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010#\u001a\u00020\u0018J\b\u0010$\u001a\u00020\u0018H\u0014J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0007H\u0016J\u0010\u0010\'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0007H\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0007H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020\u0018H\u0016J\b\u0010+\u001a\u00020\u0018H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u0007H\u0016J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0007H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\t\u00a8\u00061"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsView;", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsRouter;", "()V", "backupAlertVisibleLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getBackupAlertVisibleLiveData", "()Landroidx/lifecycle/MutableLiveData;", "biometricEnabledLiveData", "getBiometricEnabledLiveData", "biometricSettingsVisibleLiveData", "getBiometricSettingsVisibleLiveData", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsViewDelegate;)V", "editPinVisibleLiveData", "getEditPinVisibleLiveData", "openEditPinLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getOpenEditPinLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "openManageKeysLiveEvent", "getOpenManageKeysLiveEvent", "openSetPinLiveEvent", "getOpenSetPinLiveEvent", "openUnlockPinLiveEvent", "getOpenUnlockPinLiveEvent", "pinSetLiveData", "getPinSetLiveData", "init", "onCleared", "setBackupAlertVisible", "visible", "setBiometricSettingsVisible", "setEditPinVisible", "showEditPin", "showManageKeys", "showSetPin", "showUnlockPin", "toggleBiometricEnabled", "enabled", "togglePinSet", "pinSet", "app_devMainnetMasterDebug"})
public final class SecuritySettingsViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsView, io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsRouter {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> backupAlertVisibleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> pinSetLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> editPinVisibleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> biometricSettingsVisibleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> biometricEnabledLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> openManageKeysLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> openEditPinLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> openSetPinLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> openUnlockPinLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBackupAlertVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPinSetLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEditPinVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBiometricSettingsVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBiometricEnabledLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getOpenManageKeysLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getOpenEditPinLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getOpenSetPinLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getOpenUnlockPinLiveEvent() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public void setBackupAlertVisible(boolean visible) {
    }
    
    @java.lang.Override()
    public void togglePinSet(boolean pinSet) {
    }
    
    @java.lang.Override()
    public void setEditPinVisible(boolean visible) {
    }
    
    @java.lang.Override()
    public void setBiometricSettingsVisible(boolean visible) {
    }
    
    @java.lang.Override()
    public void toggleBiometricEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public void showManageKeys() {
    }
    
    @java.lang.Override()
    public void showEditPin() {
    }
    
    @java.lang.Override()
    public void showSetPin() {
    }
    
    @java.lang.Override()
    public void showUnlockPin() {
    }
    
    public SecuritySettingsViewModel() {
        super();
    }
}