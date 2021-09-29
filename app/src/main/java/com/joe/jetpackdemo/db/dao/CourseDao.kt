package com.joe.jetpackdemo.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.db.data.User

@Dao
interface CourseDao {
    @Query("SELECT * FROM course WHERE courseId=:id")
    fun findCourseById(id:Long): LiveData<Course>
    @Query("SELECT * FROM course")
    fun getAllCourse():List<Course>
    @Insert
    fun insertCourse(course: Course):Long
    @Delete
    fun deleteCourse(course: Course)
    @Update
    fun updatCourse(course: Course)
}