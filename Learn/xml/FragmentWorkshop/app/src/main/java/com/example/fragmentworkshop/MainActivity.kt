package com.example.fragmentworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.btnFragmentFirst)
        val button2: Button = findViewById(R.id.btnFragmentSecond)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragMain, firstFragment)
            commit()
        }

        button1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragMain, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        button2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragMain, secondFragment)
                addToBackStack(null)
                commit()
            }
        }


    }
}