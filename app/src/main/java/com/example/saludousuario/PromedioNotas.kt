package com.example.saludousuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PromedioNotas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promedio_notas)

        val btnCalcular:Button = findViewById(R.id.buttonCalcular)
        btnCalcular.setOnClickListener{onClick(1)}
        val btnClose:Button = findViewById(R.id.btnClose)
        btnClose.setOnClickListener{onClick(2)}
    }
    private fun onClick(boton: Int) {
        when(boton){
            1->{
                val intent = Intent(this,ResultadoNotas::class.java)
                startActivity(intent)
            }
            2->{
                finish()
            }
        }
    }
}