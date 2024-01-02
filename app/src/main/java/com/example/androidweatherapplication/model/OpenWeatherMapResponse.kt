package com.example.androidweatherapplication.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OpenWeatherMapResponse (
    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main: Main,
    val visibility: Int,
    val wind: Wind,
    val clouds: Clouds,
    val rain: Rain,
    val dt: Long,
    val sys: Sys,
    val timezone: Int,
    val id: Int,
    val name: String,
    val cod: Int
)

@Serializable
data class Coord (
    val lon: Float,
    val lat: Float
)

@Serializable
data class Weather (
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)

@Serializable
data class Main (
    val temp: Float,
    @SerialName("feels_like")
    val feelsLike: Float,
    @SerialName("temp_min")
    val tempMin: Float,
    @SerialName("temp_max")
    val tempMax: Float,
    val pressure: Int,
    val humidity: Int,
    @SerialName("sea_level")
    val seaLevel: Int? = null,
    @SerialName("grnd_level")
    val grndLevel: Int? = null
)

@Serializable
data class Wind (
    val speed: Float,
    val deg: Int,
    val gust: Float? = null
)

@Serializable
data class Rain (
    @SerialName("1h")
    val h1: Float? = null,
    @SerialName("3h")
    val h3: Float? = null
)

@Serializable
data class Clouds (
    val all: Int
)

@Serializable
data class Sys (
    val type: Int,
    val id: Int,
    val country: String,
    val sunrise: Long,
    val sunset: Long,
)
