package com.joe.jetpackdemo.ui.adapter

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.db.data.Note
import com.joe.jetpackdemo.viewmodel.NotesModel
import com.joe.jetpackdemo.widget.ExpandableTextView
import com.robertlevonyan.views.chip.Chip


class NotesAdapter(var model: NotesModel,mainContext: Context
)
    : RecyclerView.Adapter<NotesAdapter.ViewHolder>() {
    var mainContext =mainContext
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.notes_list, parent, false)
        var rightBtn = view.findViewById<Button>(R.id.right_view)
        rightBtn.setBackgroundColor(Color.parseColor("#F8F8FF"))
        return ViewHolder(view)
    }
    fun refresh(){
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = model.notesList[position]
//        holder.idView.text = item.id
//        holder.contentView.text = item.content
        holder.creatTime.text = item.creatTime
        holder.title.text = item.title
        holder.noteText.text = item.context
        if(item.tagId==2){
            holder.tagId.text = "思考"
            holder.tagId.chipBackgroundColor = Color.parseColor("#e3dbbf")
        }
        holder.del.setOnClickListener {
            AlertDialog.Builder(mainContext)
                    .setTitle("是否删除")
                    .setPositiveButton("确定") { _, _ ->
                        model.notesList.remove(item)
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
    override fun getItemCount(): Int = model.notesList.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.note_time)
        val title: TextView = view.findViewById(R.id.note_title)
        val noteText: ExpandableTextView = view.findViewById(R.id.note_text)
        val creatTime: TextView = view.findViewById(R.id.note_time)
        val del: TextView = view.findViewById(R.id.right_view)
        val tagId: Chip = view.findViewById(R.id.note_tag)
        override fun toString(): String {
            return super.toString() + idView.text
        }
    }


}