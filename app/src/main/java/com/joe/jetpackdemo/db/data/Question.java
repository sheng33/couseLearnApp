package com.joe.jetpackdemo.db.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity(tableName = "question")
public class Question implements Serializable {
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

    /*提问的老师*/
    @ColumnInfo(name = "teacherId")
    private int teacherId;
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    /*提问者*/
    @ColumnInfo(name = "questioner")
    private String questioner;
    public String getQuestioner() {
        return questioner;
    }
    public void setQuestioner(String questioner) {
        this.questioner = questioner;
    }

    /*提问内容*/
    @ColumnInfo(name = "content")
    private String content;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    /*回复内容*/
    @ColumnInfo(name = "reply")
    private String reply;
    public String getReply() {
        return reply;
    }
    public void setReply(String reply) {
        this.reply = reply;
    }

    /*提问时间*/
    @ColumnInfo(name = "addTime")
    private String addTime;
    public String getAddTime() {
        return addTime;
    }
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

}