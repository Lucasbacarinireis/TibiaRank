package com.example.tibiarank.service

import com.example.tibiarank.model.RankResponse
import retrofit2.Call
import retrofit2.http.GET

interface ServiceTibiaRank {

    @GET("/v3/highscores/{world}/{category}/{vocation}")
    fun getAllRank(): Call<RankResponse>

}