package com.hiraok.chobit_casting.domain


interface MovieRepository {
    suspend fun movies(): List<Movie>
}