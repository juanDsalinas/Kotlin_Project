package com.mitiendita

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.database.sqlite.SQLiteOpenHelper

class AdminSQL(contexto: Context, nombre:String, cursor: SQLiteDatabase.CursorFactory?, version: Int): SQLiteOpenHelper(contexto, nombre, cursor, version){

    fun obtenerTodosLosProductos(): List<Producto> {
        val productos = mutableListOf<Producto>()
        val db = this.writableDatabase

        val consulta = db.rawQuery("SELECT * FROM producto", null)

        while (consulta.moveToNext()) {
            val codigo = consulta.getInt(consulta.getColumnIndexOrThrow("codigo"))
            val nombre = consulta.getString(consulta.getColumnIndexOrThrow("nombre"))
            val precio = consulta.getFloat(consulta.getColumnIndexOrThrow("precio"))

            val producto = Producto(codigo, nombre, precio)
            productos.add(producto)
        }


        consulta.close()
        db.close()

        return productos
    }

    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("create table producto(codigo INTEGER primary key, nombre varchar(50), precio real)")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        // para hacer cambios en la BD
    }

}