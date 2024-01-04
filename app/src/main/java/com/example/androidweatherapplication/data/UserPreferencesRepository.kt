package com.example.androidweatherapplication.data

import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

class UserPreferencesRepository(
    private val dataStore: DataStore<Preferences>
){
    val city: Flow<String> = dataStore.data
        .catch {
            if(it is IOException) {
                Log.e(TAG, "Error reading preferences.", it)
                emit(emptyPreferences())
            } else {
                throw it
            }
        }
        .map { preferences ->
            preferences[CITY] ?: "Brussels"
        }

    private companion object {
        val CITY = stringPreferencesKey("city")
        const val TAG = "UserPreferencesRepo"
    }

    suspend fun saveCityPreference(city: String) {
        dataStore.edit {
            mutablePreferences -> mutablePreferences[CITY] = city
        }
    }
}