package com.peionet.chobit_casting.usecase

import com.peionet.chobit_casting.domain.Movie
import com.peionet.chobit_casting.infra.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMovieListUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository
) : GetMovieListUseCase {
    override suspend fun execute(): Flow<List<Movie>> {
        return movieRepository.findAll()
    }
}
