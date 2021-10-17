package com.joe.jetpackdemo.ui.fragment.main.me

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.common.BaseConstant
import com.joe.jetpackdemo.databinding.CourseFragmentBinding
import com.joe.jetpackdemo.databinding.LoginFragmentBinding
import com.joe.jetpackdemo.databinding.MeInfoFragmentBindingImpl
import com.joe.jetpackdemo.ui.activity.MainActivity
import com.joe.jetpackdemo.utils.AppPrefsUtils
import com.joe.jetpackdemo.viewmodel.CustomViewModelProvider
import com.joe.jetpackdemo.viewmodel.LoginModel
import com.joe.jetpackdemo.viewmodel.LoginUser
import com.joe.jetpackdemo.viewmodel.MeModel
import java.util.Observer

class MeInfoFragment : Fragment() {
    private val meModel: MeModel by viewModels {
        CustomViewModelProvider.providerMeModel(requireContext())
    }
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val binding: MeInfoFragmentBindingImpl = DataBindingUtil.inflate(
                inflater, R.layout.me_info_fragment, container, false
        )
        onSubscribeUi(binding)
        return binding.root
    }

    private fun onSubscribeUi(binding: MeInfoFragmentBindingImpl) {
        binding.model = meModel
        binding.activity = activity
        // 如果使用LiveData下面这句必须加上 ！！！
        binding.lifecycleOwner = this
        meModel.getUserInfo(LoginUser.userId)
        var breackBtn = binding.root.findViewById<TextView>(R.id.brack)
        breackBtn.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
        var updateName = binding.root.findViewById<TextView>(R.id.updateName)
        var updateOk = binding.root.findViewById<TextView>(R.id.updateNameOk)
        var nameText = binding.root.findViewById<TextView>(R.id.nameText)
        updateName.setOnClickListener {
            nameText.isEnabled = true
            nameText.setTextColor(Color.parseColor("#000000"))
            updateName.visibility = View.GONE
            updateOk.visibility = View.VISIBLE

        }
        updateOk.setOnClickListener {
            binding.root.findViewById<TextView>(R.id.nameText).isEnabled = false
            nameText.setTextColor(Color.parseColor("#bdbdbd"))
            updateName.visibility = View.VISIBLE
            updateOk.visibility = View.GONE
            meModel.updateName()
            Toast.makeText(context, "修改成功", Toast.LENGTH_SHORT).show()
        }
    }

}