package com.greenshark.vitaltrack.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.greenshark.vitaltrack.data.ActividadFisica
import com.greenshark.vitaltrack.ui.components.ItemActividadFisica
import com.greenshark.vitaltrack.ui.theme.VitalTrackTheme

/**
 * Created by Carlos Jiménez on 27-Aug-24.
 */

@Composable
fun HistorialActividadFisica() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        )
    ) {

        Text(text = "Historial Actividad Fisica", fontSize = 25.sp, fontWeight = FontWeight.Bold)


        Text(text = "Aqui podras visualizar el historial de actividad fisica")


        val listaTemporal = listOf(
            ActividadFisica("Levantamiento Pesas", "10 minutos", "5 kcal"),
            ActividadFisica("Correr", "30 minutos", "8 kcal"),
            ActividadFisica("Flexiones", "8 minutos", "5 kcal"),
            ActividadFisica("Correr", "10 minutos", "1 kcal")
        )


        LazyColumn(verticalArrangement = Arrangement.spacedBy(20.dp)) {
            items(listaTemporal) { actividad ->
                ItemActividadFisica(actividadFisica = actividad)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HistorialActividadFisicaPreview() {
    VitalTrackTheme {
        HistorialActividadFisica()
    }
}