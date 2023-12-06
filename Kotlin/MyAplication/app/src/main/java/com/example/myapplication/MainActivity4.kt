package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val cantidad = findViewById<EditText>(R.id.cantidad)
        val btnSacar = findViewById<Button>(R.id.button10)
        val message = findViewById<TextView>(R.id.SacarM)

        val enviar = findViewById<EditText>(R.id.ingresar)
        val btnEnviar = findViewById<Button>(R.id.button11)
        val message2 = findViewById<TextView>(R.id.textView9)

        val volver = findViewById<TextView>(R.id.button12)

        btnSacar.setOnClickListener {
            message.setText("Monto Enviado")
        }

        btnEnviar.setOnClickListener {
            message2.setText("Monto Recibido")
        }

        volver.setOnClickListener {
            val volvera = Intent(this,MainActivity2::class.java)
            startActivity(volvera)
        }

    }

}