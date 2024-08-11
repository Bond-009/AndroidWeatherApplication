//[app](../../../index.md)/[com.example.androidweatherapplication.model](../index.md)/[Snow](index.md)

# Snow

[androidJvm]\
@Serializable

data class [Snow](index.md)(val h1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null, val h3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null)

## Constructors

| | |
|---|---|
| [Snow](-snow.md) | [androidJvm]<br>constructor(h1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null, h3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [h1](h1.md) | [androidJvm]<br>@SerialName(value = &quot;1h&quot;)<br>val [h1](h1.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null<br>(where available) Snow volume for the last 1 hour, mm. Please note that only mm as units of measurement are available for this parameter |
| [h3](h3.md) | [androidJvm]<br>@SerialName(value = &quot;3h&quot;)<br>val [h3](h3.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null<br>(where available)Snow volume for the last 3 hours, mm. Please note that only mm as units of measurement are available for this parameter |

## Functions

| Name | Summary |
|---|---|
| [asDbSnow](../../com.example.androidweatherapplication.data.database/as-db-snow.md) | [androidJvm]<br>fun [Snow](index.md).[asDbSnow](../../com.example.androidweatherapplication.data.database/as-db-snow.md)(): [Snow](../../com.example.androidweatherapplication.data.database/-snow/index.md) |
