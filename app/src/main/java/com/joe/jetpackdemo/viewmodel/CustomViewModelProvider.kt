package com.joe.jetpackdemo.viewmodel

import android.content.Context
import com.joe.jetpackdemo.common.BaseConstant
import com.joe.jetpackdemo.db.RepositoryProvider
import com.joe.jetpackdemo.db.repository.UserRepository
import com.joe.jetpackdemo.utils.AppPrefsUtils
import com.joe.jetpackdemo.viewmodel.factory.*

/**
 * ViewModel提供者
 */
object CustomViewModelProvider {

    fun providerRegisterModel(context: Context): RegisterModelFactory {
        val repository: UserRepository = RepositoryProvider.providerUserRepository(context)
        return RegisterModelFactory(repository)
    }

    fun providerLoginModel(context: Context): LoginModelFactory {
        val repository: UserRepository = RepositoryProvider.providerUserRepository(context)
        return LoginModelFactory(repository, context)
    }




}