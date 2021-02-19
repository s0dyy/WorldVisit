package com.example.worldvisist.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Countrie::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun countrieDao(): CountrieDao
}
