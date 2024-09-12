package com.greenshark.vitaltrack.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

/**
 * Created by Carlos Jiménez on 10-Sep-24.
 */

@Dao
interface ActividadFisicaDAO {

    //Esta funcion inserta un nuevo registro en la base datos
    //y en caso de algun conflicto ignora el registro que este generando el conflicto
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(registro: RegistroAF)

    //Esta funcion sirve para editar un registro exitente en la base de datos
    @Update
    suspend fun update(registro: RegistroAF)


    @Delete
    suspend fun delete(registro: RegistroAF)

    @Query("SELECT * from ActividadFisica ORDER BY tipo ASC")
    fun obtenerRegistros(): Flow<List<RegistroAF>>
}