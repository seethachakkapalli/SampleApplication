package com.example.sampleapplication.service

import com.example.sampleapplication.model.Post
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

//this interface is responsible for defining API endpoints
interface ApiService {

    @GET("/posts")
    fun getPosts() : Flowable<List<Post>>
}