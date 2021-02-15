package com.hiraok.chobit_casting.domain

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
    val hlsUrl: String?
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Movie
        return id.id == other.id.id
    }

    override fun hashCode(): Int {
        return id.id.hashCode() * 31
    }
}