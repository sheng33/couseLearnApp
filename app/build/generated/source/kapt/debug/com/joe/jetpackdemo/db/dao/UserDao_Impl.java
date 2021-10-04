package com.joe.jetpackdemo.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.joe.jetpackdemo.db.data.User;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter<User> __deletionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter<User> __updateAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `user` (`id`,`user_account`,`user_pwd`,`user_name`,`user_url`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getAccount() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAccount());
        }
        if (value.getPwd() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPwd());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getHeadImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHeadImage());
        }
      }
    };
    this.__deletionAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `user` SET `id` = ?,`user_account` = ?,`user_pwd` = ?,`user_name` = ?,`user_url` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getAccount() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAccount());
        }
        if (value.getPwd() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPwd());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getHeadImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHeadImage());
        }
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public long insertUser(final User user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUser.insertAndReturnId(user);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUser(final User user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUser(final User user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<User> login(final String account, final String pwd) {
    final String _sql = "SELECT * FROM user WHERE user_account = ? AND user_pwd = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (account == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, account);
    }
    _argIndex = 2;
    if (pwd == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, pwd);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"user"}, false, new Callable<User>() {
      @Override
      public User call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "user_account");
          final int _cursorIndexOfPwd = CursorUtil.getColumnIndexOrThrow(_cursor, "user_pwd");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "user_name");
          final int _cursorIndexOfHeadImage = CursorUtil.getColumnIndexOrThrow(_cursor, "user_url");
          final User _result;
          if(_cursor.moveToFirst()) {
            final String _tmpAccount;
            _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            final String _tmpPwd;
            _tmpPwd = _cursor.getString(_cursorIndexOfPwd);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpHeadImage;
            _tmpHeadImage = _cursor.getString(_cursorIndexOfHeadImage);
            _result = new User(_tmpAccount,_tmpPwd,_tmpName,_tmpHeadImage);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _result.setId(_tmpId);
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
  public LiveData<User> findUserById(final long id) {
    final String _sql = "SELECT * FROM user WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"user"}, false, new Callable<User>() {
      @Override
      public User call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "user_account");
          final int _cursorIndexOfPwd = CursorUtil.getColumnIndexOrThrow(_cursor, "user_pwd");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "user_name");
          final int _cursorIndexOfHeadImage = CursorUtil.getColumnIndexOrThrow(_cursor, "user_url");
          final User _result;
          if(_cursor.moveToFirst()) {
            final String _tmpAccount;
            _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            final String _tmpPwd;
            _tmpPwd = _cursor.getString(_cursorIndexOfPwd);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpHeadImage;
            _tmpHeadImage = _cursor.getString(_cursorIndexOfHeadImage);
            _result = new User(_tmpAccount,_tmpPwd,_tmpName,_tmpHeadImage);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _result.setId(_tmpId);
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
  public List<User> getAllUsers() {
    final String _sql = "SELECT * FROM user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "user_account");
      final int _cursorIndexOfPwd = CursorUtil.getColumnIndexOrThrow(_cursor, "user_pwd");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "user_name");
      final int _cursorIndexOfHeadImage = CursorUtil.getColumnIndexOrThrow(_cursor, "user_url");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        final String _tmpAccount;
        _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
        final String _tmpPwd;
        _tmpPwd = _cursor.getString(_cursorIndexOfPwd);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpHeadImage;
        _tmpHeadImage = _cursor.getString(_cursorIndexOfHeadImage);
        _item = new User(_tmpAccount,_tmpPwd,_tmpName,_tmpHeadImage);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
