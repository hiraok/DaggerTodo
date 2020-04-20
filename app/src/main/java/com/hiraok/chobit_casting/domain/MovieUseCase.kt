package com.hiraok.chobit_casting.domain

interface MovieUseCase {
    suspend fun movies(): List<Movie>
}
