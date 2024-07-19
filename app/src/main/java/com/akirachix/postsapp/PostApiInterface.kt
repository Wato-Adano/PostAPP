package com.akirachix.postsapp

import retrofit2.Call
import retrofit2.http.GET

interface PostApiInterface {
    @GET("/posts")
    fun fetchPosts(): Call<List<Post>>
}