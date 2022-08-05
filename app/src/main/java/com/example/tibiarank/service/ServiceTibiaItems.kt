package com.example.tibiarank.service

import com.example.tibiarank.model.ItemsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceTibiaItems {

    @GET("api/items/{name}")
    fun getItems(@Path("name") name: String
    ): Call<ItemsResponse>


}