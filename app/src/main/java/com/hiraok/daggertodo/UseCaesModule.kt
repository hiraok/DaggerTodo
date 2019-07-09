package com.hiraok.daggertodo

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class UseCaseModule {
    @Singleton
    @Provides
    fun provideMovieUseCase(repository: MovieRepository): MovieUseCase = MovieUseCase(repository)

}
