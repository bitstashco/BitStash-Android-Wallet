package io.horizontalsystems.bitstashwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001HB\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0014\u00103\u001a\u000604j\u0002`52\u0006\u00106\u001a\u000207H\u0002J2\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020100092\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b\u0018\u00010;2\u0006\u0010<\u001a\u00020\u000bH\u0016J\b\u0010=\u001a\u00020\u0015H\u0016J(\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0015092\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u001c2\b\u0010A\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010B\u001a\u00020\u0015H\u0016J\b\u0010C\u001a\u00020\u0015H\u0016J\u0010\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010G\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u001cH\u0016R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0017R\u0014\u0010%\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0014\u0010\'\u001a\u00020(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u0017\u00a8\u0006I"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/EosAdapter;", "Lio/horizontalsystems/bitstashwallet/core/IAdapter;", "Lio/horizontalsystems/bitstashwallet/core/ITransactionsAdapter;", "Lio/horizontalsystems/bitstashwallet/core/IBalanceAdapter;", "Lio/horizontalsystems/bitstashwallet/core/IReceiveAdapter;", "Lio/horizontalsystems/bitstashwallet/core/ISendEosAdapter;", "eos", "Lio/horizontalsystems/bitstashwallet/entities/CoinType$Eos;", "eosKit", "Lio/horizontalsystems/eoskit/EosKit;", "decimal", "", "(Lio/horizontalsystems/bitstashwallet/entities/CoinType$Eos;Lio/horizontalsystems/eoskit/EosKit;I)V", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "balance", "getBalance", "balanceUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getBalanceUpdatedFlowable", "()Lio/reactivex/Flowable;", "confirmationsThreshold", "getConfirmationsThreshold", "()I", "debugInfo", "", "getDebugInfo", "()Ljava/lang/String;", "irreversibleThreshold", "lastBlockHeight", "getLastBlockHeight", "()Ljava/lang/Integer;", "lastBlockHeightUpdatedFlowable", "getLastBlockHeightUpdatedFlowable", "receiveAddress", "getReceiveAddress", "state", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "getState", "()Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "stateUpdatedFlowable", "getStateUpdatedFlowable", "token", "Lio/horizontalsystems/eoskit/core/Token;", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "getException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "getTransactions", "Lio/reactivex/Single;", "from", "Lkotlin/Pair;", "limit", "refresh", "send", "amount", "account", "memo", "start", "stop", "transactionRecord", "transaction", "Lio/horizontalsystems/eoskit/models/Transaction;", "validate", "Companion", "app_devMainnetMasterDebug"})
public final class EosAdapter implements io.horizontalsystems.bitstashwallet.core.IAdapter, io.horizontalsystems.bitstashwallet.core.ITransactionsAdapter, io.horizontalsystems.bitstashwallet.core.IBalanceAdapter, io.horizontalsystems.bitstashwallet.core.IReceiveAdapter, io.horizontalsystems.bitstashwallet.core.ISendEosAdapter {
    private final io.horizontalsystems.eoskit.core.Token token = null;
    private final int irreversibleThreshold = 330;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String debugInfo = "";
    private final int confirmationsThreshold = 330;
    private final io.horizontalsystems.eoskit.EosKit eosKit = null;
    private final int decimal = 0;
    public static final io.horizontalsystems.bitstashwallet.core.adapters.EosAdapter.Companion Companion = null;
    
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
    
    private final io.horizontalsystems.bitstashwallet.entities.TransactionRecord transactionRecord(io.horizontalsystems.eoskit.models.Transaction transaction) {
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
    public java.math.BigDecimal getAvailableBalance() {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String account) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String account, @org.jetbrains.annotations.Nullable()
    java.lang.String memo) {
        return null;
    }
    
    private final java.lang.Exception getException(java.lang.Throwable error) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReceiveAddress() {
        return null;
    }
    
    public EosAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinType.Eos eos, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.eoskit.EosKit eosKit, int decimal) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/EosAdapter$Companion;", "", "()V", "clear", "", "walletId", "", "testMode", "", "validatePrivateKey", "key", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String walletId, boolean testMode) {
        }
        
        public final void validatePrivateKey(@org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        private Companion() {
            super();
        }
    }
}