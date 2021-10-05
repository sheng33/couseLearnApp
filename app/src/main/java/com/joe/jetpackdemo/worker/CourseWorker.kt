package com.joe.jetpackdemo.worker

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.joe.jetpackdemo.common.BaseConstant
import com.joe.jetpackdemo.db.RepositoryProvider
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.utils.AppPrefsUtils
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import java.lang.Exception

class CourseWorker(
        context: Context,
        workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    private val TAG by lazy {
        CourseWorker::class.java.simpleName
    }

    // 指定Dispatchers
    override val coroutineContext: CoroutineDispatcher
        get() = Dispatchers.IO

    override suspend fun doWork(): Result = coroutineScope {
        try {
            applicationContext.assets.open("course.json").use {
                JsonReader(it.reader()).use {
                    val courseType = object : TypeToken<List<Course>>() {}.type
                    val courseList: List<Course> = Gson().fromJson(it, courseType)

                    val courseDao = RepositoryProvider.providerCourseRepository(applicationContext)
                    courseDao.insertCourses(courseList)
                    for (i in 0..6) {
                        for (course in courseList) {
                            course.id += courseList.size
                        }
                        courseDao.insertCourses(courseList)
                    }
                    AppPrefsUtils.putBoolean(BaseConstant.IS_FIRST_LAUNCH,false)
                    Result.success()
                }

            }
        } catch (ex: Exception) {
            Log.e(TAG, "Error seeding database", ex)
            Result.failure()
        }
    }

}