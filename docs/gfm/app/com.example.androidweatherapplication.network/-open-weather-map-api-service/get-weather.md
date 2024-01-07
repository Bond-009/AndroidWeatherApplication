//[app](../../../index.md)/[com.example.androidweatherapplication.network](../index.md)/[OpenWeatherMapApiService](index.md)/[getWeather](get-weather.md)

# getWeather

[androidJvm]\

@GET(value = &quot;/data/2.5/weather&quot;)

abstract suspend fun [getWeather](get-weather.md)(@Query(value = &quot;q&quot;)cityName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), @Query(value = &quot;appid&quot;)apikey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ApiKey, @Query(value = &quot;mode&quot;)mode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;json&quot;, @Query(value = &quot;units&quot;)units: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;metric&quot;): [OpenWeatherMapResponse](../../com.example.androidweatherapplication.model/-open-weather-map-response/index.md)

Call current weather data

#### Return

The response from the OpenWeatherMap API

#### Parameters

androidJvm

| | |
|---|---|
| cityName | The city to get the weather from |
| apikey | Your unique API key |
| mode | Response format. Possible values are xml and html. If you don't use the mode parameter format is JSON by default. |
| units | Units of measurement. standard, metric and imperial units are available. If you do not use the units parameter, standard units will be applied by default. |
