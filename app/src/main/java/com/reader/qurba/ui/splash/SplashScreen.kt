package com.reader.qurba.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.reader.qurba.R
import com.reader.qurba.navigation.AppRoute
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController){
    LaunchedEffect(key1 = true) {
        delay(500)
        navController.popBackStack()
        navController.navigate(AppRoute.DashBoard.route)
    }
    SplashDesign()
}
@Composable
fun SplashDesign(){
    Image(painter = painterResource(id = R.drawable.splash), contentDescription = stringResource(id = R.string.splash_picture), contentScale = ContentScale.Crop )
}

@Preview
@Composable
fun SplashScreenDisplay(){
    SplashDesign()
}