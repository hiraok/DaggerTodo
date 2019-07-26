package com.hiraok.twitcasting_sample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieListViewModel(
    application: Application
) : AndroidViewModel(application) {

    val movieList = MutableLiveData<List<Movie>>()

    fun setMovies(movies: List<Movie>) {
        movieList.value = movies
    }

}