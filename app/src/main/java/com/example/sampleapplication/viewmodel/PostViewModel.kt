package com.example.sampleapplication.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sampleapplication.model.Post
import com.example.sampleapplication.repository.Repository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class PostViewModel @Inject constructor(val repository: Repository): ViewModel() {

    var posts: MutableLiveData<List<Post>> = MutableLiveData<List<Post>> ()

    fun fetchPosts(): MutableLiveData<List<Post>> {
        repository.getPosts().subscribe {
            list ->
            posts?.value = list
        }

        return posts
    }
}