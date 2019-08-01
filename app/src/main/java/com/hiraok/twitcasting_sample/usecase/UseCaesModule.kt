package com.hiraok.twitcasting_sample.usecase

import com.hiraok.twitcasting_sample.domain.MovieUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class UseCaseModule {
    @Binds
    abstract fun provideMovieUseCase(useCase: MovieUseCaseImpl): MovieUseCase
}
