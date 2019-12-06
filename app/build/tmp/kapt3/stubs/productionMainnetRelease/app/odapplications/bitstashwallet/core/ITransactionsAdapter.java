package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lapp/odapplications/bitstashwallet/core/ITransactionsAdapter;", "", "confirmationsThreshold", "", "getConfirmationsThreshold", "()I", "lastBlockHeight", "getLastBlockHeight", "()Ljava/lang/Integer;", "lastBlockHeightUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getLastBlockHeightUpdatedFlowable", "()Lio/reactivex/Flowable;", "transactionRecordsFlowable", "", "Lapp/odapplications/bitstashwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "getTransactions", "Lio/reactivex/Single;", "from", "Lkotlin/Pair;", "", "limit", "app_productionMainnetRelease"})
public abstract interface ITransactionsAdapter {
    
    public abstract int getConfirmationsThreshold();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getLastBlockHeight();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getLastBlockHeightUpdatedFlowable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.String, java.lang.Integer> from, int limit);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord>> getTransactionRecordsFlowable();
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}