package app.odapplications.bitstashwallet.modules.ratelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\b\u0010)\u001a\u00020*H\u0016J\u001e\u0010+\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00152\u0006\u0010.\u001a\u00020-H\u0016J\u001e\u0010/\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00152\u0006\u0010.\u001a\u00020-H\u0016J\b\u00100\u001a\u00020*H\u0016J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RatesInteractor;", "Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IInteractor;", "Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager$Listener;", "rateStatsManager", "Lapp/odapplications/bitstashwallet/core/IRateStatsManager;", "rateStorage", "Lapp/odapplications/bitstashwallet/core/IRateStorage;", "currentDateProvider", "Lapp/odapplications/bitstashwallet/core/managers/CurrentDateProvider;", "backgroundManager", "Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager;", "currencyManager", "Lapp/odapplications/bitstashwallet/core/ICurrencyManager;", "walletStorage", "Lapp/odapplications/bitstashwallet/core/IWalletStorage;", "appConfigProvider", "Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;", "rateListSorter", "Lapp/odapplications/bitstashwallet/modules/ratelist/RateListSorter;", "(Lapp/odapplications/bitstashwallet/core/IRateStatsManager;Lapp/odapplications/bitstashwallet/core/IRateStorage;Lapp/odapplications/bitstashwallet/core/managers/CurrentDateProvider;Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager;Lapp/odapplications/bitstashwallet/core/ICurrencyManager;Lapp/odapplications/bitstashwallet/core/IWalletStorage;Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;Lapp/odapplications/bitstashwallet/modules/ratelist/RateListSorter;)V", "coins", "", "Lapp/odapplications/bitstashwallet/entities/Coin;", "getCoins", "()Ljava/util/List;", "currency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "getCurrency", "()Lapp/odapplications/bitstashwallet/entities/Currency;", "currentDate", "Ljava/util/Date;", "getCurrentDate", "()Ljava/util/Date;", "delegate", "Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "clear", "", "fetchRates", "coinCodes", "", "currencyCode", "getRateStats", "initRateList", "willEnterForeground", "activity", "Landroid/app/Activity;", "app_productionMainnetRelease"})
public final class RatesInteractor implements app.odapplications.bitstashwallet.modules.ratelist.RateListModule.IInteractor, app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.ratelist.RateListModule.IInteractorDelegate delegate;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final app.odapplications.bitstashwallet.core.IRateStatsManager rateStatsManager = null;
    private final app.odapplications.bitstashwallet.core.IRateStorage rateStorage = null;
    private final app.odapplications.bitstashwallet.core.managers.CurrentDateProvider currentDateProvider = null;
    private final app.odapplications.bitstashwallet.core.managers.BackgroundManager backgroundManager = null;
    private final app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager = null;
    private final app.odapplications.bitstashwallet.core.IWalletStorage walletStorage = null;
    private final app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final app.odapplications.bitstashwallet.modules.ratelist.RateListSorter rateListSorter = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.ratelist.RateListModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.ratelist.RateListModule.IInteractorDelegate p0) {
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
    public app.odapplications.bitstashwallet.entities.Currency getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.entities.Coin> getCoins() {
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
    app.odapplications.bitstashwallet.core.IRateStatsManager rateStatsManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateStorage rateStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.CurrentDateProvider currentDateProvider, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.BackgroundManager backgroundManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletStorage walletStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.ratelist.RateListSorter rateListSorter) {
        super();
    }
    
    public void willEnterForeground() {
    }
    
    public void didEnterBackground() {
    }
}