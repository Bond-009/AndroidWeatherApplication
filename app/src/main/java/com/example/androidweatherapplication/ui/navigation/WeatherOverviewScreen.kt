package com.example.androidweatherapplication.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.androidweatherapplication.R

enum class WeatherOverviewScreen(@StringRes val title: Int, val icon: ImageVector) {
    Start(title = R.string.app_name, icon = Icons.Filled.Home),
    Settings(title = R.string.app_name, icon = Icons.Filled.Settings),
}