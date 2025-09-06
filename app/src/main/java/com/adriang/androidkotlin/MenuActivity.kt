package com.adriang.androidkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adriang.androidkotlin.firstapp.FirstAppActivity
import com.adriang.androidkotlin.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonSaludApp = findViewById<Button>(R.id.btnGoToSaludApp)
        val buttonImcApp = findViewById<Button>(R.id.btnGoToIMCApp)
        buttonSaludApp.setOnClickListener { navigateToSaludApp() }
        buttonImcApp.setOnClickListener { navigateToImcApp() }
    }

    private fun navigateToImcApp() {

        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)

    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}