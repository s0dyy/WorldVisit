package com.example.worldvisist

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CountrieDao {
    @Query("SELECT * FROM countrie")
    fun getAll(): List<Countrie>

    @Insert
    fun insertAll(vararg countries: Countrie)

    @Delete
    fun delete(countrie: Countrie)
}