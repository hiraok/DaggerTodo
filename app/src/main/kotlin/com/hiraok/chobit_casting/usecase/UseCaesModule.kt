package com.hiraok.chobit_casting.usecase

import com.hiraok.chobit_casting.domain.GetMovieListUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class UseCaseModule {
    @Singleton
    @Binds
    abstract fun provideMovieUseCase(useCase: GetMovieListUseCaseImpl): GetMovieListUseCase
}
