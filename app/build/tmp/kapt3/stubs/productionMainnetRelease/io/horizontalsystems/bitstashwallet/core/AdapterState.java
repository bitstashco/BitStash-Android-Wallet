package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "", "()V", "NotReady", "NotSynced", "Synced", "Syncing", "Lio/horizontalsystems/bitstashwallet/core/AdapterState$Synced;", "Lio/horizontalsystems/bitstashwallet/core/AdapterState$Syncing;", "Lio/horizontalsystems/bitstashwallet/core/AdapterState$NotSynced;", "Lio/horizontalsystems/bitstashwallet/core/AdapterState$NotReady;", "app_productionMainnetRelease"})
public abstract class AdapterState {
    
    private AdapterState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/AdapterState$Synced;", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "()V", "app_productionMainnetRelease"})
    public static final class Synced extends io.horizontalsystems.bitstashwallet.core.AdapterState {
        public static final io.horizontalsystems.bitstashwallet.core.AdapterState.Synced INSTANCE = null;
        
        private Synced() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/AdapterState$Syncing;", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "progress", "", "lastBlockDate", "Ljava/util/Date;", "(ILjava/util/Date;)V", "getLastBlockDate", "()Ljava/util/Date;", "getProgress", "()I", "app_productionMainnetRelease"})
    public static final class Syncing extends io.horizontalsystems.bitstashwallet.core.AdapterState {
        private final int progress = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Date lastBlockDate = null;
        
        public final int getProgress() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date getLastBlockDate() {
            return null;
        }
        
        public Syncing(int progress, @org.jetbrains.annotations.Nullable()
        java.util.Date lastBlockDate) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/AdapterState$NotSynced;", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "()V", "app_productionMainnetRelease"})
    public static final class NotSynced extends io.horizontalsystems.bitstashwallet.core.AdapterState {
        public static final io.horizontalsystems.bitstashwallet.core.AdapterState.NotSynced INSTANCE = null;
        
        private NotSynced() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/AdapterState$NotReady;", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "()V", "app_productionMainnetRelease"})
    public static final class NotReady extends io.horizontalsystems.bitstashwallet.core.AdapterState {
        public static final io.horizontalsystems.bitstashwallet.core.AdapterState.NotReady INSTANCE = null;
        
        private NotReady() {
            super();
        }
    }
}