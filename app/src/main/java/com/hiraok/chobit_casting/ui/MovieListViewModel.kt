package com.hiraok.chobit_casting.ui

import android.app.Application
import androidx.lifecycle.*
import com.hiraok.chobit_casting.domain.Movie
import com.hiraok.chobit_casting.domain.MovieUseCase
import com.shopify.livedataktx.SingleLiveData
import kotlinx.coroutines.launch
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
                val movies = movieUseCase.movies()
                movieList.postValue(movies)
            }
        } catch (e: Exception) {
            singleError.postValue(e)
        }

    }
}