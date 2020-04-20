package com.hiraok.chobit_casting.infra

import com.hiraok.chobit_casting.api.TwitCastingApi
import com.hiraok.chobit_casting.api.response.LiveResponse
import com.hiraok.chobit_casting.domain.*
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val twitCastingApi: TwitCastingApi
) : MovieRepository {

    override suspend fun movies(): List<Movie> {
        return twitCastingApi.movies().map { it.toDomain() }
    }

    private fun LiveResponse.toDomain(): Movie {
        return Movie(
            id = MovieId(movie.id),
            userId = UserId(movie.userId),
            title = Title(movie.title),
            subTitle = SubTitle(movie.subTitle),
            lastOwnerComment = movie.lastOwnerComment,
            category = Category(movie.category),
            link = movie.link,
            isLive = movie.isLive,
            isRecorded = movie.isRecorded,
            commentCount = movie.commentCount,
            largeThumbnail = movie.largeThumbnail,
            smallThumbnail = movie.smallThumbnail,
            country = movie.country,
            duration = movie.duration,
            created = movie.created,
            isCollabo = movie.isCollabo,
            isProtected = movie.isProtected,
            maxViewCount = movie.maxViewCount,
            currentViewCount = movie.currentViewCount,
            totalViewCount = movie.totalViewCount,
            hlsUrl = movie.hlsUrl
        )
    }

}