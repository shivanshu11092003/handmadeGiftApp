package com.example.newwork

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val orderbtn=findViewById<Button>(R.id.orderbtn)
    orderbtn.setOnClickListener {
        intent = Intent(applicationContext, MainActivity2::class.java)
        startActivity(intent)

    }
    val conatactbtn=findViewById<Button>(R.id.contactbtn)
    conatactbtn.setOnClickListener {
        val intent=Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse("tel:8467849681"))
        startActivity(intent)
    }

    }
}
