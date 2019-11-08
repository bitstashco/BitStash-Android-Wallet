package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse;", "", "data", "", "", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Data;", "(Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "Data", "Transaction", "Vin", "Vout", "app_devMainnetMasterDebug"})
public final class BlockchairBTCResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.Map<java.lang.String, io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Data> data = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Data> getData() {
        return null;
    }
    
    public BlockchairBTCResponse(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Data> data) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\"\u00a8\u0006-"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Data;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse;", "transaction", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Transaction;", "vin", "Ljava/util/ArrayList;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Vin;", "vout", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Vout;", "(Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Transaction;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "confirmations", "", "getConfirmations", "()Ljava/lang/String;", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "fee", "", "getFee", "()D", "feePerByte", "getFeePerByte", "()Ljava/lang/Double;", "hash", "getHash", "height", "", "getHeight", "()I", "inputs", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "getInputs", "()Ljava/util/ArrayList;", "outputs", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "getOutputs", "size", "getSize", "()Ljava/lang/Integer;", "getTransaction", "()Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Transaction;", "getVin", "getVout", "app_devMainnetMasterDebug"})
    public static final class Data extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String confirmations = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "transaction")
        private final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Transaction transaction = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "inputs")
        private final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Vin> vin = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "outputs")
        private final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Vout> vout = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getHash() {
            return null;
        }
        
        @java.lang.Override()
        public int getHeight() {
            return 0;
        }
        
        @java.lang.Override()
        public double getFee() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Integer getSize() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Double getFeePerByte() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getConfirmations() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Input> getInputs() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Output> getOutputs() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Date getDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Transaction getTransaction() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Vin> getVin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Vout> getVout() {
            return null;
        }
        
        public Data(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Transaction transaction, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Vin> vin, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BlockchairBTCResponse.Vout> vout) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Transaction;", "", "hash", "", "time", "size", "", "height", "fee", "(Ljava/lang/String;Ljava/lang/String;III)V", "getFee", "()I", "getHash", "()Ljava/lang/String;", "getHeight", "getSize", "getTime", "app_devMainnetMasterDebug"})
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
        @com.google.gson.annotations.SerializedName(value = "fee")
        private final int fee = 0;
        
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
        
        public final int getFee() {
            return 0;
        }
        
        public Transaction(@org.jetbrains.annotations.NotNull()
        java.lang.String hash, @org.jetbrains.annotations.NotNull()
        java.lang.String time, int size, int height, int fee) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\n\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Vin;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "amount", "", "address", "", "(DLjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAmount", "()D", "value", "getValue", "app_devMainnetMasterDebug"})
    public static final class Vin extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Input {
        @com.google.gson.annotations.SerializedName(value = "value")
        private final double amount = 0.0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "recipient")
        private final java.lang.String address = null;
        
        @java.lang.Override()
        public double getValue() {
            return 0.0;
        }
        
        public final double getAmount() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAddress() {
            return null;
        }
        
        public Vin(double amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\n\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockchairBTCResponse$Vout;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "amount", "", "address", "", "(DLjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAmount", "()D", "value", "getValue", "app_devMainnetMasterDebug"})
    public static final class Vout extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Output {
        @com.google.gson.annotations.SerializedName(value = "value")
        private final double amount = 0.0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "recipient")
        private final java.lang.String address = null;
        
        @java.lang.Override()
        public double getValue() {
            return 0.0;
        }
        
        public final double getAmount() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAddress() {
            return null;
        }
        
        public Vout(double amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            super();
        }
    }
}