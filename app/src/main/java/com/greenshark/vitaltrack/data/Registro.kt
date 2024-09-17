package com.greenshark.vitaltrack.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Carlos Jiménez on 10-Sep-24.
 */

@Entity(tableName = "ActividadFisica")
data class RegistroAF(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val tipo: String,
    val duracion: Double,
    val calorias: Double
)


