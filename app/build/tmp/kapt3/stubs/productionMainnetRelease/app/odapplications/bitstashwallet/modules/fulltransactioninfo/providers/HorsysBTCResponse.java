package app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003123BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0010R\u0016\u0010\u000f\u001a\u00020\r8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\r8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010%R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010*\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%\u00a8\u00064"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBTCResponse;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse;", "fees", "", "time", "", "rate", "vin", "Ljava/util/ArrayList;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBTCResponse$Vin;", "vout", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBTCResponse$Vout;", "hash", "", "height", "confirmations", "(IJILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;ILjava/lang/String;)V", "getConfirmations", "()Ljava/lang/String;", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "fee", "", "getFee", "()D", "feePerByte", "getFeePerByte", "()Ljava/lang/Double;", "getFees", "()I", "getHash", "getHeight", "inputs", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "getInputs", "()Ljava/util/ArrayList;", "outputs", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "getOutputs", "getRate", "size", "getSize", "()Ljava/lang/Integer;", "getTime", "()J", "getVin", "getVout", "BCoin", "Vin", "Vout", "app_productionMainnetRelease"})
public final class HorsysBTCResponse extends app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse {
    @com.google.gson.annotations.SerializedName(value = "fee")
    private final int fees = 0;
    @com.google.gson.annotations.SerializedName(value = "time")
    private final long time = 0L;
    @com.google.gson.annotations.SerializedName(value = "rate")
    private final int rate = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "inputs")
    private final java.util.ArrayList<app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.HorsysBTCResponse.Vin> vin = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "outputs")
    private final java.util.ArrayList<app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.HorsysBTCResponse.Vout> vout = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "hash")
    private final java.lang.String hash = null;
    @com.google.gson.annotations.SerializedName(value = "height")
    private final int height = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "confirmations")
    private final java.lang.String confirmations = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Date getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Input> getInputs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Output> getOutputs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Double getFeePerByte() {
        return null;
    }
    
    @java.lang.Override()
    public double getFee() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getSize() {
        return null;
    }
    
    public final int getFees() {
        return 0;
    }
    
    public final long getTime() {
        return 0L;
    }
    
    public final int getRate() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.HorsysBTCResponse.Vin> getVin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.HorsysBTCResponse.Vout> getVout() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getConfirmations() {
        return null;
    }
    
    public HorsysBTCResponse(int fees, long time, int rate, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.HorsysBTCResponse.Vin> vin, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.HorsysBTCResponse.Vout> vout, @org.jetbrains.annotations.NotNull()
    java.lang.String hash, int height, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmations) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBTCResponse$Vin;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "coin", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBTCResponse$BCoin;", "(Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBTCResponse$BCoin;)V", "address", "", "getAddress", "()Ljava/lang/String;", "getCoin", "()Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBTCResponse$BCoin;", "value", "", "getValue", "()D", "app_productionMainnetRelease"})
    public static final class Vin extends app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Input {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "coin")
        private final app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.HorsysBTCResponse.BCoin coin = null;
        
        @java.lang.Override()
        public double getValue() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.HorsysBTCResponse.BCoin getCoin() {
            return null;
        }
        
        public Vin(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.HorsysBTCResponse.BCoin coin) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBTCResponse$Vout;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "amount", "", "addr", "", "(ILjava/lang/String;)V", "getAddr", "()Ljava/lang/String;", "address", "getAddress", "getAmount", "()I", "value", "", "getValue", "()D", "app_productionMainnetRelease"})
    public static final class Vout extends app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Output {
        @com.google.gson.annotations.SerializedName(value = "value")
        private final int amount = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "address")
        private final java.lang.String addr = null;
        
        @java.lang.Override()
        public double getValue() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAddress() {
            return null;
        }
        
        public final int getAmount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddr() {
            return null;
        }
        
        public Vout(int amount, @org.jetbrains.annotations.NotNull()
        java.lang.String addr) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBTCResponse$BCoin;", "", "amount", "", "addr", "", "(ILjava/lang/String;)V", "getAddr", "()Ljava/lang/String;", "getAmount", "()I", "app_productionMainnetRelease"})
    public static final class BCoin {
        @com.google.gson.annotations.SerializedName(value = "value")
        private final int amount = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "address")
        private final java.lang.String addr = null;
        
        public final int getAmount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddr() {
            return null;
        }
        
        public BCoin(int amount, @org.jetbrains.annotations.NotNull()
        java.lang.String addr) {
            super();
        }
    }
}