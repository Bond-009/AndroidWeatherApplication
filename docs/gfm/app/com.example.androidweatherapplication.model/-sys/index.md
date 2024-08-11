//[app](../../../index.md)/[com.example.androidweatherapplication.model](../index.md)/[Sys](index.md)

# Sys

[androidJvm]\
@Serializable

data class [Sys](index.md)(val type: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, val id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, val country: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sunrise: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), val sunset: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))

## Constructors

| | |
|---|---|
| [Sys](-sys.md) | [androidJvm]<br>constructor(type: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null, country: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), sunrise: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), sunset: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [country](country.md) | [androidJvm]<br>val [country](country.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Country code (GB, JP etc.) |
| [id](id.md) | [androidJvm]<br>val [id](id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null<br>Internal parameter |
| [sunrise](sunrise.md) | [androidJvm]<br>val [sunrise](sunrise.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Sunrise time, unix, UTC |
| [sunset](sunset.md) | [androidJvm]<br>val [sunset](sunset.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Sunset time, unix, UTC |
| [type](type.md) | [androidJvm]<br>val [type](type.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null<br>Internal parameter |

## Functions

| Name | Summary |
|---|---|
| [asDbSys](../../com.example.androidweatherapplication.data.database/as-db-sys.md) | [androidJvm]<br>fun [Sys](index.md).[asDbSys](../../com.example.androidweatherapplication.data.database/as-db-sys.md)(): [Sys](../../com.example.androidweatherapplication.data.database/-sys/index.md) |
