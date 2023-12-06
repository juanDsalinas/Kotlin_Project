package com.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val celsius = findViewById<EditText>(R.id.editTextText2)
        val btnCal = findViewById<Button>(R.id.button11)
        val res = findViewById<TextView>(R.id.textView9)


        val btnVolver = findViewById<Button>(R.id.button12)

        btnCal.setOnClickListener {
            // Revisar
            var cov =celsius.text.toString().toInt()
            cov = (cov*9)/5
            cov = (cov +32).toInt()
            res.setText("$cov")
        }

        btnVolver.setOnClickListener {
            val ingresar = Intent(this,MainActivity2::class.java)
            startActivity(ingresar)
        }
    }
}