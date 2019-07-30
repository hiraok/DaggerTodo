package com.hiraok.twitcasting_sample.ui.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hiraok.twitcasting_sample.Movie
import com.hiraok.twitcasting_sample.MovieListAdapter

@BindingAdapter("viewmodel")
fun RecyclerView.setMovies(movies: List<Movie>?) {
    if (movies != null) {
        val adapter = adapter as MovieListAdapter
        adapter.update(movies)
    }
}