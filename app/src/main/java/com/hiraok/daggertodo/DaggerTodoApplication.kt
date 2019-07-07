package com.hiraok.daggertodo

import android.app.Application

class DaggerTodoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }
}