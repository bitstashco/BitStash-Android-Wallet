package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;", "", "()V", "connectivityManager", "Landroid/net/ConnectivityManager;", "isConnected", "", "()Z", "setConnected", "(Z)V", "networkAvailabilitySignal", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getNetworkAvailabilitySignal", "()Lio/reactivex/subjects/PublishSubject;", "listenNetworkViaConnectivityManager", "onUpdateStatus", "app_productionMainnetRelease"})
public final class ConnectivityManager {
    private final android.net.ConnectivityManager connectivityManager = null;
    private boolean isConnected;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> networkAvailabilitySignal = null;
    
    public final boolean isConnected() {
        return false;
    }
    
    public final void setConnected(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<kotlin.Unit> getNetworkAvailabilitySignal() {
        return null;
    }
    
    private final void onUpdateStatus() {
    }
    
    private final void listenNetworkViaConnectivityManager() {
    }
    
    public ConnectivityManager() {
        super();
    }
}