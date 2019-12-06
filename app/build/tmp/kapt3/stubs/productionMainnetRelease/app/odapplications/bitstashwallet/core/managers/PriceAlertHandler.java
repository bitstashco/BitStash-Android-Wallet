package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\'\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0014H\u0002\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/PriceAlertHandler;", "Lapp/odapplications/bitstashwallet/core/IPriceAlertHandler;", "priceAlertStorage", "Lapp/odapplications/bitstashwallet/core/IPriceAlertsStorage;", "notificationManager", "Lapp/odapplications/bitstashwallet/core/INotificationManager;", "notificationFactory", "Lapp/odapplications/bitstashwallet/core/INotificationFactory;", "(Lapp/odapplications/bitstashwallet/core/IPriceAlertsStorage;Lapp/odapplications/bitstashwallet/core/INotificationManager;Lapp/odapplications/bitstashwallet/core/INotificationFactory;)V", "getAlertsToNotify", "", "Lapp/odapplications/bitstashwallet/core/factories/PriceAlertItem;", "priceAlerts", "Lapp/odapplications/bitstashwallet/entities/PriceAlert;", "latestRateData", "Lapp/odapplications/bitstashwallet/entities/LatestRateData;", "getChangedAlerts", "handleAlerts", "", "signedState", "", "alertRate", "Ljava/math/BigDecimal;", "latestRate", "threshold", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)Ljava/lang/Integer;", "app_productionMainnetRelease"})
public final class PriceAlertHandler implements app.odapplications.bitstashwallet.core.IPriceAlertHandler {
    private final app.odapplications.bitstashwallet.core.IPriceAlertsStorage priceAlertStorage = null;
    private final app.odapplications.bitstashwallet.core.INotificationManager notificationManager = null;
    private final app.odapplications.bitstashwallet.core.INotificationFactory notificationFactory = null;
    
    @java.lang.Override()
    public void handleAlerts(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.LatestRateData latestRateData) {
    }
    
    private final java.util.List<app.odapplications.bitstashwallet.core.factories.PriceAlertItem> getAlertsToNotify(java.util.List<app.odapplications.bitstashwallet.entities.PriceAlert> priceAlerts, app.odapplications.bitstashwallet.entities.LatestRateData latestRateData) {
        return null;
    }
    
    private final java.lang.Integer signedState(java.math.BigDecimal alertRate, java.math.BigDecimal latestRate, int threshold) {
        return null;
    }
    
    private final java.util.List<app.odapplications.bitstashwallet.entities.PriceAlert> getChangedAlerts(java.util.List<app.odapplications.bitstashwallet.entities.PriceAlert> priceAlerts, app.odapplications.bitstashwallet.entities.LatestRateData latestRateData) {
        return null;
    }
    
    public PriceAlertHandler(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPriceAlertsStorage priceAlertStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.INotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.INotificationFactory notificationFactory) {
        super();
    }
}