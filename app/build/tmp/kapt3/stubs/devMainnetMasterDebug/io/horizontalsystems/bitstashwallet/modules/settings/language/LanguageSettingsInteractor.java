package io.horizontalsystems.bitstashwallet.modules.settings.language;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/language/LanguageSettingsInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/settings/language/LanguageSettingsModule$ILanguageSettingsInteractor;", "languageManager", "Lio/horizontalsystems/bitstashwallet/core/ILanguageManager;", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/bitstashwallet/core/ILanguageManager;Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;)V", "availableLanguages", "", "", "getAvailableLanguages", "()Ljava/util/List;", "value", "currentLanguage", "getCurrentLanguage", "()Ljava/lang/String;", "setCurrentLanguage", "(Ljava/lang/String;)V", "getName", "language", "getNativeName", "app_devMainnetMasterDebug"})
public final class LanguageSettingsInteractor implements io.horizontalsystems.bitstashwallet.modules.settings.language.LanguageSettingsModule.ILanguageSettingsInteractor {
    private final io.horizontalsystems.bitstashwallet.core.ILanguageManager languageManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentLanguage() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getAvailableLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName(@org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getNativeName(@org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        return null;
    }
    
    public LanguageSettingsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILanguageManager languageManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider) {
        super();
    }
}