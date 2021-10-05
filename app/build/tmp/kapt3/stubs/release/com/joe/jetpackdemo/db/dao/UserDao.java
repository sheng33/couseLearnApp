package com.joe.jetpackdemo.db.dao;

import java.lang.System;

/**
 * 用户的Dao
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J \u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/joe/jetpackdemo/db/dao/UserDao;", "", "deleteUser", "", "user", "Lcom/joe/jetpackdemo/db/data/User;", "findUserById", "Landroidx/lifecycle/LiveData;", "id", "", "getAllUsers", "", "insertUser", "login", "account", "", "pwd", "updateUser", "app_release"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user WHERE user_account = :account AND user_pwd = :pwd")
    public abstract androidx.lifecycle.LiveData<com.joe.jetpackdemo.db.data.User> login(@org.jetbrains.annotations.NotNull()
    java.lang.String account, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user WHERE id=:id")
    public abstract androidx.lifecycle.LiveData<com.joe.jetpackdemo.db.data.User> findUserById(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user")
    public abstract java.util.List<com.joe.jetpackdemo.db.data.User> getAllUsers();
    
    @androidx.room.Insert()
    public abstract long insertUser(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.data.User user);
    
    @androidx.room.Delete()
    public abstract void deleteUser(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.data.User user);
    
    @androidx.room.Update()
    public abstract void updateUser(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.data.User user);
}