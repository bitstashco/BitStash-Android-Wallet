package app.odapplications.bitstashwallet.core.storage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\'J\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\'J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\'\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/core/storage/PriceAlertsDao;", "", "all", "", "Lapp/odapplications/bitstashwallet/entities/PriceAlertRecord;", "count", "", "delete", "", "coinCodes", "", "deleteExcluding", "update", "priceAlert", "app_productionMainnetRelease"})
public abstract interface PriceAlertsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void update(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.PriceAlertRecord priceAlert);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM PriceAlertRecord")
    public abstract java.util.List<app.odapplications.bitstashwallet.entities.PriceAlertRecord> all();
    
    @androidx.room.Query(value = "DELETE FROM PriceAlertRecord WHERE coinCode IN(:coinCodes)")
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> coinCodes);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM PriceAlertRecord")
    public abstract int count();
    
    @androidx.room.Query(value = "DELETE FROM PriceAlertRecord WHERE coinCode NOT IN(:coinCodes)")
    public abstract void deleteExcluding(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> coinCodes);
}