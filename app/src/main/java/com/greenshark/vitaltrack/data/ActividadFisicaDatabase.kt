package com.greenshark.vitaltrack.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by Carlos Jiménez on 10-Sep-24.
 */

@Database(entities = [RegistroAF::class], version = 1, exportSchema = false)
abstract class ActividadFisicaDatabase : RoomDatabase() {
    abstract fun actividadFisicaDAO(): ActividadFisicaDAO

    companion object {
        @Volatile
        private var Instance: ActividadFisicaDatabase? = null

        fun getDatabase(context: Context): ActividadFisicaDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, ActividadFisicaDatabase::class.java, "af_database")
                    .fallbackToDestructiveMigration().build().also {
                        Instance = it
                    }
            }
        }
    }
}