package io.horizontalsystems.bitstashwallet.modules.settings.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsView;", "Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsView;", "()V", "appVersion", "Landroidx/lifecycle/MutableLiveData;", "", "getAppVersion", "()Landroidx/lifecycle/MutableLiveData;", "backedUp", "", "getBackedUp", "baseCurrency", "getBaseCurrency", "language", "getLanguage", "lightMode", "getLightMode", "setAppVersion", "", "setBackedUp", "setBaseCurrency", "currency", "setLanguage", "setLightMode", "app_devMainnetMasterDebug"})
public final class MainSettingsView implements io.horizontalsystems.bitstashwallet.modules.settings.main.MainSettingsModule.IMainSettingsView {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> backedUp = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> baseCurrency = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> language = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> lightMode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> appVersion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBackedUp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getBaseCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLightMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAppVersion() {
        return null;
    }
    
    @java.lang.Override()
    public void setBackedUp(boolean backedUp) {
    }
    
    @java.lang.Override()
    public void setBaseCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
    }
    
    @java.lang.Override()
    public void setLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    @java.lang.Override()
    public void setLightMode(boolean lightMode) {
    }
    
    @java.lang.Override()
    public void setAppVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String appVersion) {
    }
    
    public MainSettingsView() {
        super();
    }
}