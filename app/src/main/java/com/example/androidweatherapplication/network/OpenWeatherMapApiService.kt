package com.example.androidweatherapplication.network

import com.example.androidweatherapplication.model.OpenWeatherMapResponse
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://api.openweathermap.org"
private const val ApiKey: String = ""

private val retrofit = Retrofit.Builder()
    .addConverterFactory(
        Json.asConverterFactory("application/json".toMediaType())
    )
    .baseUrl(BASE_URL)
    .build()

//create the actual function implementations (expensive!)
object OpenWeatherMapApi {
    val retrofitService : OpenWeatherMapApiService by lazy {
        retrofit.create(OpenWeatherMapApiService::class.java)
    }
}

interface OpenWeatherMapApiService {
    @GET("/data/2.5/weather")
    suspend fun getWeather(
        @Query("q") cityName: String,
        @Query("appid") apikey: String = ApiKey,
        @Query("mode") mode: String = "json",
        @Query("units") units: String = "metric"
    ): OpenWeatherMapResponse
}