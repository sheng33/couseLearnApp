package com.joe.jetpackdemo.db

import android.content.Context
import android.util.Log
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.joe.jetpackdemo.common.BaseConstant
import com.joe.jetpackdemo.db.dao.CourseDao
import com.joe.jetpackdemo.db.dao.UserDao
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.db.data.User
import com.joe.jetpackdemo.utils.AppPrefsUtils
import com.joe.jetpackdemo.worker.CourseWorker

/**
 * 数据库文件
 */
@Database(entities = [User::class, Course::class],version = 3,exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDataBase:RoomDatabase() {
    // 得到UserDao
    abstract fun userDao():UserDao
    abstract fun courseDao():CourseDao

    companion object{
        @Volatile
        private var instance:AppDataBase? = null

        fun getInstance(context: Context):AppDataBase{
            return instance?: synchronized(this){
                instance?:buildDataBase(context)
                    .also {
                        instance = it
                    }
            }
        }

        private fun buildDataBase(context: Context):AppDataBase{
            return Room
                .databaseBuilder(context,AppDataBase::class.java,"jetPackDemo-database")
                .addCallback(object :RoomDatabase.Callback(){
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        val isFirstLaunch = AppPrefsUtils.getBoolean(BaseConstant.IS_FIRST_LAUNCH)
                        if(isFirstLaunch){
                            // 读取课程的集合
                            val request = OneTimeWorkRequestBuilder<CourseWorker>().build()
                            Log.d("课程集合",request.toString())
                            WorkManager.getInstance().enqueue(request)
                        }

                    }
                })
                .build()
        }
    }
}