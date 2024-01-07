//[app](../../../index.md)/[com.example.androidweatherapplication.network](../index.md)/[OpenWeatherMapApiService](index.md)

# OpenWeatherMapApiService

[androidJvm]\
interface [OpenWeatherMapApiService](index.md)

## Functions

| Name | Summary |
|---|---|
| [getWeather](get-weather.md) | [androidJvm]<br>@GET(value = &quot;/data/2.5/weather&quot;)<br>abstract suspend fun [getWeather](get-weather.md)(@Query(value = &quot;q&quot;)cityName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), @Query(value = &quot;appid&quot;)apikey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ApiKey, @Query(value = &quot;mode&quot;)mode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;json&quot;, @Query(value = &quot;units&quot;)units: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;metric&quot;): [OpenWeatherMapResponse](../../com.example.androidweatherapplication.model/-open-weather-map-response/index.md)<br>Call current weather data |
