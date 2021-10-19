package com.joe.jetpackdemo.db.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
class Tag (
    @ColumnInfo(name = "title") var title: String // 标题
    ,@ColumnInfo(name = "color") var color: Int // 标题
){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}