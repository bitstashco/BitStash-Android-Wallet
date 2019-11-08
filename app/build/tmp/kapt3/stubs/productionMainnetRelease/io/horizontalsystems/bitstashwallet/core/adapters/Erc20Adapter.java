package io.horizontalsystems.bitstashwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 22\u00020\u0001:\u00012B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\rH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010&\u001a\u00020\rH\u0016J2\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0(2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0007H\u0016J&\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140(2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\rH\u0016J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u000201H\u0002R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0016R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0016\u00a8\u00063"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/Erc20Adapter;", "Lio/horizontalsystems/bitstashwallet/core/adapters/EthereumBaseAdapter;", "context", "Landroid/content/Context;", "kit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "decimal", "", "fee", "Ljava/math/BigDecimal;", "contractAddress", "", "gasLimit", "", "(Landroid/content/Context;Lio/horizontalsystems/ethereumkit/core/EthereumKit;ILjava/math/BigDecimal;Ljava/lang/String;J)V", "balance", "getBalance", "()Ljava/math/BigDecimal;", "balanceUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getBalanceUpdatedFlowable", "()Lio/reactivex/Flowable;", "erc20Kit", "Lio/horizontalsystems/erc20kit/core/Erc20Kit;", "ethereumBalance", "getEthereumBalance", "state", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "getState", "()Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "stateUpdatedFlowable", "getStateUpdatedFlowable", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "availableBalance", "gasPrice", "getTransactions", "Lio/reactivex/Single;", "from", "Lkotlin/Pair;", "limit", "sendSingle", "address", "amount", "transactionRecord", "transaction", "Lio/horizontalsystems/erc20kit/models/TransactionInfo;", "Companion", "app_productionMainnetRelease"})
public final class Erc20Adapter extends io.horizontalsystems.bitstashwallet.core.adapters.EthereumBaseAdapter {
    private final io.horizontalsystems.erc20kit.core.Erc20Kit erc20Kit = null;
    private final java.math.BigDecimal fee = null;
    public static final io.horizontalsystems.bitstashwallet.core.adapters.Erc20Adapter.Companion Companion = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> sendSingle(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String amount, long gasPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal availableBalance(long gasPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getEthereumBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal fee(long gasPrice) {
        return null;
    }
    
    private final io.horizontalsystems.bitstashwallet.entities.TransactionRecord transactionRecord(io.horizontalsystems.erc20kit.models.TransactionInfo transaction) {
        return null;
    }
    
    public Erc20Adapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit kit, int decimal, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal fee, @org.jetbrains.annotations.NotNull()
    java.lang.String contractAddress, long gasLimit) {
        super(null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/Erc20Adapter$Companion;", "", "()V", "clear", "", "walletId", "", "testMode", "", "app_productionMainnetRelease"})
    public static final class Companion {
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String walletId, boolean testMode) {
        }
        
        private Companion() {
            super();
        }
    }
}