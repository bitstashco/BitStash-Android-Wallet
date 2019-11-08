package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0016J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0011H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010%J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0006H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010<\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0092\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010A\u001a\u00020BH\u0016J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0018\u00a8\u0006D"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionRecordViewItem;", "", "hash", "", "adapterId", "amount", "Lio/horizontalsystems/bitstashwallet/entities/CoinValue;", "fee", "from", "to", "incoming", "", "blockHeight", "", "date", "Ljava/util/Date;", "status", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;", "currencyAmount", "Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "exchangeRate", "", "(Ljava/lang/String;Ljava/lang/String;Lio/horizontalsystems/bitstashwallet/entities/CoinValue;Lio/horizontalsystems/bitstashwallet/entities/CoinValue;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/util/Date;Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;Ljava/lang/Double;)V", "getAdapterId", "()Ljava/lang/String;", "getAmount", "()Lio/horizontalsystems/bitstashwallet/entities/CoinValue;", "getBlockHeight", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrencyAmount", "()Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "setCurrencyAmount", "(Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;)V", "getDate", "()Ljava/util/Date;", "getExchangeRate", "()Ljava/lang/Double;", "setExchangeRate", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getFee", "getFrom", "getHash", "getIncoming", "()Z", "getStatus", "()Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;", "getTo", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/horizontalsystems/bitstashwallet/entities/CoinValue;Lio/horizontalsystems/bitstashwallet/entities/CoinValue;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/util/Date;Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;Ljava/lang/Double;)Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionRecordViewItem;", "equals", "other", "hashCode", "", "toString", "app_devMainnetMasterDebug"})
public final class TransactionRecordViewItem {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String hash = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String adapterId = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.entities.CoinValue amount = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.entities.CoinValue fee = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String from = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String to = null;
    private final boolean incoming = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long blockHeight = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date date = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus status = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyAmount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double exchangeRate;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdapterId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.CoinValue getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.CoinValue getFee() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTo() {
        return null;
    }
    
    public final boolean getIncoming() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getBlockHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue getCurrencyAmount() {
        return null;
    }
    
    public final void setCurrencyAmount(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getExchangeRate() {
        return null;
    }
    
    public final void setExchangeRate(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public TransactionRecordViewItem(@org.jetbrains.annotations.NotNull()
    java.lang.String hash, @org.jetbrains.annotations.NotNull()
    java.lang.String adapterId, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue amount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue fee, @org.jetbrains.annotations.Nullable()
    java.lang.String from, @org.jetbrains.annotations.Nullable()
    java.lang.String to, boolean incoming, @org.jetbrains.annotations.Nullable()
    java.lang.Long blockHeight, @org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus status, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double exchangeRate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.CoinValue component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.CoinValue component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionRecordViewItem copy(@org.jetbrains.annotations.NotNull()
    java.lang.String hash, @org.jetbrains.annotations.NotNull()
    java.lang.String adapterId, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue amount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue fee, @org.jetbrains.annotations.Nullable()
    java.lang.String from, @org.jetbrains.annotations.Nullable()
    java.lang.String to, boolean incoming, @org.jetbrains.annotations.Nullable()
    java.lang.Long blockHeight, @org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus status, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double exchangeRate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}