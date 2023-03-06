package com.example.saludousuario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton:Button = findViewById(R.id.btnIngresar)
        boton.setOnClickListener {ingresarNombre()}
    }
        private fun ingresarNombre() {
            val campoNombre:EditText = findViewById(R.id.txtNombre)
            var nombre = campoNombre.text
            Toast.makeText(this, "Bienvenid@ $nombre", Toast.LENGTH_LONG).show()
        }

}