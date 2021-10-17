package com.joe.jetpackdemo.db.data

import androidx.room.*

/**
 * 用户表
 */
@Entity(tableName = "user")
data class User(
    @ColumnInfo(name = "user_account") val account: String // 账号
    , @ColumnInfo(name = "user_pwd") var pwd: String // 密码
    , @ColumnInfo(name = "user_name") var name: String // 用户名
    , @ColumnInfo(name = "user_url") var headImage:String // 头像地址
    , @ColumnInfo(name = "user_phone") var userPhone:String // 头像地址
    //, @Embedded val address: Address // 地址
    //, @Ignore val state: Int
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0
}
