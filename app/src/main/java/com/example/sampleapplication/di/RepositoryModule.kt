package com.example.sampleapplication.di

import com.example.sampleapplication.repository.LocalRepo
import com.example.sampleapplication.repository.RemoteRepo
import com.example.sampleapplication.repository.Repository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun getLocalRepo(localRepo: LocalRepo): Repository

    @Binds
    abstract fun getRemoteRepo(remoteRepo: RemoteRepo): Repository
}