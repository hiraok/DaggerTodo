package com.hiraok.chobit_casting.ui

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector
    abstract fun movieListFragment(): MovieListFragment
}