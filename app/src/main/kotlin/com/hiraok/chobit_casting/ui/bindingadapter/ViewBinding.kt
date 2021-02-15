package com.hiraok.chobit_casting.ui.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hiraok.chobit_casting.domain.Movie
import com.hiraok.chobit_casting.ui.MovieListAdapter

@BindingAdapter("viewmodel")
fun RecyclerView.setMovies(movies: List<Movie>?) {
    if (movies != null) {
        val adapter = adapter as MovieListAdapter
        adapter.update(movies)
    }
}