package com.example.a1_praktikos_darbas_hello_world

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tvMessage)
        val btnSetText = findViewById<Button>(R.id.btnSetText)
        val btnChangeTextColor = findViewById<Button>(R.id.btnChangeTextColor)
        val btnChangeBackground = findViewById<Button>(R.id.btnChangeBackground)

        btnSetText.setOnClickListener {
            tv.text = "Paspaudei mygtuką!"
        }

        btnChangeTextColor.setOnClickListener {
            val isRed = tv.currentTextColor == Color.BLUE
            tv.setTextColor(if (isRed) Color.BLACK else Color.BLUE)
        }

        btnChangeBackground.setOnClickListener {
            //Comment for revert
            val bg = (tv.background)
            if (bg == null) {
                tv.setBackgroundColor(Color.YELLOW)
            } else {
                tv.setBackgroundColor(Color.TRANSPARENT)
            }
        }
    }
}

