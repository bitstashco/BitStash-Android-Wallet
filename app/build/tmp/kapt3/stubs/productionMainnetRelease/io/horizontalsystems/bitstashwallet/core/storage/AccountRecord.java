package io.horizontalsystems.bitstashwallet.core.storage;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"id"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003Jy\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010@\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010B\u001a\u00020CH\u0016J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001d\"\u0004\b(\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u00a8\u0006E"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/storage/AccountRecord;", "", "id", "", "name", "type", "isBackedUp", "", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "words", "Lio/horizontalsystems/bitstashwallet/core/storage/SecretList;", "derivation", "Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "salt", "Lio/horizontalsystems/bitstashwallet/core/storage/SecretString;", "key", "eosAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/horizontalsystems/bitstashwallet/entities/SyncMode;Lio/horizontalsystems/bitstashwallet/core/storage/SecretList;Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;Lio/horizontalsystems/bitstashwallet/core/storage/SecretString;Lio/horizontalsystems/bitstashwallet/core/storage/SecretString;Ljava/lang/String;)V", "deleted", "getDeleted", "()Z", "setDeleted", "(Z)V", "getDerivation", "()Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;", "setDerivation", "(Lio/horizontalsystems/bitstashwallet/entities/AccountType$Derivation;)V", "getEosAccount", "()Ljava/lang/String;", "setEosAccount", "(Ljava/lang/String;)V", "getId", "setId", "setBackedUp", "getKey", "()Lio/horizontalsystems/bitstashwallet/core/storage/SecretString;", "setKey", "(Lio/horizontalsystems/bitstashwallet/core/storage/SecretString;)V", "getName", "setName", "getSalt", "setSalt", "getSyncMode", "()Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "setSyncMode", "(Lio/horizontalsystems/bitstashwallet/entities/SyncMode;)V", "getType", "setType", "getWords", "()Lio/horizontalsystems/bitstashwallet/core/storage/SecretList;", "setWords", "(Lio/horizontalsystems/bitstashwallet/core/storage/SecretList;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_productionMainnetRelease"})
public final class AccountRecord {
    private boolean deleted;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    private boolean isBackedUp;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.core.storage.SecretList words;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.core.storage.SecretString salt;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.core.storage.SecretString key;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String eosAccount;
    
    public final boolean getDeleted() {
        return false;
    }
    
    public final void setDeleted(boolean p0) {
    }
    
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
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isBackedUp() {
        return false;
    }
    
    public final void setBackedUp(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.SyncMode getSyncMode() {
        return null;
    }
    
    public final void setSyncMode(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.core.storage.SecretList getWords() {
        return null;
    }
    
    public final void setWords(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretList p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation getDerivation() {
        return null;
    }
    
    public final void setDerivation(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.core.storage.SecretString getSalt() {
        return null;
    }
    
    public final void setSalt(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretString p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.core.storage.SecretString getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretString p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEosAccount() {
        return null;
    }
    
    public final void setEosAccount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public AccountRecord(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String type, boolean isBackedUp, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretList words, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretString salt, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretString key, @org.jetbrains.annotations.Nullable()
    java.lang.String eosAccount) {
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
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.SyncMode component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.core.storage.SecretList component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.core.storage.SecretString component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.core.storage.SecretString component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.core.storage.AccountRecord copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String type, boolean isBackedUp, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretList words, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.AccountType.Derivation derivation, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretString salt, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.core.storage.SecretString key, @org.jetbrains.annotations.Nullable()
    java.lang.String eosAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}