package com.joe.jetpackdemo.ui.adapter

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.db.data.Note


class NotesAdapter(
    private val values: List<Note>)
    : RecyclerView.Adapter<NotesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.notes_list, parent, false)
        var rightBtn = view.findViewById<Button>(R.id.right_view)
        rightBtn.setBackgroundColor( Color.parseColor("#F8F8FF"))
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
//        holder.idView.text = item.id
//        holder.contentView.text = item.content
        holder.idView.text = item.title.toString()
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.tv_title)
        override fun toString(): String {
            return super.toString() + idView.text
        }
    }


}