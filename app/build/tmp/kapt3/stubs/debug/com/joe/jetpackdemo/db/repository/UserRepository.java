package com.joe.jetpackdemo.db.repository;

import java.lang.System;

/**
 * 用户处理仓库
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ)\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/joe/jetpackdemo/db/repository/UserRepository;", "", "userDao", "Lcom/joe/jetpackdemo/db/dao/UserDao;", "(Lcom/joe/jetpackdemo/db/dao/UserDao;)V", "findUserById", "Landroidx/lifecycle/LiveData;", "Lcom/joe/jetpackdemo/db/data/User;", "id", "", "getAllUsers", "", "login", "account", "", "pwd", "register", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "", "user", "(Lcom/joe/jetpackdemo/db/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class UserRepository {
    private final com.joe.jetpackdemo.db.dao.UserDao userDao = null;
    private static volatile com.joe.jetpackdemo.db.repository.UserRepository instance;
    public static final com.joe.jetpackdemo.db.repository.UserRepository.Companion Companion = null;
    
    /**
     * 获取所有的用户
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.joe.jetpackdemo.db.data.User> getAllUsers() {
        return null;
    }
    
    /**
     * 根据id选择用户
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.joe.jetpackdemo.db.data.User> findUserById(long id) {
        return null;
    }
    
    /**
     * 登录用户
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.joe.jetpackdemo.db.data.User> login(@org.jetbrains.annotations.NotNull()
    java.lang.String account, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return null;
    }
    
    /**
     * 更新用户
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.data.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * 注册一个用户
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String account, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p3) {
        return null;
    }
    
    private UserRepository(com.joe.jetpackdemo.db.dao.UserDao userDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/joe/jetpackdemo/db/repository/UserRepository$Companion;", "", "()V", "instance", "Lcom/joe/jetpackdemo/db/repository/UserRepository;", "getInstance", "userDao", "Lcom/joe/jetpackdemo/db/dao/UserDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.joe.jetpackdemo.db.repository.UserRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.joe.jetpackdemo.db.dao.UserDao userDao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}