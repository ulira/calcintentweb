package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculator : AppCompatActivity() {

    lateinit var txt_answer: TextView
    lateinit var edt_firstnumber: EditText
    lateinit var edt_secondnumber: EditText
    lateinit var buttonadd: Button
    lateinit var buttonsubtract: Button
    lateinit var buttondivide: Button
    lateinit var buttonmultiply: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        txt_answer = findViewById(R.id.txt_answer)
        edt_firstnumber = findViewById(R.id.edt_firstnumber)
        edt_secondnumber = findViewById(R.id.editTextNumber2)
        buttonadd = findViewById(R.id.btn_add)
        buttondivide = findViewById(R.id.btn_divide)
        buttonmultiply = findViewById(R.id.btn_multiply)
        buttonsubtract = findViewById(R.id.btn_subtract)

        buttonadd.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                txt_answer.text = "please fill in all inputs"
            } else {
                var answer = myfirstnumber.toDouble() + mysecondnumber.toDouble()
                txt_answer.text = answer.toString()
            }

        }
        buttonsubtract.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                txt_answer.text = "please fill in all inputs"
            } else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                txt_answer.text = answer.toString()
            }
        }
        buttondivide.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                txt_answer.text = "please fill in all inputs"
            } else {
                var answer = myfirstnumber.toDouble() / mysecondnumber.toDouble()
                txt_answer.text = answer.toString()
            }
        }
        buttonmultiply.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                txt_answer.text = "please fill in all inputs"
            } else {
                var answer = myfirstnumber.toDouble() * mysecondnumber.toDouble()
                txt_answer.text = answer.toString()
            }
        }

    }
}