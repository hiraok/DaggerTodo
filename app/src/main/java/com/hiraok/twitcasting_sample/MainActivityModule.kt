package com.hiraok.twitcasting_sample

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector
    abstract fun movieListFragment(): MovieListFragment
}