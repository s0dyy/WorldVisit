package com.example.worldvisist.webservice

import androidx.room.ColumnInfo
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RetourWSCountry(

    @Expose
    @SerializedName("name")
    val name: String,

    @Expose
    @SerializedName("flag")
    val flag: String,

    @Expose
    @SerializedName("continent")
    val continent: String,

    @Expose
    @SerializedName("capital")
    val capital: String
)