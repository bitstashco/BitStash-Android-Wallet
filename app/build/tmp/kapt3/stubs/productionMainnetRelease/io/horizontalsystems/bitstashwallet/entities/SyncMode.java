package io.horizontalsystems.bitstashwallet.entities;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "", "Landroid/os/Parcelable;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "FAST", "SLOW", "NEW", "Companion", "app_productionMainnetRelease"})
public enum SyncMode implements android.os.Parcelable {
    /*public static final*/ FAST /* = new FAST(null) */,
    /*public static final*/ SLOW /* = new SLOW(null) */,
    /*public static final*/ NEW /* = new NEW(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    private static final java.util.Map<java.lang.String, io.horizontalsystems.bitstashwallet.entities.SyncMode> map = null;
    public static final io.horizontalsystems.bitstashwallet.entities.SyncMode.Companion Companion = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    SyncMode(java.lang.String value) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/SyncMode$Companion;", "", "()V", "map", "", "", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "fromString", "type", "fromSyncMode", "Lio/horizontalsystems/bitcoincore/BitcoinCore$SyncMode;", "mode", "app_productionMainnetRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bitstashwallet.entities.SyncMode fromString(@org.jetbrains.annotations.Nullable()
        java.lang.String type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitcoincore.BitcoinCore.SyncMode fromSyncMode(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.entities.SyncMode mode) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}