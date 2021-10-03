package com.joe.jetpackdemo.db.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity(tableName = "homeworkTask")
public class HomeworkTask implements Serializable {
    /*记录编号*/
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "homeworkId")
    private int homeworkId;
    public int getHomeworkId() {
        return homeworkId;
    }
    public void setHomeworkId(int homeworkId) {
        this.homeworkId = homeworkId;
    }

    /*老师*/
    @ColumnInfo(name = "teacherObj")
    private int teacherObj;
    public int getTeacherObj() {
        return teacherObj;
    }
    public void setTeacherObj(int teacherObj) {
        this.teacherObj = teacherObj;
    }

    /*作业标题*/
    @ColumnInfo(name = "title")
    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    /*作业内容*/
    @ColumnInfo(name = "content")
    private String content;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    /*发布时间*/
    @ColumnInfo(name = "addTime")
    private String addTime;
    public String getAddTime() {
        return addTime;
    }
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

}