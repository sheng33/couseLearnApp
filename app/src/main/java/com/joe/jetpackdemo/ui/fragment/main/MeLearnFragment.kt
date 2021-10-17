package com.joe.jetpackdemo.ui.fragment.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.ui.adapter.MeLearnAdapter
import com.joe.jetpackdemo.ui.adapter.NotesAdapter
import com.joe.jetpackdemo.viewmodel.MeLearnModel
import com.joe.jetpackdemo.viewmodel.NotesModel
import kotlinx.android.synthetic.main.me_learn_fragment.*
import kotlinx.android.synthetic.main.notes_fragment.*
import kotlinx.android.synthetic.main.notes_search.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MeLearnFragment: Fragment()  {
    private var mRefreshLayout: SwipeRefreshLayout? = null
    lateinit var adapter: MeLearnAdapter
    lateinit var model: MeLearnModel
    // 创建视图
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.me_learn_fragment, container, false)
        mRefreshLayout = view.findViewById(R.id.me_learn_refresh_layout)
        var learnLayout = view.findViewById<RecyclerView>(R.id.me_learn_list)
        model = MeLearnModel
        Log.d("model",model.toString())
        Log.d("model",model.list.value.toString())
        model.list.observe(viewLifecycleOwner, Observer {
            if (it.isNotEmpty()){
                adapter = context?.let { it1 -> MeLearnAdapter(it, it1) }!!
                learnLayout.adapter = adapter
                adapter.notifyDataSetChanged()
            }else{
                Toast.makeText(context, "无数据", Toast.LENGTH_SHORT).show()

            }
        })
        Log.d("TT",model.list.value?.size.toString())
        return view
    }
    //添加动作事件
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mRefreshLayout!!.setOnRefreshListener(mRefreshListener) // 刷新监听。
    }

    /**
     * 刷新。
     */
    private val mRefreshListener = SwipeRefreshLayout.OnRefreshListener {
        me_learn_refresh_layout.postDelayed({ loadData()  }, 2000) // 延时模拟请求服务器。
//        GlobalScope.launch {
//            delay(2000L)
//            me_learn_refresh_layout.isRefreshing = false
//        }
    }
    private fun loadData() {
        Toast.makeText(context, "加入成功", Toast.LENGTH_SHORT).show()
        adapter.notifyDataSetChanged()
        mRefreshLayout?.isRefreshing = false
//
//        // 第一次加载数据：一定要调用这个方法，否则不会触发加载更多。
//        // 第一个参数：表示此次数据是否为空，假如你请求到的list为空(== null || list.size == 0)，那么这里就要true。
//        // 第二个参数：表示是否还有更多数据，根据服务器返回给你的page等信息判断是否还有更多，这样可以提供性能，如果不能判断则传true。
//        mRecyclerView.loadMoreFinish(false, true)
    }
}