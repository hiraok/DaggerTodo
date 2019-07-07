package com.hiraok.daggertodo

object AppInjector {

    fun init(daggerTodoApplication: DaggerTodoApplication) {
        DaggerAppComponent
            .builder()
            .application(daggerTodoApplication)
            .build()
            .inject(daggerTodoApplication)
    }
}