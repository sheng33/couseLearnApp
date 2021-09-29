package com.joe.jetpackdemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joe.jetpackdemo.db.repository.UserRepository
import kotlinx.coroutines.launch


class CourseModel constructor(
    private val repository: UserRepository
) : ViewModel() {
    var list = MutableLiveData<ArrayList<String>>()


}