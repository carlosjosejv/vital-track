package com.greenshark.vitaltrack.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.greenshark.vitaltrack.R
import com.greenshark.vitaltrack.ui.theme.VitalTrackTheme

/**
 * Created by Carlos Jiménez on 12-Aug-24.
 */

@Composable
fun RegistrarActividadScreen() {
    /* El componente Column nos permite organizar lo
     componentes dentro de el de forma vertical (Arriba hacia abajo)*/
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Registrar Actividad Fisica",
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 60.dp),
            textAlign = TextAlign.Center
        )

        var tipoEjercicio by remember {
            mutableStateOf("")
        }

        OutlinedTextField(value = tipoEjercicio, onValueChange = {
            tipoEjercicio = it
        }, label = {
            Text(text = "Tipo de Ejercicio", color = Color.LightGray)
        })

        var duracion by remember {
            mutableStateOf("")
        }

        OutlinedTextField(value = duracion, onValueChange = {
            duracion = it
        }, label = {
            Text(text = "Duración", color = Color.LightGray)
        })

        var caloriasQuemadas by remember {
            mutableStateOf("")
        }

        OutlinedTextField(value = caloriasQuemadas, onValueChange = {
            caloriasQuemadas = it
        }, label = {
            Text(text = "Calorias Quemadas", color = Color.LightGray)
        })

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ }, modifier = Modifier.width(250.dp)) {
            Text(text = "Registrar")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun RegistrarActividadScreenPreview() {
    VitalTrackTheme {
        RegistrarActividadScreen()
    }
}
