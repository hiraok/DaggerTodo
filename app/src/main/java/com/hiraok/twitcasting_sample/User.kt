package com.hiraok.twitcasting_sample

data class User(
    val id: MovieId,
    val screenId:ScreenId,
    val name: Name,
    val image: String,
    val profile: String,
    val level: Level,
    val lastMovieId: String,
    val isLive:Boolean,
    val supporterCount:Int,
    val supportingCount:Int,
    val created:Int
)