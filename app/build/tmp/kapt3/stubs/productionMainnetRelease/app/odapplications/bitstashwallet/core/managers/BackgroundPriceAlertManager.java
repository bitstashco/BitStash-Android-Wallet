package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/BackgroundPriceAlertManager;", "Lapp/odapplications/bitstashwallet/core/IBackgroundPriceAlertManager;", "Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager$Listener;", "priceAlertsStorage", "Lapp/odapplications/bitstashwallet/core/IPriceAlertsStorage;", "rateManager", "Lapp/odapplications/bitstashwallet/core/IRateManager;", "currencyManager", "Lapp/odapplications/bitstashwallet/core/ICurrencyManager;", "rateStorage", "Lapp/odapplications/bitstashwallet/core/IRateStorage;", "priceAlertHandler", "Lapp/odapplications/bitstashwallet/core/IPriceAlertHandler;", "notificationManager", "Lapp/odapplications/bitstashwallet/core/INotificationManager;", "(Lapp/odapplications/bitstashwallet/core/IPriceAlertsStorage;Lapp/odapplications/bitstashwallet/core/IRateManager;Lapp/odapplications/bitstashwallet/core/ICurrencyManager;Lapp/odapplications/bitstashwallet/core/IRateStorage;Lapp/odapplications/bitstashwallet/core/IPriceAlertHandler;Lapp/odapplications/bitstashwallet/core/INotificationManager;)V", "didEnterBackground", "", "fetchRates", "Lio/reactivex/Single;", "Lapp/odapplications/bitstashwallet/entities/LatestRateData;", "willEnterForeground", "app_productionMainnetRelease"})
public final class BackgroundPriceAlertManager implements app.odapplications.bitstashwallet.core.IBackgroundPriceAlertManager, app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener {
    private final app.odapplications.bitstashwallet.core.IPriceAlertsStorage priceAlertsStorage = null;
    private final app.odapplications.bitstashwallet.core.IRateManager rateManager = null;
    private final app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager = null;
    private final app.odapplications.bitstashwallet.core.IRateStorage rateStorage = null;
    private final app.odapplications.bitstashwallet.core.IPriceAlertHandler priceAlertHandler = null;
    private final app.odapplications.bitstashwallet.core.INotificationManager notificationManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<app.odapplications.bitstashwallet.entities.LatestRateData> fetchRates() {
        return null;
    }
    
    @java.lang.Override()
    public void didEnterBackground() {
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    public BackgroundPriceAlertManager(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPriceAlertsStorage priceAlertsStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateManager rateManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateStorage rateStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPriceAlertHandler priceAlertHandler, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.INotificationManager notificationManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
}