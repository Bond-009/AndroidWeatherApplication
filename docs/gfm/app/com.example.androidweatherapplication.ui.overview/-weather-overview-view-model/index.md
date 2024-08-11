//[app](../../../index.md)/[com.example.androidweatherapplication.ui.overview](../index.md)/[WeatherOverviewViewModel](index.md)

# WeatherOverviewViewModel

[androidJvm]\
class [WeatherOverviewViewModel](index.md)(userPreferencesRepository: [UserPreferencesRepository](../../com.example.androidweatherapplication.data/-user-preferences-repository/index.md), weatherRepository: [WeatherRepository](../../com.example.androidweatherapplication.data/-weather-repository/index.md)) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)

## Constructors

| | |
|---|---|
| [WeatherOverviewViewModel](-weather-overview-view-model.md) | [androidJvm]<br>constructor(userPreferencesRepository: [UserPreferencesRepository](../../com.example.androidweatherapplication.data/-user-preferences-repository/index.md), weatherRepository: [WeatherRepository](../../com.example.androidweatherapplication.data/-weather-repository/index.md)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [uiState](ui-state.md) | [androidJvm]<br>val [uiState](ui-state.md): StateFlow&lt;[WeatherOverviewState](../-weather-overview-state/index.md)&gt; |
| [weatherApiState](weather-api-state.md) | [androidJvm]<br>var [weatherApiState](weather-api-state.md): [WeatherApiState](../-weather-api-state/index.md) |

## Functions

| Name | Summary |
|---|---|
| [addCloseable](../../com.example.androidweatherapplication.ui.settingsScreen/-settings-screen-view-model/index.md#383812252%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [addCloseable](../../com.example.androidweatherapplication.ui.settingsScreen/-settings-screen-view-model/index.md#383812252%2FFunctions%2F-912451524)(closeable: [AutoCloseable](https://developer.android.com/reference/kotlin/java/lang/AutoCloseable.html))<br>fun [addCloseable](../../com.example.androidweatherapplication.ui.settingsScreen/-settings-screen-view-model/index.md#1722490497%2FFunctions%2F-912451524)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), closeable: [AutoCloseable](https://developer.android.com/reference/kotlin/java/lang/AutoCloseable.html)) |
| [getCloseable](../../com.example.androidweatherapplication.ui.settingsScreen/-settings-screen-view-model/index.md#1102255800%2FFunctions%2F-912451524) | [androidJvm]<br>fun &lt;[T](../../com.example.androidweatherapplication.ui.settingsScreen/-settings-screen-view-model/index.md#1102255800%2FFunctions%2F-912451524) : [AutoCloseable](https://developer.android.com/reference/kotlin/java/lang/AutoCloseable.html)&gt; [getCloseable](../../com.example.androidweatherapplication.ui.settingsScreen/-settings-screen-view-model/index.md#1102255800%2FFunctions%2F-912451524)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](../../com.example.androidweatherapplication.ui.settingsScreen/-settings-screen-view-model/index.md#1102255800%2FFunctions%2F-912451524)? |
