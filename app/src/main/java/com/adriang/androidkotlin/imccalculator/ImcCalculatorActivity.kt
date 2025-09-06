package com.adriang.androidkotlin.imccalculator

import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adriang.androidkotlin.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.Slider
import java.time.format.DecimalStyle

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private var currentWeight: Int = 60
    private var currentAge: Int = 30
    private var currentHeight: Double = 1.20

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var textViewHeight: TextView
    private lateinit var sliderHeight: Slider
    private lateinit var buttonSusbtractWeight: FloatingActionButton
    private lateinit var buttonPlusWeight: FloatingActionButton
    private lateinit var textViewWeight: TextView
    private lateinit var buttonSusbtractAge: FloatingActionButton
    private lateinit var buttonPlusAge: FloatingActionButton
    private lateinit var textViewAge: TextView
    private lateinit var buttonCalculate: Button

    companion object{
        const val IMC_KEY = "IMC_RESULT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc_calculator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.imcCalculator)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initComponents()
        initListeners()
        initUi()
    }

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        textViewHeight = findViewById(R.id.textViewHeight)
        sliderHeight = findViewById(R.id.sliderHeight)
        buttonPlusWeight = findViewById(R.id.btnPlusWeight)
        buttonSusbtractWeight = findViewById(R.id.btnSubstractWeight)
        textViewWeight = findViewById(R.id.textViewWeight)
        buttonPlusAge = findViewById(R.id.btnPlusAge)
        buttonSusbtractAge = findViewById(R.id.btnSubstractAge)
        textViewAge = findViewById(R.id.textViewAge)
        buttonCalculate = findViewById(R.id.buttonCalculate)
    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        sliderHeight.addOnChangeListener { _, value, _ ->

            currentHeight =  value.toDouble() / 100
            textViewHeight.text = "$currentHeight m"
        }
        buttonPlusWeight.setOnClickListener {
            currentWeight += 1
            setWeight()
        }
        buttonSusbtractWeight.setOnClickListener {
            currentWeight -= 1
            setWeight()
        }
        buttonPlusAge.setOnClickListener {
            currentAge += 1
            setAge()
        }
        buttonSusbtractAge.setOnClickListener {
            currentAge -= 1
            setAge()
        }
        buttonCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateToResult(result)
        }
    }

    private fun navigateToResult(result: Double) {
        val intent = Intent(this, ResultIMCActivity::class.java)
        intent.putExtra(IMC_KEY, result)
        startActivity(intent)
    }

    private fun calculateIMC(): Double {
        val df = DecimalFormat("##.#")
        val imc = currentWeight / (currentHeight * currentHeight)
        return df.format(imc).toDouble()
    }

    private fun setWeight() {
        textViewWeight.text = currentWeight.toString()
    }

    private fun setAge() {
        textViewAge.text = currentAge.toString()
    }

    private fun setGenderColor() {
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun changeGender() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }


    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {

        val colorReference = if (isSelectedComponent) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }

        return ContextCompat.getColor(this, colorReference)

    }

    private fun initUi() {

        setGenderColor()
        setWeight()
        setAge()
    }
}