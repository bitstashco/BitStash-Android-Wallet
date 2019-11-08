package io.horizontalsystems.bitstashwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0007J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016H\u0007J\u001a\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/storage/DatabaseConverters;", "", "()V", "decryptSecretList", "Lio/horizontalsystems/bitstashwallet/core/storage/SecretList;", "value", "", "decryptSecretString", "Lio/horizontalsystems/bitstashwallet/core/storage/SecretString;", "encryptSecretList", "secretList", "encryptSecretString", "secretString", "fromString", "Ljava/math/BigDecimal;", "toDerivation", "Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "toString", "derivation", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "bigDecimal", "", "toStringList", "toSyncMode", "string", "app_devMainnetMasterDebug"})
public final class DatabaseConverters {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.math.BigDecimal fromString(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal bigDecimal) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bitstashwallet.entities.SyncMode toSyncMode(@org.jetbrains.annotations.Nullable()
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<java.lang.String> toStringList(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation toDerivation(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bitstashwallet.core.storage.SecretString decryptSecretString(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String encryptSecretString(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretString secretString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bitstashwallet.core.storage.SecretList decryptSecretList(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String encryptSecretList(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretList secretList) {
        return null;
    }
    
    public DatabaseConverters() {
        super();
    }
}