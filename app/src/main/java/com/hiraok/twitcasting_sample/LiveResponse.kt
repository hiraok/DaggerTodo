package com.hiraok.twitcasting_sample

import com.squareup.moshi.Json

data class LiveResponse(
    @Json(name = "movie") val movie: MovieResponse,
    @Json(name = "broadcaster") val broadcaster: UserResponse,
    @Json(name = "tags") val tags: Array<String>
)