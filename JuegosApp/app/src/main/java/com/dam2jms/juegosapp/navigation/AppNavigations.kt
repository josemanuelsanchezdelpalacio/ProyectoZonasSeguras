package com.dam2jms.juegosapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dam2jms.juegosapp.ui.ViewModelNones
import com.dam2jms.juegosapp.ui.ViewModelPiedra
import com.dam2jms.juegosapp.screens.mainScreen
import com.dam2jms.juegosapp.screens.nonesScreen
import com.dam2jms.juegosapp.screens.piedraScreen
import com.dam2jms.juegosapp.screens.sieteScreen
import com.dam2jms.juegosapp.ui.ViewModelSiete

@Composable
fun appNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MainScreen.route) {
        composable(route = AppScreens.MainScreen.route) { mainScreen(navController) }
        composable(route = AppScreens.NonesScreen.route) { nonesScreen(navController, mvvm = ViewModelNones()) }
        composable(route = AppScreens.PiedraScreen.route) { piedraScreen(navController, mvvm = ViewModelPiedra()) }
        composable(route = AppScreens.SieteScreen.route) { sieteScreen(navController, mvvm = ViewModelSiete()) }
    }
}