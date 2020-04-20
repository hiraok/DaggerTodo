package com.hiraok.twitcasting_sample.domain


interface MovieRepository {
    suspend fun movies(): List<Movie>
}