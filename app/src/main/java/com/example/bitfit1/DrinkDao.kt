package com.example.bitfit1

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DrinkDao {
    @Insert
    suspend fun insertDrinkEntry(entry: DrinkEntry)

    @Query("SELECT * FROM drink_entries ORDER BY date DESC")
    fun getAllDrinkEntries(): Flow<List<DrinkEntry>>
}
