package com.hiraok.chobit_casting.ui

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.hiraok.chobit_casting.R
import com.hiraok.chobit_casting.databinding.MovielistItemBinding
import com.hiraok.chobit_casting.domain.Movie

class MovieListAdapter : ListAdapter<Movie, MovieListAdapter.ItemViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        return holder.bind(getItem(position))
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

}

object DIFF : DiffUtil.ItemCallback<Movie>() {
    override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem.id.id == newItem.id.id
    }
}

