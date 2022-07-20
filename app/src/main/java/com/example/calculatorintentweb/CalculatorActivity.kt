package com.example.calculatorintentweb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var ButtonAdd:Button
    lateinit var ButtonSubtract:Button
    lateinit var ButtonMult:Button
    lateinit var ButtonDiv:Button
    lateinit var Edt_Fnum:EditText
    lateinit var Edt_Snum:EditText
    lateinit var Txt_Answer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        ButtonAdd=findViewById(R.id.Btn_Add)
        ButtonSubtract=findViewById(R.id.Btn_sub)
        ButtonMult=findViewById(R.id.Btn_mult)
        ButtonDiv=findViewById(R.id.Btn_div)
        Edt_Fnum=findViewById(R.id.Edt_fnum)
        Edt_Snum=findViewById(R.id.Edt_snum)
        Txt_Answer=findViewById(R.id.txt_Ans)

        ButtonAdd.setOnClickListener {
            var firstnum=Edt_Fnum.text.toString()
            var secondnum=Edt_Snum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                Txt_Answer.text="NOPE!!"
            }else{
                var answer= firstnum.toDouble() + secondnum.toDouble()
                Txt_Answer.text=answer.toString()
            }

        }
        ButtonSubtract.setOnClickListener {
            var firstnum=Edt_Fnum.text.toString()
            var secondnum=Edt_Snum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                Txt_Answer.text="NOPE!!"
            }else{
                var answer=firstnum.toDouble() - secondnum.toDouble()
                Txt_Answer.text=answer.toString()
            }
        }
        ButtonMult.setOnClickListener {
            var firstnum=Edt_Fnum.text.toString()
            var secondnum=Edt_Snum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                Txt_Answer.text="NOPE!!"
            }else{
                var answer=firstnum.toDouble() * secondnum.toDouble()
                Txt_Answer.text=answer.toString()
            }
        }
        ButtonDiv.setOnClickListener {
            var firstnum=Edt_Fnum.text.toString()
            var secondnum=Edt_Snum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                Txt_Answer.text="NOPE!!"
            }else{
                var answer=firstnum.toDouble() / secondnum.toDouble()
                Txt_Answer.text=answer.toString()
            }
        }

    }
}