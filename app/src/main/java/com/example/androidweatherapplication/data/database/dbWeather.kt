package com.example.androidweatherapplication.data.database

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.androidweatherapplication.model.OpenWeatherMapResponse

@Entity(tableName="weather")
data class dbWeather (
    @Embedded val coord: Coord,
    @Embedded val weather: Weather,
    val base: String,
    @Embedded val main: Main,
    /**
     * Visibility, meter. The maximum value of the visibility is 10 km
     */
    val visibility: Int,
    @Embedded val wind: Wind,
    @Embedded val clouds: Clouds,
    @Embedded val rain: Rain? = null,
    @Embedded val snow: Snow? = null,
    /**
     * Time of data calculation, unix, UTC
     */
    val dt: Long,
    @Embedded val sys: Sys,
    /**
     * Shift in seconds from UTC
     */
    val timezone: Int,
    /**
     * City ID
     */
    val id: Int,
    /**
     * City name
     */
    @PrimaryKey
    val name: String,
    /**
     * Internal parameter
     */
    val cod: Int
)

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

data class Weather (
    /**
     * Weather condition id
     */
    @ColumnInfo(name = "weatherId")
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

data class Main (
    /**
     * Temperature
     */
    val temp: Float,
    /**
     * Temperature. This temperature parameter accounts for the human perception of weather
     */
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
    val tempMin: Float,
    /**
     * Maximum temperature at the moment. This is maximal currently observed temperature (within large megalopolises and urban areas)
     */
    val tempMax: Float,
    /**
     * Atmospheric pressure on the sea level, hPa
     */
    val seaLevel: Int? = null,
    /**
     * Atmospheric pressure on the ground level, hPa
     */
    val grndLevel: Int? = null
)

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

data class Clouds (
    /**
     * Cloudiness, %
     */
    val all: Int
)

data class Rain (
    /**
     * (where available) Rain volume for the last 1 hour, mm. Please note that only mm as units of measurement are available for this parameter
     */
    val h1: Float? = null,
    /**
     * (where available) Rain volume for the last 3 hours, mm. Please note that only mm as units of measurement are available for this parameter
     */
    val h3: Float? = null
)

data class Snow (
    /**
     * (where available) Snow volume for the last 1 hour, mm. Please note that only mm as units of measurement are available for this parameter
     */
    @ColumnInfo(name = "snowH1") val h1: Float? = null,
    /**
     * (where available)Snow volume for the last 3 hours, mm. Please note that only mm as units of measurement are available for this parameter
     */
    @ColumnInfo(name = "snowH3") val h3: Float? = null
)

data class Sys (
    /**
     * Internal parameter
     */
    val type: Int? = null,
    /**
     * Internal parameter
     */
    @ColumnInfo(name = "sysId") val id: Int? = null,
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

fun dbWeather.asOpenWeatherMapResponse(): OpenWeatherMapResponse {
    return OpenWeatherMapResponse(
        coord = this.coord.asModelCoord(),
        weather = listOf(this.weather.asModelWeather()),
        base = this.base,
        main = this.main.asModelMain(),
        visibility = this.visibility,
        wind = this.wind.asModelWind(),
        clouds = this.clouds.asModelClouds(),
        rain = this.rain?.asModelRain(),
        snow = this.snow?.asModelSnow(),
        dt = this.dt,
        sys = this.sys.asModelSys(),
        timezone = this.timezone,
        id = this.id,
        name = this.name,
        cod = this.cod
    )
}


fun Coord.asModelCoord(): com.example.androidweatherapplication.model.Coord {
    return com.example.androidweatherapplication.model.Coord(lon = this.lon, lat = this.lat)
}

fun Weather.asModelWeather(): com.example.androidweatherapplication.model.Weather {
    return com.example.androidweatherapplication.model.Weather(
        id = this.id,
        main = this.main,
        description = this.description,
        icon = this.icon
    )
}

fun Main.asModelMain(): com.example.androidweatherapplication.model.Main {
    return com.example.androidweatherapplication.model.Main(
        temp = this.temp,
        feelsLike = this.feelsLike,
        pressure = this.pressure,
        humidity = this.humidity,
        tempMin = this.tempMin,
        tempMax = this.tempMax,
        seaLevel = this.seaLevel,
        grndLevel = this.grndLevel
    )
}

fun Wind.asModelWind(): com.example.androidweatherapplication.model.Wind {
    return com.example.androidweatherapplication.model.Wind(speed = this.speed, deg = this.deg, gust = this.gust)
}

fun Clouds.asModelClouds(): com.example.androidweatherapplication.model.Clouds {
    return com.example.androidweatherapplication.model.Clouds(all = this.all)
}

fun Rain.asModelRain(): com.example.androidweatherapplication.model.Rain {
    return com.example.androidweatherapplication.model.Rain(h1 = this.h1, h3 = this.h3)
}

fun Snow.asModelSnow(): com.example.androidweatherapplication.model.Snow {
    return com.example.androidweatherapplication.model.Snow(h1 = this.h1, h3 = this.h3)
}

fun Sys.asModelSys(): com.example.androidweatherapplication.model.Sys {
    return com.example.androidweatherapplication.model.Sys(
        type = this.type,
        id = this.id,
        country = this.country,
        sunrise = this.sunrise,
        sunset = this.sunset)
}

fun OpenWeatherMapResponse.asDbWeather(): dbWeather {
    return dbWeather(
            coord = this.coord.asDbCoord(),
            weather = this.weather[0].asDbWeather(),
            base = this.base,
            main = this.main.asDbMain(),
            visibility = this.visibility,
            wind = this.wind.asDbWind(),
            clouds = this.clouds.asDbClouds(),
            rain = this.rain?.asDbRain(),
            snow = this.snow?.asDbSnow(),
            dt = this.dt,
            sys = this.sys.asDbSys(),
            timezone = this.timezone,
            id = this.id,
            name = this.name,
            cod = this.cod
    )
}

fun com.example.androidweatherapplication.model.Coord.asDbCoord(): Coord {
    return Coord(lon = this.lon, lat = this.lat)
}

fun com.example.androidweatherapplication.model.Weather.asDbWeather(): Weather {
    return Weather(
        id = this.id,
        main = this.main,
        description = this.description,
        icon = this.icon
    )
}

fun com.example.androidweatherapplication.model.Main.asDbMain(): Main {
    return Main(
        temp = this.temp,
        feelsLike = this.feelsLike,
        pressure = this.pressure,
        humidity = this.humidity,
        tempMin = this.tempMin,
        tempMax = this.tempMax,
        seaLevel = this.seaLevel,
        grndLevel = this.grndLevel
    )
}

fun com.example.androidweatherapplication.model.Wind.asDbWind(): Wind {
    return Wind(speed = this.speed, deg = this.deg, gust = this.gust)
}

fun com.example.androidweatherapplication.model.Clouds.asDbClouds(): Clouds {
    return Clouds(all = this.all)
}

fun com.example.androidweatherapplication.model.Rain.asDbRain(): Rain {
    return Rain(h1 = this.h1, h3 = this.h3)
}

fun com.example.androidweatherapplication.model.Snow.asDbSnow(): Snow {
    return Snow(h1 = this.h1, h3 = this.h3)
}

fun com.example.androidweatherapplication.model.Sys.asDbSys(): Sys {
    return Sys(
        type = this.type,
        id = this.id,
        country = this.country,
        sunrise = this.sunrise,
        sunset = this.sunset)
}
