package io.horizontalsystems.bitstashwallet.modules.ratelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\b\u0010)\u001a\u00020*H\u0016J\u001e\u0010+\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00152\u0006\u0010.\u001a\u00020-H\u0016J\u001e\u0010/\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00152\u0006\u0010.\u001a\u00020-H\u0016J\b\u00100\u001a\u00020*H\u0016J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/ratelist/RatesInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$IInteractor;", "Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager$Listener;", "rateStatsManager", "Lio/horizontalsystems/bitstashwallet/core/IRateStatsManager;", "rateStorage", "Lio/horizontalsystems/bitstashwallet/core/IRateStorage;", "currentDateProvider", "Lio/horizontalsystems/bitstashwallet/core/managers/CurrentDateProvider;", "backgroundManager", "Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager;", "currencyManager", "Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;", "walletStorage", "Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "rateListSorter", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListSorter;", "(Lio/horizontalsystems/bitstashwallet/core/IRateStatsManager;Lio/horizontalsystems/bitstashwallet/core/IRateStorage;Lio/horizontalsystems/bitstashwallet/core/managers/CurrentDateProvider;Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager;Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListSorter;)V", "coins", "", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "getCoins", "()Ljava/util/List;", "currency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "getCurrency", "()Lio/horizontalsystems/bitstashwallet/entities/Currency;", "currentDate", "Ljava/util/Date;", "getCurrentDate", "()Ljava/util/Date;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$IInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "clear", "", "fetchRates", "coinCodes", "", "currencyCode", "getRateStats", "initRateList", "willEnterForeground", "activity", "Landroid/app/Activity;", "app_productionMainnetRelease"})
public final class RatesInteractor implements io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.IInteractor, io.horizontalsystems.bitstashwallet.core.managers.BackgroundManager.Listener {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.IInteractorDelegate delegate;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final io.horizontalsystems.bitstashwallet.core.IRateStatsManager rateStatsManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IRateStorage rateStorage = null;
    private final io.horizontalsystems.bitstashwallet.core.managers.CurrentDateProvider currentDateProvider = null;
    private final io.horizontalsystems.bitstashwallet.core.managers.BackgroundManager backgroundManager = null;
    private final io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletStorage walletStorage = null;
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final io.horizontalsystems.bitstashwallet.modules.ratelist.RateListSorter rateListSorter = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Date getCurrentDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Currency getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> getCoins() {
        return null;
    }
    
    @java.lang.Override()
    public void initRateList() {
    }
    
    @java.lang.Override()
    public void getRateStats(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> coinCodes, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @java.lang.Override()
    public void fetchRates(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> coinCodes, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public RatesInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IRateStatsManager rateStatsManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IRateStorage rateStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.CurrentDateProvider currentDateProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.BackgroundManager backgroundManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletStorage walletStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.ratelist.RateListSorter rateListSorter) {
        super();
    }
    
    public void willEnterForeground() {
    }
    
    public void didEnterBackground() {
    }
}