package io.horizontalsystems.bitstashwallet.modules.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0016\u0010\u0014\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00150\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\t\u00a8\u0006!"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$View;", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$Router;", "()V", "closeLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "Ljava/lang/Void;", "getCloseLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$ViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$ViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$ViewDelegate;)V", "startBackupEosModule", "Lkotlin/Pair;", "", "getStartBackupEosModule", "startBackupWordsModule", "", "getStartBackupWordsModule", "startPinModule", "getStartPinModule", "close", "", "init", "account", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "activePrivateKey", "words", "startUnlockPinModule", "app_devMainnetMasterDebug"})
public final class BackupViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.View, io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.Router {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.ViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> startPinModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.util.List<java.lang.String>> startBackupWordsModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.String, java.lang.String>> startBackupEosModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> closeLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.ViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.ViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getStartPinModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.util.List<java.lang.String>> getStartBackupWordsModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.String, java.lang.String>> getStartBackupEosModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Void> getCloseLiveEvent() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void startUnlockPinModule() {
    }
    
    @java.lang.Override()
    public void startBackupWordsModule(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words) {
    }
    
    @java.lang.Override()
    public void startBackupEosModule(@org.jetbrains.annotations.NotNull()
    java.lang.String account, @org.jetbrains.annotations.NotNull()
    java.lang.String activePrivateKey) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    public BackupViewModel() {
        super();
    }
}