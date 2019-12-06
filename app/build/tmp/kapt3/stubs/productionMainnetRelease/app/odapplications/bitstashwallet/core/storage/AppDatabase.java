package app.odapplications.bitstashwallet.core.storage;

import java.lang.System;

@androidx.room.TypeConverters(value = {app.odapplications.bitstashwallet.core.storage.DatabaseConverters.class})
@androidx.room.Database(version = 10, exportSchema = false, entities = {app.odapplications.bitstashwallet.entities.Rate.class, app.odapplications.bitstashwallet.entities.EnabledWallet.class, app.odapplications.bitstashwallet.entities.PriceAlertRecord.class, app.odapplications.bitstashwallet.core.storage.AccountRecord.class})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lapp/odapplications/bitstashwallet/core/storage/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "accountsDao", "Lapp/odapplications/bitstashwallet/core/storage/AccountsDao;", "priceAlertsDao", "Lapp/odapplications/bitstashwallet/core/storage/PriceAlertsDao;", "ratesDao", "Lapp/odapplications/bitstashwallet/core/storage/RatesDao;", "walletsDao", "Lapp/odapplications/bitstashwallet/core/storage/EnabledWalletsDao;", "Companion", "app_productionMainnetRelease"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static volatile app.odapplications.bitstashwallet.core.storage.AppDatabase INSTANCE;
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    private static final androidx.room.migration.Migration MIGRATION_3_4 = null;
    private static final androidx.room.migration.Migration MIGRATION_4_5 = null;
    private static final androidx.room.migration.Migration MIGRATION_5_6 = null;
    private static final androidx.room.migration.Migration MIGRATION_6_7 = null;
    private static final androidx.room.migration.Migration migrateToAccountStructure = null;
    private static final androidx.room.migration.Migration MIGRATION_8_9 = null;
    private static final androidx.room.migration.Migration MIGRATION_9_10 = null;
    public static final app.odapplications.bitstashwallet.core.storage.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract app.odapplications.bitstashwallet.core.storage.RatesDao ratesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract app.odapplications.bitstashwallet.core.storage.EnabledWalletsDao walletsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract app.odapplications.bitstashwallet.core.storage.AccountsDao accountsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract app.odapplications.bitstashwallet.core.storage.PriceAlertsDao priceAlertsDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/core/storage/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lapp/odapplications/bitstashwallet/core/storage/AppDatabase;", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "MIGRATION_2_3", "MIGRATION_3_4", "MIGRATION_4_5", "MIGRATION_5_6", "MIGRATION_6_7", "MIGRATION_8_9", "MIGRATION_9_10", "migrateToAccountStructure", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_productionMainnetRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.core.storage.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final app.odapplications.bitstashwallet.core.storage.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}