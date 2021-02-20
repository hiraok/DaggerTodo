package com.hiraok.chobit_casting.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hiraok.chobit_casting.domain.GetMovieListUseCase
import com.hiraok.chobit_casting.domain.Movie
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor(
    private val usecase: GetMovieListUseCase
) : ViewModel() {
    private val _movieList = MutableStateFlow<List<Movie>>(emptyList())
    val movieList: StateFlow<List<Movie>> = _movieList

    init {
        viewModelScope.launch {
            usecase.execute().collect {
                _movieList.value = it
            }
        }
    }
}
