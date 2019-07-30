package com.hiraok.twitcasting_sample

import com.squareup.moshi.Json

data class UserResponse(
    @Json(name = "id") val id: String,
    @Json(name = "screen_id") val screenId: String,
    @Json(name = "name") val name: String,
    @Json(name = "image") val image: String,
    @Json(name = "profile") val profile: String,
    @Json(name = "level") val level: Int,
    @Json(name = "last_movie_id") val lastMovieId: String,
    @Json(name = "is_live") val isLive: Boolean,
    @Json(name = "supporter_count") val supporterCount: Int,
    @Json(name = "supporting_count") val supportingCount: Int,
    @Json(name = "created") val created: Int
)