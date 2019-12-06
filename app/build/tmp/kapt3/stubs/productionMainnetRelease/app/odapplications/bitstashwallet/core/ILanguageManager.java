package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0018\u0010\n\u001a\u00020\u000bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/core/ILanguageManager;", "", "currentLanguage", "", "getCurrentLanguage", "()Ljava/lang/String;", "setCurrentLanguage", "(Ljava/lang/String;)V", "currentLanguageName", "getCurrentLanguageName", "currentLocale", "Ljava/util/Locale;", "getCurrentLocale", "()Ljava/util/Locale;", "setCurrentLocale", "(Ljava/util/Locale;)V", "getName", "language", "getNativeName", "app_productionMainnetRelease"})
public abstract interface ILanguageManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Locale getCurrentLocale();
    
    public abstract void setCurrentLocale(@org.jetbrains.annotations.NotNull()
    java.util.Locale p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrentLanguage();
    
    public abstract void setCurrentLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrentLanguageName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName(@org.jetbrains.annotations.NotNull()
    java.lang.String language);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getNativeName(@org.jetbrains.annotations.NotNull()
    java.lang.String language);
}