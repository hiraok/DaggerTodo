package com.hiraok.chobit_casting.infra

import android.util.LruCache
import com.hiraok.chobit_casting.api.TwitCastingApi
import com.hiraok.chobit_casting.api.response.LiveResponse
import com.hiraok.chobit_casting.domain.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val twitCastingApi: TwitCastingApi
) : MovieRepository {

    val list = LruCache<String, List<Movie>>(100)

    override suspend fun findAll(): Flow<List<Movie>> = flow {
        twitCastingApi.movies().map { it.toDomain() }
    }

    override suspend fun findByMovieId(id: MovieId): Flow<Movie> = flow {
        twitCastingApi.movies().find { it.movie.id == id.id }
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