//[app](../../../index.md)/[com.example.androidweatherapplication.ui.settingsScreen](../index.md)/[SettingsScreenViewModel](index.md)

# SettingsScreenViewModel

[androidJvm]\
class [SettingsScreenViewModel](index.md)(userPreferencesRepository: [UserPreferencesRepository](../../com.example.androidweatherapplication.data/-user-preferences-repository/index.md)) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)

## Constructors

| | |
|---|---|
| [SettingsScreenViewModel](-settings-screen-view-model.md) | [androidJvm]<br>constructor(userPreferencesRepository: [UserPreferencesRepository](../../com.example.androidweatherapplication.data/-user-preferences-repository/index.md)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [uiState](ui-state.md) | [androidJvm]<br>val [uiState](ui-state.md): StateFlow&lt;[SettingsScreenState](../-settings-screen-state/index.md)&gt; |

## Functions

| Name | Summary |
|---|---|
| [addCloseable](index.md#383812252%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [addCloseable](index.md#383812252%2FFunctions%2F-912451524)(closeable: [AutoCloseable](https://developer.android.com/reference/kotlin/java/lang/AutoCloseable.html))<br>fun [addCloseable](index.md#1722490497%2FFunctions%2F-912451524)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), closeable: [AutoCloseable](https://developer.android.com/reference/kotlin/java/lang/AutoCloseable.html)) |
| [getCloseable](index.md#1102255800%2FFunctions%2F-912451524) | [androidJvm]<br>fun &lt;[T](index.md#1102255800%2FFunctions%2F-912451524) : [AutoCloseable](https://developer.android.com/reference/kotlin/java/lang/AutoCloseable.html)&gt; [getCloseable](index.md#1102255800%2FFunctions%2F-912451524)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](index.md#1102255800%2FFunctions%2F-912451524)? |
| [setCity](set-city.md) | [androidJvm]<br>fun [setCity](set-city.md)(city: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
