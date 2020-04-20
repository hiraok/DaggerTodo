package com.hiraok.chobit_casting.usecase

import com.hiraok.chobit_casting.domain.MovieUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class UseCaseModule {
    @Binds
    abstract fun provideMovieUseCase(useCase: MovieUseCaseImpl): MovieUseCase
}
