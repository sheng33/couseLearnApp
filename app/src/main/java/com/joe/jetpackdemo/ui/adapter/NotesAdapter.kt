package com.joe.jetpackdemo.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.db.data.Note
import com.joe.jetpackdemo.widget.ExpandableTextView
import com.robertlevonyan.views.chip.Chip


class NotesAdapter(
    private val values: List<Note>
)
    : RecyclerView.Adapter<NotesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.notes_list, parent, false)
        var rightBtn = view.findViewById<Button>(R.id.right_view)
        rightBtn.setBackgroundColor(Color.parseColor("#F8F8FF"))
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
//        holder.idView.text = item.id
//        holder.contentView.text = item.content
        holder.creatTime.text = item.creatTime
        holder.title.text = item.title
        holder.noteText.text = item.context
        if(item.tagId==2){
            holder.tagId.text = "思考"
            holder.tagId.chipBackgroundColor = Color.parseColor("#e3dbbf")
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.note_time)
        val title: TextView = view.findViewById(R.id.note_title)
        val noteText: ExpandableTextView = view.findViewById(R.id.note_text)
        val creatTime: TextView = view.findViewById(R.id.note_time)
        val tagId: Chip = view.findViewById(R.id.note_tag)
        override fun toString(): String {
            return super.toString() + idView.text
        }
    }


}