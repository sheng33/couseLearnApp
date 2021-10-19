package com.joe.jetpackdemo.viewmodel

import android.graphics.Color
import com.joe.jetpackdemo.db.data.Tag
import com.joe.jetpackdemo.dummy.DummyContent
import java.util.ArrayList

object TagModel {
    val tagList: MutableList<Tag> = ArrayList()
    init {
        tagList.add(Tag("读后感", Color.parseColor("#e79d5b")))
        tagList.add(Tag("观后感", Color.parseColor("#f5222d")))
    }
    fun getTagTitle(id:Int):String{
        return tagList[id].title
    }
    fun getTagColor(id:Int):Int{
        return tagList[id].color
    }
    fun addTag(tag:Tag):Int{
        tagList.add(tag)
        return tagList.size-1
    }
}