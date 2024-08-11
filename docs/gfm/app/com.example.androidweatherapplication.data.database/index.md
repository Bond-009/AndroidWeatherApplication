//[app](../../index.md)/[com.example.androidweatherapplication.data.database](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [Clouds](-clouds/index.md) | [androidJvm]<br>data class [Clouds](-clouds/index.md)(val all: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [Coord](-coord/index.md) | [androidJvm]<br>data class [Coord](-coord/index.md)(val lon: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val lat: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [dbWeather](db-weather/index.md) | [androidJvm]<br>data class [dbWeather](db-weather/index.md)(val coord: [Coord](-coord/index.md), val weather: [Weather](-weather/index.md), val base: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val main: [Main](-main/index.md), val visibility: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val wind: [Wind](-wind/index.md), val clouds: [Clouds](-clouds/index.md), val rain: [Rain](-rain/index.md)? = null, val snow: [Snow](-snow/index.md)? = null, val dt: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val sys: [Sys](-sys/index.md), val timezone: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val cod: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [Main](-main/index.md) | [androidJvm]<br>data class [Main](-main/index.md)(val temp: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val feelsLike: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val pressure: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val humidity: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val tempMin: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val tempMax: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val seaLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, val grndLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null) |
| [Rain](-rain/index.md) | [androidJvm]<br>data class [Rain](-rain/index.md)(val h1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null, val h3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null) |
| [Snow](-snow/index.md) | [androidJvm]<br>data class [Snow](-snow/index.md)(val h1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null, val h3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null) |
| [Sys](-sys/index.md) | [androidJvm]<br>data class [Sys](-sys/index.md)(val type: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, val id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, val country: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sunrise: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val sunset: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |
| [Weather](-weather/index.md) | [androidJvm]<br>data class [Weather](-weather/index.md)(val id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val main: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val icon: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [WeatherDao](-weather-dao/index.md) | [androidJvm]<br>interface [WeatherDao](-weather-dao/index.md) |
| [WeatherDb](-weather-db/index.md) | [androidJvm]<br>abstract class [WeatherDb](-weather-db/index.md) : [RoomDatabase](https://developer.android.com/reference/kotlin/androidx/room/RoomDatabase.html)<br>Database class with a singleton Instance object. |
| [Wind](-wind/index.md) | [androidJvm]<br>data class [Wind](-wind/index.md)(val speed: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val deg: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val gust: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null) |

## Functions

| Name | Summary |
|---|---|
| [asDbClouds](as-db-clouds.md) | [androidJvm]<br>fun [Clouds](../com.example.androidweatherapplication.model/-clouds/index.md).[asDbClouds](as-db-clouds.md)(): [Clouds](-clouds/index.md) |
| [asDbCoord](as-db-coord.md) | [androidJvm]<br>fun [Coord](../com.example.androidweatherapplication.model/-coord/index.md).[asDbCoord](as-db-coord.md)(): [Coord](-coord/index.md) |
| [asDbMain](as-db-main.md) | [androidJvm]<br>fun [Main](../com.example.androidweatherapplication.model/-main/index.md).[asDbMain](as-db-main.md)(): [Main](-main/index.md) |
| [asDbRain](as-db-rain.md) | [androidJvm]<br>fun [Rain](../com.example.androidweatherapplication.model/-rain/index.md).[asDbRain](as-db-rain.md)(): [Rain](-rain/index.md) |
| [asDbSnow](as-db-snow.md) | [androidJvm]<br>fun [Snow](../com.example.androidweatherapplication.model/-snow/index.md).[asDbSnow](as-db-snow.md)(): [Snow](-snow/index.md) |
| [asDbSys](as-db-sys.md) | [androidJvm]<br>fun [Sys](../com.example.androidweatherapplication.model/-sys/index.md).[asDbSys](as-db-sys.md)(): [Sys](-sys/index.md) |
| [asDbWeather](as-db-weather.md) | [androidJvm]<br>fun [OpenWeatherMapResponse](../com.example.androidweatherapplication.model/-open-weather-map-response/index.md).[asDbWeather](as-db-weather.md)(): [dbWeather](db-weather/index.md)<br>fun [Weather](../com.example.androidweatherapplication.model/-weather/index.md).[asDbWeather](as-db-weather.md)(): [Weather](-weather/index.md) |
| [asDbWind](as-db-wind.md) | [androidJvm]<br>fun [Wind](../com.example.androidweatherapplication.model/-wind/index.md).[asDbWind](as-db-wind.md)(): [Wind](-wind/index.md) |
| [asModelClouds](as-model-clouds.md) | [androidJvm]<br>fun [Clouds](-clouds/index.md).[asModelClouds](as-model-clouds.md)(): [Clouds](../com.example.androidweatherapplication.model/-clouds/index.md) |
| [asModelCoord](as-model-coord.md) | [androidJvm]<br>fun [Coord](-coord/index.md).[asModelCoord](as-model-coord.md)(): [Coord](../com.example.androidweatherapplication.model/-coord/index.md) |
| [asModelMain](as-model-main.md) | [androidJvm]<br>fun [Main](-main/index.md).[asModelMain](as-model-main.md)(): [Main](../com.example.androidweatherapplication.model/-main/index.md) |
| [asModelRain](as-model-rain.md) | [androidJvm]<br>fun [Rain](-rain/index.md).[asModelRain](as-model-rain.md)(): [Rain](../com.example.androidweatherapplication.model/-rain/index.md) |
| [asModelSnow](as-model-snow.md) | [androidJvm]<br>fun [Snow](-snow/index.md).[asModelSnow](as-model-snow.md)(): [Snow](../com.example.androidweatherapplication.model/-snow/index.md) |
| [asModelSys](as-model-sys.md) | [androidJvm]<br>fun [Sys](-sys/index.md).[asModelSys](as-model-sys.md)(): [Sys](../com.example.androidweatherapplication.model/-sys/index.md) |
| [asModelWeather](as-model-weather.md) | [androidJvm]<br>fun [Weather](-weather/index.md).[asModelWeather](as-model-weather.md)(): [Weather](../com.example.androidweatherapplication.model/-weather/index.md) |
| [asModelWind](as-model-wind.md) | [androidJvm]<br>fun [Wind](-wind/index.md).[asModelWind](as-model-wind.md)(): [Wind](../com.example.androidweatherapplication.model/-wind/index.md) |
| [asOpenWeatherMapResponse](as-open-weather-map-response.md) | [androidJvm]<br>fun [dbWeather](db-weather/index.md).[asOpenWeatherMapResponse](as-open-weather-map-response.md)(): [OpenWeatherMapResponse](../com.example.androidweatherapplication.model/-open-weather-map-response/index.md) |
