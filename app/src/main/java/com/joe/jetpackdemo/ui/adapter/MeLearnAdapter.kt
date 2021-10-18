package com.joe.jetpackdemo.ui.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.common.BaseApplication.Companion.context
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.viewmodel.MeLearnModel
import com.orhanobut.dialogplus.DialogPlus
import com.orhanobut.dialogplus.OnItemClickListener


class MeLearnAdapter(
        private val myDataset: ArrayList<Course>,mainContext:Context
): RecyclerView.Adapter<MeLearnAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeLearnAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.me_learn_list, parent, false)
        var rightBtn = view.findViewById<Button>(R.id.right_view)
        rightBtn.setBackgroundColor(Color.parseColor("#F8F8FF"))
        return ViewHolder(view)
    }
    var model = MeLearnModel
    var mainContext =mainContext
    override fun onBindViewHolder(holder: MeLearnAdapter.ViewHolder, position: Int) {
        val item = myDataset[position]
        holder.title.text = item.name
        holder.progress.text = "第一章第一节移动通信大纲"
        holder.learn_time.text = "99%"
        //加载网络图片
        Glide.with(holder.itemView).load(item.imgUrl).into(holder.img);
        holder.del.setOnClickListener {
            AlertDialog.Builder(mainContext)
                    .setTitle("是否删除")
                    .setPositiveButton("确定") { _, _ ->
                        model.list.value?.remove(item)
                        Toast.makeText(mainContext, "删除成功", Toast.LENGTH_SHORT).show()
                        notifyItemRemoved(position)
                        notifyDataSetChanged()
                        Toast.makeText(mainContext, "对话框显示成功", Toast.LENGTH_LONG).show()
                    }
                    .setNeutralButton("取消", null)
                    .create()
                    .show()
        }
    }

    override fun getItemCount(): Int = myDataset.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.learn_cell_title)
        val learn_time: TextView = view.findViewById(R.id.learn_cell_bfb)
        val progress: TextView = view.findViewById(R.id.learn_cell_progress)
        val img: ImageView = view.findViewById(R.id.learn_cell_img)
        val del:Button = view.findViewById(R.id.right_view)
    }

}
