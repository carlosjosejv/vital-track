package com.greenshark.vitaltrack.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.greenshark.vitaltrack.R
import com.greenshark.vitaltrack.ui.NavigationItem
import com.greenshark.vitaltrack.ui.theme.VitalTrackTheme

/**
 * Created by Carlos Jiménez on 21-Aug-24.
 */

@Composable
fun PantallaInicio(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "¡Bienvenido!", fontSize = 25.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Selecciona la actividad que deseas registrar", fontSize = 15.sp)

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(modifier = Modifier
                .size(150.dp)
                .clickable {
                    navController.navigate(NavigationItem.RegistroActividadFisica.route)
                }) {
                Image(
                    painter = painterResource(id = R.drawable.fondo),
                    contentDescription = "Actividad Fisica",
                    modifier = Modifier.matchParentSize(),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Actividad Fisica", color = Color.White, modifier = Modifier.align(
                        Alignment.Center
                    )
                )
            }

            Box(modifier = Modifier
                .size(150.dp)
                .clickable {
                    navController.navigate(NavigationItem.RegistroAlimentacion.route)
                }) {
                Image(
                    painter = painterResource(id = R.drawable.food),
                    contentDescription = "Alimentos",
                    modifier = Modifier.matchParentSize(),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Consumo de Alimentos", color = Color.White, modifier = Modifier.align(
                        Alignment.Center
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(modifier = Modifier
                .size(150.dp)
                .clickable {
                    navController.navigate(NavigationItem.RegistroSignosVitales.route)
                }) {
                Image(
                    painter = painterResource(id = R.drawable.signos),
                    contentDescription = "Signos Vitales",
                    modifier = Modifier.matchParentSize(),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Signos Vitales", color = Color.White, modifier = Modifier.align(
                        Alignment.Center
                    )
                )
            }

            Box(modifier = Modifier
                .size(150.dp)
                .clickable {
                    navController.navigate(NavigationItem.RegistroConsumoAgua.route)
                }) {
                Image(
                    painter = painterResource(id = R.drawable.agua),
                    contentDescription = "Consumo Agua",
                    modifier = Modifier.matchParentSize(),
                    contentScale = ContentScale.Crop,
                )
                Text(
                    text = "Consumo de Agua", color = Color.White, modifier = Modifier.align(
                        Alignment.Center
                    )
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PantallaInicioPreview() {
    VitalTrackTheme {
        PantallaInicio(rememberNavController())
    }
}