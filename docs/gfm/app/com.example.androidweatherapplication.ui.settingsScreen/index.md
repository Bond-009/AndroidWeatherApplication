//[app](../../index.md)/[com.example.androidweatherapplication.ui.settingsScreen](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [SettingsScreenState](-settings-screen-state/index.md) | [androidJvm]<br>data class [SettingsScreenState](-settings-screen-state/index.md)(val city: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [SettingsScreenViewModel](-settings-screen-view-model/index.md) | [androidJvm]<br>class [SettingsScreenViewModel](-settings-screen-view-model/index.md)(userPreferencesRepository: [UserPreferencesRepository](../com.example.androidweatherapplication.data/-user-preferences-repository/index.md)) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html) |

## Functions

| Name | Summary |
|---|---|
| [SettingsScreen](-settings-screen.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [SettingsScreen](-settings-screen.md)(settingsScreenViewModel: [SettingsScreenViewModel](-settings-screen-view-model/index.md) = viewModel(factory = SettingsScreenViewModel.Factory)) |
| [SettingsScreenPreview](-settings-screen-preview.md) | [androidJvm]<br>@[Preview](https://developer.android.com/reference/kotlin/androidx/compose/ui/tooling/preview/Preview.html)<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [SettingsScreenPreview](-settings-screen-preview.md)() |
