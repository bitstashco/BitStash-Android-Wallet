package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0012\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0012\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\b\u0010)\u001a\u00020\u001aH\u0002J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u001aH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00100\u00100\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u001a0\u001a0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/AdapterManager;", "Lapp/odapplications/bitstashwallet/core/IAdapterManager;", "Landroid/os/HandlerThread;", "walletManager", "Lapp/odapplications/bitstashwallet/core/IWalletManager;", "adapterFactory", "Lapp/odapplications/bitstashwallet/core/factories/AdapterFactory;", "ethereumKitManager", "Lapp/odapplications/bitstashwallet/core/IEthereumKitManager;", "eosKitManager", "Lapp/odapplications/bitstashwallet/core/IEosKitManager;", "binanceKitManager", "Lapp/odapplications/bitstashwallet/core/managers/BinanceKitManager;", "(Lapp/odapplications/bitstashwallet/core/IWalletManager;Lapp/odapplications/bitstashwallet/core/factories/AdapterFactory;Lapp/odapplications/bitstashwallet/core/IEthereumKitManager;Lapp/odapplications/bitstashwallet/core/IEosKitManager;Lapp/odapplications/bitstashwallet/core/managers/BinanceKitManager;)V", "adapterCreationObservable", "Lio/reactivex/Flowable;", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getAdapterCreationObservable", "()Lio/reactivex/Flowable;", "adapterCreationSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "adaptersMap", "", "Lapp/odapplications/bitstashwallet/core/IAdapter;", "adaptersReadyObservable", "", "getAdaptersReadyObservable", "adaptersReadySubject", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "handler", "Landroid/os/Handler;", "getAdapterForWallet", "wallet", "getBalanceAdapterForWallet", "Lapp/odapplications/bitstashwallet/core/IBalanceAdapter;", "getReceiveAdapterForWallet", "Lapp/odapplications/bitstashwallet/core/IReceiveAdapter;", "getTransactionsAdapterForWallet", "Lapp/odapplications/bitstashwallet/core/ITransactionsAdapter;", "initAdapters", "preloadAdapters", "refresh", "stopKits", "app_productionMainnetRelease"})
public final class AdapterManager extends android.os.HandlerThread implements app.odapplications.bitstashwallet.core.IAdapterManager {
    private final android.os.Handler handler = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.reactivex.subjects.PublishSubject<app.odapplications.bitstashwallet.entities.Wallet> adapterCreationSubject = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> adaptersReadySubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Flowable<app.odapplications.bitstashwallet.entities.Wallet> adapterCreationObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Flowable<kotlin.Unit> adaptersReadyObservable = null;
    private final java.util.Map<app.odapplications.bitstashwallet.entities.Wallet, app.odapplications.bitstashwallet.core.IAdapter> adaptersMap = null;
    private final app.odapplications.bitstashwallet.core.IWalletManager walletManager = null;
    private final app.odapplications.bitstashwallet.core.factories.AdapterFactory adapterFactory = null;
    private final app.odapplications.bitstashwallet.core.IEthereumKitManager ethereumKitManager = null;
    private final app.odapplications.bitstashwallet.core.IEosKitManager eosKitManager = null;
    private final app.odapplications.bitstashwallet.core.managers.BinanceKitManager binanceKitManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<app.odapplications.bitstashwallet.entities.Wallet> getAdapterCreationObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getAdaptersReadyObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void preloadAdapters() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    private final void initAdapters() {
    }
    
    @java.lang.Override()
    public void stopKits() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.core.IAdapter getAdapterForWallet(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.core.ITransactionsAdapter getTransactionsAdapterForWallet(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.core.IBalanceAdapter getBalanceAdapterForWallet(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.core.IReceiveAdapter getReceiveAdapterForWallet(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    public AdapterManager(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.factories.AdapterFactory adapterFactory, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IEthereumKitManager ethereumKitManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IEosKitManager eosKitManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.BinanceKitManager binanceKitManager) {
        super(null);
    }
}