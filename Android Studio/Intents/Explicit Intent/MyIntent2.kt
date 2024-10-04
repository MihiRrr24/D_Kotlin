package com.example.cse224

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyIntent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_intent2)

        val displName2 = findViewById<TextView>(R.id.myIntent2TextView)

        val namee2 = intent.getStringExtra("Name")
        val rollNo = intent.getIntExtra("Roll No", 0)

        displName2.text = "Name: $namee2    Roll No: $rollNo"
    }
}