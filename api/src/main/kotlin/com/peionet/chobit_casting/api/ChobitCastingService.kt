package com.peionet.chobit_casting.api

import com.peionet.chobit_casting.api.response.SearchLiveResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ChobitCastingService {
    @GET("/search/lives")
    suspend fun movies(
        @Query("type") type: String = "recommend",
        @Query("lang") lang: String = "ja"
    ): SearchLiveResponse
}