package com.peionet.chobit_casting.usecase

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(ViewModelComponent::class)
@Module
abstract class UseCaseModule {

    @Singleton
    @Binds
    abstract fun provideMovieUseCase(useCase: GetMovieListUseCaseImpl): GetMovieListUseCase
}
