package com.example.calculatorintentweb

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var Buttoncalc:Button ?=null
    var ButtonIntent:Button ?=null
    var ButtonWeb:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.Btn_calc)
        ButtonIntent=findViewById(R.id.Btn_Intent)
        ButtonWeb=findViewById(R.id.Btn_Web)

        Buttoncalc!!.setOnClickListener {
            val intent= Intent(this,CalculatorActivity::class.java)
            startActivity(intent)

        }
        ButtonIntent!!.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
        ButtonWeb!!.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
    }
}
