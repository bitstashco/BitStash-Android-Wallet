package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IBackupManager;", "", "allBackedUp", "", "getAllBackedUp", "()Z", "allBackedUpFlowable", "Lio/reactivex/Flowable;", "getAllBackedUpFlowable", "()Lio/reactivex/Flowable;", "setIsBackedUp", "", "id", "", "app_devMainnetMasterDebug"})
public abstract interface IBackupManager {
    
    public abstract boolean getAllBackedUp();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.lang.Boolean> getAllBackedUpFlowable();
    
    public abstract void setIsBackedUp(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}