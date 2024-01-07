//[app](../../../index.md)/[com.example.androidweatherapplication.model](../index.md)/[Main](index.md)

# Main

[androidJvm]\
@Serializable

data class [Main](index.md)(val temp: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val feelsLike: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val pressure: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val humidity: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val tempMin: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val tempMax: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val seaLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, val grndLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null)

## Constructors

| | |
|---|---|
| [Main](-main.md) | [androidJvm]<br>constructor(temp: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), feelsLike: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), pressure: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), humidity: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), tempMin: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), tempMax: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), seaLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, grndLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [feelsLike](feels-like.md) | [androidJvm]<br>@SerialName(value = &quot;feels_like&quot;)<br>val [feelsLike](feels-like.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Temperature. This temperature parameter accounts for the human perception of weather |
| [grndLevel](grnd-level.md) | [androidJvm]<br>@SerialName(value = &quot;grnd_level&quot;)<br>val [grndLevel](grnd-level.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null<br>Atmospheric pressure on the ground level, hPa |
| [humidity](humidity.md) | [androidJvm]<br>val [humidity](humidity.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Humidity, % |
| [pressure](pressure.md) | [androidJvm]<br>val [pressure](pressure.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Atmospheric pressure on the sea level, hPa |
| [seaLevel](sea-level.md) | [androidJvm]<br>@SerialName(value = &quot;sea_level&quot;)<br>val [seaLevel](sea-level.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null<br>Atmospheric pressure on the sea level, hPa |
| [temp](temp.md) | [androidJvm]<br>val [temp](temp.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Temperature |
| [tempMax](temp-max.md) | [androidJvm]<br>@SerialName(value = &quot;temp_max&quot;)<br>val [tempMax](temp-max.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Maximum temperature at the moment. This is maximal currently observed temperature (within large megalopolises and urban areas) |
| [tempMin](temp-min.md) | [androidJvm]<br>@SerialName(value = &quot;temp_min&quot;)<br>val [tempMin](temp-min.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Minimum temperature at the moment. This is minimal currently observed temperature (within large megalopolises and urban areas) |
