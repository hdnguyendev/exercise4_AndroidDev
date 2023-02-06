package com.example.exercise4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class CalculatorBasicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_basic_activiy)


    }

    fun calculate(view: View) {
        val number1 = findViewById<EditText>(R.id.edt_number1).text.toString().toFloat()
        val number2 = findViewById<EditText>(R.id.edt_number2).text.toString().toFloat()
        val result = findViewById<EditText>(R.id.edt_result)
        if (view.id == R.id.btn_plus) {
            result.setText((number1 + number2).toString())
            Log.w("WARN", "+")
        }
        if (view.id == R.id.btn_substract) {
            result.setText((number1 - number2).toString())
            Log.w("WARN", "-")
        }
        if (view.id == R.id.btn_times) {
            result.setText((number1 * number2).toString())
            Log.w("WARN", "*")
        }
        if (view.id == R.id.btn_div) {
            result.setText((number1 / number2).toString())
            Log.w("WARN", "/")
        }

    }
}