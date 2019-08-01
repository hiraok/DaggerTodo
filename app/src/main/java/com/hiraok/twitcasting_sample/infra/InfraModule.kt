package com.hiraok.twitcasting_sample.infra

import com.hiraok.twitcasting_sample.domain.MovieRepository
import dagger.Binds
import dagger.Module

@Module
abstract class InfraModule {
    @Binds
    abstract fun provideMovieRepository(
        reposiotry: MovieRepositoryImpl
    ): MovieRepository
}