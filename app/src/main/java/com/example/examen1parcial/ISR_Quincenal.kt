package com.example.examen1parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ISR_Quincenal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isr_quincenal)


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
                    if (ingreS >= 0.01 && ingreS <= 318.00){
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

                    if(ingreS >= 318.01 && ingreS <= 2699.40){
                        baseR = ingreS - 318.01
                        impuestoM = baseR * 0.0640
                        impuestoRet = impuestoM + 6.15

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("318.01 ")
                        baser.setText(baseR.toString())
                        tasar.setText("6.40%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("6.15")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 2699.41 && ingreS <= 4744.05){
                        baseR = ingreS - 2699.41
                        impuestoM = baseR * 0.1088
                        impuestoRet = impuestoM + 158.55

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("2699.41 ")
                        baser.setText(baseR.toString())
                        tasar.setText("10.88%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("158.55")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 4744.06 && ingreS <= 5514.75){
                        baseR = ingreS - 4744.06
                        impuestoM = baseR * 0.16
                        impuestoRet = impuestoM + 341.00

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("4744.06")
                        baser.setText(baseR.toString())
                        tasar.setText("16%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("341.00")

                        impuestoRetenerr.setText(impuestoRet.toString())

                    }

                    if(ingreS >= 5514.76 && ingreS <= 6602.70){
                        baseR = ingreS - 5514.76
                        impuestoM = baseR * 0.1792
                        impuestoRet = impuestoM + 504.30

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText(" 5514.76")
                        baser.setText(baseR.toString())
                        tasar.setText("17.92%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("504.30")

                        impuestoRetenerr.setText(impuestoRet.toString())

                    }

                    if(ingreS >= 6602.71 && ingreS <= 13316.70){
                        baseR = ingreS - 6602.71
                        impuestoM = baseR * 0.2136
                        impuestoRet = impuestoM + 699.30

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("6602.71")
                        baser.setText(baseR.toString())
                        tasar.setText("21.36%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("699.30")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 13316.71 && ingreS <= 20988.90){
                        baseR = ingreS - 13316.71
                        impuestoM = baseR * 0.2352
                        impuestoRet = impuestoM + 2133.30

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("13316.71 ")
                        baser.setText(baseR.toString())
                        tasar.setText("23.52%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("2133.30")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 20988.91 && ingreS <= 40071.30){
                        baseR = ingreS - 20988.91
                        impuestoM = baseR * 0.30
                        impuestoRet = impuestoM + 3937.80

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("20988.91 ")
                        baser.setText(baseR.toString())
                        tasar.setText("30%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("3937.80")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 40071.31 && ingreS <= 53428.50 ){
                        baseR = ingreS - 40071.31
                        impuestoM = baseR * 0.32
                        impuestoRet = impuestoM + 9662.55

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("40071.31")
                        baser.setText(baseR.toString())
                        tasar.setText("32%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("9662.55")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if(ingreS >= 53428.51 && ingreS <= 160285.35){
                        baseR = ingreS - 53428.51
                        impuestoM = baseR * 0.34
                        impuestoRet = impuestoM + 13936.80

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("53428.51")
                        baser.setText(baseR.toString())
                        tasar.setText("34%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("13,936.80")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if(ingreS >= 160285.36	){
                        baseR = ingreS - 160285.36
                        impuestoM = baseR * 0.35
                        impuestoRet = impuestoM + 50268.15

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("160285.36")
                        baser.setText(baseR.toString())
                        tasar.setText("35%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("50268.15")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }
                }
            } //Fin del when
        } //Fin btnCalcular
    }
}