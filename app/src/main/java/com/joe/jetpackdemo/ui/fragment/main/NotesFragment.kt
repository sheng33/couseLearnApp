package com.joe.jetpackdemo.ui.fragment.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.dummy.DummyContent
import com.joe.jetpackdemo.ui.adapter.MyItemRecyclerViewAdapter
import com.joe.jetpackdemo.ui.adapter.NotesAdapter
import com.joe.jetpackdemo.viewmodel.NotesModel
import com.yanzhenjie.recyclerview.SwipeRecyclerView
import kotlinx.android.synthetic.main.notes_fragment.*
import kotlinx.android.synthetic.main.notes_search.*
import java.util.*

class NotesFragment : Fragment()  {
    private var mRefreshLayout: SwipeRefreshLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.notes_fragment, container, false)
        mRefreshLayout = view.findViewById(R.id.refresh_layout)
        var noteLayout = view.findViewById<RecyclerView>(R.id.notesList)
        var model = NotesModel()
        noteLayout.adapter = NotesAdapter(model.notesList)

        return view
    }
    //添加动作事件
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mRefreshLayout!!.setOnRefreshListener(mRefreshListener) // 刷新监听。
        notes_search.setOnClickListener {
            Toast.makeText(context, drawer_search.text, Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * 刷新。
     */
    private val mRefreshListener = SwipeRefreshLayout.OnRefreshListener {
        refresh_layout.postDelayed({ loadData()  }, 1000) // 延时模拟请求服务器。
        refresh_layout.isRefreshing = false

    }
    private fun loadData() {
//        mDataList = createDataList(0)
//        mAdapter.notifyDataSetChanged(mDataList)
//        mRefreshLayout.setRefreshing(false)
//
//        // 第一次加载数据：一定要调用这个方法，否则不会触发加载更多。
//        // 第一个参数：表示此次数据是否为空，假如你请求到的list为空(== null || list.size == 0)，那么这里就要true。
//        // 第二个参数：表示是否还有更多数据，根据服务器返回给你的page等信息判断是否还有更多，这样可以提供性能，如果不能判断则传true。
//        mRecyclerView.loadMoreFinish(false, true)
    }

    protected fun createDataList(start: Int): List<String> {
        val strings: MutableList<String> = ArrayList()
        for (i in start until start + 100) {
            strings.add("第" + i + "个Item")
        }
        return strings
    }

}