package com.example.retrofitproject1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitproject1.ApiClient.apiService
import kotlinx.coroutines.launch

class ProductViewModel:ViewModel() {
    private val _product = MutableLiveData<List<Product>>()
    val product:LiveData<List<Product>> get() = _product

    init {
        viewModelScope.launch {
            fetchProducts()
        }
    }

    private suspend fun fetchProducts() {
        try {
            val response = apiService.getProducts()
            _product.postValue(response)
        }
         catch (e:Exception){

         }
    }
}