package io.horizontalsystems.bitstashwallet.modules.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$ViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$InteractorDelegate;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$Interactor;", "router", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$Router;", "account", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "(Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$Interactor;Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$Router;Lio/horizontalsystems/bitstashwallet/entities/Account;)V", "view", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$View;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$View;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$View;)V", "didBackup", "", "didCancelUnlock", "didUnlock", "onClickBackup", "onClickCancel", "startBackup", "app_productionMainnetRelease"})
public final class BackupPresenter implements io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.ViewDelegate, io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.InteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.View view;
    private final io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.Interactor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.Router router = null;
    private final io.horizontalsystems.bitstashwallet.entities.Account account = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.View p0) {
    }
    
    @java.lang.Override()
    public void onClickCancel() {
    }
    
    @java.lang.Override()
    public void onClickBackup() {
    }
    
    @java.lang.Override()
    public void didBackup() {
    }
    
    @java.lang.Override()
    public void didUnlock() {
    }
    
    @java.lang.Override()
    public void didCancelUnlock() {
    }
    
    private final void startBackup() {
    }
    
    public BackupPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.Interactor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.Router router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Account account) {
        super();
    }
}