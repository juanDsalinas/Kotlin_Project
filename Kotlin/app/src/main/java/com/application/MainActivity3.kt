package com.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val num1= findViewById<EditText>(R.id.editTextNumberSuma1)
        val num2 = findViewById<EditText>(R.id.editTextNumberSuma2)

        val calcular = findViewById<Button>(R.id.buttonResSuma)

        val resultado = findViewById<TextView>(R.id.textViewSuma)

        val btnVolver = findViewById<Button>(R.id.button7)

        calcular.setOnClickListener{
            var suma1 =num1.text.toString().toInt() + num2.text.toString().toInt()
            suma1.toString()
            resultado.setText("$suma1")
        }

        btnVolver.setOnClickListener{
            val menu = Intent(this,MainActivity2::class.java)
            startActivity(menu)
        }


    }
}