package com.hiraok.chobit_casting.usecase

import com.hiraok.chobit_casting.domain.GetMovieListUseCase
import com.hiraok.chobit_casting.domain.Movie
import com.hiraok.chobit_casting.domain.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

internal class GetMovieListUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository
) : GetMovieListUseCase {
    override suspend fun execute(): Flow<Result<List<Movie>>> {
        return movieRepository.findAll()
    }
}