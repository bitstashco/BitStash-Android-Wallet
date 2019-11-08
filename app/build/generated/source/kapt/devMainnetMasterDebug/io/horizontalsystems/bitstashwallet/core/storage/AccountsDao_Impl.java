package io.horizontalsystems.bitstashwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.horizontalsystems.bitstashwallet.entities.AccountType;
import io.horizontalsystems.bitstashwallet.entities.SyncMode;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AccountsDao_Impl implements AccountsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AccountRecord> __insertionAdapterOfAccountRecord;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  private final EntityDeletionOrUpdateAdapter<AccountRecord> __updateAdapterOfAccountRecord;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfClearDeleted;

  public AccountsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAccountRecord = new EntityInsertionAdapter<AccountRecord>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `AccountRecord` (`deleted`,`id`,`name`,`type`,`isBackedUp`,`syncMode`,`words`,`derivation`,`salt`,`key`,`eosAccount`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AccountRecord value) {
        final int _tmp;
        _tmp = value.getDeleted() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        final int _tmp_1;
        _tmp_1 = value.isBackedUp() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        final String _tmp_2;
        _tmp_2 = __databaseConverters.toString(value.getSyncMode());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __databaseConverters.encryptSecretList(value.getWords());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = __databaseConverters.toString(value.getDerivation());
        if (_tmp_4 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_4);
        }
        final String _tmp_5;
        _tmp_5 = __databaseConverters.encryptSecretString(value.getSalt());
        if (_tmp_5 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_5);
        }
        final String _tmp_6;
        _tmp_6 = __databaseConverters.encryptSecretString(value.getKey());
        if (_tmp_6 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_6);
        }
        if (value.getEosAccount() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getEosAccount());
        }
      }
    };
    this.__updateAdapterOfAccountRecord = new EntityDeletionOrUpdateAdapter<AccountRecord>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `AccountRecord` SET `deleted` = ?,`id` = ?,`name` = ?,`type` = ?,`isBackedUp` = ?,`syncMode` = ?,`words` = ?,`derivation` = ?,`salt` = ?,`key` = ?,`eosAccount` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AccountRecord value) {
        final int _tmp;
        _tmp = value.getDeleted() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        final int _tmp_1;
        _tmp_1 = value.isBackedUp() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
        final String _tmp_2;
        _tmp_2 = __databaseConverters.toString(value.getSyncMode());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __databaseConverters.encryptSecretList(value.getWords());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = __databaseConverters.toString(value.getDerivation());
        if (_tmp_4 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_4);
        }
        final String _tmp_5;
        _tmp_5 = __databaseConverters.encryptSecretString(value.getSalt());
        if (_tmp_5 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_5);
        }
        final String _tmp_6;
        _tmp_6 = __databaseConverters.encryptSecretString(value.getKey());
        if (_tmp_6 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_6);
        }
        if (value.getEosAccount() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getEosAccount());
        }
        if (value.getId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getId());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE AccountRecord SET deleted = 1 WHERE id = :id";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE AccountRecord SET deleted = 1";
        return _query;
      }
    };
    this.__preparedStmtOfClearDeleted = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM AccountRecord WHERE deleted = 1";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AccountRecord accountRow) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAccountRecord.insert(accountRow);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final AccountRecord accountRow) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfAccountRecord.handle(accountRow);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
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
  public void clearDeleted() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearDeleted.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearDeleted.release(_stmt);
    }
  }

  @Override
  public List<AccountRecord> getAll() {
    final String _sql = "SELECT * FROM AccountRecord WHERE deleted = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfIsBackedUp = CursorUtil.getColumnIndexOrThrow(_cursor, "isBackedUp");
      final int _cursorIndexOfSyncMode = CursorUtil.getColumnIndexOrThrow(_cursor, "syncMode");
      final int _cursorIndexOfWords = CursorUtil.getColumnIndexOrThrow(_cursor, "words");
      final int _cursorIndexOfDerivation = CursorUtil.getColumnIndexOrThrow(_cursor, "derivation");
      final int _cursorIndexOfSalt = CursorUtil.getColumnIndexOrThrow(_cursor, "salt");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfEosAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "eosAccount");
      final List<AccountRecord> _result = new ArrayList<AccountRecord>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AccountRecord _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpType;
        _tmpType = _cursor.getString(_cursorIndexOfType);
        final boolean _tmpIsBackedUp;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsBackedUp);
        _tmpIsBackedUp = _tmp != 0;
        final SyncMode _tmpSyncMode;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfSyncMode);
        _tmpSyncMode = __databaseConverters.toSyncMode(_tmp_1);
        final SecretList _tmpWords;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfWords);
        _tmpWords = __databaseConverters.decryptSecretList(_tmp_2);
        final AccountType.Derivation _tmpDerivation;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfDerivation);
        _tmpDerivation = __databaseConverters.toDerivation(_tmp_3);
        final SecretString _tmpSalt;
        final String _tmp_4;
        _tmp_4 = _cursor.getString(_cursorIndexOfSalt);
        _tmpSalt = __databaseConverters.decryptSecretString(_tmp_4);
        final SecretString _tmpKey;
        final String _tmp_5;
        _tmp_5 = _cursor.getString(_cursorIndexOfKey);
        _tmpKey = __databaseConverters.decryptSecretString(_tmp_5);
        final String _tmpEosAccount;
        _tmpEosAccount = _cursor.getString(_cursorIndexOfEosAccount);
        _item = new AccountRecord(_tmpId,_tmpName,_tmpType,_tmpIsBackedUp,_tmpSyncMode,_tmpWords,_tmpDerivation,_tmpSalt,_tmpKey,_tmpEosAccount);
        final boolean _tmpDeleted;
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfDeleted);
        _tmpDeleted = _tmp_6 != 0;
        _item.setDeleted(_tmpDeleted);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getDeletedIds() {
    final String _sql = "SELECT id FROM AccountRecord WHERE deleted = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        _item = _cursor.getString(0);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flowable<Integer> getNonBackedUpCount() {
    final String _sql = "SELECT COUNT(*) FROM AccountRecord WHERE isBackedUp = 0 AND deleted = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"AccountRecord"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
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
  public int getTotalCount() {
    final String _sql = "SELECT COUNT(*) FROM AccountRecord WHERE deleted = 0";
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
}
