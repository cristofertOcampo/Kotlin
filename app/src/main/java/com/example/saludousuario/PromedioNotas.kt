package com.example.saludousuario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PromedioNotas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promedio_notas)

        val btnClose:Button = findViewById(R.id.btnClose)
        btnClose.setOnClickListener{onClick()}
    }
    private fun onClick(){
        finish()
    }
}