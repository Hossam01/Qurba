package com.reader.qurba.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.reader.qurba.ui.dashboard.DashBoardScreen
import com.reader.qurba.ui.splash.SplashScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = AppRoute.Splash.route) {
        composable(route = AppRoute.Splash.route) { SplashScreen(navController = navController) }
        composable(route = AppRoute.DashBoard.route) { DashBoardScreen(navController = navController) }
    }
}