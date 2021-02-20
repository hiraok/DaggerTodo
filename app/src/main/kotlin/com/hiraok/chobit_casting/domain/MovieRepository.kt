package com.hiraok.chobit_casting.domain

import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun findAll(): Flow<List<Movie>>
    suspend fun findByMovieId(id: MovieId): Flow<Movie?>
}
