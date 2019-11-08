package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/ILockManager;", "", "isLocked", "", "()Z", "setLocked", "(Z)V", "lockStateUpdatedSignal", "Lio/reactivex/subjects/PublishSubject;", "", "getLockStateUpdatedSignal", "()Lio/reactivex/subjects/PublishSubject;", "onUnlock", "app_devMainnetMasterDebug"})
public abstract interface ILockManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.subjects.PublishSubject<kotlin.Unit> getLockStateUpdatedSignal();
    
    public abstract boolean isLocked();
    
    public abstract void setLocked(boolean p0);
    
    public abstract void onUnlock();
}