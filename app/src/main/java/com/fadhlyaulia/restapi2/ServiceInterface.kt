package com.fadhlyaulia.restapi2

import retrofit2.Call
import retrofit2.http.*

interface ServiceInterface {
    @GET("no_hp")
    fun getData(): Call<List<KontakData>>
}
