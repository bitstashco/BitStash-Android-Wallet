package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\t\u0010.\u001a\u00020\u0014H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u000eH\u00c6\u0003J\t\u00107\u001a\u00020\u000eH\u00c6\u0003J\u0097\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u00109\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020<H\u00d6\u0001J\t\u0010=\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u0006>"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionViewItem;", "", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "transactionHash", "", "coinValue", "Lio/horizontalsystems/bitstashwallet/entities/CoinValue;", "currencyValue", "Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "feeCoinValue", "from", "to", "sentToSelf", "", "showFromAddress", "incoming", "date", "Ljava/util/Date;", "status", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;", "rate", "(Lio/horizontalsystems/bitstashwallet/entities/Wallet;Ljava/lang/String;Lio/horizontalsystems/bitstashwallet/entities/CoinValue;Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;Lio/horizontalsystems/bitstashwallet/entities/CoinValue;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/Date;Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;)V", "getCoinValue", "()Lio/horizontalsystems/bitstashwallet/entities/CoinValue;", "getCurrencyValue", "()Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "getDate", "()Ljava/util/Date;", "getFeeCoinValue", "getFrom", "()Ljava/lang/String;", "getIncoming", "()Z", "getRate", "getSentToSelf", "getShowFromAddress", "getStatus", "()Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;", "getTo", "getTransactionHash", "getWallet", "()Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_devMainnetMasterDebug"})
public final class TransactionViewItem {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.entities.Wallet wallet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transactionHash = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bitstashwallet.entities.CoinValue feeCoinValue = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String from = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String to = null;
    private final boolean sentToSelf = false;
    private final boolean showFromAddress = false;
    private final boolean incoming = false;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date date = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus status = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bitstashwallet.entities.CurrencyValue rate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.Wallet getWallet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionHash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.CoinValue getCoinValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue getCurrencyValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.CoinValue getFeeCoinValue() {
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
    
    public final boolean getSentToSelf() {
        return false;
    }
    
    public final boolean getShowFromAddress() {
        return false;
    }
    
    public final boolean getIncoming() {
        return false;
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
    public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue getRate() {
        return null;
    }
    
    public TransactionViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CoinValue feeCoinValue, @org.jetbrains.annotations.Nullable()
    java.lang.String from, @org.jetbrains.annotations.Nullable()
    java.lang.String to, boolean sentToSelf, boolean showFromAddress, boolean incoming, @org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus status, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue rate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.Wallet component1() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.CoinValue component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem copy(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CoinValue feeCoinValue, @org.jetbrains.annotations.Nullable()
    java.lang.String from, @org.jetbrains.annotations.Nullable()
    java.lang.String to, boolean sentToSelf, boolean showFromAddress, boolean incoming, @org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus status, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue rate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}