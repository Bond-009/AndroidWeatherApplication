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

// create the actual function implementations (expensive!)
object OpenWeatherMapApi {
    val retrofitService : OpenWeatherMapApiService by lazy {
        retrofit.create(OpenWeatherMapApiService::class.java)
    }
}

interface OpenWeatherMapApiService {
    /**
     * Call current weather data
     * @param cityName The city to get the weather from
     * @param apikey Your unique API key
     * @param mode Response format. Possible values are xml and html. If you don't use the mode parameter format is JSON by default.
     * @param units Units of measurement. standard, metric and imperial units are available. If you do not use the units parameter, standard units will be applied by default.
     * @return The response from the OpenWeatherMap API
     */
    @GET("/data/2.5/weather")
    suspend fun getWeather(
        @Query("q") cityName: String,
        @Query("appid") apikey: String = ApiKey,
        @Query("mode") mode: String = "json",
        @Query("units") units: String = "metric"
    ): OpenWeatherMapResponse
}