package com.example.saludousuario


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoNotas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_notas)

        val nombreEstudiante:TextView=findViewById(R.id.txtViewNombre)
        val materiaEstudiante:TextView=findViewById(R.id.txtViewMateria)
        val nota1Estudiante:TextView=findViewById(R.id.txtViewNota1)
        val nota2Estudiante:TextView=findViewById(R.id.txtViewNota2)
        val nota3Estudiante:TextView=findViewById(R.id.txtViewNota3)
        val promedioEstudiante:TextView=findViewById(R.id.txtViewPromedio)
        val resultadoNotas:TextView = findViewById(R.id.txtViewResultadoNotas)

        val miBundle:Bundle?= this.intent.extras

        if (miBundle != null){
            nombreEstudiante.text = "${miBundle.getString("nombreEstudiante")}"
            materiaEstudiante.text = "${miBundle.getString("materiaEstudiante")}"
            nota1Estudiante.text = "${miBundle.getString("nota1Estudiante")}"
            nota2Estudiante.text = "${miBundle.getString("nota2Estudiante")}"
            nota3Estudiante.text = "${miBundle.getString("nota3Estudiante")}"
            promedioEstudiante.text = "${miBundle.getString("promedioEstudiante")}"
            resultadoNotas.text = "${miBundle.getString("resultadoNota")}"
        }else{

        }

        val btnCloneResultado:Button = findViewById(R.id.btnCloseResultado)
        btnCloneResultado.setOnClickListener { onClickResultado() }
    }
    private fun onClickResultado(){
        finish()
    }
}