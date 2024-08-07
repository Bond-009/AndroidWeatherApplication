package com.example.androidweatherapplication

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.example.androidweatherapplication.data.AppContainer
import com.example.androidweatherapplication.data.DataStoreUserPreferencesRepository
import com.example.androidweatherapplication.data.DefaultAppContainer
import com.example.androidweatherapplication.data.UserPreferencesRepository

private const val PREFERENCE_NAME = "preferences"

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
    name = PREFERENCE_NAME
)

class WeatherApplication : Application() {
    lateinit var container: AppContainer
    lateinit var userPreferencesRepository: UserPreferencesRepository

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(context = applicationContext)
        userPreferencesRepository = DataStoreUserPreferencesRepository(dataStore)
    }
}