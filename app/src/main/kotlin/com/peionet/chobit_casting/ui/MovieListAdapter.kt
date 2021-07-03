package com.peionet.chobit_casting.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peionet.chobit_casting.R
import com.peionet.chobit_casting.databinding.MovielistItemBinding
import com.peionet.chobit_casting.domain.Movie

class MovieListAdapter : ListAdapter<Movie, MovieListAdapter.ItemViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        return holder.bind(getItem(position))
    }

    class ItemViewHolder(
        private val parent: ViewGroup,
        private val binding: MovielistItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.movielist_item,
            parent,
            false
        )
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Movie) {
            // data setup
            binding.data = item
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

