package com.example.saludousuario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var radio1:RadioButton?=null
    var radio2:RadioButton?=null
    var check1:CheckBox?=null
    var check2:CheckBox?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton:Button = findViewById(R.id.btnIngresar)
        boton.setOnClickListener {ingresarNombre()}
    }
        private fun ingresarNombre() {
            val campoNombre:EditText = findViewById(R.id.txtNombre)
            var nombre = campoNombre.text


            //RadioButtons

            radio1=findViewById(R.id.radioButton)
            radio2=findViewById(R.id.radioButton2)

            var radioResult: String = ""

            if (radio1?.isChecked==true){
                radioResult += "opcion1\n"
            }else{
                radioResult += "error"
            }

            if(radio2?.isChecked==true) {
                radioResult += "opcion2"
            }else{
                radioResult += "error"
            }

            //CheckBox
            check1=findViewById(R.id.checkBox2)
            check2=findViewById(R.id.checkBox3)

            var checkResult: String = ""

            if ( check1?.isChecked==true){
                checkResult += "Check 1"
            }else{
                checkResult += "error"
            }
            if (check1?.isChecked==true) {
                checkResult += "Check 2"
            }else{
                checkResult += "error"
            }

            Toast.makeText(this, "Bienvenid@ $nombre $radioResult $check1", Toast.LENGTH_LONG).show()
            radioResult += ""
            checkResult += ""
        }
}
