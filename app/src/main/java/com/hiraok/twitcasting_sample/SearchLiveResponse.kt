package com.hiraok.twitcasting_sample

import com.squareup.moshi.Json

data class SearchLiveResponse(
    @Json(name = "movies") val movies: List<LiveResponse>
)