package com.hiraok.chobit_casting.usecase

import com.hiraok.chobit_casting.domain.Movie
import com.hiraok.chobit_casting.domain.MovieRepository
import com.hiraok.chobit_casting.domain.MovieUseCase
import javax.inject.Inject

class MovieUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository
) : MovieUseCase {
    override suspend fun movies(): List<Movie> {
        return movieRepository.movies()
    }
}