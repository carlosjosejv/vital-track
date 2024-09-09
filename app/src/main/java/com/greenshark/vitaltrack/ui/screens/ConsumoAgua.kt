package com.greenshark.vitaltrack.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.greenshark.vitaltrack.ui.theme.VitalTrackTheme

/**
 * Created by Carlos Jiménez on 14-Aug-24.
 */

@Composable
fun ConsumoAguaScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        
    }
}

@Preview(showBackground = true)
@Composable
fun ConsumoAguaScreenPreview() {
    VitalTrackTheme {
        ConsumoAguaScreen()
    }
}