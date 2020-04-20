package com.hiraok.twitcasting_sample.ui

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.hiraok.twitcasting_sample.R
import com.hiraok.twitcasting_sample.databinding.MovielistItemBinding
import com.hiraok.twitcasting_sample.domain.Movie

class MovieListAdapter : RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {

    private var movieList: List<Movie> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ItemViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (holder is ItemViewHolder && movieList.size > position) {
            holder.bind(movieList[position])
        }
    }

    abstract class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    class ItemViewHolder(
        private val parent: ViewGroup,
        private val binding: MovielistItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.movielist_item,
            parent,
            false
        )
    ) : ViewHolder(binding.root) {

        val centerPosition: (ViewHolder) -> Int = {
            it.layoutPosition
        }

        fun bind(item: Movie) {
            // data setup
            binding.data = item
            // ExoPlayer
            val uri = Uri.parse(item.hlsUrl)
            val dataSourceFactory = DefaultDataSourceFactory(parent.context, "ua")
            val mediaSource = HlsMediaSource.Factory(dataSourceFactory).createMediaSource(uri)
            val player = ExoPlayerFactory.newSimpleInstance(parent.context)
            player.prepare(mediaSource)
            player.apply {
                volume = 0f
                playWhenReady = true
            }
            binding.playerView.resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FILL
            binding.playerView.player = player
        }
    }

    fun update(movies: List<Movie>) {
        this.movieList = movies
        notifyDataSetChanged()
    }

}


