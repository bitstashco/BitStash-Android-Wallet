package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0012\u0010\u0014\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u0004\u0018\u00010\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/FullTransactionResponse;", "()V", "confirmations", "", "getConfirmations", "()Ljava/lang/String;", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "fee", "", "getFee", "()D", "feePerByte", "getFeePerByte", "()Ljava/lang/Double;", "hash", "getHash", "height", "", "getHeight", "()I", "inputs", "Ljava/util/ArrayList;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "getInputs", "()Ljava/util/ArrayList;", "outputs", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "getOutputs", "size", "getSize", "()Ljava/lang/Integer;", "Companion", "Input", "Output", "app_devMainnetMasterDebug"})
public abstract class BitcoinResponse implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.FullTransactionResponse {
    public static final double btcRate = 1.0E8;
    public static final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getHash();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Date getDate();
    
    public abstract int getHeight();
    
    public abstract double getFee();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getSize();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Double getFeePerByte();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getConfirmations();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Input> getInputs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse.Output> getOutputs();
    
    public BitcoinResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Input;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "value", "", "getValue", "()D", "app_devMainnetMasterDebug"})
    public static abstract class Input {
        
        public abstract double getValue();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getAddress();
        
        public Input() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Output;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "value", "", "getValue", "()D", "app_devMainnetMasterDebug"})
    public static abstract class Output {
        
        public abstract double getValue();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getAddress();
        
        public Output() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse$Companion;", "", "()V", "btcRate", "", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}