package com.joe.jetpackdemo.db.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.joe.jetpackdemo.db.dao.UserDao
import com.joe.jetpackdemo.db.data.User
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

/**
 * 用户处理仓库
 */
class UserRepository private constructor(private val userDao: UserDao) {

    /**
     * 获取所有的用户
     */
    fun getAllUsers() = userDao.getAllUsers()

    /**
     * 根据id选择用户
     */
    fun findUserById(id: Long):LiveData<User>
            = userDao.findUserById(id)

    /**
     * 登录用户
     */
    fun login(account: String, pwd: String):LiveData<User?>{
        return userDao.login(account,pwd)
    }
    fun loginByPhone(account: String, pwd: String):LiveData<User?>{
        return userDao.loginByPhone(account,pwd)
    }
    /**
     * 更新用户
     */
    suspend fun updateUser(user:User) {
        withContext(IO) {
            userDao.updateUser(user)
        }
    }

    /**
     * 注册一个用户
     */
    suspend fun register(email: String, account: String, pwd: String):Long {
        Log.d("注册",userDao.findUserById(0).value.toString())
        return withContext(IO) {
             userDao.insertUser(User(account, pwd, email,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic21.nipic.com%2F20120606%2F5137861_093119370162_2.jpg","18112345634"))
        }
    }

    companion object {
        @Volatile
        private var instance: UserRepository? = null
        fun getInstance(userDao: UserDao): UserRepository =
            instance ?: synchronized(this) {
                instance
                    ?: UserRepository(userDao).also {
                    instance = it
                }
            }
    }
}