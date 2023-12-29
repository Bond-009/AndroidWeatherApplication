package com.example.androidweatherapplication.ui.overview

import com.example.androidweatherapplication.model.OpenWeatherMapResponse

data class WeatherOverviewState (
    val currentWeather: OpenWeatherMapResponse?
)

//the sealed interface has only three possible values
sealed interface WeatherApiState {
    data class Success(val response: OpenWeatherMapResponse) : WeatherApiState
    object Error: WeatherApiState
    object Loading : WeatherApiState
}