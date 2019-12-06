package app.odapplications.bitstashwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import app.odapplications.bitstashwallet.entities.PriceAlertRecord;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PriceAlertsDao_Impl implements PriceAlertsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PriceAlertRecord> __insertionAdapterOfPriceAlertRecord;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  public PriceAlertsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPriceAlertRecord = new EntityInsertionAdapter<PriceAlertRecord>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `PriceAlertRecord` (`coinCode`,`stateRaw`,`lastRate`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PriceAlertRecord value) {
        if (value.getCoinCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCoinCode());
        }
        stmt.bindLong(2, value.getStateRaw());
        final String _tmp;
        _tmp = __databaseConverters.toString(value.getLastRate());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
  }

  @Override
  public void update(final PriceAlertRecord priceAlert) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPriceAlertRecord.insert(priceAlert);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<PriceAlertRecord> all() {
    final String _sql = "SELECT * FROM PriceAlertRecord";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfCoinCode = CursorUtil.getColumnIndexOrThrow(_cursor, "coinCode");
      final int _cursorIndexOfStateRaw = CursorUtil.getColumnIndexOrThrow(_cursor, "stateRaw");
      final int _cursorIndexOfLastRate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastRate");
      final List<PriceAlertRecord> _result = new ArrayList<PriceAlertRecord>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PriceAlertRecord _item;
        final String _tmpCoinCode;
        _tmpCoinCode = _cursor.getString(_cursorIndexOfCoinCode);
        final int _tmpStateRaw;
        _tmpStateRaw = _cursor.getInt(_cursorIndexOfStateRaw);
        final BigDecimal _tmpLastRate;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfLastRate);
        _tmpLastRate = __databaseConverters.fromString(_tmp);
        _item = new PriceAlertRecord(_tmpCoinCode,_tmpStateRaw,_tmpLastRate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int count() {
    final String _sql = "SELECT COUNT(*) FROM PriceAlertRecord";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public void delete(final List<String> coinCodes) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("DELETE FROM PriceAlertRecord WHERE coinCode IN(");
    final int _inputSize = coinCodes.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (String _item : coinCodes) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteExcluding(final List<String> coinCodes) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("DELETE FROM PriceAlertRecord WHERE coinCode NOT IN(");
    final int _inputSize = coinCodes.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (String _item : coinCodes) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
