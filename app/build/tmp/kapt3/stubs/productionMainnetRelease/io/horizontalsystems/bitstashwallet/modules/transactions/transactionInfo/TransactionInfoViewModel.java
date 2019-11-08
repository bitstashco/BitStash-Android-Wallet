package io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\rJ\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\rJ\u0006\u0010\u001b\u001a\u00020\rJ\u0006\u0010\u001c\u001a\u00020\rJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u000e\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0016J\b\u0010\"\u001a\u00020\rH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;", "()V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;)V", "showCopiedLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getShowCopiedLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "showFullInfoLiveEvent", "Lkotlin/Pair;", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "getShowFullInfoLiveEvent", "transactionLiveData", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionViewItem;", "getTransactionLiveData", "init", "onClickFrom", "onClickOpenFullInfo", "onClickTo", "onClickTransactionId", "openFullInfo", "transactionHash", "wallet", "setViewItem", "transactionViewItem", "showCopied", "app_productionMainnetRelease"})
public final class TransactionInfoViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.View, io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.Router {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.ViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem> transactionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.String, io.horizontalsystems.bitstashwallet.entities.Wallet>> showFullInfoLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showCopiedLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.ViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.ViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem> getTransactionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.String, io.horizontalsystems.bitstashwallet.entities.Wallet>> getShowFullInfoLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowCopiedLiveEvent() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void showCopied() {
    }
    
    @java.lang.Override()
    public void openFullInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    public final void setViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem transactionViewItem) {
    }
    
    public final void onClickTransactionId() {
    }
    
    public final void onClickOpenFullInfo() {
    }
    
    public final void onClickFrom() {
    }
    
    public final void onClickTo() {
    }
    
    public TransactionInfoViewModel() {
        super();
    }
}