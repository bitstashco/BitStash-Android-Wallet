package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/RateSyncScheduler;", "", "rateManager", "Lio/horizontalsystems/bitstashwallet/core/IRateManager;", "walletManager", "Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "currencyManager", "Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;", "connectivityManager", "Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;", "timerSignal", "Lio/reactivex/Observable;", "", "(Lio/horizontalsystems/bitstashwallet/core/IRateManager;Lio/horizontalsystems/bitstashwallet/core/IWalletManager;Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;Lio/horizontalsystems/bitstashwallet/core/managers/ConnectivityManager;Lio/reactivex/Observable;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "app_productionMainnetRelease"})
public final class RateSyncScheduler {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.horizontalsystems.bitstashwallet.core.IRateManager rateManager = null;
    
    public RateSyncScheduler(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IRateManager rateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.ConnectivityManager connectivityManager, @org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<kotlin.Unit> timerSignal) {
        super();
    }
}