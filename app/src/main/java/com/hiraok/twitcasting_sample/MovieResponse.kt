package com.hiraok.twitcasting_sample

import com.squareup.moshi.Json

data class MovieResponse(
    @Json(name = "id") val id: String,
    @Json(name = "user_id") val userId: String,
    @Json(name = "title") val title: String,
    @Json(name = "subtitle") val subTitle: String?,
    @Json(name = "last_owner_comment") val lastOwnerComment: String?,
    @Json(name = "category") val category: String?,
    @Json(name = "link") val link: String,
    @Json(name = "is_live") val isLive: Boolean,
    @Json(name = "is_recorded") val isRecorded: Boolean,
    @Json(name = "comment_count") val commentCount: Int,
    @Json(name = "large_thumbnail") val largeThumbnail: String,
    @Json(name = "small_thumbnail") val smallThumbnail: String,
    @Json(name = "country") val country: String,
    @Json(name = "duration") val duration: Int,
    @Json(name = "created") val created: Int,
    @Json(name = "is_collabo") val isCollabo: Boolean,
    @Json(name = "is_protected") val isProtected: Boolean,
    @Json(name = "max_view_count") val maxViewCount: Int,
    @Json(name = "current_view_count") val currentViewCount: Int,
    @Json(name = "total_view_count") val totalViewCount: Int,
    @Json(name = "hls_url") val hlsUrl: String?
)
