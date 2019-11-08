package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/LockManager;", "Lio/horizontalsystems/bitstashwallet/core/ILockManager;", "Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager$Listener;", "pinManager", "Lio/horizontalsystems/bitstashwallet/core/IPinManager;", "(Lio/horizontalsystems/bitstashwallet/core/IPinManager;)V", "value", "", "isLocked", "()Z", "setLocked", "(Z)V", "lockStateUpdatedSignal", "Lio/reactivex/subjects/PublishSubject;", "", "getLockStateUpdatedSignal", "()Lio/reactivex/subjects/PublishSubject;", "lockTimeout", "", "didEnterBackground", "onUnlock", "willEnterForeground", "activity", "Landroid/app/Activity;", "app_devMainnetMasterDebug"})
public final class LockManager implements io.horizontalsystems.bitstashwallet.core.ILockManager, io.horizontalsystems.bitstashwallet.core.managers.BackgroundManager.Listener {
    private final double lockTimeout = 60.0;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> lockStateUpdatedSignal = null;
    private boolean isLocked;
    private final io.horizontalsystems.bitstashwallet.core.IPinManager pinManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.PublishSubject<kotlin.Unit> getLockStateUpdatedSignal() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isLocked() {
        return false;
    }
    
    @java.lang.Override()
    public void setLocked(boolean value) {
    }
    
    @java.lang.Override()
    public void didEnterBackground() {
    }
    
    @java.lang.Override()
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onUnlock() {
    }
    
    public LockManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPinManager pinManager) {
        super();
    }
    
    public void willEnterForeground() {
    }
}