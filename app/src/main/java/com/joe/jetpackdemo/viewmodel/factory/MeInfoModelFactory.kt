package com.joe.jetpackdemo.viewmodel.factory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.joe.jetpackdemo.db.repository.UserRepository
import com.joe.jetpackdemo.viewmodel.LoginModel
import com.joe.jetpackdemo.viewmodel.MeModel

class MeInfoModelFactory (
        private val repository: UserRepository
        , private val context: Context
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MeModel(repository) as T
    }
}