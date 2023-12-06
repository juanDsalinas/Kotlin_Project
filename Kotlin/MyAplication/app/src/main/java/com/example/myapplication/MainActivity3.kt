package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val num1= findViewById<EditText>(R.id.numero1)
        val num2 = findViewById<EditText>(R.id.numero2)
        val calcular = findViewById<Button>(R.id.button8)
        val resultado = findViewById<TextView>(R.id.resul)
        val btnVolver = findViewById<Button>(R.id.button9)

        calcular.setOnClickListener{
            var suma =num1.text.toString().toInt() + num2.text.toString().toInt()
            suma.toString()
            resultado.setText("$suma")
        }

        btnVolver.setOnClickListener{
            val menu = Intent(this,MainActivity2::class.java)
            startActivity(menu)
        }
    }
}