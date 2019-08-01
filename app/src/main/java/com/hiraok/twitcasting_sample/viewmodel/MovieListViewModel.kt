package com.hiraok.twitcasting_sample.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.hiraok.twitcasting_sample.domain.Movie
import com.hiraok.twitcasting_sample.domain.MovieUseCase
import com.shopify.livedataktx.SingleLiveData
import kotlinx.coroutines.launch
import kotlinx.coroutines.rx2.await
import java.lang.Exception
import javax.inject.Inject

class MovieListViewModel @Inject constructor(
    application: Application,
    private val movieUseCase: MovieUseCase
) : AndroidViewModel(application) {

    val movieList = MutableLiveData<List<Movie>>()
    private val singleError: SingleLiveData<Exception> = SingleLiveData()

    fun init() {
        try {
            viewModelScope.launch {
                val movies = movieUseCase.movies().await()
                movieList.postValue(movies)
            }
        } catch (e: Exception) {
            singleError.postValue(e)
        }

    }
}