package com.example.calq_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso = editPeso.text.toString().toFloat()
        val altura = editAltura.text.toString().toFloat()
        var result: String = ""
        val imc = peso/ (altura * altura)
    this.btnIMC.setOnClickListener(View.OnClickListener {
        if (imc < 17) {
            result = "Muito abaixo do peso"
        } else if (imc < 18.49) {
            result = " abaixo do peso"
        } else if (imc < 24.99) {
            result = " peso normal"
        } else if (imc < 29.99) {
            result = "acima do peso"
        } else if (imc < 34.99) {
            result = "obesidade 1"
        } else if (imc < 39.99) {
            result = "obesidade 2"
        } else {
            result = "obesidade 3"
        }
        Toast.makeText(this, result, Toast.LENGTH_LONG).show()
    })
        




    }
}