package com.example.retrofitproject1

import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts():List<Product>
}