package com.bangkit.raionlearncompose2.presentation.feed_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bangkit.raionlearncompose2.data.remote.api.ApiConfig
import com.bangkit.raionlearncompose2.data.remote.response.ProductResponseItem
import com.bangkit.raionlearncompose2.util.Resource
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch


class MainViewModel: ViewModel() {



    // cold flow
    private val _products = Channel<Resource<List<ProductResponseItem>>>()
    val products = _products
        .receiveAsFlow()
        .onStart {
            fetchProducts()
        }

    // hot flow
//    private val _products2 = MutableSharedFlow<List<ProductResponseItem>?>()
//    val products2 = _products2.asSharedFlow()

    fun fetchProducts() {
        viewModelScope.launch {
            flow {
                emit(Resource.Loading())
                try {
                    val response = ApiConfig.getApiService().getProducts()
                    if (response.isSuccessful)
                        emit(Resource.Success(response.body()))
                    else
                        emit(Resource.Error("Error bro"))
                } catch (e: Exception) {
                    emit(Resource.Error("Error bro"))
                }

            }.collect {
                // cold
                _products.send(it)
            }
        }
    }
}