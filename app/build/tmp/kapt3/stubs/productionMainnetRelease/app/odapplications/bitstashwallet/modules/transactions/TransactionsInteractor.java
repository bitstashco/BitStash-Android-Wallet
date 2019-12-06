package app.odapplications.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0016\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\b\u0010\'\u001a\u00020\u001dH\u0016J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\u0016\u0010.\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020*0%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsInteractor;", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$IInteractor;", "walletManager", "Lapp/odapplications/bitstashwallet/core/IWalletManager;", "adapterManager", "Lapp/odapplications/bitstashwallet/core/IAdapterManager;", "currencyManager", "Lapp/odapplications/bitstashwallet/core/ICurrencyManager;", "rateManager", "Lapp/odapplications/bitstashwallet/core/managers/RateManager;", "connectivityManager", "Lapp/odapplications/bitstashwallet/core/managers/ConnectivityManager;", "(Lapp/odapplications/bitstashwallet/core/IWalletManager;Lapp/odapplications/bitstashwallet/core/IAdapterManager;Lapp/odapplications/bitstashwallet/core/ICurrencyManager;Lapp/odapplications/bitstashwallet/core/managers/RateManager;Lapp/odapplications/bitstashwallet/core/managers/ConnectivityManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$IInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "lastBlockHeightDisposables", "ratesDisposables", "requestedTimestamps", "Ljava/util/HashMap;", "", "", "transactionUpdatesDisposables", "clear", "", "fetchLastBlockHeights", "fetchRate", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "timestamp", "fetchRecords", "fetchDataList", "", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$FetchData;", "initialFetch", "onUpdateLastBlockHeight", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "adapter", "Lapp/odapplications/bitstashwallet/core/ITransactionsAdapter;", "onUpdateWallets", "setSelectedWallets", "selectedWallets", "app_productionMainnetRelease"})
public final class TransactionsInteractor implements app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.IInteractorDelegate delegate;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.reactivex.disposables.CompositeDisposable ratesDisposables = null;
    private final io.reactivex.disposables.CompositeDisposable lastBlockHeightDisposables = null;
    private final io.reactivex.disposables.CompositeDisposable transactionUpdatesDisposables = null;
    private java.util.HashMap<java.lang.String, java.lang.Long> requestedTimestamps;
    private final app.odapplications.bitstashwallet.core.IWalletManager walletManager = null;
    private final app.odapplications.bitstashwallet.core.IAdapterManager adapterManager = null;
    private final app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager = null;
    private final app.odapplications.bitstashwallet.core.managers.RateManager rateManager = null;
    private final app.odapplications.bitstashwallet.core.managers.ConnectivityManager connectivityManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void initialFetch() {
    }
    
    @java.lang.Override()
    public void fetchRecords(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.FetchData> fetchDataList) {
    }
    
    @java.lang.Override()
    public void setSelectedWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.Wallet> selectedWallets) {
    }
    
    @java.lang.Override()
    public void fetchLastBlockHeights() {
    }
    
    @java.lang.Override()
    public void fetchRate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, long timestamp) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final void onUpdateLastBlockHeight(app.odapplications.bitstashwallet.entities.Wallet wallet, app.odapplications.bitstashwallet.core.ITransactionsAdapter adapter) {
    }
    
    private final void onUpdateWallets() {
    }
    
    public TransactionsInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.RateManager rateManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.ConnectivityManager connectivityManager) {
        super();
    }
}