package com.peionet.chobit_casting

import com.peionet.chobit_casting.infra.MovieRepository
import com.peionet.chobit_casting.infra.MovieRepositoryImpl
import com.peionet.chobit_casting.usecase.GetMovieListUseCase
import com.peionet.chobit_casting.usecase.GetMovieListUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class AppModule {

    @Singleton
    @Binds
    abstract fun bindUseCase(usecase: GetMovieListUseCaseImpl): GetMovieListUseCase

    @Singleton
    @Binds
    abstract fun bindRepository(repository: MovieRepositoryImpl) : MovieRepository

}