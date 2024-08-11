//[app](../../../index.md)/[com.example.androidweatherapplication.data](../index.md)/[WeatherRepository](index.md)

# WeatherRepository

interface [WeatherRepository](index.md)

#### Inheritors

| |
|---|
| [CachingWeatherRepository](../-caching-weather-repository/index.md) |

## Functions

| Name | Summary |
|---|---|
| [deleteWeather](delete-weather.md) | [androidJvm]<br>abstract suspend fun [deleteWeather](delete-weather.md)(data: [OpenWeatherMapResponse](../../com.example.androidweatherapplication.model/-open-weather-map-response/index.md)) |
| [getWeather](get-weather.md) | [androidJvm]<br>abstract suspend fun [getWeather](get-weather.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [OpenWeatherMapResponse](../../com.example.androidweatherapplication.model/-open-weather-map-response/index.md)? |
| [insertWeather](insert-weather.md) | [androidJvm]<br>abstract suspend fun [insertWeather](insert-weather.md)(data: [OpenWeatherMapResponse](../../com.example.androidweatherapplication.model/-open-weather-map-response/index.md)) |
