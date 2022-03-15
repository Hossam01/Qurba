package com.reader.qurba.ui.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.reader.qurba.navigation.SetupBottomNavGraph
import com.reader.qurba.ui.componant.BottomBarScreen
import com.reader.qurba.ui.componant.CustomSharePost
import com.reader.qurba.ui.componant.CustomTopBar

@Composable
fun DashBoardScreen(navController: NavHostController){
    DashBoardDesign()
}

@Composable
fun DashBoardDesign(){
    val navController = rememberNavController()
    Column(modifier = Modifier.fillMaxSize()) {
        CustomTopBar()
        CustomSharePost()
        Scaffold(bottomBar = { BottomBar(navController = navController) }) { SetupBottomNavGraph(navController = navController) }
    }

}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Menu,
        BottomBarScreen.Divide,
        BottomBarScreen.Friends,
        BottomBarScreen.Profile,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        modifier = Modifier.background(Color.White),
        icon = {
            Image(
                painter = painterResource(id = screen.icon),
                contentDescription = null
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}



@Preview
@Composable
fun DashBoardScreenDisplay(){
    DashBoardDesign()
}