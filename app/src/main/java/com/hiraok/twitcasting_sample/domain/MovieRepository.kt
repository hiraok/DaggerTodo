package com.hiraok.twitcasting_sample.domain

import io.reactivex.Single

interface MovieRepository {
   fun movies(): Single<List<Movie>>
}