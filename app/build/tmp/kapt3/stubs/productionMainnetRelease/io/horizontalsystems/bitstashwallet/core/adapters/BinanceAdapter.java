package io.horizontalsystems.bitstashwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001DB\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ2\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201052\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b\u0018\u0001072\u0006\u00108\u001a\u00020\u001bH\u0016J\b\u00109\u001a\u00020\u0017H\u0016J(\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0017052\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\t2\b\u0010=\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010>\u001a\u00020\u0017H\u0016J\b\u0010?\u001a\u00020\u0017H\u0016J\u0010\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\tH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0016\u0010#\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0019R\u0014\u0010(\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010 R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u0010\u0019\u00a8\u0006E"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/BinanceAdapter;", "Lio/horizontalsystems/bitstashwallet/core/IAdapter;", "Lio/horizontalsystems/bitstashwallet/core/ITransactionsAdapter;", "Lio/horizontalsystems/bitstashwallet/core/IBalanceAdapter;", "Lio/horizontalsystems/bitstashwallet/core/IReceiveAdapter;", "Lio/horizontalsystems/bitstashwallet/core/ISendBinanceAdapter;", "binanceKit", "Lio/horizontalsystems/binancechainkit/BinanceChainKit;", "symbol", "", "(Lio/horizontalsystems/binancechainkit/BinanceChainKit;Ljava/lang/String;)V", "asset", "Lio/horizontalsystems/binancechainkit/core/Asset;", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "availableBinanceBalance", "getAvailableBinanceBalance", "balance", "getBalance", "balanceUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getBalanceUpdatedFlowable", "()Lio/reactivex/Flowable;", "confirmationsThreshold", "", "getConfirmationsThreshold", "()I", "debugInfo", "getDebugInfo", "()Ljava/lang/String;", "fee", "getFee", "lastBlockHeight", "getLastBlockHeight", "()Ljava/lang/Integer;", "lastBlockHeightUpdatedFlowable", "getLastBlockHeightUpdatedFlowable", "receiveAddress", "getReceiveAddress", "state", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "getState", "()Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "stateUpdatedFlowable", "getStateUpdatedFlowable", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "getTransactions", "Lio/reactivex/Single;", "from", "Lkotlin/Pair;", "limit", "refresh", "send", "amount", "address", "memo", "start", "stop", "transactionRecord", "transaction", "Lio/horizontalsystems/binancechainkit/models/TransactionInfo;", "validate", "Companion", "app_productionMainnetRelease"})
public final class BinanceAdapter implements io.horizontalsystems.bitstashwallet.core.IAdapter, io.horizontalsystems.bitstashwallet.core.ITransactionsAdapter, io.horizontalsystems.bitstashwallet.core.IBalanceAdapter, io.horizontalsystems.bitstashwallet.core.IReceiveAdapter, io.horizontalsystems.bitstashwallet.core.ISendBinanceAdapter {
    private final io.horizontalsystems.binancechainkit.core.Asset asset = null;
    private final io.horizontalsystems.binancechainkit.BinanceChainKit binanceKit = null;
    private final java.lang.String symbol = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.math.BigDecimal transferFee = null;
    public static final io.horizontalsystems.bitstashwallet.core.adapters.BinanceAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void start() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.core.AdapterState getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getStateUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getBalanceUpdatedFlowable() {
        return null;
    }
    
    @java.lang.Override()
    public int getConfirmationsThreshold() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getLastBlockHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getLastBlockHeightUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> getTransactionRecordsFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.String, java.lang.Integer> from, int limit) {
        return null;
    }
    
    private final io.horizontalsystems.bitstashwallet.entities.TransactionRecord transactionRecord(io.horizontalsystems.binancechainkit.models.TransactionInfo transaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAvailableBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAvailableBinanceBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getFee() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String memo) {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReceiveAddress() {
        return null;
    }
    
    public BinanceAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.binancechainkit.BinanceChainKit binanceKit, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/BinanceAdapter$Companion;", "", "()V", "transferFee", "Ljava/math/BigDecimal;", "getTransferFee", "()Ljava/math/BigDecimal;", "clear", "", "walletId", "", "testMode", "", "app_productionMainnetRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getTransferFee() {
            return null;
        }
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String walletId, boolean testMode) {
        }
        
        private Companion() {
            super();
        }
    }
}