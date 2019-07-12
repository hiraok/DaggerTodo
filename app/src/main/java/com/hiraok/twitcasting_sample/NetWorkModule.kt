package com.hiraok.twitcasting_sample

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.nio.charset.StandardCharsets
import java.util.*
import javax.inject.Singleton

@Module
class NetWorkModule {
    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient
            .Builder()
            .addInterceptor(HeaderInterceptor())
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().build()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
            .build()
    }


    class HeaderInterceptor : Interceptor {
        override fun intercept(chain: Interceptor.Chain): Response = chain.run {
            proceed(
                request()
                    .newBuilder()
                    .addHeader("Authorization: Basic", convertBase64(BuildConfig.CLIENT_ID, BuildConfig.CLIENT_SECRET))
                    .build()
            )
        }

        private fun convertBase64(clientId: String, clientSecret: String): String {
            val target = clientId + clientSecret
            val charset = StandardCharsets.UTF_8
            return Base64.getEncoder().encodeToString(target.toByteArray(charset))
        }
    }
}