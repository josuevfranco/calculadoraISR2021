package com.example.examen1parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ISR_Mensual : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isr_mensual)
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
                    var ingreS :  Double = (java.lang.Double.parseDouble(ingresos.text.toString()))
                    if (ingreS >= 0.01 && ingreS <= 644.58){
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

                    if(ingreS >= 644.59	 && ingreS <= 5470.92){
                        baseR = ingreS - 644.59
                        impuestoM = baseR * 0.0640
                        impuestoRet = impuestoM + 12.38

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("644.59")
                        baser.setText(baseR.toString())
                        tasar.setText("6.40%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("12.38")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 5470.93 && ingreS <= 9614.66){
                        baseR = ingreS - 5470.93
                        impuestoM = baseR * 0.1088
                        impuestoRet = impuestoM + 321.26

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("5470.93")
                        baser.setText(baseR.toString())
                        tasar.setText("10.88%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("321.26")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 9614.67 && ingreS <= 11176.62	){
                        baseR = ingreS - 9614.67
                        impuestoM = baseR * 0.16
                        impuestoRet = impuestoM + 341.00

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("9614.67")
                        baser.setText(baseR.toString())
                        tasar.setText("16%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("772.10")

                        impuestoRetenerr.setText(impuestoRet.toString())

                    }

                    if(ingreS >= 11176.63 && ingreS <= 13381.47	){
                        baseR = ingreS -  11176.63
                        impuestoM = baseR * 0.1792
                        impuestoRet = impuestoM + 1022.01

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("  11176.63")
                        baser.setText(baseR.toString())
                        tasar.setText("17.92%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("1022.01")

                        impuestoRetenerr.setText(impuestoRet.toString())

                    }

                    if(ingreS >= 13381.48 && ingreS <= 26988.50){
                        baseR = ingreS - 13381.48
                        impuestoM = baseR * 0.2136
                        impuestoRet = impuestoM + 1417.12

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("13381.48 ")
                        baser.setText(baseR.toString())
                        tasar.setText("21.36%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("1,417.12")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 26988.51 && ingreS <= 42537.58){
                        baseR = ingreS - 26988.51
                        impuestoM = baseR * 0.2352
                        impuestoRet = impuestoM + 4323.58

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("26988.51 ")
                        baser.setText(baseR.toString())
                        tasar.setText("23.52%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("4,323.58")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 42537.59 && ingreS <= 81211.25){
                        baseR = ingreS - 42537.59
                        impuestoM = baseR * 0.30
                        impuestoRet = impuestoM + 7980.73

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("42537.59  ")
                        baser.setText(baseR.toString())
                        tasar.setText("30%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("7,980.73")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 81211.26 && ingreS <= 108281.67){
                        baseR = ingreS -  81211.26
                        impuestoM = baseR * 0.32
                        impuestoRet = impuestoM + 19582.83

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText(" 81211.26")
                        baser.setText(baseR.toString())
                        tasar.setText("32%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("19582.83")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if(ingreS >= 108281.68 && ingreS <= 324845.01){
                        baseR = ingreS - 108281.68
                        impuestoM = baseR * 0.34
                        impuestoRet = impuestoM + 28245.36

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("108281.68")
                        baser.setText(baseR.toString())
                        tasar.setText("34%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("28245.36")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if(ingreS >= 324845.02	){
                        baseR = ingreS - 324845.02
                        impuestoM = baseR * 0.35
                        impuestoRet = impuestoM + 101876.90

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("324845.02")
                        baser.setText(baseR.toString())
                        tasar.setText("35%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("101876.90")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }
                }
            } //Fin del when
        } //Fin btnCalcular
    }
}