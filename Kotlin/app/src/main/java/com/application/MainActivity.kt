package com.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegis = findViewById<Button>(R.id.buttonRegister)
        btnRegis.setOnClickListener {
            val ingresar = Intent(this,MainActivity2::class.java)
            startActivity(ingresar)
        }
    }
}