package com.hiraok.twitcasting_sample.api.response

import com.hiraok.twitcasting_sample.api.response.LiveResponse
import com.squareup.moshi.Json

data class SearchLiveResponse(
    @Json(name = "movies") val movies: List<LiveResponse>
)