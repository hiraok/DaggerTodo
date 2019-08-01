package com.hiraok.twitcasting_sample.api

import com.hiraok.twitcasting_sample.api.response.SearchLiveResponse
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject

class TwitCastingApi @Inject constructor(
    retrofit: Retrofit
) : TwitCastingService {

    private val service = retrofit.create(TwitCastingService::class.java)

    override fun movies(type: String, lang: String): Single<SearchLiveResponse> {
        return service.movies()
    }
}

interface TwitCastingService {
    @GET("/search/lives")
    fun movies(@Query("type") type: String = "recommend", @Query("lang") lang: String = "ja"): Single<SearchLiveResponse>
}
