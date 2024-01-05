package com.example.androidweatherapplication.ui.settingsScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SettingsScreen(
    settingsScreenViewModel: SettingsScreenViewModel = viewModel(factory = SettingsScreenViewModel.Factory)
) {
    val settingsScreenState by settingsScreenViewModel.uiState.collectAsState()

    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
        Text(text = "Settings", fontSize = 32.sp)
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