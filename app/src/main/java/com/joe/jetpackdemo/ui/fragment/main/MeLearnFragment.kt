package com.joe.jetpackdemo.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.joe.jetpackdemo.R

class MeLearnFragment: Fragment()  {
    // 创建视图
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.notes_fragment, container, false)

        return view
    }
    //添加动作事件
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }

}