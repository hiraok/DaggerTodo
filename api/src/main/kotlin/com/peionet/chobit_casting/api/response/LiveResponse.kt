package com.peionet.chobit_casting.api.response

import com.squareup.moshi.Json

data class LiveResponse(
    @Json(name = "movie") val movie: MovieResponse,
    @Json(name = "broadcaster") val broadcaster: UserResponse,
    @Json(name = "tags") val tags: List<String>
)