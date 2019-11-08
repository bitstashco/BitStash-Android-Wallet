package io.horizontalsystems.bitstashwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001JB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u001cJ \u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u001cJ\b\u0010A\u001a\u00020\nH\u0016J$\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0C2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020=J\b\u0010D\u001a\u00020\nH\u0016J\b\u0010E\u001a\u00020\nH\u0016J\u000e\u0010F\u001a\u0002072\u0006\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\fR\u0014\u0010(\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u001eR\u0012\u0010*\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0010R$\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020-@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u0010\u0014R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000207060\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u0014R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000207060\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\f\u00a8\u0006K"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/BitcoinBaseAdapter;", "Lio/horizontalsystems/bitstashwallet/core/IAdapter;", "Lio/horizontalsystems/bitstashwallet/core/ITransactionsAdapter;", "Lio/horizontalsystems/bitstashwallet/core/IBalanceAdapter;", "Lio/horizontalsystems/bitstashwallet/core/IReceiveAdapter;", "kit", "Lio/horizontalsystems/bitcoincore/AbstractKit;", "(Lio/horizontalsystems/bitcoincore/AbstractKit;)V", "adapterStateUpdatedSubject", "Lio/reactivex/subjects/PublishSubject;", "", "getAdapterStateUpdatedSubject", "()Lio/reactivex/subjects/PublishSubject;", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "balanceUpdatedFlowable", "Lio/reactivex/Flowable;", "getBalanceUpdatedFlowable", "()Lio/reactivex/Flowable;", "balanceUpdatedSubject", "getBalanceUpdatedSubject", "confirmationsThreshold", "", "getConfirmationsThreshold", "()I", "debugInfo", "", "getDebugInfo", "()Ljava/lang/String;", "getKit", "()Lio/horizontalsystems/bitcoincore/AbstractKit;", "lastBlockHeight", "getLastBlockHeight", "()Ljava/lang/Integer;", "lastBlockHeightUpdatedFlowable", "getLastBlockHeightUpdatedFlowable", "lastBlockHeightUpdatedSubject", "getLastBlockHeightUpdatedSubject", "receiveAddress", "getReceiveAddress", "satoshisInBitcoin", "getSatoshisInBitcoin", "value", "Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "state", "getState", "()Lio/horizontalsystems/bitstashwallet/core/AdapterState;", "setState", "(Lio/horizontalsystems/bitstashwallet/core/AdapterState;)V", "stateUpdatedFlowable", "getStateUpdatedFlowable", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "transactionRecordsSubject", "getTransactionRecordsSubject", "availableBalance", "feeRate", "", "address", "fee", "amount", "refresh", "send", "Lio/reactivex/Single;", "start", "stop", "transactionRecord", "transaction", "Lio/horizontalsystems/bitcoincore/models/TransactionInfo;", "validate", "Companion", "app_productionMainnetRelease"})
public abstract class BitcoinBaseAdapter implements io.horizontalsystems.bitstashwallet.core.IAdapter, io.horizontalsystems.bitstashwallet.core.ITransactionsAdapter, io.horizontalsystems.bitstashwallet.core.IBalanceAdapter, io.horizontalsystems.bitstashwallet.core.IReceiveAdapter {
    private final int confirmationsThreshold = 3;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> balanceUpdatedSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> lastBlockHeightUpdatedSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> adapterStateUpdatedSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> transactionRecordsSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String debugInfo = "";
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bitstashwallet.core.AdapterState state;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitcoincore.AbstractKit kit = null;
    public static final int defaultConfirmationsThreshold = 3;
    public static final int decimal = 8;
    public static final io.horizontalsystems.bitstashwallet.core.adapters.BitcoinBaseAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getSatoshisInBitcoin();
    
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
    public java.lang.String getReceiveAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.PublishSubject<kotlin.Unit> getBalanceUpdatedSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.PublishSubject<kotlin.Unit> getLastBlockHeightUpdatedSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.PublishSubject<kotlin.Unit> getAdapterStateUpdatedSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> getTransactionRecordsSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getBalanceUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getLastBlockHeightUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getStateUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> getTransactionRecordsFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.core.AdapterState getState() {
        return null;
    }
    
    public void setState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.AdapterState value) {
    }
    
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
    public final io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, long feeRate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal availableBalance(long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal fee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address) {
        return null;
    }
    
    public final void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.TransactionRecord transactionRecord(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.models.TransactionInfo transaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitcoincore.AbstractKit getKit() {
        return null;
    }
    
    public BitcoinBaseAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.AbstractKit kit) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/BitcoinBaseAdapter$Companion;", "", "()V", "decimal", "", "defaultConfirmationsThreshold", "app_productionMainnetRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}