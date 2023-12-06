package com.mitiendita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnVolver = findViewById<Button>(R.id.buttonVolver)

        val adminDB = AdminSQL(this, "JuanchosTore", null, 1)

        // Obtiene la data ya tranformada
        val listaDeProductos = adminDB.obtenerTodosLosProductos()

        if(listaDeProductos === null){
            Toast.makeText(this,"No hay ningún producto", Toast.LENGTH_LONG).show()
            val intento1 = Intent(this,MainActivity::class.java)
            startActivity(intento1)
        }else{
            val listView = findViewById<ListView>(R.id.ListViewP)
            val adapter = ArrayAdapter<Producto>(this, android.R.layout.simple_list_item_1, listaDeProductos)
            listView.adapter = adapter
        }

        btnVolver.setOnClickListener {
            val intento1 = Intent(this,MainActivity::class.java)
            startActivity(intento1)
        }
    }
}