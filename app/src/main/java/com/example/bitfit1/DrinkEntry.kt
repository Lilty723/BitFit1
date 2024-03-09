package com.example.bitfit1

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "drink_entries")
data class DrinkEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val amount: Int, // Amount of water consumed
    val date: Long // Timestamp of entry
)


