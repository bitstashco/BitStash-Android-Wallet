package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\f\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H&J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IPriceAlertsStorage;", "", "priceAlertCount", "", "getPriceAlertCount", "()I", "all", "", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert;", "delete", "", "priceAlerts", "deleteExcluding", "coinCodes", "", "save", "app_devMainnetMasterDebug"})
public abstract interface IPriceAlertsStorage {
    
    public abstract int getPriceAlertCount();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.PriceAlert> all();
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.PriceAlert> priceAlerts);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.PriceAlert> priceAlerts);
    
    public abstract void deleteExcluding(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> coinCodes);
}