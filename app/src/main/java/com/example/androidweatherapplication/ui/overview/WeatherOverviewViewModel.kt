package com.example.androidweatherapplication.ui.overview

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.androidweatherapplication.WeatherApplication
import com.example.androidweatherapplication.data.UserPreferencesRepository
import com.example.androidweatherapplication.data.WeatherRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class WeatherOverviewViewModel(
    private val userPreferencesRepository: UserPreferencesRepository,
    private val weatherRepository: WeatherRepository
) : ViewModel() {

    // use StateFlow (Flow: emits current state + any updates)
    private val _uiState = MutableStateFlow(WeatherOverviewState(null))
    val uiState: StateFlow<WeatherOverviewState> = _uiState.asStateFlow()

    // keeping the state of the api request
    var weatherApiState: WeatherApiState by mutableStateOf(WeatherApiState.Loading)
        private set

    init {
        getWeather()
    }

    private fun getWeather() {
        viewModelScope.launch {
            userPreferencesRepository.city.collect { city ->
                    var result = weatherRepository.getWeather(city)
                    if (result != null) {
                        _uiState.update {
                            it.copy(currentWeather = result)
                        }
                        weatherApiState = WeatherApiState.Success(result)
                    }
                    else {
                        weatherApiState = WeatherApiState.Error
                    }
            }
        }
    }

    companion object {
        private var Instance: WeatherOverviewViewModel? = null
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                if (Instance == null) {
                    val application = (this[APPLICATION_KEY] as WeatherApplication)
                    val userPreferencesRepository = application.userPreferencesRepository;
                    val weatherRepository = application.container.weatherRepository;
                    Instance = WeatherOverviewViewModel(userPreferencesRepository = userPreferencesRepository, weatherRepository = weatherRepository)
                }
                Instance!!
            }
        }
    }
}
