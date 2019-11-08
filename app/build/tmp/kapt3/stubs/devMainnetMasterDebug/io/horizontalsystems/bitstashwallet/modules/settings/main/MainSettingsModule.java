package io.horizontalsystems.bitstashwallet.modules.settings.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsModule;", "", "()V", "Factory", "IMainSettingsInteractor", "IMainSettingsInteractorDelegate", "IMainSettingsRouter", "IMainSettingsView", "IMainSettingsViewDelegate", "app_devMainnetMasterDebug"})
public final class MainSettingsModule {
    public static final io.horizontalsystems.bitstashwallet.modules.settings.main.MainSettingsModule INSTANCE = null;
    
    private MainSettingsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH&\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsView;", "", "setAppVersion", "", "appVersion", "", "setBackedUp", "backedUp", "", "setBaseCurrency", "currency", "setLanguage", "language", "setLightMode", "lightMode", "app_devMainnetMasterDebug"})
    public static abstract interface IMainSettingsView {
        
        public abstract void setBackedUp(boolean backedUp);
        
        public abstract void setBaseCurrency(@org.jetbrains.annotations.NotNull()
        java.lang.String currency);
        
        public abstract void setLanguage(@org.jetbrains.annotations.NotNull()
        java.lang.String language);
        
        public abstract void setLightMode(boolean lightMode);
        
        public abstract void setAppVersion(@org.jetbrains.annotations.NotNull()
        java.lang.String appVersion);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsViewDelegate;", "", "didManageCoins", "", "didSwitchLightMode", "lightMode", "", "didTapAbout", "didTapBaseCurrency", "didTapCompanyLogo", "didTapLanguage", "didTapNotifications", "didTapReportProblem", "didTapSecurity", "didTapTellFriends", "viewDidLoad", "app_devMainnetMasterDebug"})
    public static abstract interface IMainSettingsViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void didTapSecurity();
        
        public abstract void didManageCoins();
        
        public abstract void didTapBaseCurrency();
        
        public abstract void didTapLanguage();
        
        public abstract void didSwitchLightMode(boolean lightMode);
        
        public abstract void didTapAbout();
        
        public abstract void didTapCompanyLogo();
        
        public abstract void didTapReportProblem();
        
        public abstract void didTapTellFriends();
        
        public abstract void didTapNotifications();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0018\u001a\u00020\u0019H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0012\u0010\u0012\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0018\u0010\u0014\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractor;", "", "allBackedUp", "", "getAllBackedUp", "()Z", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "appWebPageLink", "getAppWebPageLink", "baseCurrency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "getBaseCurrency", "()Lio/horizontalsystems/bitstashwallet/entities/Currency;", "companyWebPageLink", "getCompanyWebPageLink", "currentLanguageDisplayName", "getCurrentLanguageDisplayName", "lightMode", "getLightMode", "setLightMode", "(Z)V", "clear", "", "app_devMainnetMasterDebug"})
    public static abstract interface IMainSettingsInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getCompanyWebPageLink();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getAppWebPageLink();
        
        public abstract boolean getAllBackedUp();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getCurrentLanguageDisplayName();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.entities.Currency getBaseCurrency();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getAppVersion();
        
        public abstract boolean getLightMode();
        
        public abstract void setLightMode(boolean p0);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractorDelegate;", "", "didUpdateAllBackedUp", "", "allBackedUp", "", "didUpdateBaseCurrency", "app_devMainnetMasterDebug"})
    public static abstract interface IMainSettingsInteractorDelegate {
        
        public abstract void didUpdateAllBackedUp(boolean allBackedUp);
        
        public abstract void didUpdateBaseCurrency();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsRouter;", "", "openLink", "", "url", "", "reloadAppInterface", "showAbout", "showBaseCurrencySettings", "showLanguageSettings", "showManageCoins", "showNotifications", "showReportProblem", "showSecuritySettings", "showShareApp", "appWebPageLink", "app_devMainnetMasterDebug"})
    public static abstract interface IMainSettingsRouter {
        
        public abstract void showSecuritySettings();
        
        public abstract void showManageCoins();
        
        public abstract void showBaseCurrencySettings();
        
        public abstract void showLanguageSettings();
        
        public abstract void showAbout();
        
        public abstract void openLink(@org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        public abstract void reloadAppInterface();
        
        public abstract void showReportProblem();
        
        public abstract void showShareApp(@org.jetbrains.annotations.NotNull()
        java.lang.String appWebPageLink);
        
        public abstract void showNotifications();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/main/MainSettingsModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_devMainnetMasterDebug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory() {
            super();
        }
    }
}