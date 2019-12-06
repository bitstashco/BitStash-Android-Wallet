package app.odapplications.bitstashwallet.modules.restore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0011"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule;", "", "()V", "init", "", "view", "Lapp/odapplications/bitstashwallet/modules/restore/RestoreViewModel;", "router", "Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$Router;", "start", "context", "Landroid/content/Context;", "Interactor", "InteractorDelegate", "Router", "View", "ViewDelegate", "app_productionMainnetRelease"})
public final class RestoreModule {
    public static final app.odapplications.bitstashwallet.modules.restore.RestoreModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.RestoreViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.RestoreModule.Router router) {
    }
    
    private RestoreModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0014\u0010\u0007\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH&\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$View;", "", "reload", "", "items", "", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "showError", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_productionMainnetRelease"})
    public static abstract interface View {
        
        public abstract void reload(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends app.odapplications.bitstashwallet.core.IPredefinedAccountType> items);
        
        public abstract void showError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception ex);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$ViewDelegate;", "", "items", "", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "getItems", "()Ljava/util/List;", "onRestore", "", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "onSelect", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface ViewDelegate {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<app.odapplications.bitstashwallet.core.IPredefinedAccountType> getItems();
        
        public abstract void viewDidLoad();
        
        public abstract void onSelect(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.IPredefinedAccountType accountType);
        
        public abstract void onRestore(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.SyncMode syncMode);
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$Interactor;", "", "restore", "", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "app_productionMainnetRelease"})
    public static abstract interface Interactor {
        
        public abstract void restore(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.SyncMode syncMode);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$InteractorDelegate;", "", "didFailRestore", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "didRestore", "app_productionMainnetRelease"})
    public static abstract interface InteractorDelegate {
        
        public abstract void didRestore();
        
        public abstract void didFailRestore(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/RestoreModule$Router;", "", "close", "", "startMainModule", "startRestoreEosModule", "startRestoreWordsModule", "wordsCount", "", "app_productionMainnetRelease"})
    public static abstract interface Router {
        
        public abstract void startRestoreWordsModule(int wordsCount);
        
        public abstract void startRestoreEosModule();
        
        public abstract void startMainModule();
        
        public abstract void close();
    }
}