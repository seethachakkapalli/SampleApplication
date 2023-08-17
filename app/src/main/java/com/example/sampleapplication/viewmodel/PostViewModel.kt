package com.example.sampleapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sampleapplication.model.Post

class PostViewModel: ViewModel() {

    var post: MutableLiveData<Post>? = null

    fun getPosts() {

    }
}