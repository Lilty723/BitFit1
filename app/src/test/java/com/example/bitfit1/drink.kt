package com.example.bitfit1


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DrinkEntry::class], version = 1, exportSchema = false)
abstract class DrinkDatabase : RoomDatabase() {
    abstract fun drinkDao(): DrinkDao
}



