package com.example.sampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.sampleapplication.databinding.ActivityMainBinding
import com.example.sampleapplication.viewmodel.PostViewModel
import dagger.android.support.DaggerAppCompatActivity
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    //ActivityMainBinding - generated class by databindign library
    private lateinit var binding: ActivityMainBinding

    private var postsViewModel: PostViewModel? = null

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        postsViewModel = ViewModelProvider(this, viewModelFactory)[PostViewModel::class.java]
        fetchData()
    }

    private fun fetchData() {
        postsViewModel?.fetchPosts()?.observe(this) {
            Log.d("wqwwer", it.toString())
        }
    }
}