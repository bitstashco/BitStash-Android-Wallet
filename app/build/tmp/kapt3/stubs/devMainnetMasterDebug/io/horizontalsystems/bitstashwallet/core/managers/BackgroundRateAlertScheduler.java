package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundRateAlertScheduler;", "Landroidx/work/RxWorker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "createWork", "Lio/reactivex/Single;", "Landroidx/work/ListenableWorker$Result;", "Companion", "app_devMainnetMasterDebug"})
public final class BackgroundRateAlertScheduler extends androidx.work.RxWorker {
    public static final io.horizontalsystems.bitstashwallet.core.managers.BackgroundRateAlertScheduler.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<androidx.work.ListenableWorker.Result> createWork() {
        return null;
    }
    
    public BackgroundRateAlertScheduler(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParams) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundRateAlertScheduler$Companion;", "", "()V", "createConstraints", "Landroidx/work/Constraints;", "createPeriodicWorkRequest", "Landroidx/work/PeriodicWorkRequest;", "startPeriodicWorker", "", "context", "Landroid/content/Context;", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        public final void startPeriodicWorker(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private final androidx.work.PeriodicWorkRequest createPeriodicWorkRequest() {
            return null;
        }
        
        private final androidx.work.Constraints createConstraints() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}