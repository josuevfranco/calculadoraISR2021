package com.example.examen1parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.Double.parseDouble
import android.widget.Button
import android.widget.EditText


class ISR_Diario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isr_diario)

        //Obtener los TextViews a los que vamos a modificar en la vista
        val limiteinf           : TextView = findViewById(R.id.limiteinf)
        val baser               : TextView = findViewById(R.id.baser)
        val tasar               : TextView = findViewById(R.id.tasar)
        val impuestomarr        : TextView = findViewById(R.id.impuestomarr)
        val cuotaFijaa          : TextView = findViewById(R.id.cuotaFijaa)
        val impuestoRetenerr    : TextView = findViewById(R.id.impuestoRetenerr)

        //Dato de entrada
        val ingresos : EditText = findViewById(R.id.ingresos)

        //Botón para iniciar a calcular el ISR
        val btnCalcular: Button = findViewById(R.id.calcular)

        //Var entrada par cuando de clic
        var bandera: String = "0"

        //Variable para Guardar datos que se usaron par calcular el ISR
        var baseR       : Double = 0.0
        var impuestoM   : Double = 0.0
        var impuestoRet : Double = 0.0

        btnCalcular.setOnClickListener {
            bandera = "1"
            when (bandera) {
                "1" -> {
                    //Variable para guardar el Ingreso
                    var ingreS :  Double = (parseDouble(ingresos.text.toString()))
                    if (ingreS >= 0.01 && ingreS <= 21.20) {
                        baseR = ingreS - 0.01
                        impuestoM = baseR * 0.0192
                        impuestoRet = impuestoM + 0.00

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("0.01")
                        baser.setText(baseR.toString())
                        tasar.setText("1.92")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("0.0")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if (ingreS >= 21.21 && ingreS <= 179.96) {
                        baseR = ingreS - 21.21
                        impuestoM = baseR * 0.064
                        impuestoRet = impuestoM + 0.41

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("21.21")
                        baser.setText(baseR.toString())
                        tasar.setText("6.4")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("0.41")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if (ingreS >= 179.97 && ingreS <= 316.27) {
                        baseR = ingreS - 179.97
                        impuestoM = baseR * 0.1088
                        impuestoRet = impuestoM + 10.57

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("179.97")
                        baser.setText(baseR.toString())
                        tasar.setText("10.88 %")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("10.57")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if (ingreS >= 316.28 && ingreS <= 367.65) {
                        baseR = ingreS - 316.28
                        impuestoM = baseR * 0.16
                        impuestoRet = impuestoM + 25.40


                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("316.28")
                        baser.setText(baseR.toString())
                        tasar.setText("16 %")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("25.40")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if (ingreS >= 367.66 && ingreS <= 440.18) {
                        baseR = ingreS - 367.66
                        impuestoM = baseR * 0.1792
                        impuestoRet = impuestoM + 33.62

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("367.66")
                        baser.setText(baseR.toString())
                        tasar.setText("17.92 %")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("33.62")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if (ingreS >= 440.19 && ingreS <= 887.78) {
                        baseR = ingreS - 440.19
                        impuestoM = baseR * 0.2136
                        impuestoRet = impuestoM + 46.62


                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("440.19")
                        baser.setText(baseR.toString())
                        tasar.setText("21.36 %")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("46.62")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if (ingreS >= 887.79 && ingreS <= 1399.26) {
                        baseR = ingreS - 887.79
                        impuestoM = baseR * 0.2352
                        impuestoRet = impuestoM + 142.22


                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("887.79")
                        baser.setText(baseR.toString())
                        tasar.setText("23.52 %")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("142.22")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if (ingreS >= 1399.27 && ingreS <= 2671.42) {
                        baseR = ingreS - 1399.27
                        impuestoM = baseR * 0.30
                        impuestoRet = impuestoM + 262.52


                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("1399.27")
                        baser.setText(baseR.toString())
                        tasar.setText("30%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("262.52")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if (ingreS >= 2671.43 && ingreS <= 3561.90) {
                        baseR = ingreS - 2671.43
                        impuestoM = baseR * 0.32
                        impuestoRet = impuestoM + 644.17

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("2671.43")
                        baser.setText(baseR.toString())
                        tasar.setText("32%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("644.17")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if (ingreS >= 3561.91 && ingreS <= 10685.69) {
                        baseR = ingreS - 3561.91
                        impuestoM = baseR * 0.34
                        impuestoRet = impuestoM + 929.12

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("3561.91")
                        baser.setText(baseR.toString())
                        tasar.setText("34%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("929.12")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if (ingreS >= 10685.70) {
                        baseR = ingreS - 10685.70
                        impuestoM = baseR * 0.35
                        impuestoRet = impuestoM + 3351.21


                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("10685.70")
                        baser.setText(baseR.toString())
                        tasar.setText("35%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("3351.21")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }
                }
            } //Fin del when
        } //Fin btnCalcular
    }
}