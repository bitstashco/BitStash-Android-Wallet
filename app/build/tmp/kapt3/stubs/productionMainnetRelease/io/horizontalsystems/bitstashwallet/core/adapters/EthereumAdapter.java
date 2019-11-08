package io.horizontalsystems.bitstashwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J2\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001f2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!2\u0006\u0010$\u001a\u00020#H\u0016J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0006\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\rR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\r\u00a8\u0006,"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/EthereumAdapter;", "Lio/horizontalsystems/bitstashwallet/core/adapters/EthereumBaseAdapter;", "kit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "(Lio/horizontalsystems/ethereumkit/core/EthereumKit;)V", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "balanceUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getBalanceUpdatedFlowable", "()Lio/reactivex/Flowable;", "ethereumBalance", "getEthereumBalance", "state", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "getState", "()Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "stateUpdatedFlowable", "getStateUpdatedFlowable", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "availableBalance", "gasPrice", "", "fee", "getTransactions", "Lio/reactivex/Single;", "from", "Lkotlin/Pair;", "", "", "limit", "sendSingle", "address", "amount", "transactionRecord", "transaction", "Lio/horizontalsystems/ethereumkit/models/TransactionInfo;", "Companion", "app_productionMainnetRelease"})
public final class EthereumAdapter extends io.horizontalsystems.bitstashwallet.core.adapters.EthereumBaseAdapter {
    public static final int decimal = 18;
    public static final io.horizontalsystems.bitstashwallet.core.adapters.EthereumAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> sendSingle(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String amount, long gasPrice) {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.String, java.lang.Integer> from, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> getTransactionRecordsFlowable() {
        return null;
    }
    
    private final io.horizontalsystems.bitstashwallet.entities.TransactionRecord transactionRecord(io.horizontalsystems.ethereumkit.models.TransactionInfo transaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getEthereumBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal availableBalance(long gasPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal fee(long gasPrice) {
        return null;
    }
    
    public EthereumAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit kit) {
        super(null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/EthereumAdapter$Companion;", "", "()V", "decimal", "", "clear", "", "walletId", "", "testMode", "", "app_productionMainnetRelease"})
    public static final class Companion {
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String walletId, boolean testMode) {
        }
        
        private Companion() {
            super();
        }
    }
}