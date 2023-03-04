package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val myBtn: Button = findViewById(R.id.confirm_button)

//        myBtn.setOnClickListener {
//            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
//        }


    }

    fun createGreetingCard(view: View) {
        //Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()

        val text: String = findViewById<EditText>(R.id.inputNameBox).editableText.toString()
        val duration = Toast.LENGTH_SHORT
        println("text $text")
        Log.i("text", text)
        val toast = Toast.makeText(applicationContext, "Hello $text", duration)
        //toast.show()

        val intent = Intent(this, GreetingActivity::class.java)
        if(text == ""){
            Toast.makeText(applicationContext, "Please enter name here !", duration).show()
        }else{
            intent.putExtra("name",text)
            startActivity(intent)
        }

    }
}