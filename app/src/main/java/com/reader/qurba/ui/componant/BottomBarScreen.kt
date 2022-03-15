package com.reader.qurba.ui.componant

import com.reader.qurba.R
import com.reader.qurba.util.Statics

sealed class  BottomBarScreen(val route: String, val icon: Int) {
    object Home : BottomBarScreen(
        route = "home",
        icon = R.drawable.n_home
    )
    object Menu : BottomBarScreen(
        route = "menu",
        icon = R.drawable.n_eat
    )
    object Divide : BottomBarScreen(
        route = "divide",
        icon = R.drawable.n_divide
    )

    object Friends : BottomBarScreen(
        route = "friend",
        icon = R.drawable.n_two_p
    )

    object Profile : BottomBarScreen(
        route = "profile",
        icon = R.drawable.n_person
    )


}