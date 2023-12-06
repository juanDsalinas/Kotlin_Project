package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val calculador=findViewById<Button>(R.id.button4)
        val cajer = findViewById<Button>(R.id.button5)
        val salirr = findViewById<Button>(R.id.button7)

        calculador.setOnClickListener{
            val calculadora = Intent(this,MainActivity3::class.java)
            startActivity(calculadora)
        }

        cajer.setOnClickListener{
            val cajero = Intent(this,MainActivity4::class.java)
            startActivity(cajero)
        }

        salirr.setOnClickListener{
            val salir = Intent(this,MainActivity::class.java)
            startActivity(salir)
        }
    }
}