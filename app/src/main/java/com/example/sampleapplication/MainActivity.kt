package com.example.sampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.sampleapplication.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    //ActivityMainBinding - generated class by databindign library
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("ehwriue", retrofit.toString());
    }

    fun initListeners() {
        binding.btSecondActivity.setOnClickListener {
        }
    }
}