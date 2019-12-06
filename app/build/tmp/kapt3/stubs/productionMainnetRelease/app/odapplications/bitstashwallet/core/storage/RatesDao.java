package app.odapplications.bitstashwallet.core.storage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u001c\u0010\u0007\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\tH\'J\u001e\u0010\f\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\tH\'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\tH\'J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\u00102\u0006\u0010\u000b\u001a\u00020\tH\'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0016"}, d2 = {"Lapp/odapplications/bitstashwallet/core/storage/RatesDao;", "", "delete", "", "rate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "deleteAll", "deleteLatest", "coinCode", "", "Lapp/odapplications/bitstashwallet/modules/transactions/CoinCode;", "currencyCode", "getLatestRate", "getLatestRateFlowable", "Lio/reactivex/Flowable;", "getRate", "Lio/reactivex/Single;", "timestamp", "", "getZeroRates", "", "insert", "app_productionMainnetRelease"})
public abstract interface RatesDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Rate WHERE coinCode = :coinCode AND currencyCode = :currencyCode AND isLatest = 1")
    public abstract io.reactivex.Flowable<app.odapplications.bitstashwallet.entities.Rate> getLatestRateFlowable(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM Rate WHERE coinCode = :coinCode AND currencyCode = :currencyCode AND isLatest = 1")
    public abstract app.odapplications.bitstashwallet.entities.Rate getLatestRate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Rate rate);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Rate rate);
    
    @androidx.room.Query(value = "DELETE FROM Rate WHERE isLatest = 1 AND coinCode = :coinCode AND currencyCode = :currencyCode")
    public abstract void deleteLatest(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @androidx.room.Query(value = "DELETE FROM Rate")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Rate WHERE coinCode = :coinCode AND currencyCode = :currencyCode AND timestamp = :timestamp AND isLatest = 0")
    public abstract io.reactivex.Single<app.odapplications.bitstashwallet.entities.Rate> getRate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, long timestamp);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Rate WHERE value = 0.0 AND currencyCode = :currencyCode AND isLatest = 0")
    public abstract io.reactivex.Single<java.util.List<app.odapplications.bitstashwallet.entities.Rate>> getZeroRates(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
}