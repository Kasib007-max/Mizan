package com.kasib.mizan.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kasib.mizan.screens.LoginScreen
import com.kasib.mizan.screens.WelcomeScreen

@Composable
fun MizanNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {

        composable("welcome") {
            WelcomeScreen(
                onGetBalanceClick = {
                    navController.navigate("login")
                }
            )
        }

        composable("login") {
            LoginScreen()
        }
    }
}