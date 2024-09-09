package com.greenshark.vitaltrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.greenshark.vitaltrack.ui.AppNavHost
import com.greenshark.vitaltrack.ui.NavigationItem
import com.greenshark.vitaltrack.ui.theme.VitalTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VitalTrackTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppNavHost(
                        Modifier.padding(innerPadding),
                        navController = rememberNavController(),
                        startDestination = NavigationItem.Home.route
                    )
                }
            }
        }
    }
}
