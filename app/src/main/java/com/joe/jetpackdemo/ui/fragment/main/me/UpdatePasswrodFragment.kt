package com.joe.jetpackdemo.ui.fragment.main.me

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.databinding.MeInfoFragmentBindingImpl
import com.joe.jetpackdemo.viewmodel.CustomViewModelProvider
import com.joe.jetpackdemo.viewmodel.LoginUser
import com.joe.jetpackdemo.viewmodel.MeModel
import kotlinx.android.synthetic.main.me_info_password_fragment.*

class UpdatePasswrodFragment : Fragment() {
    private val meModel: MeModel by viewModels {
        CustomViewModelProvider.providerMeModel(requireContext())
    }
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.me_info_password_fragment, container, false)

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var newPasswrod = view.findViewById<EditText>(R.id.newPassword)
        var nnewPasswrod = view.findViewById<EditText>(R.id.nnewPassword)
        var oldPasswrod = view.findViewById<EditText>(R.id.oldPassword)
        var successBtn = view.findViewById<TextView>(R.id.successBtn)
        var cencelBtn = view.findViewById<TextView>(R.id.cencelBtn)
        meModel.getUserInfo(LoginUser.userId)
        successBtn.setOnClickListener {
            meModel.user?.observeForever {
                Log.d("用户",it.toString())
            }

            if(oldPasswrod.text.toString() == ( meModel.userDao?.pwd)){
                if(newPasswrod.text.toString() == nnewPasswrod.text.toString()){
                    meModel.user?.value?.pwd = newPasswrod.text.toString()
                    meModel.updateName()
                    Toast.makeText(context, "修改成功", Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.login)
                }else{
                    Toast.makeText(context, "新密码两次不一致", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(context, "旧密码不正确", Toast.LENGTH_SHORT).show()
            }
        }
        cencelBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.meInfoFragment)
        }
    }
}