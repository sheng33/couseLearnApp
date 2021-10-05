package com.joe.jetpackdemo.ui.adapter

import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.joe.jetpackdemo.R

import com.joe.jetpackdemo.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyItemRecyclerViewAdapter(
        private val values: List<DummyItem>)
    : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_sign_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
//        holder.idView.text = item.id
//        holder.contentView.text = item.content
        holder.idView.text = item.id.toString()
        holder.textView.text = item.details
        holder.nameView.text = item.name
        if (item.status==0){
//            holder.nameView.setTextColor(Color.parseColor("#f52443"))
            holder.textView.setTextColor(Color.parseColor("#f52443"))
        }else{
            holder.textView.setTextColor(Color.parseColor("#02b340"))
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.stuId)
        val textView: TextView = view.findViewById(R.id.signText)
        val nameView:TextView = view.findViewById(R.id.stuName)
        var card: CardView = view.findViewById(R.id.card_view)
        override fun toString(): String {
            return super.toString() + idView.text+ " ：" +nameView.text+ " ：" +textView.text
        }
    }
}