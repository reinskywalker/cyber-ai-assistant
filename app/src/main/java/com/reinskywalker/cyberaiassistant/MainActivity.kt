package com.reinskywalker.cyberaiassistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import com.reinskywalker.cyberaiassistant.data.MainViewModel
import com.reinskywalker.cyberaiassistant.navigation.MyNavigation
import com.reinskywalker.cyberaiassistant.ui.theme.cyberaiassistantTheme

@ExperimentalMaterial3Api
@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cyberaiassistantTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                ) {

                    MyNavigation(
                        viewModel = viewModel,
                        onSearchClicked = { query -> viewModel.makeQuery(query) })
                }
            }
        }
    }
}