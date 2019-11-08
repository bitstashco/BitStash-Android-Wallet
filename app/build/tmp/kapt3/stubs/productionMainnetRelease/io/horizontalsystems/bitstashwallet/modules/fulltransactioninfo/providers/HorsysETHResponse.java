package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011R\u0016\u0010!\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0011R\u0014\u0010%\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0011R\u0016\u0010(\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0011R\u0016\u0010+\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0011R\u0014\u0010.\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0011R\u0014\u00100\u001a\u0002018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0011\u00a8\u00065"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/HorsysETHResponse;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/EthereumResponse;", "time", "", "gNonce", "valueString", "blockNumber", "confirmationsString", "hash", "from", "receiver", "fee", "input", "gasLimit", "gasUsed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBlockNumber", "()Ljava/lang/String;", "confirmations", "", "getConfirmations", "()Ljava/lang/Integer;", "getConfirmationsString", "contractAddress", "getContractAddress", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "getFee", "getFrom", "getGNonce", "getGasLimit", "gasPrice", "getGasPrice", "getGasUsed", "getHash", "height", "getHeight", "getInput", "nonce", "getNonce", "getReceiver", "size", "getSize", "getTime", "to", "getTo", "value", "Ljava/math/BigInteger;", "getValue", "()Ljava/math/BigInteger;", "getValueString", "app_productionMainnetRelease"})
public final class HorsysETHResponse extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.EthereumResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "timeStamp")
    private final java.lang.String time = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nonce")
    private final java.lang.String gNonce = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "value")
    private final java.lang.String valueString = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "blockNumber")
    private final java.lang.String blockNumber = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "confirmations")
    private final java.lang.String confirmationsString = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "hash")
    private final java.lang.String hash = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "from")
    private final java.lang.String from = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "to")
    private final java.lang.String receiver = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fee")
    private final java.lang.String fee = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "input")
    private final java.lang.String input = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "gasLimit")
    private final java.lang.String gasLimit = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "gasUsed")
    private final java.lang.String gasUsed = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getContractAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Date getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getConfirmations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getGasPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigInteger getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getNonce() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGNonce() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValueString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlockNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConfirmationsString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getHash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceiver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFee() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getGasLimit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getGasUsed() {
        return null;
    }
    
    public HorsysETHResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String time, @org.jetbrains.annotations.Nullable()
    java.lang.String gNonce, @org.jetbrains.annotations.NotNull()
    java.lang.String valueString, @org.jetbrains.annotations.NotNull()
    java.lang.String blockNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String confirmationsString, @org.jetbrains.annotations.NotNull()
    java.lang.String hash, @org.jetbrains.annotations.NotNull()
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    java.lang.String receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String fee, @org.jetbrains.annotations.NotNull()
    java.lang.String input, @org.jetbrains.annotations.NotNull()
    java.lang.String gasLimit, @org.jetbrains.annotations.NotNull()
    java.lang.String gasUsed) {
        super();
    }
}