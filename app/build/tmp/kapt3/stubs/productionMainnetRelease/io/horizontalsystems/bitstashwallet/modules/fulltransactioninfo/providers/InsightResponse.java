package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002./BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u00a2\u0006\u0002\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010#R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b\'\u0010(R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010#\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/InsightResponse;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse;", "hash", "", "height", "", "size", "fee", "", "confirmations", "time", "", "vin", "Ljava/util/ArrayList;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/InsightResponse$Vin;", "vout", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/InsightResponse$Vout;", "(Ljava/lang/String;ILjava/lang/Integer;DLjava/lang/String;JLjava/util/ArrayList;Ljava/util/ArrayList;)V", "getConfirmations", "()Ljava/lang/String;", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "getFee", "()D", "feePerByte", "getFeePerByte", "()Ljava/lang/Double;", "getHash", "getHeight", "()I", "inputs", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "getInputs", "()Ljava/util/ArrayList;", "outputs", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "getOutputs", "getSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTime", "()J", "getVin", "getVout", "Vin", "Vout", "app_productionMainnetRelease"})
public final class InsightResponse extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "txid")
    private final java.lang.String hash = null;
    @com.google.gson.annotations.SerializedName(value = "blockheight")
    private final int height = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "size")
    private final java.lang.Integer size = null;
    @com.google.gson.annotations.SerializedName(value = "fees")
    private final double fee = 0.0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "confirmations")
    private final java.lang.String confirmations = null;
    @com.google.gson.annotations.SerializedName(value = "time")
    private final long time = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "vin")
    private final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.InsightResponse.Vin> vin = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "vout")
    private final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.InsightResponse.Vout> vout = null;
    
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Double getFeePerByte() {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getSize() {
        return null;
    }
    
    @java.lang.Override()
    public double getFee() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getConfirmations() {
        return null;
    }
    
    public final long getTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.InsightResponse.Vin> getVin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.InsightResponse.Vout> getVout() {
        return null;
    }
    
    public InsightResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String hash, int height, @org.jetbrains.annotations.Nullable()
    java.lang.Integer size, double fee, @org.jetbrains.annotations.Nullable()
    java.lang.String confirmations, long time, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.InsightResponse.Vin> vin, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.InsightResponse.Vout> vout) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/InsightResponse$Vin;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "value", "", "address", "", "(DLjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getValue", "()D", "app_productionMainnetRelease"})
    public static final class Vin extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Input {
        @com.google.gson.annotations.SerializedName(value = "value")
        private final double value = 0.0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "addr")
        private final java.lang.String address = null;
        
        @java.lang.Override()
        public double getValue() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAddress() {
            return null;
        }
        
        public Vin(double value, @org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/InsightResponse$Vout;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "value", "", "scriptPubKey", "", "", "", "(DLjava/util/Map;)V", "address", "getAddress", "()Ljava/lang/String;", "getScriptPubKey", "()Ljava/util/Map;", "getValue", "()D", "app_productionMainnetRelease"})
    public static final class Vout extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Output {
        @com.google.gson.annotations.SerializedName(value = "value")
        private final double value = 0.0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "scriptPubKey")
        private final java.util.Map<java.lang.String, java.lang.Object> scriptPubKey = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAddress() {
            return null;
        }
        
        @java.lang.Override()
        public double getValue() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.Object> getScriptPubKey() {
            return null;
        }
        
        public Vout(double value, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.lang.Object> scriptPubKey) {
            super();
        }
    }
}