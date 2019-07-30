package com.hiraok.twitcasting_sample

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module(
    includes = [
        UseCaseModule::class,
        NetWorkModule::class,
        ViewModelModule::class
    ]
)
class AppModule {

    @Singleton
    @Provides
    fun provideApplication(application: TwitCastingSampleApplication): Application = application

    @Singleton
    @Provides
    fun provideContext(application: TwitCastingSampleApplication): Context = application

    @Singleton
    @Provides
    fun provideDisposable() : CompositeDisposable = CompositeDisposable()
}