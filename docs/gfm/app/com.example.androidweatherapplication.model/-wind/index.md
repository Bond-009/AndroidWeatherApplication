//[app](../../../index.md)/[com.example.androidweatherapplication.model](../index.md)/[Wind](index.md)

# Wind

[androidJvm]\
@Serializable

data class [Wind](index.md)(val speed: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val deg: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val gust: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null)

## Constructors

| | |
|---|---|
| [Wind](-wind.md) | [androidJvm]<br>constructor(speed: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), deg: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), gust: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [deg](deg.md) | [androidJvm]<br>val [deg](deg.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Wind direction, degrees (meteorological) |
| [gust](gust.md) | [androidJvm]<br>val [gust](gust.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null<br>Wind gust |
| [speed](speed.md) | [androidJvm]<br>val [speed](speed.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour |

## Functions

| Name | Summary |
|---|---|
| [asDbWind](../../com.example.androidweatherapplication.data.database/as-db-wind.md) | [androidJvm]<br>fun [Wind](index.md).[asDbWind](../../com.example.androidweatherapplication.data.database/as-db-wind.md)(): [Wind](../../com.example.androidweatherapplication.data.database/-wind/index.md) |
