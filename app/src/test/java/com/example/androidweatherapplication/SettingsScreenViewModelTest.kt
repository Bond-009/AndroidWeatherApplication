package com.example.androidweatherapplication

import com.example.androidweatherapplication.fake.FakeUserPreferencesRepository
import com.example.androidweatherapplication.ui.settingsScreen.SettingsScreenViewModel
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class SettingsScreenViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    private lateinit var viewModel: SettingsScreenViewModel
    private lateinit var repo: FakeUserPreferencesRepository

    @Before
    fun setup() {
        repo = FakeUserPreferencesRepository()
        viewModel = SettingsScreenViewModel(repo)
    }
    @Test
    fun viewModel_setCity_correct() {
        val newCity = "Gent"
        viewModel.setCity(newCity)
        assert(viewModel.uiState.value.city == newCity)
    }
}