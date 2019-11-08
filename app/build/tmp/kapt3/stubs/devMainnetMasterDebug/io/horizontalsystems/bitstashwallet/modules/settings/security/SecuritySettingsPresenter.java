package io.horizontalsystems.bitstashwallet.modules.settings.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0011H\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractorDelegate;", "router", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsRouter;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractor;", "(Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsRouter;Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractor;)V", "view", "Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsView;)V", "didAllBackedUp", "", "allBackedUp", "", "didCancelSetPin", "didCancelUnlockPinToDisablePin", "didSetPin", "didSwitchBiometricEnabled", "enable", "didSwitchPinSet", "didTapEditPin", "didTapManageKeys", "didUnlockPinToDisablePin", "onClear", "syncPinSet", "pinSet", "viewDidLoad", "app_devMainnetMasterDebug"})
public final class SecuritySettingsPresenter implements io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsViewDelegate, io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsView view;
    private final io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsRouter router = null;
    private final io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractor interactor = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsView p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void didTapManageKeys() {
    }
    
    @java.lang.Override()
    public void didSwitchPinSet(boolean enable) {
    }
    
    @java.lang.Override()
    public void didTapEditPin() {
    }
    
    @java.lang.Override()
    public void didSwitchBiometricEnabled(boolean enable) {
    }
    
    @java.lang.Override()
    public void didSetPin() {
    }
    
    @java.lang.Override()
    public void didCancelSetPin() {
    }
    
    @java.lang.Override()
    public void didUnlockPinToDisablePin() {
    }
    
    @java.lang.Override()
    public void didCancelUnlockPinToDisablePin() {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    private final void syncPinSet(boolean pinSet) {
    }
    
    @java.lang.Override()
    public void didAllBackedUp(boolean allBackedUp) {
    }
    
    public SecuritySettingsPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractor interactor) {
        super();
    }
}