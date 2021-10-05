package com.joe.jetpackdemo.db;

import java.lang.System;

/**
 * 数据库文件
 */
@androidx.room.TypeConverters(value = {com.joe.jetpackdemo.db.Converters.class})
@androidx.room.Database(entities = {com.joe.jetpackdemo.db.data.User.class, com.joe.jetpackdemo.db.data.Course.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/joe/jetpackdemo/db/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "courseDao", "Lcom/joe/jetpackdemo/db/dao/CourseDao;", "userDao", "Lcom/joe/jetpackdemo/db/dao/UserDao;", "Companion", "app_release"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    private static volatile com.joe.jetpackdemo.db.AppDataBase instance;
    public static final com.joe.jetpackdemo.db.AppDataBase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.joe.jetpackdemo.db.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.joe.jetpackdemo.db.dao.CourseDao courseDao();
    
    public AppDataBase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/joe/jetpackdemo/db/AppDataBase$Companion;", "", "()V", "instance", "Lcom/joe/jetpackdemo/db/AppDataBase;", "buildDataBase", "context", "Landroid/content/Context;", "getInstance", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.joe.jetpackdemo.db.AppDataBase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.joe.jetpackdemo.db.AppDataBase buildDataBase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}