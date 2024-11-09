package com.example.wallpaperchanger

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var isDefault = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundChanger = findViewById<Button>(R.id.button)
        val layout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.main)

        backgroundChanger.setOnClickListener {
            if (isDefault) {
                layout.setBackgroundResource(R.drawable.mondongo)
                isDefault = false
            } else {
                layout.setBackgroundColor(Color.WHITE)
                isDefault = true
            }
        }

    }
}