package com.hiraok.twitcasting_sample.domain

import io.reactivex.Single

interface MovieUseCase {
    fun movies(): Single<List<Movie>>
}