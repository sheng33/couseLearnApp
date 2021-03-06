package com.joe.jetpackdemo.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.viewmodel.LoginUser.sharedPreference
import com.wyt.searchbox.SearchFragment
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity  : AppCompatActivity(),
PopupMenu.OnMenuItemClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS)
        setExitSharedElementCallback(MaterialContainerTransformSharedElementCallback())
        val sharedPreferences = getSharedPreferences("art", MODE_PRIVATE)
        sharedPreference = sharedPreferences
        window.sharedElementsUseOverlay = false
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
        val navController = host.navController
        initBottomNavigationView(bnv_view, navController)
        //为右上角+号添加点击功能
        more.setOnClickListener {
            var btn: View = findViewById(R.id.more)
            val popup = PopupMenu(this, btn)
            val inflater: MenuInflater = popup.menuInflater
            inflater.inflate(R.menu.function_menu, popup.menu)
            popup.setOnMenuItemClickListener(this@MainActivity)
            popup.show()
        }
        edit.setOnClickListener {
            startActivity(Intent(this@MainActivity, PublishActivity::class.java))
        }
        val searchFragment = SearchFragment.newInstance()
        searchFragment.setOnSearchClickListener { keyword -> //这里处理逻辑
            Toast.makeText(this@MainActivity, keyword, Toast.LENGTH_SHORT).show()
        }
        search.setOnClickListener {
            searchFragment.showFragment(supportFragmentManager, SearchFragment.TAG);
        }
    }
    //创建右上角下拉菜单
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.function_menu, menu)
        return true
    }
    //为菜单选项添加点击事件
    override fun onMenuItemClick(item: MenuItem?): Boolean {
        if (item != null) {
            return when(item.itemId){
                R.id.scanBtn -> {
                    Toast.makeText(this, "扫一扫", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.stuSign -> {
                    Toast.makeText(this, "签到", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.invite -> {
                    Toast.makeText(this, "邀请码", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.teaSign -> {
                    val intent = Intent(
                        this,
                        SignActivity::class.java
                    )
                    startActivity(intent)
                    Toast.makeText(this, "老师开启签到", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
        return false
    }
    /**
     * Navigation绑定bottomNavigationView
     */
    private fun initBottomNavigationView(
        bottomNavigationView: BottomNavigationView,
        navController: NavController
    ) {
        bottomNavigationView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            when(destination.id){
                //当处于“我”界面时，显示右上角+号
                R.id.courseFragment -> {
                    mainTitle.setText("课程列表")
                    search.visibility = View.VISIBLE
                    search0.visibility = View.GONE
                    search1.visibility = View.GONE
                    search2.visibility = View.GONE
                    more.visibility = View.VISIBLE
                    edit.visibility = View.GONE
                    set.visibility = View.GONE
                }
                R.id.meFragment -> {
                    mainTitle.setText("个人界面")
                    search.visibility = View.GONE
                    more.visibility = View.GONE
                    search0.visibility = View.VISIBLE
                    search1.visibility = View.GONE
                    search2.visibility = View.GONE
                    edit.visibility = View.GONE
                    set.visibility = View.VISIBLE
                }
                R.id.notesFragment -> {
                    mainTitle.setText("笔记")
                    search.visibility = View.GONE
                    search0.visibility = View.VISIBLE
                    search1.visibility = View.GONE
                    search2.visibility = View.GONE
                    more.visibility = View.GONE
                    edit.visibility = View.VISIBLE
                    set.visibility = View.GONE
                }
                R.id.learnFragment -> {
                    mainTitle.setText("我的学习")
                    search.visibility = View.VISIBLE
                    search0.visibility = View.VISIBLE
                    search1.visibility = View.GONE
                    search2.visibility = View.GONE
                    more.visibility = View.GONE
                    edit.visibility = View.GONE
                    set.visibility = View.GONE


                }
            }
        }
    }
}