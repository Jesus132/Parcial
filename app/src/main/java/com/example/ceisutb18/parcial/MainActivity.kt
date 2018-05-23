package com.example.ceisutb18.parcial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var textView_R: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView_R: TextView? = null
        textView_R = this.Resultado
        var numero1=0
        var numero2=0
        val num= arrayOf(cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve)
        var validar=0
        var ecuacion=0
        var url="http://parcial.getsandbox.com/operation"

        num[0].setOnClickListener{
            if(validar == 0){
                numero1=0

            }
            if(validar == 1){
                numero2=0
            }
        }
        num[1].setOnClickListener{
            if(validar == 0){
                numero1=1

            }
            if(validar == 1){
                numero2=1
            }
        }
        num[2].setOnClickListener{
            if(validar == 0){
                numero1=2

            }
            if(validar == 1){
                numero2=2
            }
        }
        num[3].setOnClickListener{
            if(validar == 0){
                numero1=3

            }
            if(validar == 1){
                numero2=3
            }
        }
        num[4].setOnClickListener{
            if(validar == 0){
                numero1=4

            }
            if(validar == 1){
                numero2=4
            }
        }
        num[5].setOnClickListener{
            if(validar == 0){
                numero1=5

            }
            if(validar == 1){
                numero2=5
            }
        }
        num[6].setOnClickListener{
            if(validar == 0){
                numero1=6

            }
            if(validar == 1){
                numero2=6
            }
        }
        num[7].setOnClickListener{
            if(validar == 0){
                numero1=7

            }
            if(validar == 1){
                numero2=7
            }
        }
        num[8].setOnClickListener{
            if(validar == 0){
                numero1=8

            }
            if(validar == 1){
                numero2=8
            }
        }
        num[9].setOnClickListener{
            if(validar == 0){
                numero1=9

            }
            if(validar == 1){
                numero2=9
            }
        }
        Mas.setOnClickListener {
            validar=1
            ecuacion=1
        }
        Menos.setOnClickListener {
            validar=1
            ecuacion=2
        }
        Mult.setOnClickListener {
            validar=1
            ecuacion=3
        }
        Divicion.setOnClickListener {
            validar=1
            ecuacion=4
        }
        Igual.setOnClickListener {
            //numero1 + numero2
            //{"operation":"+",1,2}
            if (ecuacion == 1){
                textView_R!!.text = (numero1 + numero2).toString()
        }
            if (ecuacion == 2){
                textView_R!!.text = (numero1 - numero2).toString()
            }
            if (ecuacion == 3){
                textView_R!!.text = (numero1 * numero2).toString()
            }
            if (ecuacion == 4){
                textView_R!!.text = (numero1 / numero2).toString()
            }
        }

    }
}
