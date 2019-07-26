package com.hiraok.twitcasting_sample.ui.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.hiraok.twitcasting_sample.Callback
import com.hiraok.twitcasting_sample.Movie
import com.hiraok.twitcasting_sample.MovieListAdapter

@BindingAdapter(value = ["viewmodel"])
fun RecyclerView.setMovies(movies: List<Movie>) {
    val adapter = adapter as MovieListAdapter
    val diff = DiffUtil.calculateDiff(Callback(adapter.movies, movies), true)
    adapter.movies = movies
    diff.dispatchUpdatesTo(adapter)
}