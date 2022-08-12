package com.example.tibiarank.service

import com.example.tibiarank.database.model.RankResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceTibiaRank {

    @GET("/v3/highscores/{world}/{category}/{vocation}")
    fun getAllRank(@Path("world") world: String,
                   @Path("category") category: String,
                   @Path("vocation") vocation: String
    ): Call<RankResponse>

}