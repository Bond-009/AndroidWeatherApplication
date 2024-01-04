package com.example.androidweatherapplication.ui.settingsScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SettingsScreen(
    settingsScreenViewModel: SettingsScreenViewModel = viewModel(factory = SettingsScreenViewModel.Factory)
) {
    val settingsScreenState by settingsScreenViewModel.uiState.collectAsState()

    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
        OutlinedTextField(
            value = settingsScreenState.city,
            onValueChange = { settingsScreenViewModel.setCity(it) },
            label = { Text(text = "City") })
    }
}

@Preview
@Composable
fun SettingsScreenPreview() {
    SettingsScreen()
}