package com.joe.jetpackdemo.ui.activity

import android.os.Bundle
import android.util.Log
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
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity  : AppCompatActivity(),
PopupMenu.OnMenuItemClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS)
        setExitSharedElementCallback(MaterialContainerTransformSharedElementCallback())
        setSupportActionBar(toolbar)
        window.sharedElementsUseOverlay = false
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
        val navController = host.navController
        initBottomNavigationView(bnv_view, navController)
        more.setOnClickListener {
            Log.d("Test","11111111111111111")
            var btn: View = findViewById(R.id.more)
            val popup = PopupMenu(this, btn)
            val inflater: MenuInflater = popup.menuInflater
            inflater.inflate(R.menu.function_menu, popup.menu)
            popup.setOnMenuItemClickListener(this@MainActivity)
            popup.show()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.function_menu, menu)
        return true
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        if (item != null) {
            return when(item.itemId){
                R.id.scanBtn -> {
                    Toast.makeText(this, "扫一扫", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.stuSign->{
                    Toast.makeText(this, "签到", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.invite ->{
                    Toast.makeText(this, "邀请码", Toast.LENGTH_SHORT).show()
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
//        navController.addOnDestinationChangedListener { controller, destination, arguments ->
//            when(destination.id){
//                //当处于“我”界面时，显示右上角+号
//                R.id.meFragment -> more.visibility = View.VISIBLE
//                else -> more.visibility = View.GONE
//            }
//        }
    }
}