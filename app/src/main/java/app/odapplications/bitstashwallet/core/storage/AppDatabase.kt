package app.odapplications.bitstashwallet.core.storage

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.entities.EnabledWallet
import app.odapplications.bitstashwallet.entities.PriceAlertRecord
import app.odapplications.bitstashwallet.entities.Rate

@Database(version = 10, exportSchema = false, entities = [
    Rate::class,
    EnabledWallet::class,
    PriceAlertRecord::class,
    AccountRecord::class]
)

@TypeConverters(DatabaseConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun ratesDao(): RatesDao
    abstract fun walletsDao(): EnabledWalletsDao
    abstract fun accountsDao(): AccountsDao
    abstract fun priceAlertsDao(): PriceAlertsDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "dbBankWallet")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .addMigrations(
                            MIGRATION_1_2,
                            MIGRATION_2_3,
                            MIGRATION_3_4,
                            MIGRATION_4_5,
                            MIGRATION_5_6,
                            MIGRATION_6_7,
                            migrateToAccountStructure,
                            MIGRATION_8_9,
                            MIGRATION_9_10
                    )
                    .build()
        }

        private val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                //renaming column coin to coinCode
                database.execSQL("ALTER TABLE TransactionRecord RENAME TO TransactionTemp")
                database.execSQL("CREATE TABLE TransactionRecord (`transactionHash` TEXT NOT NULL PRIMARY KEY,`blockHeight` INTEGER NOT NULL,`coinCode` TEXT NOT NULL,`amount` REAL NOT NULL,`timestamp` INTEGER NOT NULL,`rate` REAL NOT NULL,`from` TEXT NOT NULL,`to` TEXT NOT NULL)")
                database.execSQL("INSERT INTO TransactionRecord (`transactionHash`,`blockHeight`,`coinCode`,`amount`,`timestamp`,`rate`,`from`,`to`) SELECT `transactionHash`,`blockHeight`,`coin`,`amount`,`timestamp`,`rate`,`from`,`to` FROM TransactionTemp")
                database.execSQL("DROP TABLE TransactionTemp")

                database.execSQL("ALTER TABLE Rate RENAME TO RateTemp")
                database.execSQL("CREATE TABLE Rate (`coinCode` TEXT NOT NULL,`currencyCode` TEXT NOT NULL,`value` REAL NOT NULL,`timestamp` INTEGER NOT NULL, PRIMARY KEY(`coinCode`,`currencyCode`))")
                database.execSQL("INSERT INTO Rate (`coinCode`,`currencyCode`,`value`,`timestamp`) SELECT `coin`,`currencyCode`,`value`,`timestamp` FROM RateTemp")
                database.execSQL("DROP TABLE RateTemp")
            }
        }

        private val MIGRATION_2_3: Migration = object : Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE IF NOT EXISTS StorableCoin (`coinTitle` TEXT NOT NULL, `coinCode` TEXT NOT NULL, `coinType` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `order` INTEGER, PRIMARY KEY(`coinCode`))")
            }
        }

        private val MIGRATION_3_4: Migration = object : Migration(3, 4) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("DROP TABLE IF EXISTS TransactionRecord")
                database.execSQL("DROP TABLE IF EXISTS Rate")
                database.execSQL("CREATE TABLE Rate (`coinCode` TEXT NOT NULL,`currencyCode` TEXT NOT NULL,`value` REAL NOT NULL,`timestamp` INTEGER NOT NULL, `isLatest` INTEGER NOT NULL, PRIMARY KEY(`coinCode`,`currencyCode`,`timestamp`,`isLatest`))")
            }
        }

        private val MIGRATION_4_5: Migration = object : Migration(4, 5) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("DROP TABLE IF EXISTS Rate")
                database.execSQL("CREATE TABLE Rate (`coinCode` TEXT NOT NULL,`currencyCode` TEXT NOT NULL,`value` TEXT NOT NULL,`timestamp` INTEGER NOT NULL, `isLatest` INTEGER NOT NULL, PRIMARY KEY(`coinCode`,`currencyCode`,`timestamp`,`isLatest`))")
            }
        }

        private val MIGRATION_5_6: Migration = object : Migration(5, 6) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("DELETE FROM Rate")
            }
        }

        private val MIGRATION_6_7: Migration = object : Migration(6, 7) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE IF NOT EXISTS EnabledCoin (`coinCode` TEXT NOT NULL, `order` INTEGER, PRIMARY KEY(`coinCode`))")
                database.execSQL("INSERT INTO EnabledCoin (`coinCode`,`order`) SELECT `coinCode`,`order` FROM StorableCoin")
                database.execSQL("DROP TABLE StorableCoin")
            }
        }

        private val migrateToAccountStructure: Migration = object : Migration(7, 8) {
            override fun migrate(database: SupportSQLiteDatabase) {

                database.execSQL("CREATE TABLE IF NOT EXISTS `AccountRecord` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `isBackedUp` INTEGER NOT NULL, `syncMode` TEXT, `words` TEXT, `derivation` TEXT, `salt` TEXT, `key` TEXT, `eosAccount` TEXT, PRIMARY KEY(`id`))")
                database.execSQL("CREATE TABLE IF NOT EXISTS `EnabledWallet` (`coinCode` TEXT NOT NULL, `accountId` TEXT NOT NULL, `walletOrder` INTEGER, `syncMode` TEXT, PRIMARY KEY(`coinCode`, `accountId`), FOREIGN KEY(`accountId`) REFERENCES `AccountRecord`(`id`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)")

                val syncMode = App.localStorage.syncMode.value
                val authData = App.secureStorage.authData
                authData?.let {
                    val isBackedUp = if (App.localStorage.isBackedUp) 1 else 0
                    val encryptedWords = App.encryptionManager.encrypt(authData.words.joinToString(separator = ","))

                    database.execSQL("INSERT OR REPLACE INTO `AccountRecord`(`id`,`name`,`type`,`isBackedUp`,`syncMode`,`words`,`derivation`,`salt`,`key`,`eosAccount`) " +
                            "VALUES ('${authData.walletId}', 'Mnemonic', 'mnemonic', $isBackedUp, '$syncMode', '$encryptedWords','bip44', NULL, NULL, NULL)")

                    database.execSQL("INSERT OR REPLACE INTO `EnabledWallet`(`coinCode`, `accountId`, `walletOrder`, `syncMode`) " +
                            " SELECT `coinCode`, '${authData.walletId}', '$syncMode', `order` FROM `EnabledCoin`")
                }

                database.execSQL("DROP TABLE EnabledCoin")
            }
        }

        private val MIGRATION_8_9: Migration = object : Migration(8, 9) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE AccountRecord ADD COLUMN `deleted` INTEGER NOT NULL DEFAULT 0")
            }
        }

        private val MIGRATION_9_10: Migration = object : Migration(9, 10) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE IF NOT EXISTS PriceAlertRecord (`coinCode` TEXT NOT NULL, `stateRaw` INTEGER NOT NULL, `lastRate` TEXT, PRIMARY KEY(`coinCode`))")
            }
        }
    }
}
