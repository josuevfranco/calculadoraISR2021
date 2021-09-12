package com.example.examen1parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAceptar: Button = findViewById(R.id.aceptar)
        btnAceptar.setOnClickListener {
            if (it is Button)
                if (it.isClickable)
                    System.exit(0)
                else
                    btnAceptar.text = "Boton No seleccionado"
        }

        val rbGrupo: RadioGroup = findViewById(R.id.contenedor)
        val diario: RadioButton = findViewById(R.id.isrdiario)
        val semanal: RadioButton = findViewById(R.id.isrsemanal)
        val decenal: RadioButton = findViewById(R.id.isrdecenal)
        val quincenal: RadioButton = findViewById(R.id.isrquincenal)
        val mensual: RadioButton = findViewById(R.id.isrmensual)
        var opcion: String = ""


        //Limpiamos y asignamosla primer opcion al RadioGroup
        rbGrupo.clearCheck()
        rbGrupo.check(R.id.isrdiario)

        val handler = View.OnClickListener {  view->
            if (view is RadioButton)
                when(view.getId()) {
                    R.id.isrdiario ->
                        opcion = "ISR DIARIO"
                    R.id.isrsemanal ->
                        opcion = "ISR SEMANAL"
                    R.id.isrdecenal ->
                        opcion = "ISR DECENAL"
                    R.id.isrquincenal ->
                        opcion = "ISR QUINCENAL"
                    R.id.isrmensual ->
                        opcion = "ISR MENSUAL"
                }

            if(opcion == "ISR DIARIO")
                 startActivity(Intent(this,ISR_Diario::class.java))
            if(opcion == "ISR SEMANAL")
                startActivity(Intent(this,ISR_Semanal::class.java))
            if(opcion == "ISR DECENAL")
                startActivity(Intent(this,ISR_Decenal::class.java))
            if(opcion == "ISR QUINCENAL")
                startActivity(Intent(this,ISR_Quincenal::class.java))
            if(opcion == "ISR MENSUAL")
                startActivity(Intent(this,ISR_Mensual::class.java))
            Toast.makeText(
                applicationContext,
                "Opcion Seleccionada: $opcion",
                Toast.LENGTH_SHORT
            ).show()
        }

        diario.setOnClickListener(handler)
        semanal.setOnClickListener(handler)
        decenal.setOnClickListener(handler)
        quincenal.setOnClickListener(handler)
        mensual.setOnClickListener(handler)
    }
}