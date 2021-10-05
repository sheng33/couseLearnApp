package com.joe.jetpackdemo.db.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity(tableName = "exercise")
public class Exercise implements Serializable {
    /*记录编号*/
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /*习题名称*/
    @ColumnInfo(name = "title")
    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    /*所在章*/
    @ColumnInfo(name = "chapterId")
    private int chapterId;
    public int getChapterId() {
        return chapterId;
    }
    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    /*练习内容*/
    @ColumnInfo(name = "content")
    private String content;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    /*加入时间*/
    @ColumnInfo(name = "addTime")
    private String addTime;
    public String getAddTime() {
        return addTime;
    }
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

}