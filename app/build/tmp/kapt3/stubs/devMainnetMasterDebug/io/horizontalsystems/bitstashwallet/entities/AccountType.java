package io.horizontalsystems.bitstashwallet.entities;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "Landroid/os/Parcelable;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Derivation", "Eos", "HDMasterKey", "Mnemonic", "PrivateKey", "app_devMainnetMasterDebug"})
public class AccountType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public AccountType() {
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
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J/\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/AccountType$Mnemonic;", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "words", "", "", "derivation", "Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "salt", "(Ljava/util/List;Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;Ljava/lang/String;)V", "getDerivation", "()Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "getSalt", "()Ljava/lang/String;", "getWords", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devMainnetMasterDebug"})
    public static final class Mnemonic extends io.horizontalsystems.bitstashwallet.entities.AccountType {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> words = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String salt = null;
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getWords() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation getDerivation() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSalt() {
            return null;
        }
        
        public Mnemonic(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> words, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation, @org.jetbrains.annotations.Nullable()
        java.lang.String salt) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.AccountType.Mnemonic copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> words, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation, @org.jetbrains.annotations.Nullable()
        java.lang.String salt) {
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
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/AccountType$PrivateKey;", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "key", "", "([B)V", "getKey", "()[B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devMainnetMasterDebug"})
    public static final class PrivateKey extends io.horizontalsystems.bitstashwallet.entities.AccountType {
        @org.jetbrains.annotations.NotNull()
        private final byte[] key = null;
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
        public final byte[] getKey() {
            return null;
        }
        
        public PrivateKey(@org.jetbrains.annotations.NotNull()
        byte[] key) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.AccountType.PrivateKey copy(@org.jetbrains.annotations.NotNull()
        byte[] key) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
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
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/AccountType$HDMasterKey;", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "key", "", "derivation", "Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "([BLio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;)V", "getDerivation", "()Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "getKey", "()[B", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devMainnetMasterDebug"})
    public static final class HDMasterKey extends io.horizontalsystems.bitstashwallet.entities.AccountType {
        @org.jetbrains.annotations.NotNull()
        private final byte[] key = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation = null;
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
        public final byte[] getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation getDerivation() {
            return null;
        }
        
        public HDMasterKey(@org.jetbrains.annotations.NotNull()
        byte[] key, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.AccountType.HDMasterKey copy(@org.jetbrains.annotations.NotNull()
        byte[] key, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
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
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/AccountType$Eos;", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "account", "", "activePrivateKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getActivePrivateKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devMainnetMasterDebug"})
    public static final class Eos extends io.horizontalsystems.bitstashwallet.entities.AccountType {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String account = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String activePrivateKey = null;
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAccount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getActivePrivateKey() {
            return null;
        }
        
        public Eos(@org.jetbrains.annotations.NotNull()
        java.lang.String account, @org.jetbrains.annotations.NotNull()
        java.lang.String activePrivateKey) {
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
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.AccountType.Eos copy(@org.jetbrains.annotations.NotNull()
        java.lang.String account, @org.jetbrains.annotations.NotNull()
        java.lang.String activePrivateKey) {
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
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u00d6\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "bip44", "bip49", "bip84", "app_devMainnetMasterDebug"})
    public static enum Derivation implements android.os.Parcelable {
        /*public static final*/ bip44 /* = new bip44() */,
        /*public static final*/ bip49 /* = new bip49() */,
        /*public static final*/ bip84 /* = new bip84() */;
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        Derivation() {
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
}