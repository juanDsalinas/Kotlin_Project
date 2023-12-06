package com.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        // Subir
        val cantidad = findViewById<EditText>(R.id.editTextNumberPedir)
        val btnSacar = findViewById<Button>(R.id.button8)
        val message = findViewById<TextView>(R.id.textView4)


        // SACAR
        val enviar = findViewById<EditText>(R.id.editTextNumberSacar)
        val btnEnviar = findViewById<Button>(R.id.button9)
        val message2 = findViewById<TextView>(R.id.textView10)

        val volver = findViewById<TextView>(R.id.button10)

        btnSacar.setOnClickListener {
            message.setText("Monto Recibido")
        }

        btnEnviar.setOnClickListener {
            message2.setText("Monto Retirado")
        }

        volver.setOnClickListener {
            val volvera = Intent(this,MainActivity2::class.java)
            startActivity(volvera)
        }





    }
}