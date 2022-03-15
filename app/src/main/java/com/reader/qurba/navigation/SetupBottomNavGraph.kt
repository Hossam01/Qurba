package com.reader.qurba.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.reader.qurba.ui.dashboard.*

@Composable
fun SetupBottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AppRoute.Home.route
    ) {
        composable(route = AppRoute.Home.route) {
            HomeScreen()
        }
        composable(route = AppRoute.Profile.route) {
            ProfileScreen()
        }
        composable(route = AppRoute.Friend.route) {
            FriendsScreen()
        }
        composable(route = AppRoute.Menu.route) {
            MenuScreen()
        }
        composable(route = AppRoute.Divide.route) {
            DivideScreen()
        }
    }
}