package com.joe.jetpackdemo.db

import android.content.Context
import com.joe.jetpackdemo.db.repository.CourseRepository
import com.joe.jetpackdemo.db.repository.UserRepository

object RepositoryProvider {

    /**
     * 得到用户仓库
     */
    fun providerUserRepository(context: Context): UserRepository {
        return UserRepository.getInstance(AppDataBase.getInstance(context).userDao())
    }
    fun providerCourseRepository(context: Context): CourseRepository {
        return CourseRepository.getInstance(AppDataBase.getInstance(context).courseDao())
    }



}