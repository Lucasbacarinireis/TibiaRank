package com.example.tibiarank.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitTibiaRank {

    private const val BASE_URL = "https://api.tibiadata.com"

    fun createRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ServiceTibiaRank::class.java)

}