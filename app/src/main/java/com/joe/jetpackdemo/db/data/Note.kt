package com.joe.jetpackdemo.db.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note (
    @ColumnInfo(name = "title") val title: String // 标题
    , @ColumnInfo(name = "正文") val context: String // 正文
    //, @Embedded val address: Address // 地址
    //, @Ignore val state: Int
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}