package com.example.saludousuario

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadoNotas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_notas)

        val btnCloneResultado:Button = findViewById(R.id.btnCloseResultado)
        btnCloneResultado.setOnClickListener { onClickResultado() }
    }
    private fun onClickResultado(){
        finish()
    }
}