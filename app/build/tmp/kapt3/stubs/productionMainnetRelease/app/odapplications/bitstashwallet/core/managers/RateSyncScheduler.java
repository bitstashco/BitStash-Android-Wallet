package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/RateSyncScheduler;", "", "rateManager", "Lapp/odapplications/bitstashwallet/core/IRateManager;", "walletManager", "Lapp/odapplications/bitstashwallet/core/IWalletManager;", "currencyManager", "Lapp/odapplications/bitstashwallet/core/ICurrencyManager;", "connectivityManager", "Lapp/odapplications/bitstashwallet/core/managers/ConnectivityManager;", "timerSignal", "Lio/reactivex/Observable;", "", "(Lapp/odapplications/bitstashwallet/core/IRateManager;Lapp/odapplications/bitstashwallet/core/IWalletManager;Lapp/odapplications/bitstashwallet/core/ICurrencyManager;Lapp/odapplications/bitstashwallet/core/managers/ConnectivityManager;Lio/reactivex/Observable;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "app_productionMainnetRelease"})
public final class RateSyncScheduler {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final app.odapplications.bitstashwallet.core.IRateManager rateManager = null;
    
    public RateSyncScheduler(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateManager rateManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.ConnectivityManager connectivityManager, @org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<kotlin.Unit> timerSignal) {
        super();
    }
}