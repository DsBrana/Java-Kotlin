package com.exemple.exemplos

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class KotlinActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        val TAG: String = "kotlinModule"
    }

    private var editTextA: EditText? = null
    private var editTextB: EditText? = null

    private lateinit var Sum: Button
    private lateinit var Sub: Button
    private lateinit var Mul: Button
    private lateinit var Div: Button

    private lateinit var Label: TextView
    private var Result: TextView? = null

    private lateinit var CL00: ConstraintLayout

    private var numberA = 0.0

    private var numberB = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CL00 = findViewById(R.id.cl00_lay)

        editTextA = findViewById(R.id.etNumber01)
        editTextB = findViewById(R.id.etNumber02)

        Label = findViewById(R.id.tvLabel)
        Result = findViewById(R.id.tvResult)

        Sum = findViewById(R.id.btSum)
        Sum.setOnClickListener(this)

        Sub = findViewById(R.id.btSub)
        Sub.setOnClickListener(this)

        Mul = findViewById(R.id.btMul)
        Mul.setOnClickListener(this)

        Div = findViewById(R.id.btDiv)
        Div.setOnClickListener(this)
    }

    override fun onStart() {
        super.onStart()
        Label.text = "Em KOTLIN"
        CL00.background = resources.getDrawable(R.color.kotlin)

    }

    override fun onClick(p0: View?) {
        numberA = editTextA?.text.toString().toDouble()
        numberB = editTextB?.text.toString().toDouble()
        when (p0!!.id) {
            R.id.btSum -> sum(numberA, numberB)
            R.id.btSub -> sub(numberA, numberB)
            R.id.btMul -> mul(numberA, numberB)
            R.id.btDiv -> div(numberA, numberB)
        }
    }

    private fun sum(number1: Double, number2: Double): Double {
        var result = number1 + number2
        Result?.text = result.toString()
        Result!!.visibility = View.VISIBLE
        return result
    }

    private fun sub(number1: Double, number2: Double): Double {
        var result = number1 - number2
        Result?.text = result.toString()
        Result!!.visibility = View.VISIBLE
        return result
    }

    private fun mul(number1: Double, number2: Double): Double {
        var result = number1 * number2
        Result?.text = result.toString()
        Result!!.visibility = View.VISIBLE
        return result
    }

    private fun div(number1: Double, number2: Double): Double {
        var result = number1 / number2
        Result?.text = result.toString()
        Result!!.visibility = View.VISIBLE
        return result
    }
}