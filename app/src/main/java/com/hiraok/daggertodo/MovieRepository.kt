package com.hiraok.daggertodo

import io.reactivex.Single
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val twitCastingApi: TwitCastingApi
) {

    fun getMovies(): Single<List<Movie>> {
        return twitCastingApi.movies().map { response -> response.movies.map { it.toDomain() } }
    }

    private fun MovieResponse.toDomain(): Movie {
        return Movie(
            id = MovieId(id),
            userId = UserId(userId),
            title = Title(title),
            subTitle = SubTitle(subTitle),
            lastOwnerComment = lastOwnerComment,
            category = Category(category),
            link = link,
            isLive = isLive,
            isRecorded = isRecorded,
            commentCount = commentCount,
            largeThumbnail = largeThumbnail,
            smallThumbnail = smallThumbnail,
            country = country,
            duration = duration,
            created = created,
            isCollabo = isCollabo,
            isProtected = isProtected,
            maxViewCount = maxViewCount,
            currentViewCount = currentViewCount,
            totalViewCount = totalViewCount,
            hldUrl = hlsUrl
        )
    }

}