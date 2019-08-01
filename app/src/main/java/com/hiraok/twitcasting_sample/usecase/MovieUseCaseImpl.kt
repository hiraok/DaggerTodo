package com.hiraok.twitcasting_sample.usecase

import com.hiraok.twitcasting_sample.domain.Movie
import com.hiraok.twitcasting_sample.domain.MovieRepository
import com.hiraok.twitcasting_sample.domain.MovieUseCase
import io.reactivex.Single
import javax.inject.Inject

class MovieUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository
) : MovieUseCase {
    override fun movies(): Single<List<Movie>> {
        return movieRepository.movies()
    }
}