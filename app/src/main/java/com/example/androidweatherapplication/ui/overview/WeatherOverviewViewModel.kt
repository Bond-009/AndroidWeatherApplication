package com.example.androidweatherapplication.ui.overview

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidweatherapplication.network.OpenWeatherMapApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.io.IOException

class WeatherOverviewViewModel : ViewModel() {
    // use StateFlow (Flow: emits current state + any updates)
    private val _uiState = MutableStateFlow(WeatherOverviewState(null))
    val uiState: StateFlow<WeatherOverviewState> = _uiState.asStateFlow()

    // keeping the state of the api request
    var weatherApiState: WeatherApiState by mutableStateOf(WeatherApiState.Loading)
        private set

    init {
        getWeather()
    }

    private fun getWeather(){
        viewModelScope.launch {
            try{
                val result = OpenWeatherMapApi.retrofitService.getWeather("Brussels")
                _uiState.update {
                    it.copy(currentWeather = result)
                }
                weatherApiState = WeatherApiState.Success(result)
            }
            catch (e: IOException){
                //show a toast? save a log on firebase? ...
                //set the error state
                weatherApiState = WeatherApiState.Error
            }
        }
    }
}
