package com.joe.jetpackdemo.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/joe/jetpackdemo/db/dao/CourseDao;", "", "deleteCourse", "", "course", "Lcom/joe/jetpackdemo/db/data/Course;", "findCourseById", "Landroidx/lifecycle/LiveData;", "id", "", "getAllCourse", "", "insertCourse", "updatCourse", "app_release"})
public abstract interface CourseDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM course WHERE courseId=:id")
    public abstract androidx.lifecycle.LiveData<com.joe.jetpackdemo.db.data.Course> findCourseById(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM course")
    public abstract java.util.List<com.joe.jetpackdemo.db.data.Course> getAllCourse();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCourse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.joe.jetpackdemo.db.data.Course> course);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCourse(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.data.Course course);
    
    @androidx.room.Delete()
    public abstract void deleteCourse(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.data.Course course);
    
    @androidx.room.Update()
    public abstract void updatCourse(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.data.Course course);
}