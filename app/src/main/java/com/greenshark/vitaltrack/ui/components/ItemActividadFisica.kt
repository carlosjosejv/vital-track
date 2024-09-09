package com.greenshark.vitaltrack.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.greenshark.vitaltrack.data.ActividadFisica
import com.greenshark.vitaltrack.ui.theme.VitalTrackTheme

/**
 * Created by Carlos Jiménez on 27-Aug-24.
 */

@Composable
fun ItemActividadFisica(actividadFisica: ActividadFisica) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(color = Color.LightGray)
            .clip(shape = RoundedCornerShape(15.dp))
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(text = actividadFisica.tipo, fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Text(text = actividadFisica.duracion, fontSize = 10.sp)
            Text(text = actividadFisica.calorias, fontSize = 10.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemActividadFisicaPreview() {
    VitalTrackTheme {
        ItemActividadFisica(ActividadFisica("Correr", "30 minutos", "5 kcal"))
    }
}