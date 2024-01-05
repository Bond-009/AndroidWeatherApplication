package com.example.androidweatherapplication

import com.example.androidweatherapplication.data.UserPreferencesRepository
import com.example.androidweatherapplication.ui.settingsScreen.SettingsScreenViewModel
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.kotlin.mock

class SettingsScreenViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    private lateinit var viewModel: SettingsScreenViewModel
    private lateinit var repo: UserPreferencesRepository

    @Before
    fun setup() {
        repo = mock()
        viewModel = SettingsScreenViewModel(repo)
    }
    @Test
    fun viewModel_setCity_correct() {
        val newCity = "Gent"
        viewModel.setCity(newCity)
        assert(viewModel.uiState.value.city == newCity)
    }
}