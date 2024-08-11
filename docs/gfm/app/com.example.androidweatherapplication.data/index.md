//[app](../../index.md)/[com.example.androidweatherapplication.data](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [AppContainer](-app-container/index.md) | [androidJvm]<br>interface [AppContainer](-app-container/index.md) |
| [CachingWeatherRepository](-caching-weather-repository/index.md) | [androidJvm]<br>class [CachingWeatherRepository](-caching-weather-repository/index.md)(weatherDao: [WeatherDao](../com.example.androidweatherapplication.data.database/-weather-dao/index.md), openWeatherMapApiService: [OpenWeatherMapApiService](../com.example.androidweatherapplication.network/-open-weather-map-api-service/index.md)) : [WeatherRepository](-weather-repository/index.md) |
| [DataStoreUserPreferencesRepository](-data-store-user-preferences-repository/index.md) | [androidJvm]<br>class [DataStoreUserPreferencesRepository](-data-store-user-preferences-repository/index.md)(dataStore: [DataStore](https://developer.android.com/reference/kotlin/androidx/datastore/core/DataStore.html)&lt;[Preferences](https://developer.android.com/reference/kotlin/androidx/datastore/preferences/core/Preferences.html)&gt;) : [UserPreferencesRepository](-user-preferences-repository/index.md)<br>An implementation of the user preferences repository interface using DataStore |
| [DefaultAppContainer](-default-app-container/index.md) | [androidJvm]<br>class [DefaultAppContainer](-default-app-container/index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)) : [AppContainer](-app-container/index.md) |
| [UserPreferencesRepository](-user-preferences-repository/index.md) | [androidJvm]<br>interface [UserPreferencesRepository](-user-preferences-repository/index.md)<br>The user preferences repository |
| [WeatherRepository](-weather-repository/index.md) | [androidJvm]<br>interface [WeatherRepository](-weather-repository/index.md) |
