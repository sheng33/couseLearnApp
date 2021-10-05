package com.joe.jetpackdemo.ui.fragment.main.me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.joe.jetpackdemo.R
import mehdi.sakout.aboutpage.AboutPage
import mehdi.sakout.aboutpage.Element


class AboutFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var aboutPage =  AboutPage(context)
            .isRTL(false)
            .setDescription(getString(R.string.app_description))
            .setImage(R.drawable.head_image)
            .addGroup("应用介绍")
            .addGroup("小组成员：盛嘉伟 胡琪勇")
            .addItem(Element().setTitle("Version 1.0"))
            .create()
        return aboutPage
    }
}