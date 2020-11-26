package com.hiraok.chobit_casting.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.hiraok.chobit_casting.domain.GetMovieListUseCase
import com.hiraok.chobit_casting.domain.Movie
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
class MovieListViewModel @Inject constructor(
    application: Application,
    private val usecase: GetMovieListUseCase
) : AndroidViewModel(application) {

    private val _movieList = MutableStateFlow(emptyList<Movie>())
    val movieList: StateFlow<List<Movie>> = _movieList

    fun init() {
        viewModelScope.launch {
            usecase.execute().collect {
                it.onSuccess {
                    _movieList.value = it
                }
                it.onFailure {

                }
            }
        }
    }
}