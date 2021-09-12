package com.example.examen1parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ISR_Decenal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isr_decenal)

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
                    if (ingreS >= 0.01 && ingreS <= 212.00){
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

                    if(ingreS >= 212.01 && ingreS <= 1799.60	){
                        baseR = ingreS - 212.01
                        impuestoM = baseR * 0.0640
                        impuestoRet = impuestoM + 4.10

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("212.01")
                        baser.setText(baseR.toString())
                        tasar.setText("6.40%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("4.10")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 1799.61 && ingreS <= 3162.70){
                        baseR = ingreS - 1799.61
                        impuestoM = baseR * 0.1088
                        impuestoRet = impuestoM + 105.70

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("1259.73 ")
                        baser.setText(baseR.toString())
                        tasar.setText("10.88%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("105.70")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 3162.71 && ingreS <= 3676.50){
                        baseR = ingreS - 3162.71
                        impuestoM = baseR * 0.16
                        impuestoRet = impuestoM + 254.0

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("3162.71")
                        baser.setText(baseR.toString())
                        tasar.setText("16%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("254.0")

                        impuestoRetenerr.setText(impuestoRet.toString())

                    }

                    if(ingreS >= 3676.51 && ingreS <= 4401.80){
                        baseR = ingreS - 3676.51
                        impuestoM = baseR * 0.1792
                        impuestoRet = impuestoM + 336.20

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("3676.51")
                        baser.setText(baseR.toString())
                        tasar.setText("17.92%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("336.20")

                        impuestoRetenerr.setText(impuestoRet.toString())

                    }

                    if(ingreS >= 4401.81 && ingreS <= 8877.80){
                        baseR = ingreS - 4401.81
                        impuestoM = baseR * 0.2136
                        impuestoRet = impuestoM + 466.20

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("3081.27")
                        baser.setText(baseR.toString())
                        tasar.setText("21.36%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("466.20")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 8877.81 && ingreS <= 13992.60){
                        baseR = ingreS - 8877.81
                        impuestoM = baseR * 0.2352
                        impuestoRet = impuestoM +1422.20

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("8877.81 ")
                        baser.setText(baseR.toString())
                        tasar.setText("23.52%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("1,422.20")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 13992.61 && ingreS <= 26714.20){
                        baseR = ingreS - 13992.61
                        impuestoM = baseR * 0.30
                        impuestoRet = impuestoM + 2625.20

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("13992.61 ")
                        baser.setText(baseR.toString())
                        tasar.setText("30%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("2,625.20")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }

                    if(ingreS >= 26714.21	 && ingreS <= 35619.00 ){
                        baseR = ingreS - 26714.21
                        impuestoM = baseR * 0.32
                        impuestoRet = impuestoM + 6441.70

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("26714.21")
                        baser.setText(baseR.toString())
                        tasar.setText("32%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("6,441.70")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if(ingreS >= 35619.01 && ingreS <= 106856.90){
                        baseR = ingreS - 35619.01
                        impuestoM = baseR * 0.34
                        impuestoRet = impuestoM + 9291.20

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("35619.01")
                        baser.setText(baseR.toString())
                        tasar.setText("34%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("6503.84")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }


                    if(ingreS >= 106856.91){
                        baseR = ingreS - 106856.91
                        impuestoM = baseR * 0.35
                        impuestoRet = impuestoM + 33512.10

                        //Asignamos el texto a los elementos de la vista de salida
                        limiteinf.setText("106856.91")
                        baser.setText(baseR.toString())
                        tasar.setText("35%")
                        impuestomarr.setText(impuestoM.toString())
                        cuotaFijaa.setText("33512.10")

                        impuestoRetenerr.setText(impuestoRet.toString())
                    }
                }
            } //Fin del when
        } //Fin btnCalcular
    }
}