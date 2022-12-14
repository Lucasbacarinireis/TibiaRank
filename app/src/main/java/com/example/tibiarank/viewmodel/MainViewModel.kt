package com.example.tibiarank.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tibiarank.database.model.HighscoreListItem
import com.example.tibiarank.database.model.RankResponse
import com.example.tibiarank.service.RetrofitTibiaRank
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    val data = MutableLiveData<List<HighscoreListItem>>()


    fun getAllRank() {
        RetrofitTibiaRank.createRetrofit()
            .getAllRank("all", "experience", "all")
            .enqueue(object : Callback<RankResponse> {
                override fun onResponse(
                    call: Call<RankResponse>,
                    response: Response<RankResponse>
                ) {
                    if (response.isSuccessful) {
                        data.postValue(response.body()?.highscores?.highscoreList)
                    }
                }

                override fun onFailure(call: Call<RankResponse>, t: Throwable) {
                    t.printStackTrace()
                }

            })
    }



}