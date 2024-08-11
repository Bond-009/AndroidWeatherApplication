//[app](../../../index.md)/[com.example.androidweatherapplication.data.database](../index.md)/[dbWeather](index.md)

# dbWeather

[androidJvm]\
data class [dbWeather](index.md)(val coord: [Coord](../-coord/index.md), val weather: [Weather](../-weather/index.md), val base: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val main: [Main](../-main/index.md), val visibility: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val wind: [Wind](../-wind/index.md), val clouds: [Clouds](../-clouds/index.md), val rain: [Rain](../-rain/index.md)? = null, val snow: [Snow](../-snow/index.md)? = null, val dt: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val sys: [Sys](../-sys/index.md), val timezone: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val cod: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

## Constructors

| | |
|---|---|
| [dbWeather](db-weather.md) | [androidJvm]<br>constructor(coord: [Coord](../-coord/index.md), weather: [Weather](../-weather/index.md), base: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), main: [Main](../-main/index.md), visibility: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), wind: [Wind](../-wind/index.md), clouds: [Clouds](../-clouds/index.md), rain: [Rain](../-rain/index.md)? = null, snow: [Snow](../-snow/index.md)? = null, dt: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), sys: [Sys](../-sys/index.md), timezone: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cod: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [base](base.md) | [androidJvm]<br>val [base](base.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [clouds](clouds.md) | [androidJvm]<br>val [clouds](clouds.md): [Clouds](../-clouds/index.md) |
| [cod](cod.md) | [androidJvm]<br>val [cod](cod.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Internal parameter |
| [coord](coord.md) | [androidJvm]<br>val [coord](coord.md): [Coord](../-coord/index.md) |
| [dt](dt.md) | [androidJvm]<br>val [dt](dt.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Time of data calculation, unix, UTC |
| [id](id.md) | [androidJvm]<br>val [id](id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>City ID |
| [main](main.md) | [androidJvm]<br>val [main](main.md): [Main](../-main/index.md) |
| [name](name.md) | [androidJvm]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>City name |
| [rain](rain.md) | [androidJvm]<br>val [rain](rain.md): [Rain](../-rain/index.md)? = null |
| [snow](snow.md) | [androidJvm]<br>val [snow](snow.md): [Snow](../-snow/index.md)? = null |
| [sys](sys.md) | [androidJvm]<br>val [sys](sys.md): [Sys](../-sys/index.md) |
| [timezone](timezone.md) | [androidJvm]<br>val [timezone](timezone.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Shift in seconds from UTC |
| [visibility](visibility.md) | [androidJvm]<br>val [visibility](visibility.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Visibility, meter. The maximum value of the visibility is 10 km |
| [weather](weather.md) | [androidJvm]<br>val [weather](weather.md): [Weather](../-weather/index.md) |
| [wind](wind.md) | [androidJvm]<br>val [wind](wind.md): [Wind](../-wind/index.md) |

## Functions

| Name | Summary |
|---|---|
| [asOpenWeatherMapResponse](../as-open-weather-map-response.md) | [androidJvm]<br>fun [dbWeather](index.md).[asOpenWeatherMapResponse](../as-open-weather-map-response.md)(): [OpenWeatherMapResponse](../../com.example.androidweatherapplication.model/-open-weather-map-response/index.md) |
