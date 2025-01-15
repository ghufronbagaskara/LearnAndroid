package com.example.xml_intent_service

import android.app.IntentService
import android.content.Intent
import android.util.Log

//this class is need to be describe intent service's behaviour
class MyIntentService : IntentService ("MyIntentService"){

    init {
        instance = this
    }

    companion object {
        private lateinit var instance: MyIntentService
        var isRunning = false

        fun stopService(){
            Log.d("MyIntentService", "Service is stopping...")
            isRunning = false
            instance.stopSelf()
        }
    }

    override fun onHandleIntent(intent: Intent?) {
        try {
            isRunning = true
            while (isRunning){
                Log.d("MyIntentService", "Service is running...")
                Thread.sleep(1000)
            }
        } catch (e: InterruptedException){
            Thread.currentThread().interrupt()
        }
    }

}