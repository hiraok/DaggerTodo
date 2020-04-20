package com.hiraok.twitcasting_sample.domain

interface MovieUseCase {
    suspend fun movies(): List<Movie>
}
