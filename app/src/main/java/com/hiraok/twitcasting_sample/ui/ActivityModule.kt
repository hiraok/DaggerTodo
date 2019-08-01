package com.hiraok.twitcasting_sample.ui

import com.hiraok.twitcasting_sample.MainActivity
import com.hiraok.twitcasting_sample.ui.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity
}
