package com.joe.jetpackdemo.ui.activity

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback
import com.joe.jetpackdemo.R
import kotlinx.android.synthetic.main.toolbar_activity.*

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS)
        setExitSharedElementCallback(MaterialContainerTransformSharedElementCallback())
        window.sharedElementsUseOverlay = false
        setContentView(R.layout.sign_activity)
        breakBtn.setOnClickListener {
            finish()
        }
        titleText.text = "签到界面"
    }
}