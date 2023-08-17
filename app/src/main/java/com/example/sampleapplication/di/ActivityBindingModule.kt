package com.example.sampleapplication.di

import com.example.sampleapplication.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun provideMainActivity(): MainActivity
}