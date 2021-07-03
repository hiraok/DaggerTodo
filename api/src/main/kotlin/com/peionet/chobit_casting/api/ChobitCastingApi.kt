package com.peionet.chobit_casting.api

import com.peionet.chobit_casting.api.response.LiveResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Retrofit

class ChobitCastingApi(retrofit: Retrofit) {

    private val service = retrofit.create(ChobitCastingService::class.java)

    suspend fun movies(): Flow<List<LiveResponse>> = flow {
        emit(service.movies().movies)
    }
}