package com.reinskywalker.cyberaiassistant.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.reinskywalker.cyberaiassistant.data.MainViewModel
import com.reinskywalker.cyberaiassistant.screens.AboutScreen
import com.reinskywalker.cyberaiassistant.screens.HomeScreen
import com.reinskywalker.cyberaiassistant.screens.MultiTurn


@ExperimentalComposeUiApi
@ExperimentalMaterial3Api
@Composable
fun MyNavigation(
    viewModel: MainViewModel,
    onSearchClicked: (String) -> Unit) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route)
    {
        composable(Home.route)
        {
            HomeScreen(viewModel, onSearchClicked, navController)
        }
        composable(MultiTurn.route){
            MultiTurn(viewModel)
        }
        composable(About.route){
            AboutScreen(navController)
        }
    }
}