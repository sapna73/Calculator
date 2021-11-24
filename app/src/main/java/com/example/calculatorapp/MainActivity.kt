package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    var number1 : Float = 0.0f
    var isPlus : Boolean = false
    var isMinus : Boolean = false
    var isDivide : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.etEnter)
    }
    fun operationFunction(view : View){
        when(view.id){
            R.id.btn1 -> {
                numberClicked(1)
            }
            R.id.btn2 -> {
                numberClicked(2)
            }
            R.id.btn3 -> {
                numberClicked(3)
            }
            R.id.btn5 -> {
                numberClicked(4)
            }
            R.id.btn6 -> {
                numberClicked(5)
            }
            R.id.btn7 -> {
                numberClicked(6)
            }
            R.id.btn9 -> {
                numberClicked(7)
            }
            R.id.btn10 -> {
                numberClicked(8)
            }
            R.id.btn11 -> {
                numberClicked(9)
            }
            R.id.btn14 -> {
                numberClicked(0)
            }
            R.id.btn15 -> {
                val number = editText.text.toString() + "."
                editText.setText(number)
            }
            R.id.btn13 -> {
                editText.setText("")
            }
            R.id.btn4 -> {
                dotIsClicked()
            }
            R.id.btn8 -> {
                minusClicked()
            }
            R.id.btn12 -> {
               plusClicked()
            }
            R.id.btn4 -> {
                divideClicked()
            }
            R.id.btn16 -> {
                equalIsClicked()
            }
        }
    }
    private fun numberClicked(numbClicked : Int){
        val number = editText.text.toString() + numbClicked.toString()
        editText.setText(number)
    }
    private fun dotIsClicked(){
        val number = editText.text.toString() + "."
        editText.setText(number)
    }
    private fun plusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isPlus = true
    }
    private fun minusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isMinus = true
    }
    private fun divideClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isDivide = true
    }
    private fun equalIsClicked(){
        when {
            isPlus -> {
                plus()
            }
            isMinus -> {
                minus()
            }
            isDivide -> {
                divide()
            }
        }
    }
    private fun plus(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 + number2
        editText.setText(result.toString())
        isPlus = false
    }
    private fun minus(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 - number2
        editText.setText(result.toString())
        isMinus = false
    }
    private fun divide(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 / number2
        editText.setText(result.toString())
        isDivide = false
    }
}