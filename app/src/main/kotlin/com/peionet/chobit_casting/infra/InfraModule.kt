package com.peionet.chobit_casting.infra

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(ViewModelComponent::class)
@Module
abstract class InfraModule {
    @Singleton
    @Binds
    abstract fun provideMovieRepository(reposiotry: MovieRepositoryImpl): MovieRepository
}
