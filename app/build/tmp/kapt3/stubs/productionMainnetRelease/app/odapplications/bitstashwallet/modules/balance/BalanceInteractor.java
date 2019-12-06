package app.odapplications.bitstashwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J\b\u0010\"\u001a\u00020#H\u0016J\"\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0010\u0010\'\u001a\f\u0012\b\u0012\u00060&j\u0002`)0(H\u0016J\u0012\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020#H\u0016J\b\u00103\u001a\u00020#H\u0002J\b\u00104\u001a\u00020#H\u0002J\u0012\u00105\u001a\u0004\u0018\u0001062\u0006\u0010,\u001a\u00020-H\u0016J\b\u00107\u001a\u00020#H\u0016J\u0010\u00108\u001a\u00020#2\u0006\u00109\u001a\u000201H\u0016J\u0018\u0010:\u001a\u00020#2\u0006\u0010,\u001a\u00020-2\u0006\u0010;\u001a\u00020<H\u0002J\u0018\u0010=\u001a\u00020#2\u0006\u0010/\u001a\u00020&2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010>\u001a\u00020#H\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceInteractor;", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IInteractor;", "Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager$Listener;", "walletManager", "Lapp/odapplications/bitstashwallet/core/IWalletManager;", "adapterManager", "Lapp/odapplications/bitstashwallet/core/IAdapterManager;", "rateStatsManager", "Lapp/odapplications/bitstashwallet/core/IRateStatsManager;", "currencyManager", "Lapp/odapplications/bitstashwallet/core/ICurrencyManager;", "backgroundManager", "Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager;", "rateStorage", "Lapp/odapplications/bitstashwallet/core/IRateStorage;", "localStorage", "Lapp/odapplications/bitstashwallet/core/ILocalStorage;", "rateManager", "Lapp/odapplications/bitstashwallet/core/IRateManager;", "predefinedAccountTypeManager", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountTypeManager;", "refreshTimeout", "", "(Lapp/odapplications/bitstashwallet/core/IWalletManager;Lapp/odapplications/bitstashwallet/core/IAdapterManager;Lapp/odapplications/bitstashwallet/core/IRateStatsManager;Lapp/odapplications/bitstashwallet/core/ICurrencyManager;Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager;Lapp/odapplications/bitstashwallet/core/IRateStorage;Lapp/odapplications/bitstashwallet/core/ILocalStorage;Lapp/odapplications/bitstashwallet/core/IRateManager;Lapp/odapplications/bitstashwallet/core/IPredefinedAccountTypeManager;J)V", "adapterDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "delegate", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/balance/BalanceModule$IInteractorDelegate;)V", "disposables", "rateDisposables", "clear", "", "fetchRates", "currencyCode", "", "coinCodes", "", "Lapp/odapplications/bitstashwallet/modules/transactions/CoinCode;", "getBalanceAdapterForWallet", "Lapp/odapplications/bitstashwallet/core/IBalanceAdapter;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getLatestRate", "coinCode", "getSortingType", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "initWallets", "onUpdateCurrency", "onUpdateWallets", "predefinedAccountType", "Lapp/odapplications/bitstashwallet/core/IPredefinedAccountType;", "refresh", "saveSortingType", "sortType", "subscribeToAdapterUpdates", "initialUpdate", "", "syncStats", "willEnterForeground", "app_productionMainnetRelease"})
public final class BalanceInteractor implements app.odapplications.bitstashwallet.modules.balance.BalanceModule.IInteractor, app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.balance.BalanceModule.IInteractorDelegate delegate;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private io.reactivex.disposables.CompositeDisposable adapterDisposables;
    private io.reactivex.disposables.CompositeDisposable rateDisposables;
    private final app.odapplications.bitstashwallet.core.IWalletManager walletManager = null;
    private final app.odapplications.bitstashwallet.core.IAdapterManager adapterManager = null;
    private final app.odapplications.bitstashwallet.core.IRateStatsManager rateStatsManager = null;
    private final app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager = null;
    private final app.odapplications.bitstashwallet.core.managers.BackgroundManager backgroundManager = null;
    private final app.odapplications.bitstashwallet.core.IRateStorage rateStorage = null;
    private final app.odapplications.bitstashwallet.core.ILocalStorage localStorage = null;
    private final app.odapplications.bitstashwallet.core.IRateManager rateManager = null;
    private final app.odapplications.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager = null;
    private final long refreshTimeout = 0L;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.balance.BalanceModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.balance.BalanceModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public void syncStats(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @java.lang.Override()
    public void initWallets() {
    }
    
    @java.lang.Override()
    public void fetchRates(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> coinCodes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.balance.BalanceSortType getSortingType() {
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
    public app.odapplications.bitstashwallet.core.IPredefinedAccountType predefinedAccountType(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    private final void onUpdateCurrency() {
    }
    
    private final synchronized void onUpdateWallets() {
    }
    
    private final synchronized void subscribeToAdapterUpdates(app.odapplications.bitstashwallet.entities.Wallet wallet, boolean initialUpdate) {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    public void saveSortingType(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.balance.BalanceSortType sortType) {
    }
    
    private final void getLatestRate(java.lang.String currencyCode, java.lang.String coinCode) {
    }
    
    public BalanceInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateStatsManager rateStatsManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.BackgroundManager backgroundManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateStorage rateStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateManager rateManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager, long refreshTimeout) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public void didEnterBackground() {
    }
}