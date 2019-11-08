package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/BackupManager;", "Lio/horizontalsystems/bitstashwallet/core/IBackupManager;", "accountManager", "Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "(Lio/horizontalsystems/bitstashwallet/core/IAccountManager;)V", "allBackedUp", "", "getAllBackedUp", "()Z", "allBackedUpFlowable", "Lio/reactivex/Flowable;", "getAllBackedUpFlowable", "()Lio/reactivex/Flowable;", "setIsBackedUp", "", "id", "", "app_productionMainnetRelease"})
public final class BackupManager implements io.horizontalsystems.bitstashwallet.core.IBackupManager {
    private final io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager = null;
    
    @java.lang.Override()
    public boolean getAllBackedUp() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.lang.Boolean> getAllBackedUpFlowable() {
        return null;
    }
    
    @java.lang.Override()
    public void setIsBackedUp(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public BackupManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager) {
        super();
    }
}