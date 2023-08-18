package com.example.sampleapplication.di

import android.app.Application
import com.example.sampleapplication.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

//Extending AndroidInjector means it is responsible for injecting dependencies into application class
//modules = [(AndroidInjectionModule::class)] should be added to inject in the application class

// AndroidInjectionModule ===> Application class related module
@Component(
    modules = [(AndroidInjectionModule::class),
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityBindingModule::class,
        RepositoryModule::class,
        ViewModelModule::class]
)
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}