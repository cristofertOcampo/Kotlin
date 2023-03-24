package com.example.saludousuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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
                val campoNombre: EditText = findViewById(R.id.txtNombre)
                val nombre = campoNombre.text
                val campoMateria: EditText = findViewById(R.id.txtMateria)
                val materia = campoMateria.text
                val campoNota1: EditText = findViewById(R.id.txtDecimalNota1)
                val nota1:Double = campoNota1.text.toString().toDouble()
                val campoNota2: EditText = findViewById(R.id.txtDecimalNota2)
                val nota2:Double = campoNota2.text.toString().toDouble()
                val campoNota3: EditText = findViewById(R.id.txtDecimalNota3)
                val nota3:Double = campoNota3.text.toString().toDouble()
                var promedioNotas = (nota1 + nota2 + nota3) / 3;
                var resultado= ""

                if (promedioNotas >= 3.0){
                    resultado = "Aprobo"
                }else{
                    resultado = "Desaprobo"
                }

               // Toast.makeText(this,"$nombre \n $materia \n $nota1 \n $nota2 \n $nota3 \n $promedioNotas", Toast.LENGTH_LONG).show()

                val intent = Intent(this,ResultadoNotas::class.java)
                var miBundle:Bundle = Bundle()

                miBundle.putString("nombreEstudiante", "$nombre")
                miBundle.putString("materiaEstudiante", "$materia")
                miBundle.putString("nota1Estudiante", "$nota1")
                miBundle.putString("nota2Estudiante", "$nota2 ")
                miBundle.putString("nota3Estudiante", "$nota3")
                miBundle.putString("promedioEstudiante", "$promedioNotas")
                miBundle.putString("resultadoNota", "$resultado")

                intent.putExtras(miBundle)

                startActivity(intent)
            }
            2->{
                finish()
            }
        }
    }
}