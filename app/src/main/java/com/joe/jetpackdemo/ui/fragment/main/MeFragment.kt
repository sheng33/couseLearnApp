package com.joe.jetpackdemo.ui.fragment.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.databinding.MeFragmentBindingImpl
import com.joe.jetpackdemo.databinding.MeInfoFragmentBindingImpl
import com.joe.jetpackdemo.ui.fragment.main.me.AboutFragment
import com.joe.jetpackdemo.viewmodel.CustomViewModelProvider
import com.joe.jetpackdemo.viewmodel.LoginUser
import com.joe.jetpackdemo.viewmodel.MeModel
import com.vansuita.gaussianblur.GaussianBlur
import jp.wasabeef.glide.transformations.BitmapTransformation
import jp.wasabeef.glide.transformations.BlurTransformation
import jp.wasabeef.glide.transformations.CropCircleTransformation
import jp.wasabeef.glide.transformations.CropTransformation
import kotlinx.android.synthetic.main.me_fragment.*

class MeFragment : Fragment()  {
    private val meModel: MeModel by viewModels {
        CustomViewModelProvider.providerMeModel(requireContext())
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        //  将背景图进行高斯模糊
        val binding: MeFragmentBindingImpl = DataBindingUtil.inflate(
                inflater, R.layout.me_fragment, container, false
        )
        LoginUser.userId = activity?.intent?.getLongExtra("loginId",0)!!
        onSubscribeUi(binding)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        userBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.meInfoFragment)

            Toast.makeText(context, "用户管理", Toast.LENGTH_SHORT).show()
        }
        courseBtn.setOnClickListener {
            Toast.makeText(context, "课程管理", Toast.LENGTH_SHORT).show()
        }
        about.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.aboutFragment)
            Toast.makeText(context, "关于我们", Toast.LENGTH_SHORT).show()
        }
    }
    private fun onSubscribeUi(binding: MeFragmentBindingImpl) {
        GaussianBlur.with(context).put(R.drawable.head_back, binding.root.findViewById(R.id.h_back));
        binding.model = meModel
        binding.activity = activity
        // 如果使用LiveData下面这句必须加上 ！！！
        binding.lifecycleOwner = this
        meModel.getUserInfo(LoginUser.userId)
    }
}