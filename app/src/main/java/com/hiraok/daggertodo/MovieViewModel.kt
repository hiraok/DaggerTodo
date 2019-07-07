package com.hiraok.daggertodo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel : ViewModel() {

    private val _movieId: MutableLiveData<MovieId> = MutableLiveData()


}