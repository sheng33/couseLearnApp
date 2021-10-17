package com.joe.jetpackdemo.viewmodel

import android.text.Editable
import android.util.Log
import androidx.lifecycle.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.joe.jetpackdemo.common.BaseApplication
import com.joe.jetpackdemo.common.listener.SimpleWatcher
import com.joe.jetpackdemo.db.RepositoryProvider
import com.joe.jetpackdemo.db.data.User
import com.joe.jetpackdemo.db.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginModel constructor(
    private val repository: UserRepository
) : ViewModel() {

    val n = MutableLiveData("1")
    val p = MutableLiveData("1")
    val enable = MutableLiveData(true)

    /*val n = ObservableField<String>("")
    val p = ObservableField<String>("")*/
    //lateinit var lifecycleOwner: LifecycleOwner

    /**
     * 用户名改变回调的函数
     */
    fun onNameChanged(s: CharSequence) {
        //n.set(s.toString())
        n.value = s.toString()
        judgeEnable()
    }

    private fun judgeEnable(){
        enable.value = n.value!!.isNotEmpty() && p.value!!.isNotEmpty()
    }

    /**
     * 密码改变的回调函数
     */
    fun onPwdChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        //p.set(s.toString())
        p.value = s.toString()
        judgeEnable()
    }

    // SimpleWatcher 是简化了的TextWatcher
    val nameWatcher = object : SimpleWatcher() {
        override fun afterTextChanged(s: Editable?) {
            super.afterTextChanged(s)
            n.value = s.toString()
            //n.set(s.toString())
            judgeEnable()
        }
    }

    val pwdWatcher = object : SimpleWatcher() {
        override fun afterTextChanged(s: Editable?) {
            super.afterTextChanged(s)
            //p.set(s.toString())
            p.value = s.toString()
            judgeEnable()
        }
    }

    fun login(): LiveData<User?>? {
        val pwd = p.value!!
        val account = n.value!!
        GlobalScope.launch {
            with(Dispatchers.IO){
                repository.getAllUsers().forEach {
                    Log.d("所有用户",it.toString())
                }
            }
        }
        return repository.login(account, pwd)
    }
    fun loginByPhone(): LiveData<User?>? {
        val pwd = p.value!!
        val account = n.value!!
        return repository.loginByPhone(account, pwd)
    }

//
//    /**
//     * 第一次启动的时候调用
//     */
//    fun onFirstLaunch():String {
//        val context = BaseApplication.context
//        context.assets.open("shoes.json").use {
//            JsonReader(it.reader()).use {
//                val shoeType = object : TypeToken<List<Shoe>>() {}.type
//                val shoeList: List<Shoe> = Gson().fromJson(it, shoeType)
//
//                val shoeDao = RepositoryProvider.providerShoeRepository(context)
//                shoeDao.insertShoes(shoeList)
//                for (i in 0..2) {
//                    for (shoe in shoeList) {
//                        shoe.id += shoeList.size
//                    }
//                    shoeDao.insertShoes(shoeList)
//                }
//            }
//
//        }
//        return "初始化数据成功！"
//    }
}