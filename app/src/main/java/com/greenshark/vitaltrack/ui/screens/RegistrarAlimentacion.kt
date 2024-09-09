package com.greenshark.vitaltrack.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import com.greenshark.vitaltrack.ui.theme.Pink10
import com.greenshark.vitaltrack.ui.theme.VitalTrackTheme

/**
 * Created by Carlos Jiménez on 13-Aug-24.
 */

@Composable
fun RegistrarAlimentacionScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.food),
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
            text = "Registrar Alimentación",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Pink10
        )

        Spacer(modifier = Modifier.height(20.dp))

        var tipoComida by remember {
            mutableStateOf("")
        }

        TextField(value = tipoComida, onValueChange = {
            tipoComida = it
        })

        var cantidadComida by remember {
            mutableStateOf("")
        }


        TextField(value = cantidadComida, onValueChange = {
            cantidadComida = it
        })

        var caloriasConsumidas by remember {
            mutableStateOf("")
        }

        TextField(value = caloriasConsumidas, onValueChange = {
            caloriasConsumidas = it
        })

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Registrar Alimentación")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun RegistrarAlimentacionScreenPreview() {
    VitalTrackTheme {
        RegistrarAlimentacionScreen()
    }
}