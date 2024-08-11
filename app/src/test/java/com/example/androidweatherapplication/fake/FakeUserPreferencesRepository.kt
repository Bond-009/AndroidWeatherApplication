package com.example.androidweatherapplication.fake

import com.example.androidweatherapplication.data.UserPreferencesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeUserPreferencesRepository : UserPreferencesRepository {
    override val city: Flow<String>
        get() = flow {
            emit("")
        }

    override suspend fun saveCityPreference(city: String) {
    }
}