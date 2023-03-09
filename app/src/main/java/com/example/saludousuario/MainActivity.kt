package com.example.saludousuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton:Button = findViewById(R.id.btnIngresar)
        boton.setOnClickListener {onClick(1)}

        val btnPromedio:Button = findViewById(R.id.btnPromedioNotas)
        btnPromedio.setOnClickListener{onClick(2)}
    }

        private fun onClick(boton: Int) {
            when(boton){
                1->{
                    //Nombre
                    val fieldTxt:EditText= findViewById(R.id.txtNombre)
                    val name:String=fieldTxt.text.toString()

                    //Radio
                    val radioOne:RadioButton =findViewById(R.id.radioButton)
                    val radioTwo:RadioButton =findViewById(R.id.radioButton2)
                    var radioResult: String = ""

                    if(radioOne.isChecked){
                        radioResult += "opcion 1 seleccionada "
                    }else{
                        radioResult += "opcion 1 no seleccionada"
                    }

                    if(radioTwo.isChecked) {
                        radioResult += "opcion 2 seleccionada "
                    }else{
                        radioResult += "opcion 2 no seleccionada"
                    }

                    //CheckBox
                    val checkOne:CheckBox =findViewById(R.id.checkBox2)
                    val checkTwo:CheckBox =findViewById(R.id.checkBox3)
                    var checkResult: String = ""

                    if (checkOne.isChecked){
                        checkResult += "Check 1 activo "
                    }else{
                        checkResult += "Check 1 inactivo "
                    }
                    if (checkTwo.isChecked) {
                        checkResult += "Check 2 activo "
                    }else{
                        checkResult += "Check 2 inactivo "
                    }

                    //Toggle
                    val toggleBtn:ToggleButton = findViewById(R.id.toggleButton)
                    var statusToggle:String = ""

                    if (toggleBtn.isChecked) {
                        statusToggle += "Toogle activo"
                    } else {
                        statusToggle += "Toogle inactivo"
                    }

                    //Switch
                    val switchBtn:Switch = findViewById(R.id.switch2)
                    var statusSwitch:String = ""
                    if(switchBtn.isChecked) {
                        statusSwitch += "Switch activo"
                    } else {
                        statusSwitch += "Switch inactivo"
                    }

                    val message = "$name, $radioResult, $checkResult, $statusToggle, $statusSwitch"
                    Toast.makeText(this, message , Toast.LENGTH_LONG).show()
                }
                2->{
                    //Creamos el intent encargado de la comunicacion entre actividades
                    val intent = Intent(this,PromedioNotas::class.java)
                    startActivity(intent)
                }
            }
        }
}



