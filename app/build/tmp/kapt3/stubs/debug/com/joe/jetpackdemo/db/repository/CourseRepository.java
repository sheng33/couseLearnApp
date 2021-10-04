package com.joe.jetpackdemo.db.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\u0014\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/joe/jetpackdemo/db/repository/CourseRepository;", "", "courseDao", "Lcom/joe/jetpackdemo/db/dao/CourseDao;", "(Lcom/joe/jetpackdemo/db/dao/CourseDao;)V", "getAllUsers", "", "Lcom/joe/jetpackdemo/db/data/Course;", "getTestingListmodel", "Ljava/util/ArrayList;", "insertCourse", "", "course", "insertCourses", "Companion", "app_debug"})
public final class CourseRepository {
    private final com.joe.jetpackdemo.db.dao.CourseDao courseDao = null;
    private static volatile com.joe.jetpackdemo.db.repository.CourseRepository instance;
    public static final com.joe.jetpackdemo.db.repository.CourseRepository.Companion Companion = null;
    
    /**
     * 获取所有的课程
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.joe.jetpackdemo.db.data.Course> getAllUsers() {
        return null;
    }
    
    public final void insertCourses(@org.jetbrains.annotations.NotNull()
    java.util.List<com.joe.jetpackdemo.db.data.Course> course) {
    }
    
    public final void insertCourse(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.data.Course course) {
    }
    
    /**
     * 测试数据
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.joe.jetpackdemo.db.data.Course> getTestingListmodel() {
        return null;
    }
    
    private CourseRepository(com.joe.jetpackdemo.db.dao.CourseDao courseDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/joe/jetpackdemo/db/repository/CourseRepository$Companion;", "", "()V", "instance", "Lcom/joe/jetpackdemo/db/repository/CourseRepository;", "getInstance", "courseDao", "Lcom/joe/jetpackdemo/db/dao/CourseDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.joe.jetpackdemo.db.repository.CourseRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.joe.jetpackdemo.db.dao.CourseDao courseDao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}