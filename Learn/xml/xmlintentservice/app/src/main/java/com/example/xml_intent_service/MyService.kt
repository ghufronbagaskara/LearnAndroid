package com.example.xml_intent_service

import android.app.Service
import android.content.Intent
import android.nfc.Tag
import android.os.IBinder
import android.util.Log

class MyService : Service(){

    val TAG = "MyService"

    init {
        Log.d(TAG, "Service is running...")
    }

    // it must be inherited, but if we don't needed the onBind func, we can add return null to the function
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val dataString = intent?.getStringExtra("EXTRA_DATA")
        dataString?.let {
            Log.d(TAG, dataString)
        }

        Thread {
            while (true) {  }
        }.start()

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Service is being killed...")
    }



}