package com.example.androidweatherapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androidweatherapplication.ui.overview.WeatherOverview
import com.example.androidweatherapplication.ui.settingsScreen.SettingsScreen

@Composable
fun navComponent(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = WeatherOverviewScreen.Start.name,
        modifier = modifier,
    ) {
        composable(route = WeatherOverviewScreen.Start.name) {
            WeatherOverview()
        }
        composable(route = WeatherOverviewScreen.Settings.name) {
            SettingsScreen()
        }
    }
}