package com.example.examen1parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ISR_Semanal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isr_semanal)

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
                    if (ingreS >= 0.01 && ingreS <= 148.40){
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

                    if(ingreS >= 148.41 && ingreS <= 1259.72){
                        baseR = ingreS - 148.41
                        impuestoM = baseR * 0.0640
                        impuestoRet = impuestoM + 2.87

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("148.41 ")
                        baser.setText(baseR.toString())
                        tasar.setText("6.40%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("2.87")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 1259.73 && ingreS <= 2213.89){
                        baseR = ingreS - 1259.73
                        impuestoM = baseR * 0.1088
                        impuestoRet = impuestoM + 73.99

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("1259.73 ")
                        baser.setText(baseR.toString())
                        tasar.setText("6.40%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("73.99")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 2213.90 && ingreS <= 2573.55){
                        baseR = ingreS - 2213.90
                        impuestoM = baseR * 0.16
                        impuestoRet = impuestoM + 177.80

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("2213.90")
                        baser.setText(baseR.toString())
                        tasar.setText("16%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("177.80")

                        impuestoRetenerr.setText(impuestoRet.toString())

                    }

                    if(ingreS >= 2573.56 && ingreS <= 3081.26){
                        baseR = ingreS - 2573.56
                        impuestoM = baseR * 0.1792
                        impuestoRet = impuestoM + 235.34

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("2573.56")
                        baser.setText(baseR.toString())
                        tasar.setText("17.92%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("235.34")

                        impuestoRetenerr.setText(impuestoRet.toString())

                    }

                    if(ingreS >= 3081.27 && ingreS <= 6214.46){
                        baseR = ingreS - 3081.27
                        impuestoM = baseR * 0.2136
                        impuestoRet = impuestoM + 326.34

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("3081.27")
                        baser.setText(baseR.toString())
                        tasar.setText("21.36%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("326.34")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 6214.47 && ingreS <= 9794.82){
                        baseR = ingreS - 6214.47
                        impuestoM = baseR * 0.2352
                        impuestoRet = impuestoM + 995.54

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("6214.47 ")
                        baser.setText(baseR.toString())
                        tasar.setText("23.52%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("995.54")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 9794.83 && ingreS <= 18699.94){
                        baseR = ingreS - 9794.83
                        impuestoM = baseR * 0.30
                        impuestoRet = impuestoM + 1837.64

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("9794.83")
                        baser.setText(baseR.toString())
                        tasar.setText("30%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("1837.64")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 18699.95 && ingreS <= 24933.30 ){
                        baseR = ingreS - 18699.95
                        impuestoM = baseR * 0.32
                        impuestoRet = impuestoM + 4509.19

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("18699.95 ")
                        baser.setText(baseR.toString())
                        tasar.setText("32%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("4509.19")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if(ingreS >= 24933.31 && ingreS <= 74799.89){
                        baseR = ingreS - 24933.31
                        impuestoM = baseR * 0.34
                        impuestoRet = impuestoM + 6503.84

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("24933.31")
                        baser.setText(baseR.toString())
                        tasar.setText("34%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("6503.84")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if(ingreS >= 74799.84){
                        baseR = ingreS - 74799.84
                        impuestoM = baseR * 0.35
                        impuestoRet = impuestoM + 23458.47

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("74799.84")
                        baser.setText(baseR.toString())
                        tasar.setText("35%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("23458.47")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }
                }
            } //Fin del when
        } //Fin btnCalcular
    }
}