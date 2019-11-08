package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002/0BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010%R\u0016\u0010\u000f\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010%\u00a8\u00061"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BtcComResponse;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse;", "fees", "", "vin", "Ljava/util/ArrayList;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BtcComResponse$Vin;", "vout", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BtcComResponse$Vout;", "confirmations", "", "hash", "height", "time", "", "size", "(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;IJI)V", "getConfirmations", "()Ljava/lang/String;", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "fee", "", "getFee", "()D", "feePerByte", "getFeePerByte", "()Ljava/lang/Double;", "getFees", "()I", "getHash", "getHeight", "inputs", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "getInputs", "()Ljava/util/ArrayList;", "outputs", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "getOutputs", "getSize", "()Ljava/lang/Integer;", "getTime", "()J", "getVin", "getVout", "Vin", "Vout", "app_devMainnetMasterDebug"})
public final class BtcComResponse extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse {
    @com.google.gson.annotations.SerializedName(value = "fee")
    private final int fees = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "inputs")
    private final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BtcComResponse.Vin> vin = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "outputs")
    private final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BtcComResponse.Vout> vout = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "confirmations")
    private final java.lang.String confirmations = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "hash")
    private final java.lang.String hash = null;
    @com.google.gson.annotations.SerializedName(value = "block_height")
    private final int height = 0;
    @com.google.gson.annotations.SerializedName(value = "block_time")
    private final long time = 0L;
    @com.google.gson.annotations.SerializedName(value = "size")
    private final int size = 0;
    
    @java.lang.Override()
    public double getFee() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Double getFeePerByte() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Date getDate() {
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
    
    public final int getFees() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BtcComResponse.Vin> getVin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BtcComResponse.Vout> getVout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getConfirmations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getHash() {
        return null;
    }
    
    @java.lang.Override()
    public int getHeight() {
        return 0;
    }
    
    public final long getTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Integer getSize() {
        return null;
    }
    
    public BtcComResponse(int fees, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BtcComResponse.Vin> vin, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BtcComResponse.Vout> vout, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmations, @org.jetbrains.annotations.NotNull()
    java.lang.String hash, int height, long time, int size) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BtcComResponse$Vin;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "amount", "", "addresses", "Ljava/util/ArrayList;", "", "(JLjava/util/ArrayList;)V", "address", "getAddress", "()Ljava/lang/String;", "getAddresses", "()Ljava/util/ArrayList;", "getAmount", "()J", "value", "", "getValue", "()D", "app_devMainnetMasterDebug"})
    public static final class Vin extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Input {
        @com.google.gson.annotations.SerializedName(value = "prev_value")
        private final long amount = 0L;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "prev_addresses")
        private final java.util.ArrayList<java.lang.String> addresses = null;
        
        @java.lang.Override()
        public double getValue() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAddress() {
            return null;
        }
        
        public final long getAmount() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getAddresses() {
            return null;
        }
        
        public Vin(long amount, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> addresses) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BtcComResponse$Vout;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "amount", "", "addresses", "Ljava/util/ArrayList;", "", "(DLjava/util/ArrayList;)V", "address", "getAddress", "()Ljava/lang/String;", "getAddresses", "()Ljava/util/ArrayList;", "getAmount", "()D", "value", "getValue", "app_devMainnetMasterDebug"})
    public static final class Vout extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Output {
        @com.google.gson.annotations.SerializedName(value = "value")
        private final double amount = 0.0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "addresses")
        private final java.util.ArrayList<java.lang.String> addresses = null;
        
        @java.lang.Override()
        public double getValue() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAddress() {
            return null;
        }
        
        public final double getAmount() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getAddresses() {
            return null;
        }
        
        public Vout(double amount, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> addresses) {
            super();
        }
    }
}