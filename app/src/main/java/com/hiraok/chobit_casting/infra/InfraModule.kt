package com.hiraok.chobit_casting.infra

import com.hiraok.chobit_casting.domain.MovieRepository
import dagger.Binds
import dagger.Module

@Module
abstract class InfraModule {
    @Binds
    abstract fun provideMovieRepository(
        reposiotry: MovieRepositoryImpl
    ): MovieRepository
}