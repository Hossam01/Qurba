package com.reader.qurba.navigation

import android.content.res.Resources
import com.reader.qurba.R
import com.reader.qurba.util.Statics

sealed class AppRoute(val route:String){
    object Splash : AppRoute("splash")
    object DashBoard : AppRoute("dashboard")
    object Home : AppRoute("home")
    object Menu : AppRoute("menu")
    object Divide : AppRoute("divide")
    object Profile : AppRoute("profile")
    object Friend : AppRoute("friend")
}