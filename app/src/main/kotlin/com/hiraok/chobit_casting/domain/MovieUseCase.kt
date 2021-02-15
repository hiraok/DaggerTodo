package com.hiraok.chobit_casting.domain

import kotlinx.coroutines.flow.Flow


interface GetMovieListUseCase {
    suspend fun execute(): Flow<List<Movie>>
}
