package com.example.cse224

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_list_view)

        val lst = findViewById<ListView>(R.id.lsView)
        val arrLst = ArrayList<String>()

        arrLst.add("Mihir")
        arrLst.add("Kumar")
        arrLst.add("Shrestha")
        arrLst.add("Akash")
        arrLst.add("Kumar")
        arrLst.add("Mihir")
        arrLst.add("Kumar")
        arrLst.add("Shrestha")
        arrLst.add("Akash")
        arrLst.add("Kumar")
        arrLst.add("Mihir")
        arrLst.add("Kumar")
        arrLst.add("Shrestha")
        arrLst.add("Akash")
        arrLst.add("Kumar")

        val adappter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrLst)
        lst.adapter = adappter

        lst.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2==0){
                    Toast.makeText(applicationContext, "Hi first", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



        val spiner = findViewById<Spinner>(R.id.spiner12)
        val spinss = arrayOf("Adhaar", "PAN", "Voter ID",10)
        val spinAdapt = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinss)
        spiner.adapter = spinAdapt


        val autoComplete = findViewById<AutoCompleteTextView>(R.id.auto)
        val autoList = mutableListOf("Kotlin", "Java", "C++")
        val autoAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, autoList)
        autoComplete.setAdapter(autoAdapter)
        autoComplete.threshold=1
    }
}