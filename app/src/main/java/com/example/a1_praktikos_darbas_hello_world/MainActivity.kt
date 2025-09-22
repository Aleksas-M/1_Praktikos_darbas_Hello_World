package com.example.a1_praktikos_darbas_hello_world

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tvMessage)
        val btn = findViewById<Button>(R.id.btnSetText)

        btn.setOnClickListener {
            tv.text = "Paspaudei mygtuką!"
        }
    }
}
