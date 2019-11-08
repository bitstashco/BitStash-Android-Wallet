package io.horizontalsystems.bitstashwallet.entities;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"coinCode", "accountId"}, foreignKeys = {@androidx.room.ForeignKey(entity = io.horizontalsystems.bitstashwallet.core.storage.AccountRecord.class, childColumns = {"accountId"}, deferred = true, onUpdate = 5, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/EnabledWallet;", "", "coinCode", "", "accountId", "walletOrder", "", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lio/horizontalsystems/bitstashwallet/entities/SyncMode;)V", "getAccountId", "()Ljava/lang/String;", "getCoinCode", "getSyncMode", "()Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "getWalletOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lio/horizontalsystems/bitstashwallet/entities/SyncMode;)Lio/horizontalsystems/bitstashwallet/entities/EnabledWallet;", "equals", "", "other", "hashCode", "toString", "app_productionMainnetRelease"})
public final class EnabledWallet {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String accountId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer walletOrder = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWalletOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.SyncMode getSyncMode() {
        return null;
    }
    
    public EnabledWallet(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer walletOrder, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.SyncMode component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.EnabledWallet copy(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer walletOrder, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}