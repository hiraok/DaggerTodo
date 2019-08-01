package com.hiraok.twitcasting_sample.di

import android.app.Application
import android.content.Context
import com.hiraok.twitcasting_sample.TwitCastingSampleApplication
import com.hiraok.twitcasting_sample.infra.InfraModule
import com.hiraok.twitcasting_sample.usecase.UseCaseModule
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module(
    includes = [
        InfraModule::class,
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