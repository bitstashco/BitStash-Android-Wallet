package app.odapplications.bitstashwallet.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0000H\u0096\u0002J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003Jx\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u0010#\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u00020\u0005H\u0016J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001b\u00a8\u00064"}, d2 = {"Lapp/odapplications/bitstashwallet/entities/TransactionRecord;", "", "transactionHash", "", "transactionIndex", "", "interTransactionIndex", "blockHeight", "", "amount", "Ljava/math/BigDecimal;", "fee", "timestamp", "from", "", "Lapp/odapplications/bitstashwallet/entities/TransactionAddress;", "to", "(Ljava/lang/String;IILjava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;JLjava/util/List;Ljava/util/List;)V", "getAmount", "()Ljava/math/BigDecimal;", "getBlockHeight", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFee", "getFrom", "()Ljava/util/List;", "getInterTransactionIndex", "()I", "getTimestamp", "()J", "getTo", "getTransactionHash", "()Ljava/lang/String;", "getTransactionIndex", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;IILjava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;JLjava/util/List;Ljava/util/List;)Lapp/odapplications/bitstashwallet/entities/TransactionRecord;", "equals", "", "", "hashCode", "toString", "app_productionMainnetRelease"})
public final class TransactionRecord implements java.lang.Comparable<app.odapplications.bitstashwallet.entities.TransactionRecord> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transactionHash = null;
    private final int transactionIndex = 0;
    private final int interTransactionIndex = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long blockHeight = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal amount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.math.BigDecimal fee = null;
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> from = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> to = null;
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.TransactionRecord other) {
        return 0;
    }
    
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
    public final java.lang.String getTransactionHash() {
        return null;
    }
    
    public final int getTransactionIndex() {
        return 0;
    }
    
    public final int getInterTransactionIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getBlockHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getFee() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> getFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> getTo() {
        return null;
    }
    
    public TransactionRecord(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, int transactionIndex, int interTransactionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Long blockHeight, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal fee, long timestamp, @org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> from, @org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> to) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal component6() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.TransactionRecord copy(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, int transactionIndex, int interTransactionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Long blockHeight, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal fee, long timestamp, @org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> from, @org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.TransactionAddress> to) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}