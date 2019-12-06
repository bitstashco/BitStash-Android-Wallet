package app.odapplications.bitstashwallet.modules.settings.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010.\u001a\u00020/H\u0016R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0016R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00108V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/main/MainSettingsInteractor;", "Lapp/odapplications/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractor;", "localStorage", "Lapp/odapplications/bitstashwallet/core/ILocalStorage;", "backupManager", "Lapp/odapplications/bitstashwallet/core/IBackupManager;", "languageManager", "Lapp/odapplications/bitstashwallet/core/ILanguageManager;", "systemInfoManager", "Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;", "currencyManager", "Lapp/odapplications/bitstashwallet/core/ICurrencyManager;", "appConfigProvider", "Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;", "(Lapp/odapplications/bitstashwallet/core/ILocalStorage;Lapp/odapplications/bitstashwallet/core/IBackupManager;Lapp/odapplications/bitstashwallet/core/ILanguageManager;Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;Lapp/odapplications/bitstashwallet/core/ICurrencyManager;Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;)V", "allBackedUp", "", "getAllBackedUp", "()Z", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "appWebPageLink", "getAppWebPageLink", "baseCurrency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "getBaseCurrency", "()Lapp/odapplications/bitstashwallet/entities/Currency;", "companyWebPageLink", "getCompanyWebPageLink", "currentLanguageDisplayName", "getCurrentLanguageDisplayName", "delegate", "Lapp/odapplications/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "value", "lightMode", "getLightMode", "setLightMode", "(Z)V", "clear", "", "app_productionMainnetRelease"})
public final class MainSettingsInteractor implements app.odapplications.bitstashwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractor {
    private io.reactivex.disposables.CompositeDisposable disposables;
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.ILocalStorage localStorage = null;
    private final app.odapplications.bitstashwallet.core.IBackupManager backupManager = null;
    private final app.odapplications.bitstashwallet.core.ILanguageManager languageManager = null;
    private final app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager = null;
    private final app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager = null;
    private final app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompanyWebPageLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAppWebPageLink() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getAllBackedUp() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentLanguageDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.Currency getBaseCurrency() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getLightMode() {
        return false;
    }
    
    @java.lang.Override()
    public void setLightMode(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAppVersion() {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public MainSettingsInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IBackupManager backupManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILanguageManager languageManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider) {
        super();
    }
}