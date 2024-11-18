package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)
        val textView3: TextView = findViewById(R.id.textView3)
        val textView4: TextView = findViewById(R.id.textView4)
        val textView5: TextView = findViewById(R.id.textView5)

        // Setting text to the TextViews
        textView1.text = getString(R.string.text1)
        textView2.text = getString(R.string.text2)
        textView3.text = getString(R.string.text3)
        textView4.text = getString(R.string.text4)
        textView5.text = getString(R.string.text5)

        // Button click to pass data to SecondActivity
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text1", getString(R.string.text1))
            intent.putExtra("text2", getString(R.string.text2))
            intent.putExtra("text3", getString(R.string.text3))
            intent.putExtra("text4", getString(R.string.text4))
            intent.putExtra("text5", getString(R.string.text5))
            intent.putExtra("booleanValue", true)
            intent.putExtra("intValue", 42)
            intent.putExtra("floatValue", 3.14f)

            startActivity(intent)
        }
    }
}
