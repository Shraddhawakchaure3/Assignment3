package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.textView)

        // Retrieve the data from Intent
        val text1 = intent.getStringExtra("text1")
        val text2 = intent.getStringExtra("text2")
        val text3 = intent.getStringExtra("text3")
        val text4 = intent.getStringExtra("text4")
        val text5 = intent.getStringExtra("text5")
        val booleanValue = intent.getBooleanExtra("booleanValue", false)
        val intValue = intent.getIntExtra("intValue", 0)
        val floatValue = intent.getFloatExtra("floatValue", 0f)

        // Display the received data
        val combinedData = "$text1\n$text2\n$text3\n$text4\n$text5\nBoolean: $booleanValue\nInt: $intValue\nFloat: $floatValue"
        textView.text = combinedData

        // Log the data for debugging
        Log.d("SecondActivity", "Received data: $combinedData")

        // Button to send the combined data to ThirdActivity
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            val finalString = "$text1 $text2 $text3 $text4 $text5"
            intent.putExtra("finalString", finalString)
            startActivity(intent)
        }
    }
}
