package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // Do something in response to button
            val string: String = textView.getText().toString()
            val i = string.toInt()
            val binary = Integer.toBinaryString(i)
            textView2.setText(binary)
        }
        button3.setOnClickListener {
            // Do something in response to button
            val string: String = textView.getText().toString()
            val i = string.toInt()
            val binary = Integer.toOctalString(i)
            textView2.setText(binary)
        }
        button4.setOnClickListener {
            // Do something in response to button
            val string: String = textView.getText().toString()
            val i = string.toInt()
            val binary = Integer.toHexString(i)
            textView2.setText(binary)
        }
        val button1 = findViewById<Button>(R.id.button2)
        val textView = findViewById<EditText>(R.id.textView)
        val textView2 = findViewById<EditText>(R.id.textView2)
        button1.setOnClickListener {
            // Do something in response to button
            textView.setText("")
            textView2.setText("")

        }
    }

}