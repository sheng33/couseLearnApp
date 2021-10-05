package com.joe.jetpackdemo.db.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity(tableName = "teacher")
public class Teacher implements Serializable {
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

    /*姓名*/
    @ColumnInfo(name = "teacher_name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /*职称*/
    @ColumnInfo(name = "teacher_position")
    private String position;
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    /*密码*/
    @ColumnInfo(name = "password")
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    /*教师简介*/
    @ColumnInfo(name = "introduction")
    private String introduction;
    public String getIntroduction() {
        return introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}