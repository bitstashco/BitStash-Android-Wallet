package io.horizontalsystems.bitstashwallet.modules.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$Router;", "account", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "start", "context", "Landroid/content/Context;", "coinCodes", "", "Interactor", "InteractorDelegate", "Router", "View", "ViewDelegate", "app_productionMainnetRelease"})
public final class BackupModule {
    public static final io.horizontalsystems.bitstashwallet.modules.backup.BackupModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCodes) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.BackupViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.Router router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account) {
    }
    
    private BackupModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$View;", "", "app_productionMainnetRelease"})
    public static abstract interface View {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$ViewDelegate;", "", "didBackup", "", "didCancelUnlock", "didUnlock", "onClickBackup", "onClickCancel", "app_productionMainnetRelease"})
    public static abstract interface ViewDelegate {
        
        public abstract void onClickCancel();
        
        public abstract void onClickBackup();
        
        public abstract void didBackup();
        
        public abstract void didUnlock();
        
        public abstract void didCancelUnlock();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$Interactor;", "", "isPinSet", "", "()Z", "setBackedUp", "", "accountId", "", "app_productionMainnetRelease"})
    public static abstract interface Interactor {
        
        public abstract boolean isPinSet();
        
        public abstract void setBackedUp(@org.jetbrains.annotations.NotNull()
        java.lang.String accountId);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$InteractorDelegate;", "", "app_productionMainnetRelease"})
    public static abstract interface InteractorDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$Router;", "", "close", "", "startBackupEosModule", "account", "", "activePrivateKey", "startBackupWordsModule", "words", "", "startUnlockPinModule", "app_productionMainnetRelease"})
    public static abstract interface Router {
        
        public abstract void startUnlockPinModule();
        
        public abstract void startBackupWordsModule(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> words);
        
        public abstract void startBackupEosModule(@org.jetbrains.annotations.NotNull()
        java.lang.String account, @org.jetbrains.annotations.NotNull()
        java.lang.String activePrivateKey);
        
        public abstract void close();
    }
}