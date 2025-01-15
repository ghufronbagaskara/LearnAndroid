package com.example.xml_intent_service

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.xml_intent_service.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener{
            Intent(this, MyService::class.java).also {
                startService(it)
                binding.tvServiceInformation.text = "Service running.."
            }
        }

        binding.btnStop.setOnClickListener{
            Intent(this, MyService::class.java).also {
                stopService(it)
                binding.tvServiceInformation.text = "Service Stopped.."
            }
        }

        binding.btnSendData.setOnClickListener{
            Intent(this, MyService::class.java).also {
                val dataString = binding.etData.text.toString()
                it.putExtra("EXTRA_DATA", dataString)
                startService(it)
            }
        }


    }
}