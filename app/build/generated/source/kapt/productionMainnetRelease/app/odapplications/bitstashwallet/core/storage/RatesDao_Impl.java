package app.odapplications.bitstashwallet.core.storage;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import app.odapplications.bitstashwallet.entities.Rate;
import io.reactivex.Flowable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RatesDao_Impl implements RatesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Rate> __insertionAdapterOfRate;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  private final EntityDeletionOrUpdateAdapter<Rate> __deletionAdapterOfRate;

  private final SharedSQLiteStatement __preparedStmtOfDeleteLatest;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public RatesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRate = new EntityInsertionAdapter<Rate>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Rate` (`coinCode`,`currencyCode`,`value`,`timestamp`,`isLatest`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Rate value) {
        if (value.getCoinCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCoinCode());
        }
        if (value.getCurrencyCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCurrencyCode());
        }
        final String _tmp;
        _tmp = __databaseConverters.toString(value.getValue());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        stmt.bindLong(4, value.getTimestamp());
        final int _tmp_1;
        _tmp_1 = value.isLatest() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
      }
    };
    this.__deletionAdapterOfRate = new EntityDeletionOrUpdateAdapter<Rate>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Rate` WHERE `coinCode` = ? AND `currencyCode` = ? AND `timestamp` = ? AND `isLatest` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Rate value) {
        if (value.getCoinCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCoinCode());
        }
        if (value.getCurrencyCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCurrencyCode());
        }
        stmt.bindLong(3, value.getTimestamp());
        final int _tmp;
        _tmp = value.isLatest() ? 1 : 0;
        stmt.bindLong(4, _tmp);
      }
    };
    this.__preparedStmtOfDeleteLatest = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Rate WHERE isLatest = 1 AND coinCode = :coinCode AND currencyCode = :currencyCode";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Rate";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Rate rate) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRate.insert(rate);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Rate rate) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfRate.handle(rate);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteLatest(final String coinCode, final String currencyCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteLatest.acquire();
    int _argIndex = 1;
    if (coinCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, coinCode);
    }
    _argIndex = 2;
    if (currencyCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, currencyCode);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteLatest.release(_stmt);
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
  public Flowable<Rate> getLatestRateFlowable(final String coinCode, final String currencyCode) {
    final String _sql = "SELECT * FROM Rate WHERE coinCode = :coinCode AND currencyCode = :currencyCode AND isLatest = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (coinCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, coinCode);
    }
    _argIndex = 2;
    if (currencyCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, currencyCode);
    }
    return RxRoom.createFlowable(__db, false, new String[]{"Rate"}, new Callable<Rate>() {
      @Override
      public Rate call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCoinCode = CursorUtil.getColumnIndexOrThrow(_cursor, "coinCode");
          final int _cursorIndexOfCurrencyCode = CursorUtil.getColumnIndexOrThrow(_cursor, "currencyCode");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfIsLatest = CursorUtil.getColumnIndexOrThrow(_cursor, "isLatest");
          final Rate _result;
          if(_cursor.moveToFirst()) {
            final String _tmpCoinCode;
            _tmpCoinCode = _cursor.getString(_cursorIndexOfCoinCode);
            final String _tmpCurrencyCode;
            _tmpCurrencyCode = _cursor.getString(_cursorIndexOfCurrencyCode);
            final BigDecimal _tmpValue;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfValue);
            _tmpValue = __databaseConverters.fromString(_tmp);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final boolean _tmpIsLatest;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsLatest);
            _tmpIsLatest = _tmp_1 != 0;
            _result = new Rate(_tmpCoinCode,_tmpCurrencyCode,_tmpValue,_tmpTimestamp,_tmpIsLatest);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Rate getLatestRate(final String coinCode, final String currencyCode) {
    final String _sql = "SELECT * FROM Rate WHERE coinCode = :coinCode AND currencyCode = :currencyCode AND isLatest = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (coinCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, coinCode);
    }
    _argIndex = 2;
    if (currencyCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, currencyCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfCoinCode = CursorUtil.getColumnIndexOrThrow(_cursor, "coinCode");
      final int _cursorIndexOfCurrencyCode = CursorUtil.getColumnIndexOrThrow(_cursor, "currencyCode");
      final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfIsLatest = CursorUtil.getColumnIndexOrThrow(_cursor, "isLatest");
      final Rate _result;
      if(_cursor.moveToFirst()) {
        final String _tmpCoinCode;
        _tmpCoinCode = _cursor.getString(_cursorIndexOfCoinCode);
        final String _tmpCurrencyCode;
        _tmpCurrencyCode = _cursor.getString(_cursorIndexOfCurrencyCode);
        final BigDecimal _tmpValue;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfValue);
        _tmpValue = __databaseConverters.fromString(_tmp);
        final long _tmpTimestamp;
        _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
        final boolean _tmpIsLatest;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsLatest);
        _tmpIsLatest = _tmp_1 != 0;
        _result = new Rate(_tmpCoinCode,_tmpCurrencyCode,_tmpValue,_tmpTimestamp,_tmpIsLatest);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Single<Rate> getRate(final String coinCode, final String currencyCode,
      final long timestamp) {
    final String _sql = "SELECT * FROM Rate WHERE coinCode = :coinCode AND currencyCode = :currencyCode AND timestamp = :timestamp AND isLatest = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (coinCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, coinCode);
    }
    _argIndex = 2;
    if (currencyCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, currencyCode);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, timestamp);
    return RxRoom.createSingle(new Callable<Rate>() {
      @Override
      public Rate call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCoinCode = CursorUtil.getColumnIndexOrThrow(_cursor, "coinCode");
          final int _cursorIndexOfCurrencyCode = CursorUtil.getColumnIndexOrThrow(_cursor, "currencyCode");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfIsLatest = CursorUtil.getColumnIndexOrThrow(_cursor, "isLatest");
          final Rate _result;
          if(_cursor.moveToFirst()) {
            final String _tmpCoinCode;
            _tmpCoinCode = _cursor.getString(_cursorIndexOfCoinCode);
            final String _tmpCurrencyCode;
            _tmpCurrencyCode = _cursor.getString(_cursorIndexOfCurrencyCode);
            final BigDecimal _tmpValue;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfValue);
            _tmpValue = __databaseConverters.fromString(_tmp);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final boolean _tmpIsLatest;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsLatest);
            _tmpIsLatest = _tmp_1 != 0;
            _result = new Rate(_tmpCoinCode,_tmpCurrencyCode,_tmpValue,_tmpTimestamp,_tmpIsLatest);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<List<Rate>> getZeroRates(final String currencyCode) {
    final String _sql = "SELECT * FROM Rate WHERE value = 0.0 AND currencyCode = :currencyCode AND isLatest = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (currencyCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, currencyCode);
    }
    return RxRoom.createSingle(new Callable<List<Rate>>() {
      @Override
      public List<Rate> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCoinCode = CursorUtil.getColumnIndexOrThrow(_cursor, "coinCode");
          final int _cursorIndexOfCurrencyCode = CursorUtil.getColumnIndexOrThrow(_cursor, "currencyCode");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfIsLatest = CursorUtil.getColumnIndexOrThrow(_cursor, "isLatest");
          final List<Rate> _result = new ArrayList<Rate>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Rate _item;
            final String _tmpCoinCode;
            _tmpCoinCode = _cursor.getString(_cursorIndexOfCoinCode);
            final String _tmpCurrencyCode;
            _tmpCurrencyCode = _cursor.getString(_cursorIndexOfCurrencyCode);
            final BigDecimal _tmpValue;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfValue);
            _tmpValue = __databaseConverters.fromString(_tmp);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final boolean _tmpIsLatest;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsLatest);
            _tmpIsLatest = _tmp_1 != 0;
            _item = new Rate(_tmpCoinCode,_tmpCurrencyCode,_tmpValue,_tmpTimestamp,_tmpIsLatest);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
