package com.joe.jetpackdemo.db.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity(tableName = "student")
public class Student implements Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    public int getId() {return id;}
    public void setId(int id) {
        this.id = id;
    }
    /*学号*/
    @ColumnInfo(name = "student_Number")
    private String studentNumber;
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    /*登陆密码*/
    @ColumnInfo(name = "password")
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    /*姓名*/
    @ColumnInfo(name = "name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /*性别*/
    @ColumnInfo(name = "sex")
    private String sex;
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    /*出生日期*/
    @ColumnInfo(name = "birthday")
    private java.sql.Timestamp birthday;
    public java.sql.Timestamp getBirthday() {
        return birthday;
    }
    public void setBirthday(java.sql.Timestamp birthday) {
        this.birthday = birthday;
    }

    /*政治面貌*/
    @ColumnInfo(name = "zzmm")
    private String zzmm;
    public String getZzmm() {
        return zzmm;
    }
    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    /*所在班级*/
    @ColumnInfo(name = "className")
    private String className;
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    /*联系电话*/
    @ColumnInfo(name = "telephone")
    private String telephone;
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /*个人照片*/
    @ColumnInfo(name = "photo")
    private String photo;
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /*家庭地址*/
    @ColumnInfo(name = "address")
    private String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}