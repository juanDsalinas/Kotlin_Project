package com.mitiendita

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val codigo = findViewById<EditText>(R.id.editTextNumberCod);
        val nombre = findViewById<EditText>(R.id.editTextTextName);
        val precio = findViewById<EditText>(R.id.editTextNumber2Price);

        // btn
        val btnRegistrar = findViewById<Button>(R.id.buttonReg);
        val btnConsultar = findViewById<Button>(R.id.buttonCon);
        val btnActualizar = findViewById<Button>(R.id.buttonEdi);
        val btnEliminar = findViewById<Button>(R.id.buttonEli);
        val btnAll = findViewById<Button>(R.id.buttonAll);

        btnRegistrar.setOnClickListener {
            val adminDB = AdminSQL(this, "JuanchosTore", null, 1);
            val db = adminDB.writableDatabase

            val registro = ContentValues()
            registro.put("codigo", codigo.text.toString().toInt())
            registro.put("nombre", nombre.text.toString())
            registro.put("precio", precio.text.toString().toDouble())

            db.insert("producto", null, registro)
            db.close()
            codigo.setText("")
            nombre.setText("")
            precio.setText("")
            Toast.makeText(this,"Producto Registrado", Toast.LENGTH_LONG).show()
        }

        btnConsultar.setOnClickListener {
            val adminDB = AdminSQL(this, "JuanchosTore", null, 1);
            val db = adminDB.writableDatabase
            val consulta = db.rawQuery("SELECT nombre, precio FROM producto WHERE codigo = ${codigo.text.toString()}", null)
            if(consulta.moveToFirst()){
                // indicamos que columnas queremos que nos consulte
                nombre.setText(consulta.getString(0));
                precio.setText(consulta.getString(1));
            }else {
                Toast.makeText(this,"Producto no encontrado", Toast.LENGTH_LONG).show();
                nombre.setText("");
                precio.setText("");
            }
            db.close()
        }

        btnActualizar.setOnClickListener {
            val adminDB = AdminSQL(this, "JuanchosTore", null, 1);
            val db = adminDB.writableDatabase
            val registro = ContentValues()
            registro.put("nombre",nombre.text.toString())
            registro.put("precio",precio.text.toString().toDouble())
            val act = db.update("producto",registro,"codigo=${codigo.text.toString()}",null)
            db.close()
            if(act == 1){
                Toast.makeText(this,"Producto Actualizado", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"El Producto no existe", Toast.LENGTH_LONG).show();
            }
        }

        btnEliminar.setOnClickListener {
            val adminDB = AdminSQL(this, "JuanchosTore", null, 1);
            val db = adminDB.writableDatabase
            val eliminar = db.delete("producto","codigo=${codigo.text.toString()}",null)
            codigo.setText("")
            nombre.setText("")
            precio.setText("")
            if(eliminar == 1){
                Toast.makeText(this,"Producto Eliminado", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"El Producto no existe", Toast.LENGTH_LONG).show();
            }
        }

        btnAll.setOnClickListener {
            val intento1 = Intent(this,MainActivity2::class.java)
            startActivity(intento1)
        }

    }
}