package com.joe.jetpackdemo.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/joe/jetpackdemo/db/RepositoryProvider;", "", "()V", "providerCourseRepository", "Lcom/joe/jetpackdemo/db/repository/CourseRepository;", "context", "Landroid/content/Context;", "providerUserRepository", "Lcom/joe/jetpackdemo/db/repository/UserRepository;", "app_debug"})
public final class RepositoryProvider {
    public static final com.joe.jetpackdemo.db.RepositoryProvider INSTANCE = null;
    
    /**
     * 得到用户仓库
     */
    @org.jetbrains.annotations.NotNull()
    public final com.joe.jetpackdemo.db.repository.UserRepository providerUserRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.joe.jetpackdemo.db.repository.CourseRepository providerCourseRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private RepositoryProvider() {
        super();
    }
}