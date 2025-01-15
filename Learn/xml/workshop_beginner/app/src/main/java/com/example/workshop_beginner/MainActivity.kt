package com.example.workshop_beginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_AGE = "extra age"
        const val EXTRA_NAME = "extra name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val move: Button = findViewById(R.id.btnToSecondScreen)
        move.setOnClickListener{
            val moveIntent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(moveIntent)
        }

        val nameAgeText: TextView = findViewById(R.id.tvNameAge)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getStringExtra(EXTRA_AGE)

        nameAgeText.text = "name : $name || age : $age"



    }
}