package com.hiraok.twitcasting_sample.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hiraok.twitcasting_sample.viewmodel.MovieListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MovieListViewModel::class)
    abstract fun bindMovieListViewModel(movieListViewModel: MovieListViewModel): ViewModel
}