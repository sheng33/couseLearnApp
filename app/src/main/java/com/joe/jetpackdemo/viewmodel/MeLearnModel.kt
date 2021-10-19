package com.joe.jetpackdemo.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.joe.jetpackdemo.db.data.Course
import java.util.*

object MeLearnModel : ViewModel() {
    var list = MutableLiveData<ArrayList<Course>>()

    fun addCourse(course: Course){
        if(list.value==null){
            list.value = arrayListOf()
        }
        Log.d("chu",course.toString())
        list.value?.add(course)
    }


}