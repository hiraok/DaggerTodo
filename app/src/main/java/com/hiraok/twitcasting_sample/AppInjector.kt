package com.hiraok.twitcasting_sample

object AppInjector {

    fun init(daggerTodoApplication: DaggerTodoApplication) {
        DaggerAppComponent
            .builder()
            .application(daggerTodoApplication)
            .build()
            .inject(daggerTodoApplication)
    }
}