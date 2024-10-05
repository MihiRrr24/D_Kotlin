package com.example.cse224

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.cse224.databinding.ActivityMyCalculatorBinding
import org.mozilla.javascript.Context
import org.mozilla.javascript.Scriptable

class MyCalculator : AppCompatActivity() {

    private lateinit var binding: ActivityMyCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMyCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setNightMode()

        binding.nightMode.setOnClickListener {
            toggleNightMode()
        }

        binding.buttonAllclear.setOnClickListener {
            binding.input.text=""
            binding.output.text=""
            Toast.makeText(this, "All Cleared",Toast.LENGTH_SHORT).show()
        }

        binding.buttonClear.setOnClickListener {
            val currentInput = binding.input.text.toString()

            if(currentInput.isNotEmpty()){
                binding.input.text=currentInput.substring(0, currentInput.length-1)
            }
        }

        binding.button0.setOnClickListener {
//            binding.input.text="0"           // but this will not append new text instead new text will come upon this
            binding.input.append("0")         // so we will use append method to combinely take all inputs
        }

        binding.button1.setOnClickListener {
            binding.input.append("1")
        }

        binding.button2.setOnClickListener {
            binding.input.append("2")
        }

        binding.button3.setOnClickListener {
            binding.input.append("3")
        }

        binding.button4.setOnClickListener {
            binding.input.append("4")
        }

        binding.button5.setOnClickListener {
            binding.input.append("5")
        }

        binding.button6.setOnClickListener {
            binding.input.append("6")
        }

        binding.button7.setOnClickListener {
            binding.input.append("7")
        }

        binding.button8.setOnClickListener {
            binding.input.append("8")
        }

        binding.button9.setOnClickListener {
            binding.input.append("9")
        }

        binding.buttonDot.setOnClickListener {
            binding.input.append(".")
        }

        binding.buttonAddition.setOnClickListener {
            binding.input.append("+")
        }

        binding.buttonSubtraction.setOnClickListener {
            binding.input.append("-")
        }

        binding.buttonMultiplication.setOnClickListener {
            binding.input.append("*")
        }

        binding.buttonDivision.setOnClickListener {
            binding.input.append("/")
        }

        binding.buttonLeftbracket.setOnClickListener {
            binding.input.append("(")
        }

        binding.buttonRightbracket.setOnClickListener {
            binding.input.append(")")
        }



        binding.buttonEqualto.setOnClickListener {
            val expression = binding.input.text.toString()
            val context = Context.enter()
            try {
                context.optimizationLevel = -1
                val scope: Scriptable = context.initStandardObjects()

                var result = context.evaluateString(scope, expression, "JavaScript", 1, null).toString()

                if (result.endsWith(".0")) {
                    result = result.substring(0, result.length - 2)
                }
                binding.output.text = result
                binding.input.text=""
                Toast.makeText(this, "THE RESULT IS $result", Toast.LENGTH_SHORT).show()
            }

            catch(e : Exception){
                binding.output.text="Err"
            }
        }

    }



    private fun toggleNightMode(){
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            Toast.makeText(this, "Switched To Light Mode 🌞", Toast.LENGTH_SHORT).show()
        }
        else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            Toast.makeText(this, "Switch To Dark Mode 🌃", Toast.LENGTH_SHORT).show()
        }
        recreate()
    }

    private fun setNightMode(){
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            binding.nightMode.setImageResource(R.drawable.lightmode)
        }
        else{
            binding.nightMode.setImageResource(R.drawable.darkmode)
        }
    }
}