package com.peionet.chobit_casting.infra

import com.peionet.chobit_casting.domain.Movie
import com.peionet.chobit_casting.domain.MovieId
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun findAll(): Flow<List<Movie>>
    suspend fun findByMovieId(id: MovieId): Flow<Movie?>
}
