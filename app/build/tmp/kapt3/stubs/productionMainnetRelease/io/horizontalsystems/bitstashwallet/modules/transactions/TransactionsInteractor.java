package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0016\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\b\u0010\'\u001a\u00020\u001dH\u0016J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\u0016\u0010.\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020*0%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IInteractor;", "walletManager", "Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "adapterManager", "Lio/horizontalsystems/bitstashwallet/core/IAdapterManager;", "currencyManager", "Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;", "rateManager", "Lio/horizontalsystems/bitstashwallet/core/managers/RateManager;", "connectivityManager", "Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;", "(Lio/horizontalsystems/bitstashwallet/core/IWalletManager;Lio/horizontalsystems/bitstashwallet/core/IAdapterManager;Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;Lio/horizontalsystems/bitstashwallet/core/managers/RateManager;Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "lastBlockHeightDisposables", "ratesDisposables", "requestedTimestamps", "Ljava/util/HashMap;", "", "", "transactionUpdatesDisposables", "clear", "", "fetchLastBlockHeights", "fetchRate", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "timestamp", "fetchRecords", "fetchDataList", "", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$FetchData;", "initialFetch", "onUpdateLastBlockHeight", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "adapter", "Lio/horizontalsystems/bitstashwallet/core/ITransactionsAdapter;", "onUpdateWallets", "setSelectedWallets", "selectedWallets", "app_productionMainnetRelease"})
public final class TransactionsInteractor implements io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IInteractorDelegate delegate;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.reactivex.disposables.CompositeDisposable ratesDisposables = null;
    private final io.reactivex.disposables.CompositeDisposable lastBlockHeightDisposables = null;
    private final io.reactivex.disposables.CompositeDisposable transactionUpdatesDisposables = null;
    private java.util.HashMap<java.lang.String, java.lang.Long> requestedTimestamps;
    private final io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bitstashwallet.core.managers.RateManager rateManager = null;
    private final io.horizontalsystems.bitstashwallet.core.managers.ConnectivityManager connectivityManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void initialFetch() {
    }
    
    @java.lang.Override()
    public void fetchRecords(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.FetchData> fetchDataList) {
    }
    
    @java.lang.Override()
    public void setSelectedWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> selectedWallets) {
    }
    
    @java.lang.Override()
    public void fetchLastBlockHeights() {
    }
    
    @java.lang.Override()
    public void fetchRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, long timestamp) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final void onUpdateLastBlockHeight(io.horizontalsystems.bitstashwallet.entities.Wallet wallet, io.horizontalsystems.bitstashwallet.core.ITransactionsAdapter adapter) {
    }
    
    private final void onUpdateWallets() {
    }
    
    public TransactionsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.RateManager rateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.ConnectivityManager connectivityManager) {
        super();
    }
}