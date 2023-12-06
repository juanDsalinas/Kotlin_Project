package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user=findViewById<EditText>(R.id.username)
        val password=findViewById<EditText>(R.id.password)
        val btnSend =findViewById<Button>(R.id.button)

        btnSend.setOnClickListener{
            val ingresar = Intent(this,MainActivity2::class.java)
            startActivity(ingresar)
        }
    }
}