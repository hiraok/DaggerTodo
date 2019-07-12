package com.hiraok.twitcasting_sample

import android.app.Application

class DaggerTodoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }
}