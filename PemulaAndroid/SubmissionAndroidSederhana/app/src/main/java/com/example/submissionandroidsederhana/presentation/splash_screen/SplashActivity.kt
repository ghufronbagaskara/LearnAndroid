package com.example.submissionandroidsederhana.presentation.splash_screen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.submissionandroidsederhana.R
import com.example.submissionandroidsederhana.presentation.main_screen.MainActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            goToMainActivity()
        }, 2000L)

    }

    private fun goToMainActivity(){
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}