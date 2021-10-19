package com.joe.jetpackdemo.viewmodel

import android.content.SharedPreferences
import com.joe.jetpackdemo.ui.adapter.NotesAdapter

object LoginUser {
    var userId:Long = 0
    lateinit var notesAdapter:NotesAdapter
    lateinit var sharedPreference: SharedPreferences
}