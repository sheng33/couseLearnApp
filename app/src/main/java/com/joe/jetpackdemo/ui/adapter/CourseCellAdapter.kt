package com.joe.jetpackdemo.ui.adapter
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.binding.bindImageFromUrl
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.viewmodel.CourseModel
import com.ramotion.foldingcell.FoldingCell
import java.util.*

class CourseCellAdapter(context: Context?, objects: List<CourseModel?>?) : ArrayAdapter<CourseModel>(context, 0, objects) {
    private val unfoldedIndexes = HashSet<Int>()
    var defaultRequestBtnClickListener: View.OnClickListener? = null

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        Log.d("ttttt",convertView.toString())
        // get item for selected view
        val item = getItem(position)
        // if cell is exists - reuse it, if not - create the new one from resource
        var cell = convertView as FoldingCell?
        val viewHolder: ViewHolder
        if (cell == null) {
            viewHolder = ViewHolder()
            val vi = LayoutInflater.from(context)
            cell = vi.inflate(R.layout.cell, parent, false) as FoldingCell
            // binding view parts to view holder
            viewHolder.cellImg = cell.findViewById(R.id.cellImg)
            viewHolder.contentRequestBtn = cell.findViewById(R.id.content_request_btn)
            cell.tag = viewHolder
        } else {
            // for existing cell set valid valid state(without animation)
            if (unfoldedIndexes.contains(position)) {
                cell.unfold(true)
            } else {
                cell.fold(true)
            }
            viewHolder = cell.tag as ViewHolder
        }
        if (null == item) return cell
        // bind data from selected element to view through view holder
        bindImageFromUrl(viewHolder.cellImg!!, item.course.imgUrl)
        //        viewHolder.cellImg.setImageURI(item.getCellImg());
        // set custom btn handler for list item from that item
       if(item.requestBtnClickListener!=null){
           run { viewHolder.contentRequestBtn!!.setOnClickListener(item.requestBtnClickListener) }
       }else{
           run {
               // (optionally) add "default" handler if no handler found in item
               viewHolder.contentRequestBtn!!.setOnClickListener(defaultRequestBtnClickListener)
           }
       }
        return cell
    }

    // simple methods for register cell state changes
    fun registerToggle(position: Int) {
        if (unfoldedIndexes.contains(position)) registerFold(position) else registerUnfold(position)
    }

    fun registerFold(position: Int) {
        unfoldedIndexes.remove(position)
    }

    fun registerUnfold(position: Int) {
        unfoldedIndexes.add(position)
    }



    // View lookup cache
    private class ViewHolder {
        var cellImg: ImageView? = null
        var contentRequestBtn: TextView? = null
        var title: TextView? = null
    }
}