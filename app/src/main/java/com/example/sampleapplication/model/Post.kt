package com.example.sampleapplication.model


data class Post(val userId: Int, val id: Int, val title: String, val body: String, var fetchedOn: String)
