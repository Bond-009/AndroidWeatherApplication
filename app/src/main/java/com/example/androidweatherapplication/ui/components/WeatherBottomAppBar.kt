package com.example.androidweatherapplication.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun WeatherBottomAppBar(goHome: () -> Unit, goToSettings: () -> Unit) {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary,
        actions = {
            IconButton(onClick = goHome, modifier = Modifier.testTag("homeButton")) {
                Icon(Icons.Filled.Home, contentDescription = "navigate to home screen")
            }

            IconButton(onClick = goToSettings, modifier = Modifier.testTag("settingsButton")) {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "navigate to settings page",
                )
            }
        }
    )
}