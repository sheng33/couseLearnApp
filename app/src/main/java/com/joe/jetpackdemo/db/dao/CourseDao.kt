package com.joe.jetpackdemo.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.joe.jetpackdemo.db.data.Course

@Dao
interface CourseDao {
    @Query("SELECT * FROM course WHERE courseId=:id")
    fun findCourseById(id:Long): LiveData<Course>
    @Query("SELECT * FROM course")
    fun getAllCourse():List<Course>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCourse(course: List<Course>)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCourse(course: Course)
    @Delete
    fun deleteCourse(course: Course)
    @Update
    fun updatCourse(course: Course)
}