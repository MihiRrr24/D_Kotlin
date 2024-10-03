package com.example.cse224

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RadioCheck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio_check)

        val a = findViewById<RadioGroup>(R.id.rgfull)
        val placeorder = findViewById<Button>(R.id.placeorder)
        val paneer = findViewById<CheckBox>(R.id.checkBox)
        val jalapenos = findViewById<CheckBox>(R.id.checkBox2)
        val corn = findViewById<CheckBox>(R.id.checkBox3)

        placeorder.setOnClickListener {
            val size = a.checkedRadioButtonId
            val finalsize = when(size){
                R.id.radioButton1 -> "Regular"
                R.id.radioButton2 -> "Medium"
                R.id.radioButton3 -> "Large"
                else -> "Chhose Any One Size"
            }

            val tops = mutableListOf<String>()

            if(paneer.isChecked) tops.add("Paneer ✅")
            if(jalapenos.isChecked) tops.add("Jalapenos ✅")
            if(corn.isChecked) tops.add("Corn ✅")

            Toast.makeText(this, "You selected $finalsize pizza with $tops", Toast.LENGTH_LONG).show()
        }

    }
}