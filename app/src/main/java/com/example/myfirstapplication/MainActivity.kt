package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculator = findViewById<Button>(R.id.btnCalculator)
        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)


        btnCalculator.setOnClickListener{

            val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {
                val altura = alturaStr.toFloat()
                val alturafinal = altura * altura
                val peso = pesoStr.toFloat()
                val result = peso / alturafinal

                val intent = Intent(this, ResultActivity::class.java)
                    .apply {
                        putExtra("Extra_Result", result)
                    }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Os campos devem ser preenchidos", Toast.LENGTH_LONG).show()
            }

        }













    }
}