package com.hiraok.chobit_casting.api.response

import com.squareup.moshi.Json

data class SearchLiveResponse(
    @Json(name = "movies") val movies: List<LiveResponse>
)