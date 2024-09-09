package com.greenshark.vitaltrack.ui

/**
 * Created by Carlos Jiménez on 09-Sep-24.
 */

enum class Screen {
    HOME,
    REGISTRO_ACTIVIDAD_FISICA,
    REGISTRO_CONSUMO_AGUA,
    REGISTRO_ALIMENTACION,
    REGISTRO_SIGNOS_VITALES,
    HISTORIAL_ACTIVIDAD_FISICA,
    HISTORIAL_CONSUMO_AGUA,
    HISTORIAL_ALIMENTACION,
    HISTORIAL_SIGNOS_VITALES
}

sealed class NavigationItem(val route: String) {
    object Home : NavigationItem(Screen.HOME.name)
    object RegistroActividadFisica : NavigationItem(Screen.REGISTRO_ACTIVIDAD_FISICA.name)
    object RegistroConsumoAgua : NavigationItem(Screen.REGISTRO_CONSUMO_AGUA.name)
    object RegistroAlimentacion : NavigationItem(Screen.REGISTRO_ALIMENTACION.name)
    object RegistroSignosVitales : NavigationItem(Screen.REGISTRO_SIGNOS_VITALES.name)
    object HistorialActividadFisica : NavigationItem(Screen.HISTORIAL_ACTIVIDAD_FISICA.name)
    object HistorialConsumoAgua : NavigationItem(Screen.HISTORIAL_CONSUMO_AGUA.name)
    object HistorialAlimentacion : NavigationItem(Screen.HISTORIAL_ALIMENTACION.name)
    object HistorialSignosVitales : NavigationItem(Screen.HISTORIAL_SIGNOS_VITALES.name)
}
