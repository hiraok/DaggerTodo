package com.hiraok.twitcasting_sample.ui

import com.hiraok.twitcasting_sample.ui.MovieListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector
    abstract fun movieListFragment(): MovieListFragment
}