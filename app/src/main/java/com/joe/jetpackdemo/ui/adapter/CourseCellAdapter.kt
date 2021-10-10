package com.joe.jetpackdemo.ui.adapter
import android.app.Activity
import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentActivity
import com.bumptech.glide.Glide
import com.joe.jetpackdemo.R
import com.joe.jetpackdemo.binding.bindImageFromUrl
import com.joe.jetpackdemo.db.data.Course
import com.ramotion.foldingcell.FoldingCell
import org.salient.artplayer.MediaPlayerManager
import org.salient.artplayer.conduction.PlayerState
import org.salient.artplayer.exo.ExoMediaPlayer
import org.salient.artplayer.exo.ExoSourceBuilder
import org.salient.artplayer.player.SystemMediaPlayer
import org.salient.artplayer.ui.FullscreenVideoView
import org.salient.artplayer.ui.VideoView
import java.util.*

class CourseCellAdapter(context: Context?, objects: List<Course?>?, var activity: FragmentActivity?) : ArrayAdapter<Course>(context, 0, objects) {
    private val unfoldedIndexes = HashSet<Int>()
    var defaultRequestBtnClickListener: View.OnClickListener? = null

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
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
            viewHolder.videoView = cell.findViewById(R.id.video_view)
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
        bindImageFromUrl(viewHolder.cellImg!!, item.imgUrl)
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
        val videoView = cell.findViewById(R.id.video_view) as VideoView
        var mediaPlayer = ExoMediaPlayer(context)
        val mediaSource = ExoSourceBuilder(context, "http://mooc2vod.stu.126.net/nos/hls/2021/09/02/66/53f1be65-bbb2-4f8f-b056-54113fa51344_7.m3u8")
            .apply {
                this.isLooping = false
                this.cacheEnable = true
            }
            .build()
        mediaPlayer.mediaSource  = mediaSource
        mediaPlayer.playWhenReady = false
        videoView.mediaPlayer = mediaPlayer
        videoView.cover.setImageResource(R.drawable.head_test)
        videoView.cover.isVisible = true
        videoView.prepare()
        var lastClickTime = 0L
        videoView.setOnClickListener {
            val clickTime = System.currentTimeMillis()
            lastClickTime = if (lastClickTime > 0L && clickTime - lastClickTime < 500) {
                0L
            } else {
                clickTime
            }
            if(lastClickTime==0L){
                val fullScreenVideoView = FullscreenVideoView(context = context, origin = videoView)
                fullScreenVideoView.setOnClickListener {
                    if(videoView.isPlaying){
                        mediaPlayer.pause()
                        videoView.pause()
                    }else{
                        mediaPlayer.start()
                        videoView.start()
                    }
                }
                videoView.mediaPlayer = mediaPlayer
                //开始播放
                fullScreenVideoView.prepare()
                activity?.let { it1 -> MediaPlayerManager.startFullscreen(it1, fullScreenVideoView) }
            }else{
                if(videoView.isPlaying){
                    mediaPlayer.pause()
                    videoView.pause()
                }else{
                    mediaPlayer.start()
                    videoView.start()
                }
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
        var videoView: VideoView? = null
    }
}