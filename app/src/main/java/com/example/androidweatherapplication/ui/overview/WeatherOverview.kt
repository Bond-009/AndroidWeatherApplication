package com.example.androidweatherapplication.ui.overview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WeatherOverview(
    modifier: Modifier = Modifier,
    weatherOverviewViewModel: WeatherOverviewViewModel = viewModel()
) {
    val weatherOverviewState = weatherOverviewViewModel.uiState.collectAsState()

    val weatherApiState = weatherOverviewViewModel.weatherApiState

    Column() {
        Box(modifier = modifier) {
            when (weatherApiState) {
                is WeatherApiState.Loading -> Text("Loading...")
                is WeatherApiState.Error -> Text("Couldn't load...")
                is WeatherApiState.Success -> WeatherComponent(
                    weatherOverviewState = weatherOverviewState.value,
                )
            }
        }
    }
}

@Composable
fun WeatherComponent(
    modifier: Modifier = Modifier,
    weatherOverviewState: WeatherOverviewState
) {
    val currentWeather = weatherOverviewState.currentWeather;
    if (currentWeather == null) {
        Text(text = "Nothing to see here")
    }
    else {
        Column {
            Text(text = currentWeather.name)
            Text(text = String.format("%.0f°C", currentWeather.main.temp))
            Text(text = String.format("Min %.0f°C Max %.0f°C", currentWeather.main.tempMin, currentWeather.main.tempMax))
            Text(text = String.format("%d%% Humidity", currentWeather.main.humidity))
        }
    }
}