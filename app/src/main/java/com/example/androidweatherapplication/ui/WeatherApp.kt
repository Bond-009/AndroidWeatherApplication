package com.example.androidweatherapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.androidweatherapplication.R
import com.example.androidweatherapplication.ui.components.WeatherBottomAppBar
import com.example.androidweatherapplication.ui.navigation.WeatherOverviewScreen
import com.example.androidweatherapplication.ui.navigation.navComponent
import com.example.androidweatherapplication.ui.theme.AndroidWeatherApplicationTheme

@Composable
fun WeatherApp(
    navController: NavHostController = rememberNavController(),
) {
    val goHome: () -> Unit = {
        navController.popBackStack(
            WeatherOverviewScreen.Start.name,
            inclusive = false,
        )
    }
    val goToSettings = { navController.navigate(WeatherOverviewScreen.Settings.name) { launchSingleTop = true } }

    Scaffold(
        containerColor = Color.Transparent,
        bottomBar = {
            WeatherBottomAppBar(goHome, goToSettings)
        }
    ) { innerPadding ->
        navComponent(navController, modifier = Modifier.padding(innerPadding))
    }
}

@Preview(showBackground = true, widthDp = 500)
@Composable
fun WeatherAppPreview() {
    AndroidWeatherApplicationTheme {
        val image = painterResource(R.drawable.ic_launcher_background)
        // create a box to overlap image and texts
        Surface(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alpha = 0.5F,
            )
            WeatherApp()
        }
    }
}