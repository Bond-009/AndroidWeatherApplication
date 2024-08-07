package com.example.androidweatherapplication.data

import com.example.androidweatherapplication.data.database.WeatherDao
import com.example.androidweatherapplication.data.database.asDbWeather
import com.example.androidweatherapplication.data.database.asOpenWeatherMapResponse
import com.example.androidweatherapplication.model.OpenWeatherMapResponse
import com.example.androidweatherapplication.network.OpenWeatherMapApiService
import java.time.Instant

interface WeatherRepository {
    suspend fun getWeather(id: String): OpenWeatherMapResponse?
    suspend fun insertWeather(data: OpenWeatherMapResponse)
    suspend fun deleteWeather(data: OpenWeatherMapResponse)
}

class CachingWeatherRepository(private val weatherDao: WeatherDao, private val openWeatherMapApiService: OpenWeatherMapApiService): WeatherRepository {
    override suspend fun getWeather(name: String): OpenWeatherMapResponse? {
        var dbRes = weatherDao.getItem(name)
        if (dbRes == null || Instant.ofEpochSecond(dbRes.dt) < Instant.now().minusSeconds(60 * 60)) {
            try {
                var weather = openWeatherMapApiService.getWeather(name)
                insertWeather(weather)
                return weather
            }
            catch(e: Exception) {
                //log something
            }
        }

        return dbRes?.asOpenWeatherMapResponse();
    }

    override suspend fun insertWeather(data: OpenWeatherMapResponse) {
        weatherDao.insert(data.asDbWeather())
    }

    override suspend fun deleteWeather(data: OpenWeatherMapResponse) {
        weatherDao.delete(data.asDbWeather())
    }
}