package com.example.cse224

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_implicit_intent)


        val dialer = findViewById<Button>(R.id.dialer)
        val message = findViewById<Button>(R.id.message)
        val email = findViewById<Button>(R.id.email)
        val refer = findViewById<Button>(R.id.refer)

        // The keywords and strings used are default ones use them only
        dialer.setOnClickListener {
            val iDial = Intent(Intent.ACTION_DIAL)
            // URI is used to give the type at runtime to the receiving intent so
            // instead of datatype we use URI
            iDial.setData(Uri.parse("tel: +917484012349"))
            startActivity(iDial)
        }

        message.setOnClickListener {
            val iMsg = Intent(Intent.ACTION_SENDTO)       // sendto opens default app
            // Encode is used to by default send the message to a no
            iMsg.setData(Uri.parse("smsto:"+Uri.encode("+917484012349")))
            iMsg.putExtra("sms_body", "Solve the issue.")
            startActivity(iMsg)
        }

        email.setOnClickListener {
            val iEmail = Intent(Intent.ACTION_SEND)         // send is used by refer or share also so to differentiate
            iEmail.setType("message/rfc822")              //  its email we use seType for it(differentiable)
            // arrayof here is used in the CC option of email
            iEmail.putExtra(Intent.EXTRA_EMAIL, arrayOf("abc@gmail.com", "xy12@gmail.com"))
            iEmail.putExtra(Intent.EXTRA_SUBJECT, "Promotion")    // Subject
            iEmail.putExtra(Intent.EXTRA_TEXT,"Issue Resolver")      // Body
            startActivity(Intent.createChooser(iEmail, "Email via "))  // Option to select an app
        }

        refer.setOnClickListener {
            val iRefer = Intent(Intent.ACTION_SEND)
            iRefer.setType("text/plain")                  // send is differentiable same
            iRefer.putExtra(Intent.EXTRA_TEXT, "Download this app: https://brave.com/en-in/download/")
            startActivity(Intent.createChooser(iRefer, "Share via"))
        }
    }
}