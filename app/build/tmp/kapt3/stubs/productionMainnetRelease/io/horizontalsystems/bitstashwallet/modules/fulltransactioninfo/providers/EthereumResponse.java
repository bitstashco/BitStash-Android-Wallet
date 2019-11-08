package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0012\u0010\u0011\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0012\u0010\u0013\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0012\u0010\u0019\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0012\u0010\u001b\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0012\u0010!\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\nR\u0012\u0010#\u001a\u00020$X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u0006("}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/EthereumResponse;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/FullTransactionResponse;", "()V", "confirmations", "", "getConfirmations", "()Ljava/lang/Integer;", "contractAddress", "", "getContractAddress", "()Ljava/lang/String;", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "fee", "getFee", "from", "getFrom", "gasLimit", "getGasLimit", "gasPrice", "getGasPrice", "gasUsed", "getGasUsed", "hash", "getHash", "height", "getHeight", "nonce", "getNonce", "size", "getSize", "to", "getTo", "value", "Ljava/math/BigInteger;", "getValue", "()Ljava/math/BigInteger;", "Companion", "app_productionMainnetRelease"})
public abstract class EthereumResponse implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.FullTransactionResponse {
    public static final double ethRate = 1.0E18;
    public static final double gweiRate = 1.0E9;
    public static final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.EthereumResponse.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getHash();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Date getDate();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getConfirmations();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getHeight();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getSize();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getGasPrice();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getGasUsed();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getGasLimit();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getFee();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigInteger getValue();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getNonce();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getFrom();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTo();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getContractAddress();
    
    public EthereumResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/EthereumResponse$Companion;", "", "()V", "ethRate", "", "gweiRate", "app_productionMainnetRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}