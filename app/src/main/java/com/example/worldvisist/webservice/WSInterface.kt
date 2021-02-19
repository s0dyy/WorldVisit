package com.example.worldvisist.webservice

import retrofit2.Call
import retrofit2.http.GET

interface WSInterface {

    @GET("rest/v2/all")
    fun getCountries(): Call<List<RetourWSCountry>>
}