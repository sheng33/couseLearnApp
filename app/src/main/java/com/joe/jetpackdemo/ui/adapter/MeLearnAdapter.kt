package com.joe.jetpackdemo.ui.adapter

import android.graphics.Color
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.db.data.Note
import com.joe.jetpackdemo.widget.ExpandableTextView
import com.robertlevonyan.views.chip.Chip
import java.net.URL

class MeLearnAdapter(
        private val values: List<Course>
): RecyclerView.Adapter<MeLearnAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeLearnAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.me_learn_list, parent, false)
        var rightBtn = view.findViewById<Button>(R.id.right_view)
        rightBtn.setBackgroundColor(Color.parseColor("#F8F8FF"))
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MeLearnAdapter.ViewHolder, position: Int) {
        val item = values[position]
        holder.title.text = item.name
        holder.progress.text = "第一章第一节移动通信大纲"
        holder.learn_time.text = "99%"
        //加载网络图片
        Glide.with(holder.itemView).load(item.imgUrl).into(holder.img);
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.learn_cell_title)
        val learn_time: TextView = view.findViewById(R.id.learn_cell_bfb)
        val progress: TextView = view.findViewById(R.id.learn_cell_progress)
        val img: ImageView = view.findViewById(R.id.learn_cell_img)
    }

}
