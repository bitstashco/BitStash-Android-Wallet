package io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationInfo;", "Landroid/os/Parcelable;", "primaryAmount", "", "secondaryAmount", "receiver", "fee", "total", "duration", "showMemo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDuration", "()Ljava/lang/String;", "getFee", "getPrimaryAmount", "getReceiver", "getSecondaryAmount", "getShowMemo", "()Z", "getTotal", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devMainnetMasterDebug"})
public final class SendConfirmationInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String primaryAmount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String secondaryAmount = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String receiver = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String fee = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String total = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String duration = null;
    private final boolean showMemo = false;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrimaryAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecondaryAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceiver() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFee() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDuration() {
        return null;
    }
    
    public final boolean getShowMemo() {
        return false;
    }
    
    public SendConfirmationInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String primaryAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String secondaryAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String fee, @org.jetbrains.annotations.Nullable()
    java.lang.String total, @org.jetbrains.annotations.Nullable()
    java.lang.String duration, boolean showMemo) {
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