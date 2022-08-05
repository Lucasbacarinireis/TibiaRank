package com.example.tibiarank.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitTibiaRank {

    private const val BASE_URL = "https://api.tibiadata.com"
    private const val BASE_URL2 = "https://tibiawiki.dev"

    fun createRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ServiceTibiaRank::class.java)

    fun createRetrofitItems() = Retrofit.Builder()
        .baseUrl(BASE_URL2)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ServiceTibiaItems::class.java)


}