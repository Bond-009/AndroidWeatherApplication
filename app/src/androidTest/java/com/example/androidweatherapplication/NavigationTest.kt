package com.example.androidweatherapplication

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.SemanticsProperties.EditableText
import androidx.compose.ui.semantics.getOrNull
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.example.androidweatherapplication.ui.WeatherApp
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class NavigationTest {
    @get:Rule
    val composeTestRule = createComposeRule()
    private lateinit var navController: TestNavHostController

    @Before
    fun setupSvkAppGraphHost() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current)
            navController.navigatorProvider.addNavigator(ComposeNavigator())
            WeatherApp(navController = navController)
        }
    }

    @Test
    fun verifyStartDestination() {
        composeTestRule
            .onNodeWithTag("weatherApiOverview")
            .assertIsDisplayed()
    }

    @Test
    fun navigateToSettingsScreen() {
        composeTestRule
            .onNodeWithTag("settingsButton")
            .performClick()
        composeTestRule
            .onNodeWithText("City")
            .assertIsDisplayed()
    }

    @Test
    fun navigateToSettingsScreenAndBack() {
        composeTestRule
            .onNodeWithTag("settingsButton")
            .performClick()
        composeTestRule
            .onNodeWithText("City")
            .assertIsDisplayed()
        composeTestRule
            .onNodeWithTag("homeButton")
            .performClick()
        composeTestRule
            .onNodeWithTag("weatherApiOverview")
            .assertIsDisplayed()
    }

    @Test
    fun changeCity() {
        composeTestRule
            .onNodeWithTag("settingsButton")
            .performClick()
        val city = composeTestRule
            .onNodeWithText("City")
        city.performTextClearance()
        city.performTextInput("Gent")
        assertEquals("Gent", city.fetchSemanticsNode().config.getOrNull(EditableText).toString())
    }
}
