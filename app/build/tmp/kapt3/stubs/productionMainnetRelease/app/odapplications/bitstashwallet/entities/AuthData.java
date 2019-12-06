package app.odapplications.bitstashwallet.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001a\u001a\u00020\u0004H\u0016R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lapp/odapplications/bitstashwallet/entities/AuthData;", "", "words", "", "", "walletId", "(Ljava/util/List;Ljava/lang/String;)V", "serialized", "(Ljava/lang/String;)V", "partsSeparator", "seed", "", "getSeed", "()[B", "setSeed", "([B)V", "version", "", "getWalletId", "()Ljava/lang/String;", "setWalletId", "getWords", "()Ljava/util/List;", "setWords", "(Ljava/util/List;)V", "wordsSeparator", "toString", "app_productionMainnetRelease"})
public final class AuthData {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> words;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String walletId;
    @org.jetbrains.annotations.NotNull()
    private byte[] seed;
    private int version;
    private final java.lang.String wordsSeparator = " ";
    private final java.lang.String partsSeparator = "|";
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getWords() {
        return null;
    }
    
    public final void setWords(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletId() {
        return null;
    }
    
    public final void setWalletId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getSeed() {
        return null;
    }
    
    public final void setSeed(@org.jetbrains.annotations.NotNull()
    byte[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AuthData(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words, @org.jetbrains.annotations.NotNull()
    java.lang.String walletId) {
        super();
    }
    
    public AuthData(@org.jetbrains.annotations.NotNull()
    java.lang.String serialized) {
        super();
    }
}