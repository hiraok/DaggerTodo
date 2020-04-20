package com.hiraok.chobit_casting.di

import android.app.Application
import android.content.Context
import com.hiraok.chobit_casting.TwitCastingSampleApplication
import com.hiraok.chobit_casting.infra.InfraModule
import com.hiraok.chobit_casting.usecase.UseCaseModule
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