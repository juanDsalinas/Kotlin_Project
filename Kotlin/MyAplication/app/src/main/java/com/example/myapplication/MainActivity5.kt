package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myapplication.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Listas - ListView
        val paises = arrayOf("Argentina","venve","ararar","soacha")
        val capital = arrayOf("1","2","3","4")
        val adaptador = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,paises)

        listPaises.adapter = adaptador
        listPaises.setOnClickListener{
            adapterView,view,i,l ->
            // Insert Toast MakeText
        }


    }

}