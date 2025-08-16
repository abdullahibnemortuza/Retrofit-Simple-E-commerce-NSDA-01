package com.example.retrofitproject1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://fakestoreapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService = retrofit.create(ApiService::class.java)
}