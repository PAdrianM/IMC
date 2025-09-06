package com.adriang.androidkotlin.imccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adriang.androidkotlin.R
import com.adriang.androidkotlin.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var textViewResult: TextView
    private lateinit var textViewIMC: TextView
    private lateinit var textViewMessage: TextView
    private lateinit var buttonRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_imcactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.resultIMC)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0

        initComponent()
        initUi(result)
        initListeners()
    }

    private fun initListeners() {
        buttonRecalculate.setOnClickListener {
            finish() // Finaliza la actividad actual y regresa a la anterior
        }
    }

    private fun initUi(result: Double) {
        textViewIMC.text = result.toString()
        when(result){
            in 0.00..18.50 -> { //Bajo peso
                textViewResult.setTextColor(getColor(R.color.low_weight_color))
                textViewResult.text = getString(R.string.title_low_weight)
                textViewMessage.text = "Su IMC es $result, lo que indica que su peso esta en la categoria de Bajo Peso"
            }
            in 18.51..24.99 -> { //Peso saludable
                textViewResult.setTextColor(getColor(R.color.healthy_weight_color))
                textViewResult.text = getString(R.string.title_healthy_weight)
                textViewIMC.text = result.toString()
                textViewMessage.text = "Su IMC es $result, lo que indica que su peso esta en la categoria de Peso Saludable"
            }
            in 25.0..29.99 -> { //Sobrepeso
                textViewResult.setTextColor(getColor(R.color.overweight_color))
                textViewResult.text = getString(R.string.title_overweight)
                textViewMessage.text = "Su IMC es $result, lo que indica que su peso esta en la categoria de Sobrepeso"
            }
            in 30.0..99.00 -> { //Obesidad
                textViewResult.setTextColor(getColor(R.color.obesity_color))
                textViewResult.text = getString(R.string.title_obesity)
                textViewIMC.text = result.toString()
                textViewMessage.text = "Su IMC es $result, lo que indica que su peso esta en la categoria de Obesidad"
            }
            else -> {
                textViewIMC.text = getString(R.string.error_number)
                textViewResult.text = getString(R.string.title_error)
                textViewMessage.text = R.string.error_message.toString()
            }
        }
    }

    private fun initComponent() {
        textViewIMC = findViewById(R.id.textViewIMC)
        textViewResult = findViewById(R.id.textViewResult)
        textViewMessage = findViewById(R.id.textViewMessage)
        buttonRecalculate = findViewById(R.id.buttonReCalculate)

    }
}