package com.example.cse224

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MyIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_intent)

        val myintentButton = findViewById<Button>(R.id.myintentbutton1)
        val iNext = Intent(this, MyIntent2::class.java)

        iNext.putExtra("Name", "Mihir")
        iNext.putExtra("Roll No", 21)

        myintentButton.setOnClickListener {
            startActivity(iNext)
        }
    }
}