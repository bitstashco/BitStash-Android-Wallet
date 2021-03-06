package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/PriceAlertManager;", "", "walletManager", "Lapp/odapplications/bitstashwallet/core/IWalletManager;", "priceAlertsStorage", "Lapp/odapplications/bitstashwallet/core/IPriceAlertsStorage;", "(Lapp/odapplications/bitstashwallet/core/IWalletManager;Lapp/odapplications/bitstashwallet/core/IPriceAlertsStorage;)V", "getPriceAlerts", "", "Lapp/odapplications/bitstashwallet/entities/PriceAlert;", "savePriceAlerts", "", "priceAlerts", "app_productionMainnetRelease"})
public final class PriceAlertManager {
    private final app.odapplications.bitstashwallet.core.IWalletManager walletManager = null;
    private final app.odapplications.bitstashwallet.core.IPriceAlertsStorage priceAlertsStorage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.entities.PriceAlert> getPriceAlerts() {
        return null;
    }
    
    public final void savePriceAlerts(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.PriceAlert> priceAlerts) {
    }
    
    public PriceAlertManager(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPriceAlertsStorage priceAlertsStorage) {
        super();
    }
}