package com.hiraok.twitcasting_sample.di

import com.hiraok.twitcasting_sample.TwitCastingSampleApplication
import com.hiraok.twitcasting_sample.ui.ActivityModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityModule::class
    ]
)
interface AppComponent : AndroidInjector<TwitCastingSampleApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<TwitCastingSampleApplication>()
}