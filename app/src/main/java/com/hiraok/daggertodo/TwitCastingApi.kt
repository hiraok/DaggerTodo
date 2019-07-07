package com.hiraok.daggertodo

import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class TwitCastingApi @Inject constructor(
    retrofit: Retrofit
) : TwitCastingService {

    private val service = retrofit.create(TwitCastingService::class.java)

    override fun movies(): Single<SearchLiveResponse> {
        return service.movies()
    }
}

interface TwitCastingService {
    fun movies(): Single<SearchLiveResponse>
}
