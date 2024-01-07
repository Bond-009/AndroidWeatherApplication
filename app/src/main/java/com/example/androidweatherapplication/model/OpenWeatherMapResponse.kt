package com.example.androidweatherapplication.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OpenWeatherMapResponse (
    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main: Main,
    /**
     * Visibility, meter. The maximum value of the visibility is 10 km
     */
    val visibility: Int,
    val wind: Wind,
    val clouds: Clouds,
    val rain: Rain? = null,
    val snow: Snow? = null,
    /**
     * Time of data calculation, unix, UTC
     */
    val dt: Long,
    val sys: Sys,
    /**
     * Shift in seconds from UTC
     */
    val timezone: Int,
    /**
     * City ID
     */
    @Deprecated(message = "Please note that built-in geocoder functionality has been deprecated.")
    val id: Int,
    /**
     * City name
     */
    @Deprecated(message = "Please note that built-in geocoder functionality has been deprecated.")
    val name: String,
    /**
     * Internal parameter
     */
    val cod: Int
)

@Serializable
data class Coord (
    /**
     * Longitude of the location
     */
    val lon: Float,
    /**
     * Latitude of the location
     */
    val lat: Float
)

@Serializable
data class Weather (
    /**
     * Weather condition id
     */
    val id: Int,
    /**
     * Group of weather parameters (Rain, Snow, Clouds etc.)
     */
    val main: String,
    /**
     * Weather condition within the group
     */
    val description: String,
    /**
     * Weather icon id
     */
    val icon: String
)

@Serializable
data class Main (
    /**
     * Temperature
     */
    val temp: Float,
    /**
     * Temperature. This temperature parameter accounts for the human perception of weather
     */
    @SerialName("feels_like")
    val feelsLike: Float,
    /**
     * Atmospheric pressure on the sea level, hPa
     */
    val pressure: Int,
    /**
     * Humidity, %
     */
    val humidity: Int,
    /**
     * Minimum temperature at the moment. This is minimal currently observed temperature (within large megalopolises and urban areas)
     */
    @SerialName("temp_min")
    val tempMin: Float,
    /**
     * Maximum temperature at the moment. This is maximal currently observed temperature (within large megalopolises and urban areas)
     */
    @SerialName("temp_max")
    val tempMax: Float,
    /**
     * Atmospheric pressure on the sea level, hPa
     */
    @SerialName("sea_level")
    val seaLevel: Int? = null,
    /**
     * Atmospheric pressure on the ground level, hPa
     */
    @SerialName("grnd_level")
    val grndLevel: Int? = null
)

@Serializable
data class Wind (
    /**
     * Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour
     */
    val speed: Float,
    /**
     * Wind direction, degrees (meteorological)
     */
    val deg: Int,
    /**
     * Wind gust
     */
    val gust: Float? = null
)

@Serializable
data class Clouds (
    /**
     * Cloudiness, %
     */
    val all: Int
)

@Serializable
data class Rain (
    /**
     * (where available) Rain volume for the last 1 hour, mm. Please note that only mm as units of measurement are available for this parameter
     */
    @SerialName("1h")
    val h1: Float? = null,
    /**
     * (where available) Rain volume for the last 3 hours, mm. Please note that only mm as units of measurement are available for this parameter
     */
    @SerialName("3h")
    val h3: Float? = null
)

@Serializable
data class Snow (
    /**
     * (where available) Snow volume for the last 1 hour, mm. Please note that only mm as units of measurement are available for this parameter
     */
    @SerialName("1h")
    val h1: Float? = null,
    /**
     * (where available)Snow volume for the last 3 hours, mm. Please note that only mm as units of measurement are available for this parameter
     */
    @SerialName("3h")
    val h3: Float? = null
)

@Serializable
data class Sys (
    /**
     * Internal parameter
     */
    val type: Int? = null,
    /**
     * Internal parameter
     */
    val id: Int? = null,
    /**
     * Country code (GB, JP etc.)
     */
    val country: String,
    /**
     * Sunrise time, unix, UTC
     */
    val sunrise: Long,
    /**
     * Sunset time, unix, UTC
     */
    val sunset: Long,
)
