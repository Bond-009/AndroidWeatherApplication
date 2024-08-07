package com.example.androidweatherapplication.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: dbWeather)

    @Delete
    suspend fun delete(item: dbWeather)

    @Query("SELECT * from weather WHERE name = :name")
    suspend fun getItem(name: String): dbWeather?
}