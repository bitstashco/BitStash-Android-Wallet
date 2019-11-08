package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\t\nB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairETHResponse;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/FullTransactionResponse;", "data", "", "", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairETHResponse$Data;", "(Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "Data", "Transaction", "app_devMainnetMasterDebug"})
public final class BlockchairETHResponse implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.FullTransactionResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.Map<java.lang.String, io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairETHResponse.Data> data = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairETHResponse.Data> getData() {
        return null;
    }
    
    public BlockchairETHResponse(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairETHResponse.Data> data) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0014\u0010\u001f\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\bR\u0014\u0010#\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\'\u001a\u00020(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*\u00a8\u0006+"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairETHResponse$Data;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/EthereumResponse;", "transaction", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairETHResponse$Transaction;", "(Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairETHResponse$Transaction;)V", "confirmations", "", "getConfirmations", "()Ljava/lang/Integer;", "contractAddress", "", "getContractAddress", "()Ljava/lang/String;", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "fee", "getFee", "from", "getFrom", "gasLimit", "getGasLimit", "gasPrice", "getGasPrice", "gasUsed", "getGasUsed", "hash", "getHash", "height", "getHeight", "nonce", "getNonce", "size", "getSize", "to", "getTo", "getTransaction", "()Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairETHResponse$Transaction;", "value", "Ljava/math/BigInteger;", "getValue", "()Ljava/math/BigInteger;", "app_devMainnetMasterDebug"})
    public static final class Data extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.EthereumResponse {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "transaction")
        private final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairETHResponse.Transaction transaction = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Integer getSize() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getHash() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getHeight() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getFee() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getTo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.math.BigInteger getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNonce() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getGasLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getGasPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getGasUsed() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Integer getConfirmations() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getContractAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Date getDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairETHResponse.Transaction getTransaction() {
            return null;
        }
        
        public Data(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairETHResponse.Transaction transaction) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0018R\u0011\u0010(\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018\u00a8\u0006+"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairETHResponse$Transaction;", "", "hash", "", "time", "size", "", "height", "fee", "gasLimit", "", "gasPrice", "gasUsed", "nonce", "value", "from", "recipient", "input", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "amount", "Ljava/math/BigInteger;", "getAmount", "()Ljava/math/BigInteger;", "getFee", "()Ljava/lang/String;", "getFrom", "getGasLimit", "()J", "getGasPrice", "getGasUsed", "getHash", "getHeight", "()I", "getInput", "getNonce", "getRecipient", "setRecipient", "(Ljava/lang/String;)V", "getSize", "getTime", "to", "getTo", "getValue", "app_devMainnetMasterDebug"})
    public static final class Transaction {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "hash")
        private final java.lang.String hash = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "time")
        private final java.lang.String time = null;
        @com.google.gson.annotations.SerializedName(value = "size")
        private final int size = 0;
        @com.google.gson.annotations.SerializedName(value = "block_id")
        private final int height = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "fee")
        private final java.lang.String fee = null;
        @com.google.gson.annotations.SerializedName(value = "gas_limit")
        private final long gasLimit = 0L;
        @com.google.gson.annotations.SerializedName(value = "gas_price")
        private final long gasPrice = 0L;
        @com.google.gson.annotations.SerializedName(value = "gas_used")
        private final long gasUsed = 0L;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "nonce")
        private final java.lang.String nonce = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "value")
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "sender")
        private final java.lang.String from = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "recipient")
        private java.lang.String recipient;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "input_hex")
        private final java.lang.String input = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigInteger getAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHash() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTime() {
            return null;
        }
        
        public final int getSize() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFee() {
            return null;
        }
        
        public final long getGasLimit() {
            return 0L;
        }
        
        public final long getGasPrice() {
            return 0L;
        }
        
        public final long getGasUsed() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNonce() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRecipient() {
            return null;
        }
        
        public final void setRecipient(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getInput() {
            return null;
        }
        
        public Transaction(@org.jetbrains.annotations.NotNull()
        java.lang.String hash, @org.jetbrains.annotations.NotNull()
        java.lang.String time, int size, int height, @org.jetbrains.annotations.NotNull()
        java.lang.String fee, long gasLimit, long gasPrice, long gasUsed, @org.jetbrains.annotations.NotNull()
        java.lang.String nonce, @org.jetbrains.annotations.NotNull()
        java.lang.String value, @org.jetbrains.annotations.NotNull()
        java.lang.String from, @org.jetbrains.annotations.NotNull()
        java.lang.String recipient, @org.jetbrains.annotations.NotNull()
        java.lang.String input) {
            super();
        }
    }
}