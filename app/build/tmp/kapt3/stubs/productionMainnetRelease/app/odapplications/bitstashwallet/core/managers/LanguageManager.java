package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\fR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/LanguageManager;", "Lapp/odapplications/bitstashwallet/core/ILanguageManager;", "localStorage", "Lapp/odapplications/bitstashwallet/core/ILocalStorage;", "appConfigProvider", "Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;", "fallbackLanguage", "", "(Lapp/odapplications/bitstashwallet/core/ILocalStorage;Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;Ljava/lang/String;)V", "value", "currentLanguage", "getCurrentLanguage", "()Ljava/lang/String;", "setCurrentLanguage", "(Ljava/lang/String;)V", "currentLanguageName", "getCurrentLanguageName", "Ljava/util/Locale;", "currentLocale", "getCurrentLocale", "()Ljava/util/Locale;", "setCurrentLocale", "(Ljava/util/Locale;)V", "preferredSystemLocale", "getPreferredSystemLocale", "getName", "language", "getNativeName", "app_productionMainnetRelease"})
public final class LanguageManager implements app.odapplications.bitstashwallet.core.ILanguageManager {
    @org.jetbrains.annotations.NotNull()
    private java.util.Locale currentLocale;
    private final app.odapplications.bitstashwallet.core.ILocalStorage localStorage = null;
    private final app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Locale getCurrentLocale() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentLocale(@org.jetbrains.annotations.NotNull()
    java.util.Locale value) {
    }
    
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
    public java.lang.String getCurrentLanguageName() {
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
    
    private final java.util.Locale getPreferredSystemLocale() {
        return null;
    }
    
    public LanguageManager(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    java.lang.String fallbackLanguage) {
        super();
    }
}