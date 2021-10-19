package com.joe.jetpackdemo.viewmodel

import android.text.Editable
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.joe.jetpackdemo.common.listener.SimpleWatcher
import com.joe.jetpackdemo.db.data.User
import com.joe.jetpackdemo.db.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MeModel constructor(
        private val repository: UserRepository
) : ViewModel() {
    var user: LiveData<User>? = null
    var name = MutableLiveData("")
    var password = MutableLiveData("")
    var userDao: User? = null
    fun getUserInfo(id: Long) {
        user = repository.findUserById(id)
        user!!.observeForever {
            userDao = it
        }
        name.value = user!!.value?.name
        password.value = user!!.value?.pwd

    }

    // SimpleWatcher 是简化了的TextWatcher
    val nameWatcher = object : SimpleWatcher() {
        override fun afterTextChanged(s: Editable?) {
            super.afterTextChanged(s)
            user?.value?.name = s.toString()
        }
    }

    fun updateName() {
        GlobalScope.launch(Dispatchers.IO) {
            user?.value?.let { repository.updateUser(it) }
        }
    }
}