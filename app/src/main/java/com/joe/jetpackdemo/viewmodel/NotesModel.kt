package com.joe.jetpackdemo.viewmodel

import androidx.lifecycle.ViewModel
import com.joe.jetpackdemo.db.data.Note
import com.joe.jetpackdemo.dummy.DummyContent
import java.util.ArrayList

class NotesModel: ViewModel() {
    val notesList: MutableList<Note> = ArrayList()
    init{
        notesList.add(Note("test1","1111111"))
        notesList.add(Note("test2","2222222"))
        notesList.add(Note("test3","3333333"))
        notesList.add(Note("test4","1111111"))
        notesList.add(Note("test5","1111111"))
    }
}