package io.horizontalsystems.bitstashwallet.modules.settings.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0016J\u0010\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0005H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsRouter;", "Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsRouter;", "()V", "openLinkLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getOpenLinkLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "reloadAppLiveEvent", "", "getReloadAppLiveEvent", "shareAppLiveEvent", "getShareAppLiveEvent", "showAboutLiveEvent", "getShowAboutLiveEvent", "showBaseCurrencySettingsLiveEvent", "getShowBaseCurrencySettingsLiveEvent", "showLanguageSettingsLiveEvent", "getShowLanguageSettingsLiveEvent", "showManageCoinsLiveEvent", "getShowManageCoinsLiveEvent", "showNotificationsLiveEvent", "getShowNotificationsLiveEvent", "showReportProblemLiveEvent", "getShowReportProblemLiveEvent", "showSecuritySettingsLiveEvent", "getShowSecuritySettingsLiveEvent", "openLink", "url", "reloadAppInterface", "showAbout", "showBaseCurrencySettings", "showLanguageSettings", "showManageCoins", "showNotifications", "showReportProblem", "showSecuritySettings", "showShareApp", "appWebPageLink", "app_productionMainnetRelease"})
public final class MainSettingsRouter implements io.horizontalsystems.bitstashwallet.modules.settings.main.MainSettingsModule.IMainSettingsRouter {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showSecuritySettingsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showManageCoinsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showBaseCurrencySettingsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showLanguageSettingsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showAboutLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showNotificationsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showReportProblemLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> openLinkLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> shareAppLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> reloadAppLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowSecuritySettingsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowManageCoinsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowBaseCurrencySettingsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowLanguageSettingsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowAboutLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowNotificationsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowReportProblemLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> getOpenLinkLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> getShareAppLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getReloadAppLiveEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void showSecuritySettings() {
    }
    
    @java.lang.Override()
    public void showManageCoins() {
    }
    
    @java.lang.Override()
    public void showBaseCurrencySettings() {
    }
    
    @java.lang.Override()
    public void showLanguageSettings() {
    }
    
    @java.lang.Override()
    public void showAbout() {
    }
    
    @java.lang.Override()
    public void openLink(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void reloadAppInterface() {
    }
    
    @java.lang.Override()
    public void showReportProblem() {
    }
    
    @java.lang.Override()
    public void showShareApp(@org.jetbrains.annotations.NotNull()
    java.lang.String appWebPageLink) {
    }
    
    @java.lang.Override()
    public void showNotifications() {
    }
    
    public MainSettingsRouter() {
        super();
    }
}