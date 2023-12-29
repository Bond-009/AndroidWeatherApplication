package com.example.androidweatherapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androidweatherapplication.ui.overview.WeatherOverview

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
    }
}