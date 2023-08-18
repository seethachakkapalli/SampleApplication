package com.example.sampleapplication.repository

import android.util.Log
import com.example.sampleapplication.model.Post
import com.example.sampleapplication.service.ApiService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.Date
import javax.inject.Inject

class RemoteRepo @Inject constructor(val apiService: ApiService) : Repository {
    override fun getPosts(): Flowable<List<Post>> {
        return apiService.getPosts()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { posts ->
                posts.map { post ->
                    post.copy(fetchedOn = System.currentTimeMillis().toString())
                }
            }
    }
}