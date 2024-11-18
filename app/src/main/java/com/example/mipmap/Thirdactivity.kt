package com.example.myapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val textView: TextView = findViewById(R.id.textView)

        // Retrieve the final string passed from SecondActivity
        val finalString = intent.getStringExtra("finalString")

        // Display the final string
        textView.text = finalString
    }
}
