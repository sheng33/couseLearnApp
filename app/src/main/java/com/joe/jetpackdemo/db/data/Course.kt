package com.joe.jetpackdemo.db.data

import android.view.View
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "course")
data class Course(
        @ColumnInfo(name = "course_name") val name: String // 课程名
        , @ColumnInfo(name = "course_content") val content: String // 正文
        , @ColumnInfo(name = "course_img_url") val imgUrl: String // 图片链接
        , @ColumnInfo(name = "createTime") var createTime: String // 创建时间
        , var requestBtnClickListener: View.OnClickListener? = null
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "courseId")
    var id: Long = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Course

        if (name != other.name) return false
        if (content != other.content) return false
        if (imgUrl != other.imgUrl) return false
        if (createTime != other.createTime) return false
        if (id != other.id) return false
        if (requestBtnClickListener != other.requestBtnClickListener) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + content.hashCode()
        result = 31 * result + imgUrl.hashCode()
        result = 31 * result + createTime.hashCode()
        result = 31 * result + id.hashCode()
        result = 31 * result + (requestBtnClickListener?.hashCode() ?: 0)
        return result
    }

}