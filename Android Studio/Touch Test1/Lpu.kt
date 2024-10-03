package com.example.cse224

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lpu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lpu)

        val button = findViewById<Button>(R.id.button111)
        button.setOnClickListener {
            Toast.makeText(this, "Welcome Back", Toast.LENGTH_LONG).show()
        }
    }
}