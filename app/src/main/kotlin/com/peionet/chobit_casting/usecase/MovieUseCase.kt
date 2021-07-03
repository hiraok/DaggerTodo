package com.peionet.chobit_casting.usecase

import com.peionet.chobit_casting.domain.Movie
import kotlinx.coroutines.flow.Flow

interface GetMovieListUseCase {
    suspend fun execute(): Flow<List<Movie>>
}
