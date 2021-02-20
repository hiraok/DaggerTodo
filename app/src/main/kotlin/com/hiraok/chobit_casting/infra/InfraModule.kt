package com.hiraok.chobit_casting.infra

import com.hiraok.chobit_casting.domain.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class InfraModule {
    @Singleton
    @Binds
    abstract fun provideMovieRepository(reposiotry: MovieRepositoryImpl): MovieRepository
}
