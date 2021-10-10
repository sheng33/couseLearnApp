package com.joe.jetpackdemo.db.repository

import com.joe.jetpackdemo.db.dao.CourseDao
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.viewmodel.CourseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.ArrayList

class CourseRepository private constructor(private val courseDao: CourseDao){
    /**
     * 获取所有的课程
     */
    fun getAllUsers() = courseDao.getAllCourse()


    fun insertCourses(course: List<Course>) = courseDao.insertCourse(course)

    fun insertCourse(course: Course) = courseDao.insertCourse(course)
    /**
     * 测试数据
     */
    fun getTestingListmodel(): ArrayList<Course>? {
        val items = ArrayList<Course>()
        items.add(Course("计算机科学与技术1","ttttt","https://edu-image.nosdn.127.net/7A5D2D50370DE227BAF6E94747C51AF2.jpg","2020-05-21"))
//        items.add(Course("计算机科学与技术2","ttttt","https://edu-image.nosdn.127.net/7A5D2D50370DE227BAF6E94747C51AF2.jpg","2020-05-21"))
//        items.add(Course("计算机科学与技术3","ttttt","https://edu-image.nosdn.127.net/7A5D2D50370DE227BAF6E94747C51AF2.jpg","2020-05-21"))
        return items
    }

    companion object {
        @Volatile
        private var instance: CourseRepository? = null
        fun getInstance(courseDao: CourseDao): CourseRepository =
                instance ?: synchronized(this) {
                    instance
                            ?: CourseRepository(courseDao).also {
                                instance = it
                            }
                }
    }
}