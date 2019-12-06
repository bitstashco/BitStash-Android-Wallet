package app.odapplications.bitstashwallet.modules.settings.language;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/language/LanguageSettingsModule;", "", "()V", "start", "", "context", "Landroid/content/Context;", "Factory", "ILanguageSettingsInteractor", "ILanguageSettingsRouter", "ILanguageSettingsView", "ILanguageSettingsViewDelegate", "app_productionMainnetRelease"})
public final class LanguageSettingsModule {
    public static final app.odapplications.bitstashwallet.modules.settings.language.LanguageSettingsModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private LanguageSettingsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/language/LanguageSettingsModule$ILanguageSettingsView;", "", "show", "", "items", "", "Lapp/odapplications/bitstashwallet/modules/settings/language/LanguageViewItem;", "app_productionMainnetRelease"})
    public static abstract interface ILanguageSettingsView {
        
        public abstract void show(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.modules.settings.language.LanguageViewItem> items);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/language/LanguageSettingsModule$ILanguageSettingsViewDelegate;", "", "didSelect", "", "position", "", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface ILanguageSettingsViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void didSelect(int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/language/LanguageSettingsModule$ILanguageSettingsInteractor;", "", "availableLanguages", "", "", "getAvailableLanguages", "()Ljava/util/List;", "currentLanguage", "getCurrentLanguage", "()Ljava/lang/String;", "setCurrentLanguage", "(Ljava/lang/String;)V", "getName", "language", "getNativeName", "app_productionMainnetRelease"})
    public static abstract interface ILanguageSettingsInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getCurrentLanguage();
        
        public abstract void setCurrentLanguage(@org.jetbrains.annotations.NotNull()
        java.lang.String p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<java.lang.String> getAvailableLanguages();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getName(@org.jetbrains.annotations.NotNull()
        java.lang.String language);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getNativeName(@org.jetbrains.annotations.NotNull()
        java.lang.String language);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/language/LanguageSettingsModule$ILanguageSettingsRouter;", "", "close", "", "reloadAppInterface", "app_productionMainnetRelease"})
    public static abstract interface ILanguageSettingsRouter {
        
        public abstract void reloadAppInterface();
        
        public abstract void close();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/language/LanguageSettingsModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_productionMainnetRelease"})
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