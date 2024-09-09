package com.greenshark.vitaltrack.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.greenshark.vitaltrack.ui.screens.HistorialActividadFisica
import com.greenshark.vitaltrack.ui.screens.PantallaInicio
import com.greenshark.vitaltrack.ui.screens.RegistrarActividadScreen
import com.greenshark.vitaltrack.ui.screens.RegistrarAlimentacionScreen

/**
 * Created by Carlos Jiménez on 09-Sep-24.
 */

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String
){
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ){
        composable(NavigationItem.Home.route){
            PantallaInicio(navController)
        }

        composable(NavigationItem.HistorialActividadFisica.route){
            HistorialActividadFisica()
        }

        composable(NavigationItem.RegistroActividadFisica.route){
            RegistrarActividadScreen()
        }

        composable(NavigationItem.RegistroAlimentacion.route){
            RegistrarAlimentacionScreen()
        }

    }
}