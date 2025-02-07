package com.example.restaurantreview.data.retrofit

import retrofit2.Call
import com.example.restaurantreview.data.response.RestaurantResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<RestaurantResponse>
}