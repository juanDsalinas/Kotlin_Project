package com.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnSalir = findViewById<Button>(R.id.buttonSalir1)
        val btnCal = findViewById<Button>(R.id.buttonCal)
        val btnNeq = findViewById<Button>(R.id.buttonNeq)
        val btnFC = findViewById<Button>(R.id.buttonFC)


        btnSalir.setOnClickListener {
            val ingresar = Intent(this,MainActivity::class.java)
            startActivity(ingresar)
        }

        btnCal.setOnClickListener {
            val ingresar1 = Intent(this,MainActivity3::class.java)
            startActivity(ingresar1)
        }

        btnNeq.setOnClickListener {
            val ingresar2 = Intent(this,MainActivity4::class.java)
            startActivity(ingresar2)
        }

        btnFC.setOnClickListener {
            val ingresar5 = Intent(this,MainActivity5::class.java)
            startActivity(ingresar5)
        }
    }
}