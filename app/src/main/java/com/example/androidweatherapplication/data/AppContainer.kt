package com.example.androidweatherapplication.data

import android.content.Context
import com.example.androidweatherapplication.data.database.WeatherDb
import com.example.androidweatherapplication.network.BASE_URL
import com.example.androidweatherapplication.network.OpenWeatherMapApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val weatherRepository: WeatherRepository
}

class DefaultAppContainer(private val context: Context): AppContainer {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(
            Json.asConverterFactory("application/json".toMediaType())
        )
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService : OpenWeatherMapApiService by lazy {
        retrofit.create(OpenWeatherMapApiService::class.java)
    }

    override val weatherRepository: WeatherRepository by lazy {
        CachingWeatherRepository(WeatherDb.getDatabase(context = context).weatherDao(), retrofitService)
    }
}