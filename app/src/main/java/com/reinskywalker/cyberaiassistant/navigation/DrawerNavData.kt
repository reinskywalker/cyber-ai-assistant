package com.reinskywalker.cyberaiassistant.navigation

import com.reinskywalker.cyberaiassistant.R

data class DrawerNavigationItem(
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
)

val Items = listOf(
    DrawerNavigationItem(
        title = "Home",
        selectedIcon = R.drawable.home_selected,
        unselectedIcon = R.drawable.home,
    ),
    DrawerNavigationItem(
        title = "About",
        selectedIcon = R.drawable.info,
        unselectedIcon = R.drawable.info,
    )
)