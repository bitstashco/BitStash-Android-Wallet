package io.horizontalsystems.bitstashwallet.core.storage;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile RatesDao _ratesDao;

  private volatile EnabledWalletsDao _enabledWalletsDao;

  private volatile AccountsDao _accountsDao;

  private volatile PriceAlertsDao _priceAlertsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(10) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Rate` (`coinCode` TEXT NOT NULL, `currencyCode` TEXT NOT NULL, `value` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `isLatest` INTEGER NOT NULL, PRIMARY KEY(`coinCode`, `currencyCode`, `timestamp`, `isLatest`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `EnabledWallet` (`coinCode` TEXT NOT NULL, `accountId` TEXT NOT NULL, `walletOrder` INTEGER, `syncMode` TEXT, PRIMARY KEY(`coinCode`, `accountId`), FOREIGN KEY(`accountId`) REFERENCES `AccountRecord`(`id`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PriceAlertRecord` (`coinCode` TEXT NOT NULL, `stateRaw` INTEGER NOT NULL, `lastRate` TEXT, PRIMARY KEY(`coinCode`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AccountRecord` (`deleted` INTEGER NOT NULL, `id` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `isBackedUp` INTEGER NOT NULL, `syncMode` TEXT, `words` TEXT, `derivation` TEXT, `salt` TEXT, `key` TEXT, `eosAccount` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '200475f843e8ff9bd7343c451f30540d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Rate`");
        _db.execSQL("DROP TABLE IF EXISTS `EnabledWallet`");
        _db.execSQL("DROP TABLE IF EXISTS `PriceAlertRecord`");
        _db.execSQL("DROP TABLE IF EXISTS `AccountRecord`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRate = new HashMap<String, TableInfo.Column>(5);
        _columnsRate.put("coinCode", new TableInfo.Column("coinCode", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRate.put("currencyCode", new TableInfo.Column("currencyCode", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRate.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRate.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 3, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRate.put("isLatest", new TableInfo.Column("isLatest", "INTEGER", true, 4, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRate = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRate = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRate = new TableInfo("Rate", _columnsRate, _foreignKeysRate, _indicesRate);
        final TableInfo _existingRate = TableInfo.read(_db, "Rate");
        if (! _infoRate.equals(_existingRate)) {
          return new RoomOpenHelper.ValidationResult(false, "Rate(io.horizontalsystems.bitstashwallet.entities.Rate).\n"
                  + " Expected:\n" + _infoRate + "\n"
                  + " Found:\n" + _existingRate);
        }
        final HashMap<String, TableInfo.Column> _columnsEnabledWallet = new HashMap<String, TableInfo.Column>(4);
        _columnsEnabledWallet.put("coinCode", new TableInfo.Column("coinCode", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEnabledWallet.put("accountId", new TableInfo.Column("accountId", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEnabledWallet.put("walletOrder", new TableInfo.Column("walletOrder", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEnabledWallet.put("syncMode", new TableInfo.Column("syncMode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEnabledWallet = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysEnabledWallet.add(new TableInfo.ForeignKey("AccountRecord", "CASCADE", "CASCADE",Arrays.asList("accountId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesEnabledWallet = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEnabledWallet = new TableInfo("EnabledWallet", _columnsEnabledWallet, _foreignKeysEnabledWallet, _indicesEnabledWallet);
        final TableInfo _existingEnabledWallet = TableInfo.read(_db, "EnabledWallet");
        if (! _infoEnabledWallet.equals(_existingEnabledWallet)) {
          return new RoomOpenHelper.ValidationResult(false, "EnabledWallet(io.horizontalsystems.bitstashwallet.entities.EnabledWallet).\n"
                  + " Expected:\n" + _infoEnabledWallet + "\n"
                  + " Found:\n" + _existingEnabledWallet);
        }
        final HashMap<String, TableInfo.Column> _columnsPriceAlertRecord = new HashMap<String, TableInfo.Column>(3);
        _columnsPriceAlertRecord.put("coinCode", new TableInfo.Column("coinCode", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPriceAlertRecord.put("stateRaw", new TableInfo.Column("stateRaw", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPriceAlertRecord.put("lastRate", new TableInfo.Column("lastRate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPriceAlertRecord = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPriceAlertRecord = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPriceAlertRecord = new TableInfo("PriceAlertRecord", _columnsPriceAlertRecord, _foreignKeysPriceAlertRecord, _indicesPriceAlertRecord);
        final TableInfo _existingPriceAlertRecord = TableInfo.read(_db, "PriceAlertRecord");
        if (! _infoPriceAlertRecord.equals(_existingPriceAlertRecord)) {
          return new RoomOpenHelper.ValidationResult(false, "PriceAlertRecord(io.horizontalsystems.bitstashwallet.entities.PriceAlertRecord).\n"
                  + " Expected:\n" + _infoPriceAlertRecord + "\n"
                  + " Found:\n" + _existingPriceAlertRecord);
        }
        final HashMap<String, TableInfo.Column> _columnsAccountRecord = new HashMap<String, TableInfo.Column>(11);
        _columnsAccountRecord.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("isBackedUp", new TableInfo.Column("isBackedUp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("syncMode", new TableInfo.Column("syncMode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("words", new TableInfo.Column("words", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("derivation", new TableInfo.Column("derivation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("salt", new TableInfo.Column("salt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("key", new TableInfo.Column("key", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("eosAccount", new TableInfo.Column("eosAccount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAccountRecord = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAccountRecord = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAccountRecord = new TableInfo("AccountRecord", _columnsAccountRecord, _foreignKeysAccountRecord, _indicesAccountRecord);
        final TableInfo _existingAccountRecord = TableInfo.read(_db, "AccountRecord");
        if (! _infoAccountRecord.equals(_existingAccountRecord)) {
          return new RoomOpenHelper.ValidationResult(false, "AccountRecord(io.horizontalsystems.bitstashwallet.core.storage.AccountRecord).\n"
                  + " Expected:\n" + _infoAccountRecord + "\n"
                  + " Found:\n" + _existingAccountRecord);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "200475f843e8ff9bd7343c451f30540d", "bad353906e592df4dc15635fb545d60f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Rate","EnabledWallet","PriceAlertRecord","AccountRecord");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `Rate`");
      _db.execSQL("DELETE FROM `EnabledWallet`");
      _db.execSQL("DELETE FROM `PriceAlertRecord`");
      _db.execSQL("DELETE FROM `AccountRecord`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RatesDao ratesDao() {
    if (_ratesDao != null) {
      return _ratesDao;
    } else {
      synchronized(this) {
        if(_ratesDao == null) {
          _ratesDao = new RatesDao_Impl(this);
        }
        return _ratesDao;
      }
    }
  }

  @Override
  public EnabledWalletsDao walletsDao() {
    if (_enabledWalletsDao != null) {
      return _enabledWalletsDao;
    } else {
      synchronized(this) {
        if(_enabledWalletsDao == null) {
          _enabledWalletsDao = new EnabledWalletsDao_Impl(this);
        }
        return _enabledWalletsDao;
      }
    }
  }

  @Override
  public AccountsDao accountsDao() {
    if (_accountsDao != null) {
      return _accountsDao;
    } else {
      synchronized(this) {
        if(_accountsDao == null) {
          _accountsDao = new AccountsDao_Impl(this);
        }
        return _accountsDao;
      }
    }
  }

  @Override
  public PriceAlertsDao priceAlertsDao() {
    if (_priceAlertsDao != null) {
      return _priceAlertsDao;
    } else {
      synchronized(this) {
        if(_priceAlertsDao == null) {
          _priceAlertsDao = new PriceAlertsDao_Impl(this);
        }
        return _priceAlertsDao;
      }
    }
  }
}
