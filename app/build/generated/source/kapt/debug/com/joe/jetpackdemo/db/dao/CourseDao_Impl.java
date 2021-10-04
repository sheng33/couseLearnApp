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
import com.joe.jetpackdemo.db.data.Course;
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
public final class CourseDao_Impl implements CourseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Course> __insertionAdapterOfCourse;

  private final EntityDeletionOrUpdateAdapter<Course> __deletionAdapterOfCourse;

  private final EntityDeletionOrUpdateAdapter<Course> __updateAdapterOfCourse;

  public CourseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCourse = new EntityInsertionAdapter<Course>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `course` (`courseId`,`course_name`,`course_content`,`course_img_url`,`createTime`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Course value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getImgUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImgUrl());
        }
        if (value.getCreateTime() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreateTime());
        }
      }
    };
    this.__deletionAdapterOfCourse = new EntityDeletionOrUpdateAdapter<Course>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `course` WHERE `courseId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Course value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCourse = new EntityDeletionOrUpdateAdapter<Course>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `course` SET `courseId` = ?,`course_name` = ?,`course_content` = ?,`course_img_url` = ?,`createTime` = ? WHERE `courseId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Course value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getImgUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImgUrl());
        }
        if (value.getCreateTime() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreateTime());
        }
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public void insertCourse(final List<Course> course) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCourse.insert(course);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCourse(final Course course) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCourse.insert(course);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCourse(final Course course) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCourse.handle(course);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatCourse(final Course course) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCourse.handle(course);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<Course> findCourseById(final long id) {
    final String _sql = "SELECT * FROM course WHERE courseId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"course"}, false, new Callable<Course>() {
      @Override
      public Course call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "courseId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "course_name");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "course_content");
          final int _cursorIndexOfImgUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "course_img_url");
          final int _cursorIndexOfCreateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "createTime");
          final Course _result;
          if(_cursor.moveToFirst()) {
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpContent;
            _tmpContent = _cursor.getString(_cursorIndexOfContent);
            final String _tmpImgUrl;
            _tmpImgUrl = _cursor.getString(_cursorIndexOfImgUrl);
            final String _tmpCreateTime;
            _tmpCreateTime = _cursor.getString(_cursorIndexOfCreateTime);
            _result = new Course(_tmpName,_tmpContent,_tmpImgUrl,_tmpCreateTime);
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
  public List<Course> getAllCourse() {
    final String _sql = "SELECT * FROM course";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "courseId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "course_name");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "course_content");
      final int _cursorIndexOfImgUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "course_img_url");
      final int _cursorIndexOfCreateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "createTime");
      final List<Course> _result = new ArrayList<Course>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Course _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpContent;
        _tmpContent = _cursor.getString(_cursorIndexOfContent);
        final String _tmpImgUrl;
        _tmpImgUrl = _cursor.getString(_cursorIndexOfImgUrl);
        final String _tmpCreateTime;
        _tmpCreateTime = _cursor.getString(_cursorIndexOfCreateTime);
        _item = new Course(_tmpName,_tmpContent,_tmpImgUrl,_tmpCreateTime);
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
