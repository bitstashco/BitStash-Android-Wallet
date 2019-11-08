package io.horizontalsystems.bitstashwallet.modules.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$Interactor;", "backupManager", "Lio/horizontalsystems/bitstashwallet/core/IBackupManager;", "pinManager", "Lio/horizontalsystems/bitstashwallet/core/IPinManager;", "(Lio/horizontalsystems/bitstashwallet/core/IBackupManager;Lio/horizontalsystems/bitstashwallet/core/IPinManager;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$InteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$InteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/backup/BackupModule$InteractorDelegate;)V", "isPinSet", "", "()Z", "setBackedUp", "", "accountId", "", "app_productionMainnetRelease"})
public final class BackupInteractor implements io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.Interactor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.InteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.IBackupManager backupManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IPinManager pinManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.InteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.backup.BackupModule.InteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public boolean isPinSet() {
        return false;
    }
    
    @java.lang.Override()
    public void setBackedUp(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId) {
    }
    
    public BackupInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IBackupManager backupManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPinManager pinManager) {
        super();
    }
}