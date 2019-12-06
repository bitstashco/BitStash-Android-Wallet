package app.odapplications.bitstashwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import app.odapplications.bitstashwallet.entities.EnabledWallet;
import app.odapplications.bitstashwallet.entities.SyncMode;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EnabledWalletsDao_Impl implements EnabledWalletsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EnabledWallet> __insertionAdapterOfEnabledWallet;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public EnabledWalletsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEnabledWallet = new EntityInsertionAdapter<EnabledWallet>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `EnabledWallet` (`coinCode`,`accountId`,`walletOrder`,`syncMode`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EnabledWallet value) {
        if (value.getCoinCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCoinCode());
        }
        if (value.getAccountId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAccountId());
        }
        if (value.getWalletOrder() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getWalletOrder());
        }
        final String _tmp;
        _tmp = __databaseConverters.toString(value.getSyncMode());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM EnabledWallet";
        return _query;
      }
    };
  }

  @Override
  public void insert(final EnabledWallet storableCoin) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEnabledWallet.insert(storableCoin);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCoins(final List<EnabledWallet> coins) {
    __db.beginTransaction();
    try {
      EnabledWalletsDao.DefaultImpls.insertCoins(EnabledWalletsDao_Impl.this, coins);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<EnabledWallet> enabledCoins() {
    final String _sql = "SELECT * FROM EnabledWallet ORDER BY `walletOrder` ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfCoinCode = CursorUtil.getColumnIndexOrThrow(_cursor, "coinCode");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "accountId");
      final int _cursorIndexOfWalletOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "walletOrder");
      final int _cursorIndexOfSyncMode = CursorUtil.getColumnIndexOrThrow(_cursor, "syncMode");
      final List<EnabledWallet> _result = new ArrayList<EnabledWallet>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final EnabledWallet _item;
        final String _tmpCoinCode;
        _tmpCoinCode = _cursor.getString(_cursorIndexOfCoinCode);
        final String _tmpAccountId;
        _tmpAccountId = _cursor.getString(_cursorIndexOfAccountId);
        final Integer _tmpWalletOrder;
        if (_cursor.isNull(_cursorIndexOfWalletOrder)) {
          _tmpWalletOrder = null;
        } else {
          _tmpWalletOrder = _cursor.getInt(_cursorIndexOfWalletOrder);
        }
        final SyncMode _tmpSyncMode;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfSyncMode);
        _tmpSyncMode = __databaseConverters.toSyncMode(_tmp);
        _item = new EnabledWallet(_tmpCoinCode,_tmpAccountId,_tmpWalletOrder,_tmpSyncMode);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
