package com.example.coroutinelearn

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val job = GlobalScope.launch {
            Log.d(TAG, "Coroutine is still working. . .")
            delay(1000L)
        }
        runBlocking {
            delay(3000L)
            job.cancel()
            Log.d(TAG, "Main Thread is continuing....")
        }

    }
}