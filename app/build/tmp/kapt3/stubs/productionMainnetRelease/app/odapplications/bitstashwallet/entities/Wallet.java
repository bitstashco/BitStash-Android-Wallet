package app.odapplications.bitstashwallet.entities;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lapp/odapplications/bitstashwallet/entities/Wallet;", "Landroid/os/Parcelable;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "account", "Lapp/odapplications/bitstashwallet/entities/Account;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "(Lapp/odapplications/bitstashwallet/entities/Coin;Lapp/odapplications/bitstashwallet/entities/Account;Lapp/odapplications/bitstashwallet/entities/SyncMode;)V", "getAccount", "()Lapp/odapplications/bitstashwallet/entities/Account;", "getCoin", "()Lapp/odapplications/bitstashwallet/entities/Coin;", "getSyncMode", "()Lapp/odapplications/bitstashwallet/entities/SyncMode;", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionMainnetRelease"})
public final class Wallet implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.entities.Coin coin = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.entities.Account account = null;
    @org.jetbrains.annotations.Nullable()
    private final app.odapplications.bitstashwallet.entities.SyncMode syncMode = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.Coin getCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.Account getAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.entities.SyncMode getSyncMode() {
        return null;
    }
    
    public Wallet(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Account account, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.SyncMode syncMode) {
        super();
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
}