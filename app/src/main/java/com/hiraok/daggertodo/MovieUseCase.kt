package com.hiraok.daggertodo

import io.reactivex.Single
import javax.inject.Inject

class MovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {
    fun getMovies() : Single<List<Movie>> {
        return movieRepository.getMovies()
    }
}