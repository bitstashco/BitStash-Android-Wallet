package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004H&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u0004H&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u0004H&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u0004H&J\b\u0010\u0013\u001a\u00020\bH&J\b\u0010\u0014\u001a\u00020\bH&J\b\u0010\u0015\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IAdapterManager;", "", "adapterCreationObservable", "Lio/reactivex/Flowable;", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "getAdapterCreationObservable", "()Lio/reactivex/Flowable;", "adaptersReadyObservable", "", "getAdaptersReadyObservable", "getAdapterForWallet", "Lio/horizontalsystems/bitstashwallet/core/IAdapter;", "wallet", "getBalanceAdapterForWallet", "Lio/horizontalsystems/bitstashwallet/core/IBalanceAdapter;", "getReceiveAdapterForWallet", "Lio/horizontalsystems/bitstashwallet/core/IReceiveAdapter;", "getTransactionsAdapterForWallet", "Lio/horizontalsystems/bitstashwallet/core/ITransactionsAdapter;", "preloadAdapters", "refresh", "stopKits", "app_productionMainnetRelease"})
public abstract interface IAdapterManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<io.horizontalsystems.bitstashwallet.entities.Wallet> getAdapterCreationObservable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getAdaptersReadyObservable();
    
    public abstract void preloadAdapters();
    
    public abstract void refresh();
    
    public abstract void stopKits();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bitstashwallet.core.IAdapter getAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bitstashwallet.core.ITransactionsAdapter getTransactionsAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bitstashwallet.core.IBalanceAdapter getBalanceAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bitstashwallet.core.IReceiveAdapter getReceiveAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet);
}