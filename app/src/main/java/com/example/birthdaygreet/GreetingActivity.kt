package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val name = intent.getStringExtra("name")
        val greetingText = findViewById<TextView>(R.id.birthdayBox)
        greetingText.text = "Happy Birthday \n $name"
    }
}