package io.horizontalsystems.bitstashwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0016J\u0016\u0010\u0016\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/storage/PriceAlertsStorage;", "Lio/horizontalsystems/bitstashwallet/core/IPriceAlertsStorage;", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "appDatabase", "Lio/horizontalsystems/bitstashwallet/core/storage/AppDatabase;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;Lio/horizontalsystems/bitstashwallet/core/storage/AppDatabase;)V", "dao", "Lio/horizontalsystems/bitstashwallet/core/storage/PriceAlertsDao;", "priceAlertCount", "", "getPriceAlertCount", "()I", "all", "", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert;", "delete", "", "priceAlerts", "deleteExcluding", "coinCodes", "", "save", "app_devMainnetMasterDebug"})
public final class PriceAlertsStorage implements io.horizontalsystems.bitstashwallet.core.IPriceAlertsStorage {
    private final io.horizontalsystems.bitstashwallet.core.storage.PriceAlertsDao dao = null;
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    
    @java.lang.Override()
    public int getPriceAlertCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.PriceAlert> all() {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.PriceAlert> priceAlerts) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.PriceAlert> priceAlerts) {
    }
    
    @java.lang.Override()
    public void deleteExcluding(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> coinCodes) {
    }
    
    public PriceAlertsStorage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.storage.AppDatabase appDatabase) {
        super();
    }
}