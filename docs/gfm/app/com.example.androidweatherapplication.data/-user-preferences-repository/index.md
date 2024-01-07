//[app](../../../index.md)/[com.example.androidweatherapplication.data](../index.md)/[UserPreferencesRepository](index.md)

# UserPreferencesRepository

interface [UserPreferencesRepository](index.md)

The user preferences repository

#### Inheritors

| |
|---|
| [DataStoreUserPreferencesRepository](../-data-store-user-preferences-repository/index.md) |

## Properties

| Name | Summary |
|---|---|
| [city](city.md) | [androidJvm]<br>abstract val [city](city.md): Flow&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Flow returning the configured city |

## Functions

| Name | Summary |
|---|---|
| [saveCityPreference](save-city-preference.md) | [androidJvm]<br>abstract suspend fun [saveCityPreference](save-city-preference.md)(city: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Saves the city to the repository |
