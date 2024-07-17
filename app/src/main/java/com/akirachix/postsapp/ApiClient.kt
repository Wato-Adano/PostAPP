package com.akirachix.postsapp

object ApiClient {
    val retrofit{
        val retrofit = Retrofit
            .Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory()
            .buid()
    }
}