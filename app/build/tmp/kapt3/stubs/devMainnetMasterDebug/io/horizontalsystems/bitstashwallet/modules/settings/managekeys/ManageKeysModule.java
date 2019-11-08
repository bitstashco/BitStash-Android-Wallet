package io.horizontalsystems.bitstashwallet.modules.settings.managekeys;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageKeysModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageKeysViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageKeysModule$Router;", "start", "context", "Landroid/content/Context;", "Interactor", "InteractorDelegate", "Router", "View", "ViewDelegate", "app_devMainnetMasterDebug"})
public final class ManageKeysModule {
    public static final io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageKeysModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageKeysViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageKeysModule.Router router) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private ManageKeysModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0014\u0010\n\u001a\u00020\u00032\n\u0010\u000b\u001a\u00060\fj\u0002`\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageKeysModule$View;", "", "show", "", "items", "", "Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageAccountItem;", "showBackupConfirmation", "accountItem", "showCreateConfirmation", "showError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "showSuccess", "showUnlinkConfirmation", "app_devMainnetMasterDebug"})
    public static abstract interface View {
        
        public abstract void show(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem> items);
        
        public abstract void showCreateConfirmation(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem);
        
        public abstract void showBackupConfirmation(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem);
        
        public abstract void showUnlinkConfirmation(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem);
        
        public abstract void showSuccess();
        
        public abstract void showError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception error);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\bH&J\b\u0010\u0012\u001a\u00020\bH&J\u001c\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageKeysModule$ViewDelegate;", "", "items", "", "Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageAccountItem;", "getItems", "()Ljava/util/List;", "onClear", "", "onClickBackup", "accountItem", "onClickNew", "onClickRestore", "accountType", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "onClickShow", "onClickUnlink", "onConfirmBackup", "onConfirmCreate", "onConfirmRestore", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "onConfirmUnlink", "accountId", "", "viewDidLoad", "app_devMainnetMasterDebug"})
    public static abstract interface ViewDelegate {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem> getItems();
        
        public abstract void viewDidLoad();
        
        public abstract void onClickNew(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem);
        
        public abstract void onClickBackup(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem);
        
        public abstract void onClickRestore(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType accountType);
        
        public abstract void onClickUnlink(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem);
        
        public abstract void onClickShow(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem);
        
        public abstract void onConfirmCreate();
        
        public abstract void onConfirmBackup();
        
        public abstract void onConfirmUnlink(@org.jetbrains.annotations.NotNull()
        java.lang.String accountId);
        
        public abstract void onConfirmRestore(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode);
        
        public abstract void onClear();
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageKeysModule$Interactor;", "", "predefinedAccountTypes", "", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "getPredefinedAccountTypes", "()Ljava/util/List;", "account", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "predefinedAccountType", "clear", "", "createAccount", "deleteAccount", "id", "", "loadAccounts", "restoreAccount", "accountType", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "app_devMainnetMasterDebug"})
    public static abstract interface Interactor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType> getPredefinedAccountTypes();
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bitstashwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType predefinedAccountType);
        
        public abstract void createAccount(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType predefinedAccountType);
        
        public abstract void restoreAccount(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode);
        
        public abstract void loadAccounts();
        
        public abstract void deleteAccount(@org.jetbrains.annotations.NotNull()
        java.lang.String id);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageKeysModule$InteractorDelegate;", "", "didLoad", "", "accounts", "", "Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageAccountItem;", "app_devMainnetMasterDebug"})
    public static abstract interface InteractorDelegate {
        
        public abstract void didLoad(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem> accounts);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageKeysModule$Router;", "", "close", "", "startBackupModule", "accountItem", "Lio/horizontalsystems/bitstashwallet/modules/settings/managekeys/ManageAccountItem;", "startRestoreEos", "startRestoreWords", "wordsCount", "", "app_devMainnetMasterDebug"})
    public static abstract interface Router {
        
        public abstract void startBackupModule(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageAccountItem accountItem);
        
        public abstract void startRestoreWords(int wordsCount);
        
        public abstract void startRestoreEos();
        
        public abstract void close();
    }
}