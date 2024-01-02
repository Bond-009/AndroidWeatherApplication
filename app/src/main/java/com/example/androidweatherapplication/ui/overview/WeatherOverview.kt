package com.example.androidweatherapplication.ui.overview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WeatherOverview(
    modifier: Modifier = Modifier,
    weatherOverviewViewModel: WeatherOverviewViewModel = viewModel(factory = WeatherOverviewViewModel.Factory)
) {
    val weatherOverviewState = weatherOverviewViewModel.uiState.collectAsState()

    val weatherApiState = weatherOverviewViewModel.weatherApiState

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = modifier) {
            when (weatherApiState) {
                is WeatherApiState.Loading -> Text("Loading...")
                is WeatherApiState.Error -> Text("Couldn't load...")
                is WeatherApiState.Success -> WeatherComponent(
                    weatherOverviewState = weatherOverviewState.value
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
    val currentWeather = weatherOverviewState.currentWeather!!;
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = currentWeather.name, fontSize = 32.sp)
        Text(text = String.format("%.0f°C", currentWeather.main.temp), fontSize = 64.sp)
        Text(text = currentWeather.weather[0].main)
        Text(text = String.format("H:%.0f°C L:%.0f°C", currentWeather.main.tempMax, currentWeather.main.tempMin))
    }
}