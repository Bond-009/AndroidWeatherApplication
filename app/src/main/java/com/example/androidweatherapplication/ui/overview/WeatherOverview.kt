package com.example.androidweatherapplication.ui.overview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidweatherapplication.model.OpenWeatherMapResponse
import com.example.androidweatherapplication.ui.components.RotationAware

@Composable
fun WeatherOverview(
    modifier: Modifier = Modifier,
    weatherOverviewViewModel: WeatherOverviewViewModel = viewModel(factory = WeatherOverviewViewModel.Factory)
) {
    val weatherOverviewState = weatherOverviewViewModel.uiState.collectAsState()

    val weatherApiState = weatherOverviewViewModel.weatherApiState

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Box(modifier = modifier.testTag("weatherApiOverview")) {
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
    val currentWeather = weatherOverviewState.currentWeather!!
    RotationAware(modifier = modifier) {
        MainWeatherComponent(modifier = modifier, weatherResponse = currentWeather)
        Spacer(modifier = Modifier.size(24.dp))
        WindComponent(modifier = modifier, weatherResponse = currentWeather)
    }
}

@Composable
fun MainWeatherComponent(
    modifier: Modifier = Modifier,
    weatherResponse: OpenWeatherMapResponse
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = weatherResponse.name, fontSize = 32.sp)
        Text(text = String.format("%.0f°C", weatherResponse.main.temp), fontSize = 64.sp)
        Text(text = weatherResponse.weather[0].main)
        Text(text = String.format("H:%.0f°C L:%.0f°C", weatherResponse.main.tempMax, weatherResponse.main.tempMin))
    }
}

@Composable
fun WindComponent(
    modifier: Modifier = Modifier,
    weatherResponse: OpenWeatherMapResponse
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Wind", fontSize = 24.sp)
        Text(text = String.format("%.0fm/s", weatherResponse.wind.speed))
        Text(text = String.format("%d°", weatherResponse.wind.deg))
        if (weatherResponse.wind.gust != null) Text(text = String.format("Gusts: %.0fm/s", weatherResponse.wind.gust)) else {}
    }
}