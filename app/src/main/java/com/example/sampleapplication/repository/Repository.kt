package com.example.sampleapplication.repository

import com.example.sampleapplication.model.Post
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Single

interface Repository {
    fun getPosts() : Flowable<List<Post>>
}