package app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0016\u001a\u00020\bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BinanceResponse;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/FullTransactionResponse;", "()V", "blockHeight", "", "getBlockHeight", "()Ljava/lang/String;", "fee", "Ljava/math/BigDecimal;", "getFee", "()Ljava/math/BigDecimal;", "setFee", "(Ljava/math/BigDecimal;)V", "from", "getFrom", "setFrom", "(Ljava/lang/String;)V", "hash", "getHash", "to", "getTo", "setTo", "value", "getValue", "setValue", "app_productionMainnetRelease"})
public abstract class BinanceResponse implements app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.FullTransactionResponse {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getHash();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getBlockHeight();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getFee();
    
    public abstract void setFee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getValue();
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getFrom();
    
    public abstract void setFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTo();
    
    public abstract void setTo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    public BinanceResponse() {
        super();
    }
}