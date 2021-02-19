package com.example.worldvisist

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.android.material.textfield.TextInputLayout

@Entity
data class CountrieEntity(
        @PrimaryKey val uid: Int,
        @ColumnInfo(name = "name") val name: String?,
        @ColumnInfo(name = "flag") val flag: String?,
        @ColumnInfo(name = "capital") val capital: String?,
        @ColumnInfo(name = "continent") val continent: String?,
        @ColumnInfo(name = "scheduledDate") val scheduledDate: String?
)