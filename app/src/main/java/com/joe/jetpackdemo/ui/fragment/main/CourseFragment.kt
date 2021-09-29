package com.joe.jetpackdemo.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.databinding.CourseFragmentBinding
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.ui.adapter.FoldingCellListAdapter
import com.joe.jetpackdemo.db.data.Item
import com.joe.jetpackdemo.db.data.Item.getTestingList
import com.joe.jetpackdemo.db.repository.CourseRepository
import com.joe.jetpackdemo.viewmodel.CourseModel
import com.ramotion.foldingcell.FoldingCell
import java.util.*

class CourseFragment : Fragment() {
    lateinit var courseModel: CourseModel
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
        courseRepository = CourseRepository()
        // get our list view
        val theListView: ListView = binding.mainListView

        // prepare elements to display

        // prepare elements to display
        val items: ArrayList<Course>? = courseRepository.getTestingList()

        // add custom btn handler to first list item

        // add custom btn handler to first list item
        items!![0].requestBtnClickListener=(View.OnClickListener {
            Toast.makeText(
                this.context,
                "CUSTOM HANDLER FOR FIRST BUTTON",
                Toast.LENGTH_SHORT
            ).show()
        })

        // create custom adapter that holds elements and their state (we need hold a id's of unfolded elements for reusable elements)

        // create custom adapter that holds elements and their state (we need hold a id's of unfolded elements for reusable elements)
        val adapter = FoldingCellListAdapter(this.context, items)

        // add default btn handler for each request btn on each item if custom handler not found

        // add default btn handler for each request btn on each item if custom handler not found
        adapter.setDefaultRequestBtnClickListener(View.OnClickListener {
            Toast.makeText(
                this.context,
                "DEFAULT HANDLER FOR ALL BUTTONS",
                Toast.LENGTH_SHORT
            ).show()
        })

        // set elements to adapter

        // set elements to adapter
        theListView.adapter = adapter

        // set on click event listener to list view

        // set on click event listener to list view
        theListView.onItemClickListener =
            OnItemClickListener { adapterView, view, pos, l -> // toggle clicked cell state
                (view as FoldingCell).toggle(false)
                // register in adapter that state for selected cell is toggled
                adapter.registerToggle(pos)
            }


        return binding.root
    }
}