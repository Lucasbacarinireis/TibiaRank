package com.example.tibiarank.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tibiarank.database.model.ItemsResponse
import com.example.tibiarank.service.RetrofitTibiaRank
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ItemsViewModel: ViewModel() {

    val data = MutableLiveData<String>()

    fun getItems() {
        RetrofitTibiaRank.createRetrofitItems()
            .getItems("Protective Charm")
            .enqueue(object : Callback<ItemsResponse>{
                override fun onResponse(
                    call: Call<ItemsResponse>,
                    response: Response<ItemsResponse>
                ) {
                    if (response.isSuccessful){
                        data.postValue(response.body()?.name)
                    }
                }

                override fun onFailure(call: Call<ItemsResponse>, t: Throwable) {
                    t.printStackTrace()
                }

            })


    }


}