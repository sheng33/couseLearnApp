package com.joe.jetpackdemo.viewmodel

import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.joe.jetpackdemo.db.data.Course


class CourseModel : ViewModel() {
    var list = MutableLiveData<ArrayList<String>>()
    var requestBtnClickListener: View.OnClickListener? = null

}