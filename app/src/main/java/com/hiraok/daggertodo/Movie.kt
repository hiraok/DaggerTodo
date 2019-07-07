package com.hiraok.daggertodo

data class Movie(
    val id: MovieId,
    val userId: UserId,
    val title: Title,
    val subTitle: SubTitle?,
    val lastOwnerComment: String?,
    val category: Category?,
    val link: String,
    val isLive: Boolean,
    val isRecorded: Boolean,
    val commentCount: Int,
    val largeThumbnail: String,
    val smallThumbnail: String,
    val country: String,
    val duration: Int,
    val created: Int,
    val isCollabo: Boolean,
    val isProtected: Boolean,
    val maxViewCount: Int,
    val currentViewCount: Int,
    val totalViewCount: Int,
    val hldUrl: String?
)