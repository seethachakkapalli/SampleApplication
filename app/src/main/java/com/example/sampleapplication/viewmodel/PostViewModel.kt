package com.example.sampleapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sampleapplication.model.Post
import com.example.sampleapplication.repository.Repository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class PostViewModel: ViewModel() {

    var posts: MutableLiveData<List<Post>>? = null

    @Inject lateinit var repository: Repository

    fun getPosts() {
        repository.getPosts().subscribe {
            list ->
            posts?.value = list
        }
    }
}