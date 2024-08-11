//[app](../../../index.md)/[com.example.androidweatherapplication.data.database](../index.md)/[Weather](index.md)

# Weather

[androidJvm]\
data class [Weather](index.md)(val id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val main: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val icon: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

## Constructors

| | |
|---|---|
| [Weather](-weather.md) | [androidJvm]<br>constructor(id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), main: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), icon: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [description](description.md) | [androidJvm]<br>val [description](description.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Weather condition within the group |
| [icon](icon.md) | [androidJvm]<br>val [icon](icon.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Weather icon id |
| [id](id.md) | [androidJvm]<br>val [id](id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Weather condition id |
| [main](main.md) | [androidJvm]<br>val [main](main.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Group of weather parameters (Rain, Snow, Clouds etc.) |

## Functions

| Name | Summary |
|---|---|
| [asModelWeather](../as-model-weather.md) | [androidJvm]<br>fun [Weather](index.md).[asModelWeather](../as-model-weather.md)(): [Weather](../../com.example.androidweatherapplication.model/-weather/index.md) |
