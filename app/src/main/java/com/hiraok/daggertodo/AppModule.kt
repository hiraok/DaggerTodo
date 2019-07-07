package com.hiraok.daggertodo

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object AppModule {
    @Singleton
    @Provides
    @JvmStatic
    fun provideContext(application: DaggerTodoApplication) : Context = application
}