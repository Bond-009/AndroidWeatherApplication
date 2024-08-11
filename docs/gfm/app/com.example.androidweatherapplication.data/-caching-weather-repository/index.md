//[app](../../../index.md)/[com.example.androidweatherapplication.data](../index.md)/[CachingWeatherRepository](index.md)

# CachingWeatherRepository

[androidJvm]\
class [CachingWeatherRepository](index.md)(weatherDao: [WeatherDao](../../com.example.androidweatherapplication.data.database/-weather-dao/index.md), openWeatherMapApiService: [OpenWeatherMapApiService](../../com.example.androidweatherapplication.network/-open-weather-map-api-service/index.md)) : [WeatherRepository](../-weather-repository/index.md)

## Constructors

| | |
|---|---|
| [CachingWeatherRepository](-caching-weather-repository.md) | [androidJvm]<br>constructor(weatherDao: [WeatherDao](../../com.example.androidweatherapplication.data.database/-weather-dao/index.md), openWeatherMapApiService: [OpenWeatherMapApiService](../../com.example.androidweatherapplication.network/-open-weather-map-api-service/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [deleteWeather](delete-weather.md) | [androidJvm]<br>open suspend override fun [deleteWeather](delete-weather.md)(data: [OpenWeatherMapResponse](../../com.example.androidweatherapplication.model/-open-weather-map-response/index.md)) |
| [getWeather](get-weather.md) | [androidJvm]<br>open suspend override fun [getWeather](get-weather.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [OpenWeatherMapResponse](../../com.example.androidweatherapplication.model/-open-weather-map-response/index.md)? |
| [insertWeather](insert-weather.md) | [androidJvm]<br>open suspend override fun [insertWeather](insert-weather.md)(data: [OpenWeatherMapResponse](../../com.example.androidweatherapplication.model/-open-weather-map-response/index.md)) |
