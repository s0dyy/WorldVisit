package com.example.worldvisist.webservice

import retrofit2.Call
import retrofit2.http.GET

interface WSInterface {

    @GET("all")
    fun getCountries(): Call<RetourWSCountries>
}