package com.example.sampleapplication.di

import android.app.Application
import com.example.sampleapplication.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector

//Extending AndroidInjector means it is responsible for injecting dependencies into application class
@Component
interface AppComponent: AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}