package com.hiraok.chobit_casting.api

import com.hiraok.chobit_casting.api.response.LiveResponse
import com.hiraok.chobit_casting.api.response.SearchLiveResponse
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject

class TwitCastingApi @Inject constructor(
    retrofit: Retrofit
) {
    private val service = retrofit.create(TwitCastingService::class.java)

    suspend fun movies(): List<LiveResponse> = service.movies().movies
}

interface TwitCastingService {
    @GET("/search/lives")
    suspend fun movies(
        @Query("type") type: String = "recommend",
        @Query("lang") lang: String = "ja"
    ): SearchLiveResponse
}
