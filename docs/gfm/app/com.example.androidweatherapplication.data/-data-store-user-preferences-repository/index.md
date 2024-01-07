//[app](../../../index.md)/[com.example.androidweatherapplication.data](../index.md)/[DataStoreUserPreferencesRepository](index.md)

# DataStoreUserPreferencesRepository

[androidJvm]\
class [DataStoreUserPreferencesRepository](index.md)(dataStore: [DataStore](https://developer.android.com/reference/kotlin/androidx/datastore/core/DataStore.html)&lt;[Preferences](https://developer.android.com/reference/kotlin/androidx/datastore/preferences/core/Preferences.html)&gt;) : [UserPreferencesRepository](../-user-preferences-repository/index.md)

An implementation of the user preferences repository interface using DataStore

## Constructors

| | |
|---|---|
| [DataStoreUserPreferencesRepository](-data-store-user-preferences-repository.md) | [androidJvm]<br>constructor(dataStore: [DataStore](https://developer.android.com/reference/kotlin/androidx/datastore/core/DataStore.html)&lt;[Preferences](https://developer.android.com/reference/kotlin/androidx/datastore/preferences/core/Preferences.html)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [city](city.md) | [androidJvm]<br>open override val [city](city.md): Flow&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Flow returning the configured city |

## Functions

| Name | Summary |
|---|---|
| [saveCityPreference](save-city-preference.md) | [androidJvm]<br>open suspend override fun [saveCityPreference](save-city-preference.md)(city: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Saves the city to the repository |
