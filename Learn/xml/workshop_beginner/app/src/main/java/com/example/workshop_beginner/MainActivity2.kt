package com.example.workshop_beginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val sendData: Button = findViewById(R.id.btnToFirstScreen)
        sendData.setOnClickListener{
            val moveDataIntent = Intent(this@MainActivity2, MainActivity::class.java)
            moveDataIntent.putExtra(MainActivity.EXTRA_AGE, "21")
            moveDataIntent.putExtra(MainActivity.EXTRA_NAME, "Ghufron Bagaskara")
            startActivity(moveDataIntent)
        }

    }
}