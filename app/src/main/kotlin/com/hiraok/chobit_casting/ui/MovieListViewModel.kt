package com.hiraok.chobit_casting.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hiraok.chobit_casting.domain.GetMovieListUseCase
import com.hiraok.chobit_casting.domain.Movie
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class MovieListViewModel @ViewModelInject constructor(
    private val usecase: GetMovieListUseCase
) : ViewModel() {

    private val _movieList = MutableStateFlow(emptyList<Movie>())
    val movieList: StateFlow<List<Movie>> = _movieList

    init {
        viewModelScope.launch {
            usecase.execute().collect {
                _movieList.value = it
            }
        }
    }
}