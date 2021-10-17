package com.joe.jetpackdemo.ui.fragment.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.databinding.CourseFragmentBinding
import com.joe.jetpackdemo.db.RepositoryProvider
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.db.repository.CourseRepository
import com.joe.jetpackdemo.ui.adapter.CourseCellAdapter
import com.joe.jetpackdemo.viewmodel.CourseModel
import com.joe.jetpackdemo.viewmodel.MeLearnModel
import com.ramotion.foldingcell.FoldingCell
import kotlinx.android.synthetic.main.cell_content_layout.*
import java.util.*

class CourseFragment : Fragment() {

    lateinit var courseModel: CourseModel
    lateinit var learModel: MeLearnModel
    lateinit var courseRepository: CourseRepository
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // TODO 研究DataBindComponent
        // 1.Binding生成的方式一
        val binding: CourseFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.course_fragment, container, false
        )

        courseRepository = context?.let { RepositoryProvider.providerCourseRepository(it) }!!;
        // get our list view
        val theListView: ListView = binding.mainListView

        // prepare elements to display

        // prepare elements to display
        val items: ArrayList<Course>? = courseRepository.getTestingListmodel()
        learModel =  MeLearnModel
        // add custom btn handler to first list item

        // add custom btn handler to first list item

        // create custom adapter that holds elements and their state (we need hold a id's of unfolded elements for reusable elements)
        val adapter = CourseCellAdapter(this.context,learModel, items,this.activity)

        // set elements to adapter
        theListView.adapter = adapter

        // set on click event listener to list view
        theListView.onItemClickListener =
            OnItemClickListener { adapterView, view, pos, l -> // toggle clicked cell state
                (view as FoldingCell).toggle(false)
                var layout1: RelativeLayout = view.findViewById(R.id.courselayout1)
                layout1.setOnClickListener {
                    view.toggle(false)
                    adapter.registerToggle(pos)
                }
                // register in adapter that state for selected cell is toggled
                adapter.registerToggle(pos)
            }
        return binding.root
    }
    //拦截全屏时的返回事件
//    override fun onBackPressed() {
//        if (MediaPlayerManager.blockBackPress(this)) {
//            return
//        }
//        super.onBackPressed()
//    }
}