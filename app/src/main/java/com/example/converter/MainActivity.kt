package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val button= findViewById<Button>(R.id.button)
        button3.setOnClickListener {
            // Do something in response to button
            val string: String = textView.getText().toString() //changing to String
            val i = string.toInt() //Changing to Integer
            val oct = Integer.toOctalString(i) //Octal Conversion function used
            textView2.setText("Octal Value of $string is $oct")
        }
        button4.setOnClickListener {
            // Do something in response to button
            val string: String = textView.getText().toString() //changing to String
            val i = string.toInt() //Changing to Integer
            val hex = Integer.toHexString(i) //Hexadecimal Conversion function used
            textView2.setText("HexaDecimal Value of $string is $hex")
        }

        button2.setOnClickListener {
            // Do something in response to button
            textView.setText("") //clearing the textview
            textView2.setText("") //clearing the texview
            Toast.makeText(this,"Cleared",Toast.LENGTH_SHORT).show()

        }
    }
    fun calculate(view : View)
    {
        val string: String = textView.getText().toString() //changing to String
        val i = string.toInt() //Changing to Integer
        val binary = Integer.toBinaryString(i) //Binary Conversion function used
        textView2.setText("Binary Value of $string is $binary")
    }


}