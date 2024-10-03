package com.example.cse224

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        Toast.makeText(this, "onCreate() Here 😉", LENGTH_LONG).show()
    }

    override fun onStart(){
        super.onStart()
        val toast =Toast.makeText(this, "onStart() Here ️✌️", LENGTH_LONG)
        toast.show()
        Handler(Looper.getMainLooper()).postDelayed({ toast.cancel() }, 3000)
    }
    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "onResume() Here 😁", LENGTH_LONG).show()
    }
    override fun onRestart(){
        super.onRestart()
        Toast.makeText(this, "onRestart() Here 😊", LENGTH_LONG).show()
    }
    override fun onPause(){
        super.onPause()
        Toast.makeText(this, "onPause() Here 😢", LENGTH_LONG).show()
    }
    override fun onStop(){
        super.onStop()
        Toast.makeText(applicationContext, "onStop() Here 😪", LENGTH_LONG).show()
    }
    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy() Here 😒", LENGTH_LONG).show()
    }
}




